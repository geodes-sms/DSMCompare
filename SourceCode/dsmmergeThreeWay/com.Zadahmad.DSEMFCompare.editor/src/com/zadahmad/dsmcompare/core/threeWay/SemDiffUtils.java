package com.zadahmad.dsmcompare.core.threeWay;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Conflict;
import org.eclipse.emf.compare.ConflictKind;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.DifferenceSource;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.UsageCrossReferencer;

import dsmcompare.mmextension.utils.EMFUtils;
import dsmcompare.mmextension.utils.EMFUtils.ChangeStatus;

public class SemDiffUtils {//Three-way
 	public EFactory DiffMM_Factory	= null;  
 	public ComparisonResult comparisonResult = null;
 	public VesrionInfo versionLeftInfo 	= null;
 	public VesrionInfo versionRightInfo 	= null;
 	public VesrionInfo versionCaInfo 		= null;
 	public EEnum ChangeStatusType = null;// (EEnum)  DiffMM_Factory.getEPackage().getEClassifier("ChangeStatus");
 	public Object changeStatusEQUIVALENT = null; //DiffMM_Factory.createFromString(ChangeStatusType, "EQUIVALENT");
 	public Object changeStatusCONTRADICTING = null; //DiffMM_Factory.createFromString(ChangeStatusType, "CONTRADICTING");

 	
	
	 //******************************************************************************************	 
	 public EObject setDiffKind(
			 String diffAttributeName, 
			 String customMapClassName, 
			 EClass valueDiffEClass, 
			 DifferenceSource differenceSource, 
			 DifferenceKind differenceKind, 
			 EObject valueDiff) 
	 {	 
		 try {
			 //DiffMM_Factory = valueDiff.eClass().getEPackage().getEFactoryInstance();
			 final String changedAttributeName= 
					 differenceSource == DifferenceSource.LEFT ? diffAttributeName + "_Left" : diffAttributeName + "_Right";
			 
		 	 EAttribute diffKindAttribute = valueDiffEClass.getEAllAttributes().stream().filter(
		 			 f->f.getName().contains(changedAttributeName)).collect(Collectors.toList()).get(0);
			 if(customMapClassName == "DiffKind") {					
					//Set the ClassOp(DiffKind) attribute, it can be of ADD or DELETE
					EEnum classDiffKind = (EEnum) valueDiffEClass.getEPackage().getEClassifier("DiffKind");
					//sortedFineDiffReference.valueDiff.eSet(attrOperation,ClassOpAdd);		
					Object classDiffKindValue = null;
					if(differenceKind == DifferenceKind.DELETE)
					{					
						classDiffKindValue = DiffMM_Factory.createFromString(classDiffKind, "DELETE");
					}else if(differenceKind == DifferenceKind.ADD) {					
						classDiffKindValue = DiffMM_Factory.createFromString(classDiffKind, "ADD");	
					}else if(differenceKind == DifferenceKind.CHANGE) {					
						classDiffKindValue = DiffMM_Factory.createFromString(classDiffKind, "MODIFY");
					}else if(differenceKind == DifferenceKind.MOVE) {//conflicting Move	with an attribute Modify			
						classDiffKindValue = DiffMM_Factory.createFromString(classDiffKind, "DELETE");
					}						
					try {
						//Object v = valueDiff.eGet(diffKindAttribute);
						valueDiff.eSet(diffKindAttribute, classDiffKindValue);
					}catch(Throwable ex) {
						System.out.println("Cannot setDiffKind(...) \n DSDiffObject: " 
								 + valueDiff+ "\n changeStatusAttribute: " + diffKindAttribute+"\n " +classDiffKindValue);
					}				
			 }
		 }catch(Throwable ex) {
			System.out.println("Cannot setDiffKind(...) \n : " + ex.getMessage());
		 }
		 return null;	
	 }
	 //******************************************************************************************
	 public EObject getValueDiff(EObject originValueMatch)	{
		 return comparisonResult.comparisonCaDSMDiff.getMatch(originValueMatch).getLeft();
	 }
	 //******************************************************************************************
	 private void setChangeStatus(
			 EObject DSDiffObject, 
			 String diffAttributeName,
			 Object attrValueToBeSet,
			 EClass valueDiffEClass) 
	 {

		 try {
			 EAttribute changeStatusAttribute = valueDiffEClass.getEAllAttributes().stream().filter(
						f->f.getName().equals(diffAttributeName)).collect(Collectors.toList()).get(0);	
			 EEnum ChangeStatusType = (EEnum)  valueDiffEClass.getEPackage().getEClassifier("ChangeStatus");
			 Object changeStatus = DiffMM_Factory.createFromString(ChangeStatusType, attrValueToBeSet.toString());
			 try {
	  		 DSDiffObject.eSet(changeStatusAttribute, changeStatus);
			 }catch(Throwable ex) {
				 System.out.println("Cannot setChangeStatus(...) \n DSDiffObject: " 
			 + DSDiffObject+ "\n changeStatusAttribute: " + changeStatusAttribute+"\n " +changeStatus);
			 }
		 }catch(Exception ex) {
			 System.out.println("\n setChangeStatus(...): " + ex.getLocalizedMessage() + " --> " + diffAttributeName + " / " +DSDiffObject.toString());
		 }
		 
	 }	 
	 //******************************************************************************************
	 private EObject setValueDiff(EObject valueDiff, String diffAttributeName, 
			 Object attrValueToBeSet, EClass valueDiffEClass, VesrionInfo version, EAttribute	originalAttributeClass) {
		 	 
		 if(diffAttributeName.toLowerCase().contains("changestatus")) {		 
			 setChangeStatus(valueDiff, diffAttributeName,attrValueToBeSet,valueDiffEClass);			 
			 return null;
		 }
		 
		 String oldAttributeName = diffAttributeName.substring(4);//"new_"
		 EAttribute oldAttribute = valueDiffEClass.getEAllAttributes().stream().filter(
					f->f.getName().equals(oldAttributeName)).collect(Collectors.toList()).get(0);

		 final String newAttributeName= 
				 version.version == Version.LEFT ? diffAttributeName+"_Left":diffAttributeName+"_Right";
		 
		 if(oldAttribute.getUpperBound()==1) {
			 try {
	  			EAttribute newAttribute = valueDiffEClass.getEAllAttributes().stream().filter(
						f->f.getName().equals(newAttributeName)).collect(Collectors.toList()).get(0);	
	  			valueDiff.eSet(newAttribute, attrValueToBeSet);
	  			 /*
				 EAttribute newAttribute = valueDiffEClass.getEAllAttributes().stream().filter(
							f->f.getName().equals(newAttributeName)).collect(Collectors.toList()).get(0);
				 
				 EList<Object> newAttributeArray = (EList<Object>) DSDiffObject.eGet(newAttribute);
					if(newAttributeArray.size()==0) {
						newAttributeArray.add(0, null);
						newAttributeArray.add(1, null);
					}				
					if(version.version == Version.LEFT) {
						newAttributeArray.set(0, attrValueToBeSet);
					}
					else {
						newAttributeArray.set(1, attrValueToBeSet);
					}
					
					DSDiffObject.eSet(newAttribute, attrValueToBeSet);
				*/
			 }
	  			 catch(Exception ex) {
	  				 System.out.println("\n setValueDiff(...): diffAttributeName: "+ diffAttributeName + " - "+ ex.getMessage());
	  			 }
			return null;
		 }
		 else
		 {
		 	//Object attrValueToBeSet = diff.value;
		 	//Find the changedAttributeName(such as diff_kind) reference in the valueDiff
			EReference refDiffKinkMap = 
					valueDiffEClass.getEAllReferences().stream().filter(
					f->f.getName().equalsIgnoreCase(newAttributeName)).collect(Collectors.toList()).get(0);
		 
			//Map<String, Object> attrModifiedValue= ((Map<String, Object>) DSDiffObject.eGet(diffNewAttribute));
			//if(attrModifiedValue==null ) 
				//attrModifiedValue= new HashMap<String,Object>();
			//attrModifiedValue.put(author, attrValueToBeSet);
			//DSDiffObject.eSet(diffNewAttribute, attrModifiedValue);
			//Create DiffKind custom map class 
			EClassifier     mapClassDiffKindEClassifier = refDiffKinkMap.getEType();
			EClass			mapClassDiffKind			= (EClass) mapClassDiffKindEClassifier;						
			EObject 		mapClassDiffKindObject		= DiffMM_Factory.create(mapClassDiffKind);
			
			//Set Key
			
			//EAttribute KeyAttribute = mapClassDiffKind.getEAllAttributes().stream().filter(
			//		f->f.getName()=="key").collect(Collectors.toList()).get(0);
			//mapClassDiffKindObject.eSet(KeyAttribute, version.source);//author		
			
			//Set Value
			EAttribute valueAttribute = mapClassDiffKind.getEAllAttributes().stream().filter(
					f->f.getName()=="value").collect(Collectors.toList()).get(0);
			mapClassDiffKindObject.eSet(valueAttribute, attrValueToBeSet);
			//Set attributeName
			
			//EAttribute attributeName = mapClassDiffKind.getEAllAttributes().stream().filter(
			//		f->f.getName()=="attributeName").collect(Collectors.toList()).get(0);
			//mapClassDiffKindObject.eSet(attributeName, newAttributeName);
			
			//Add Map custom class to diff class
			SetEFeature(valueDiff, refDiffKinkMap, mapClassDiffKindObject);
			return mapClassDiffKindObject;	
		 }
	 }
	 //******************************************************************************************
	 void SetEFeature(EObject ERoot, EStructuralFeature feature, EObject newValue)
	 {
		 EList<EStructuralFeature>  a = ERoot.eClass().getEAllStructuralFeatures();
		 
		 if(ERoot == null || feature == null || newValue == null || a.stream().filter(f->f.equals(feature)).collect(Collectors.toList()).size()==0) {
			 System.out.println("Cannot set the feature!");
			 System.out.println("ERoot : " + ERoot);
			 System.out.println("feature : " + feature);
			 System.out.println("newValue : " + newValue);
			 return;
		 }
			 
		try
		{				
			((EList<EObject>) ERoot.eGet(feature)).add((EObject) newValue);	
		}
		catch(Exception ex)
		{
			try {
			ERoot.eSet(feature,newValue);}
			catch(Exception ex2)
			{
				 System.out.println("Error: SetEFeature(EObject ERoot");
				 System.out.println("ex2 : " + ex2.getLocalizedMessage());
			}
		}
	 }
	 
	//******************************************************************************************
	public EObject createValueDiff(
			EObject value, 
			String changeStatusString,
			DifferenceKind differenceKindLeft,
			DifferenceKind differenceKindRight) 
	{
		EClass 		valueEClass 	= value.eClass();
		EClassifier valueDiffEClassifier	= 
				valueEClass.getEPackage().getEClassifier("Diff"+valueEClass.getName()); 
		EClass		valueDiffEClass		= (EClass)valueDiffEClassifier;
		EObject valueDiff = DiffMM_Factory.create(valueDiffEClass);			
		for(EAttribute attr:valueEClass.getEAllAttributes())
		{
			valueDiff.eSet(attr, value.eGet(attr));
		}
			
		if(differenceKindLeft != null)
			setDiffKind("diff_kind",  "DiffKind", valueDiffEClass, DifferenceSource.LEFT, differenceKindLeft, valueDiff);
		if(differenceKindRight != null)
			setDiffKind("diff_kind",  "DiffKind", valueDiffEClass, DifferenceSource.RIGHT, differenceKindRight, valueDiff);
		
		EEnum ChangeStatusType = (EEnum)  DiffMM_Factory.getEPackage().getEClassifier("ChangeStatus");
		if(changeStatusString.toUpperCase().equals("EQUIVALENT") ||  changeStatusString.toUpperCase().equals("CONTRADICTING"))
		{
				Object changeStatusObject = DiffMM_Factory.createFromString(ChangeStatusType, changeStatusString.toUpperCase());
				setChangeStatus(valueDiff, "changeStatus",changeStatusObject,valueDiffEClass);
		}	
		
			
		return valueDiff;
	}
	
	//******************************************************************************************
	public void claculateClassDiffGroups(List<FineDiffReference> sortedFineDiffClasses) {
		
		Map<EObject, List<FineDiffReference>> mapGroupByOriginValue= new HashMap();
		mapGroupByOriginValue = 
				sortedFineDiffClasses.stream()
				.filter(p -> p.getOriginValueMatch() != null)
				.collect(Collectors.groupingBy(FineDiffReference::getOriginValueMatch));
		
		for (Map.Entry<EObject, List<FineDiffReference>> entry : mapGroupByOriginValue.entrySet()) {
			ClassDiffGroup classDiffGroup = new ClassDiffGroup();
			classDiffGroup.originValueMatch = entry.getKey();
			for(FineDiffReference fdClass:entry.getValue()) {
				if(fdClass.diff.getSource() == DifferenceSource.LEFT)
					classDiffGroup.left.add(fdClass);
				else
					classDiffGroup.right.add(fdClass);
			}
			comparisonResult.classDiffGroups.add(classDiffGroup);
		}
		
		Map<EObject, List<FineDiffReference>> mapGroupByValue =  new HashMap();
		mapGroupByValue =
				sortedFineDiffClasses.stream()
				.filter(p -> p.getOriginValueMatch() == null)
				.collect(Collectors.groupingBy(FineDiffReference::getValue));
		
		for (Map.Entry<EObject, List<FineDiffReference>> entry : mapGroupByValue.entrySet()) {
			ClassDiffGroup classDiffGroup = new ClassDiffGroup();
			classDiffGroup.value = entry.getKey();
			for(FineDiffReference fdClass:entry.getValue()) {
				if(fdClass.diff.getSource() == DifferenceSource.LEFT)
					classDiffGroup.left.add(fdClass);
				else
					classDiffGroup.right.add(fdClass);
			}
			comparisonResult.classDiffGroups.add(classDiffGroup);
		}
		
	}

	//******************************************************************************************
	public void transformClassDiffGroup(ArrayList<ClassDiffGroup> classDiffGroups) {
		
	
		//*********//Also process the attribute groups
		//calculated
		ArrayList<ClassDiffGroup>  calculated = new ArrayList<ClassDiffGroup>();
		
		//DELETE-DELETE
		List<ClassDiffGroup>  dD = classDiffGroups.stream().filter(
				f->f.left.size()==1 && f.right.size()==1 
				&& f.left.get(0).diffKind == DifferenceKind.DELETE
				&& f.right.get(0).diffKind == DifferenceKind.DELETE).collect(Collectors.toList());

		for(ClassDiffGroup dd:dD) {
			dd.changeStatus = EMFUtils.ChangeStatus.EQUIVALENT;
			dd.valueDiff = dd.left.get(0).valueDiff = dd.right.get(0).valueDiff =
					createValueDiff(dd.originValueMatch, EMFUtils.ChangeStatus.EQUIVALENT.toString(), 
							DifferenceKind.DELETE, DifferenceKind.DELETE);				
		}
		calculated.addAll(dD);

		//DELETE-NON
		List<ClassDiffGroup>  dLeft = classDiffGroups.stream().filter(
				f->f.left.size()==1 && f.right.size()==0 
				&& f.left.get(0).diffKind == DifferenceKind.DELETE).collect(Collectors.toList());	
		for(ClassDiffGroup dL:dLeft) {
			dL.changeStatus = EMFUtils.ChangeStatus.NON;
			//dL.value = dL.left.get(0).value;
			dL.valueDiff = dL.left.get(0).valueDiff = 
					createValueDiff(dL.originValueMatch, EMFUtils.ChangeStatus.NON.toString(), 
							DifferenceKind.DELETE, null);						
		}
		calculated.addAll(dLeft);
		
		//NON-DELETE
		List<ClassDiffGroup>  dRight = classDiffGroups.stream().filter(
				f->f.left.size()==0 && f.right.size()==1 
				&& f.right.get(0).diffKind == DifferenceKind.DELETE).collect(Collectors.toList());	
		for(ClassDiffGroup dR:dRight) {
			dR.changeStatus = EMFUtils.ChangeStatus.NON;
			dR.valueDiff = dR.right.get(0).valueDiff = 
					createValueDiff(dR.originValueMatch, EMFUtils.ChangeStatus.NON.toString(), 
							null, DifferenceKind.DELETE);					
		}
		calculated.addAll(dRight);	
		
		
		//ADD-ADD
		List<ClassDiffGroup>  aA = classDiffGroups.stream().filter(
				f->f.left.size()==1 && f.right.size()==1 
				&& f.left.get(0).diffKind == DifferenceKind.ADD
				&& f.right.get(0).diffKind == DifferenceKind.ADD).collect(Collectors.toList());
		
		for(ClassDiffGroup aa:aA) {
			aa.changeStatus = EMFUtils.ChangeStatus.EQUIVALENT;
			aa.valueDiff = aa.left.get(0).valueDiff = aa.right.get(0).valueDiff =
					createValueDiff(aa.value, EMFUtils.ChangeStatus.EQUIVALENT.toString(), 
							DifferenceKind.ADD, DifferenceKind.ADD);								
		}
		calculated.addAll(aA);
		
		//ADD-NON
		List<ClassDiffGroup>  aLeft = classDiffGroups.stream().filter(
				f->f.left.size()==1 && f.right.size()==0 
				&& f.left.get(0).diffKind == DifferenceKind.ADD).collect(Collectors.toList());	
		for(ClassDiffGroup aL:aLeft) {
			aL.changeStatus = EMFUtils.ChangeStatus.NON;
			aL.valueDiff = aL.left.get(0).valueDiff = 
					createValueDiff(aL.value, EMFUtils.ChangeStatus.NON.toString(), 
							DifferenceKind.ADD, null);					
		}
		calculated.addAll(aLeft);
		
		//NON-ADD
		List<ClassDiffGroup>  aRight = classDiffGroups.stream().filter(
				f->f.left.size()==0 && f.right.size()==1 
				&& f.right.get(0).diffKind == DifferenceKind.ADD).collect(Collectors.toList());	
		for(ClassDiffGroup aR:aRight) {
			aR.changeStatus = EMFUtils.ChangeStatus.NON;
			aR.valueDiff = aR.right.get(0).valueDiff = 
					createValueDiff(aR.value, EMFUtils.ChangeStatus.NON.toString(), 
							null, DifferenceKind.ADD);							
		}
		calculated.addAll(aRight);
		
		
		ArrayList<ClassDiffGroup> moveClassDiffGroups = new ArrayList<ClassDiffGroup>();
		
		//DELETE-MOVE
		List<ClassDiffGroup>  dV = classDiffGroups.stream().filter(
				f->f.left.size()==1 && f.right.size()==1 
				&& f.left.get(0).diffKind == DifferenceKind.DELETE
				&& f.right.get(0).diffKind == DifferenceKind.MOVE).collect(Collectors.toList());
		for(ClassDiffGroup dv:dV) {
			dv.changeStatus = EMFUtils.ChangeStatus.NON;
			//dv.value = dv.left.get(0).value;
			dv.valueDiff = dv.left.get(0).valueDiff = 
					createValueDiff(dv.originValueMatch, EMFUtils.ChangeStatus.NON.toString(), 
							DifferenceKind.DELETE, DifferenceKind.MOVE);	
		}
		calculated.addAll(dV);
		moveClassDiffGroups.addAll(dV);
		//MOVE-DELETE
		List<ClassDiffGroup>  vD = classDiffGroups.stream().filter(
				f->f.left.size()==1 && f.right.size()==1 
				&& f.left.get(0).diffKind == DifferenceKind.MOVE
				&& f.right.get(0).diffKind == DifferenceKind.DELETE).collect(Collectors.toList());
		for(ClassDiffGroup vd:vD) {
			vd.changeStatus = EMFUtils.ChangeStatus.NON;
			vd.valueDiff = vd.right.get(0).valueDiff = 
					createValueDiff(vd.originValueMatch, EMFUtils.ChangeStatus.NON.toString(), 
							DifferenceKind.MOVE, DifferenceKind.DELETE);							
		}
		calculated.addAll(vD);
		moveClassDiffGroups.addAll(vD);
		
		List<ClassDiffGroup> factoryList = 
		classDiffGroups.stream().filter(f->f.valueDiff!=null && 
				EMFUtils.getAttrValueByAttrNameNullDefault(f.valueDiff,"name").toString().contains("Factory")).collect(Collectors.toList());
		
		// call attribute change in here 
		transformAttributeDiffs();
		findAllContainers(comparisonResult.classDiffGroups);
		
		//List<ClassDiffGroup> modified = classDiffGroups.stream().filter(f->f.valueDiff != null && 
		//		f.valueDiff.toString().contains("MODIFY")).collect(Collectors.toList());

		//MOVE-MOVE		
		List<ClassDiffGroup>  vV = classDiffGroups.stream().filter(
				f->f.left.size()==1 && f.right.size()==1 
				&& f.left.get(0).diffKind == DifferenceKind.MOVE
				&& f.right.get(0).diffKind == DifferenceKind.MOVE).collect(Collectors.toList());
		calculated.addAll(vV);
		moveClassDiffGroups.addAll(vV);
		//MOVE-NON
		List<ClassDiffGroup>  vLeft = classDiffGroups.stream().filter(
				f->f.left.size()==1 && f.right.size()==0 
				&& f.left.get(0).diffKind == DifferenceKind.MOVE).collect(Collectors.toList());	
		calculated.addAll(vLeft);
		moveClassDiffGroups.addAll(vLeft);
		//NON-MOVE
		List<ClassDiffGroup>  vRight = classDiffGroups.stream().filter(
				f->f.left.size()==0 && f.right.size()==1 
				&& f.right.get(0).diffKind == DifferenceKind.MOVE).collect(Collectors.toList());	
		calculated.addAll(vRight);
		moveClassDiffGroups.addAll(vRight);
		
		//MODIFY-MOVE
		List<ClassDiffGroup>  mv = classDiffGroups.stream().filter(
				f->f.left.size()==1 && f.right.size()==1 
				&& f.left.get(0).diffKind == DifferenceKind.CHANGE
				&& f.right.get(0).diffKind == DifferenceKind.MOVE).collect(Collectors.toList());	
		//calculated.addAll(mv);
		moveClassDiffGroups.addAll(mv);
		
		//MOVE-MODIFY
		List<ClassDiffGroup>  vm = classDiffGroups.stream().filter(
				f->f.left.size()==1 && f.right.size()==1 
				&& f.left.get(0).diffKind == DifferenceKind.MOVE
				&& f.right.get(0).diffKind == DifferenceKind.CHANGE).collect(Collectors.toList());	
		//calculated.addAll(mv);
		moveClassDiffGroups.addAll(vm);		
		classDiffGroups.addAll(moveClassDiffGroups);
		
		factoryList = 
				classDiffGroups.stream().filter(f->f.valueDiff!=null && 
						EMFUtils.getAttrValueByAttrNameNullDefault(f.valueDiff,"name").toString().contains("Factory")).collect(Collectors.toList());

		
		transformClassMoveDiffs(moveClassDiffGroups); 
		
		//Strange Group
		List<ClassDiffGroup>  sG = classDiffGroups.stream().filter(
				f->f.left.size()>1 || f.right.size()>1).collect(Collectors.toList());
		calculated.addAll(sG);
		//Not catched yet
		List<ClassDiffGroup>  notCatched = classDiffGroups.stream().filter(
				f->!calculated.contains(f)).collect(Collectors.toList());
				
		//sourceOriginDiff = comparisonCaDSMDiff.getMatch(sortedFineDiffClass.originContainerMatch).getLeft();
		//I think it is better to find all containerDiff and refDiff at the end of this prorcess accordinf to dependsOn or diff.requires
		/*if(rightFineDiff.originContainerMatch != null)
			aR.originValueMatch = rightFineDiff.originContainerMatch;
		if(aR.originValueMatch != null && aR.originValueMatch.eContainer()!=null) {
			aR.containerDiff = comparisonCaDSMDiff.getMatch(aR.originValueMatch.eContainer()).getLeft();
			aR.refDiff = aR.containerDiff.eClass().getEAllReferences().stream().filter(
						r->r.getName().equalsIgnoreCase(
								rightFineDiff.referenceChangeDiff.getReference().getName())).collect(
									Collectors.toList()).get(0);
		}*/
		
	}
			
	
	//******************************************************************************************
	public void transformAttributeDiffs() {
		//Transform Attribute Differences	
		//Iterate each class hasing at least on attribute changed
		for(FineDiffAttributeGroup fdag:comparisonResult.fineDiffAttributeGroups)
		{	
			//All attribute diffs are Pseudo-Conflict (Modify-Modify)
			//It has not class-diffs in either sides 			
		    //In this case it DOSE NOT need creating a DSDiffObject
			ChangeStatus changeStatus = ChangeStatus.NON; 
			List<FineDiffAttributeGroupProps> fdagPropsEqChange =  
					fdag.fineDiffAttributeGroupProps.stream().filter(
							f->f.changeStatus == ChangeStatus.EQUIVALENT).collect(Collectors.toList());
			//Equal attribute (LEFT MODIFY/ RIGHT MODIFY)
			boolean isEqChange_All_MODIFY_MODIFY_attrs = 
					fdagPropsEqChange.size() == fdag.fineDiffAttributeGroupProps.size();
			
			/*
			if(allAreEqChangeConflict) {
				for(FineDiffAttributeGroupProps fdagProps:fdag.fineDiffAttributeGroupProps) {
					fdagProps.isProcessed = true;
					EObject modifiedNonDiffClassInDiffModel = 
							comparisonCaDSMDiff.getMatch(fdag.originContainerMatch).getLeft(); 						
					modifiedNonDiffClassInDiffModel.eSet(
							fdagProps.originalAttributeClass, fdagProps.vLeftValue);	//d.vRightValue
				}
				//continue;					
			}*/	
			
			EObject valueDiff = null;//DSDiffObject
			List<ClassDiffGroup> classDiffGroupList= 
					comparisonResult.classDiffGroups.stream().filter(
							f->f.originValueMatch == fdag.originContainerMatch).collect(Collectors.toList());
			
			EClass EDiffObjectEClass = fdag.originContainerMatch.eClass();
		    EClassifier DSDiffEClassifier = 
		    		EDiffObjectEClass.getEPackage().getEClassifier("Diff" + EDiffObjectEClass.getName());
		    EClass DSDiffEClass = (EClass) DSDiffEClassifier;
		    
			if(classDiffGroupList!=null && classDiffGroupList.size()==1) {
				valueDiff = classDiffGroupList.get(0).valueDiff;
				classDiffGroupList.get(0).fdag = fdag;
			}			
			else if(classDiffGroupList!=null && classDiffGroupList.size()>1) {
				System.out.println("VERY STRANGE!");
				valueDiff = classDiffGroupList.get(0).valueDiff;
				classDiffGroupList.get(0).fdag = fdag;
			}
			
						
			
			if(valueDiff == null)
			{
				valueDiff = createValueDiff(fdag.originContainerMatch, EMFUtils.ChangeStatus.NON.toString(), null, null);
				if(classDiffGroupList!=null && classDiffGroupList.size()>0) {
					 classDiffGroupList.get(0).valueDiff = valueDiff;
					 if(classDiffGroupList.get(0).left.size()>0)
						 for(FineDiffReference d:classDiffGroupList.get(0).left)
							 d.valueDiff = valueDiff;
					 if(classDiffGroupList.get(0).right.size()>0)
						 for(FineDiffReference d:classDiffGroupList.get(0).right)
							 d.valueDiff = valueDiff;
						 
				}
				else if(classDiffGroupList==null || (classDiffGroupList!=null && classDiffGroupList.size()==0)) {
					ClassDiffGroup classDiffGroup = new ClassDiffGroup();
					classDiffGroup.fdag = fdag;
					classDiffGroup.valueDiff = valueDiff;
					classDiffGroup.originValueMatch = fdag.originContainerMatch;
					comparisonResult.classDiffGroups.add(classDiffGroup);
				}
			}
			//!!!//
			//at least has one attribute diff of Pseudo-Conflict (Modify-Modify)
			//It has not class-diffs in either sides 
		    //In this case it needs creating a DSDiffObject
			if(fdagPropsEqChange!=null && fdagPropsEqChange.size()>0) {
		        //valueDiff = DiffMM_Factory.create(DSDiffEClass);
				//!!!//    for (EAttribute attr: EDiffObjectEClass.getEAllAttributes()) {
				//!!!//    valueDiff.eSet(attr, fdag.originContainerMatch.eGet(attr));
				//!!!//}		        
		        
		        if(isEqChange_All_MODIFY_MODIFY_attrs) {
		        	setValueDiff(valueDiff, "changeStatus", ChangeStatus.EQUIVALENT, DSDiffEClass, versionLeftInfo, null);
	    			setDiffKind("diff_kind",  "DiffKind", DSDiffEClass,  
							DifferenceSource.LEFT, DifferenceKind.CHANGE, valueDiff);
					setDiffKind("diff_kind",  "DiffKind", DSDiffEClass,   
							DifferenceSource.RIGHT, DifferenceKind.CHANGE, valueDiff);
		        }
		        //For each attribute group (collection of attribute changes grouped by an attribute name = fineDiffAttributeGroupProps)
				for(FineDiffAttributeGroupProps fdagProps:fdag.fineDiffAttributeGroupProps) {
					fdagProps.isProcessed = true;
					if(fdagProps.changeStatus == ChangeStatus.EQUIVALENT)
					{
						String newAttributeName = "new_"+fdagProps.attributeName;
						String changeStatusAttributeName = fdagProps.attributeName+"ChangeStatus";
						setValueDiff(valueDiff, newAttributeName, fdagProps.vLeftValue, DSDiffEClass, versionLeftInfo, null);
						setValueDiff(valueDiff, changeStatusAttributeName, ChangeStatus.EQUIVALENT, DSDiffEClass, versionLeftInfo, fdagProps.originalAttributeClass);							

						setValueDiff(valueDiff, newAttributeName, fdagProps.vRightValue, DSDiffEClass, versionRightInfo, null);
						//setValueDiff(DSDiffObject, changeStatusAttributeName, ChangeStatus.EQUIVALENT, DSDiffEClass, versionRightInfo);
						

		    			setDiffKind("diff_kind",  "DiffKind", DSDiffEClass,   
								DifferenceSource.LEFT, DifferenceKind.CHANGE, valueDiff);
							setDiffKind("diff_kind",  "DiffKind", DSDiffEClass,   
									DifferenceSource.RIGHT, DifferenceKind.CHANGE, valueDiff);
						
						//DSDiffObject.eSet(fdagProps.originalAttributeClass, fdagProps.vLeftValue);	//d.vRightValue
					}
					else {
						String newAttributeName = "new_"+fdagProps.attributeName;
						if(fdagProps.vLeftValue!=null) {
							setValueDiff(valueDiff, newAttributeName, fdagProps.vLeftValue, DSDiffEClass, versionLeftInfo, null);
							setDiffKind("diff_kind",  "DiffKind", DSDiffEClass,   
									DifferenceSource.LEFT, DifferenceKind.CHANGE, valueDiff);
						}else if(fdagProps.vRightValue!=null) {
							setValueDiff(valueDiff, newAttributeName, fdagProps.vRightValue, DSDiffEClass, versionRightInfo, null);
							setDiffKind("diff_kind",  "DiffKind", DSDiffEClass,   
									DifferenceSource.RIGHT, DifferenceKind.CHANGE, valueDiff);
						}
						
						if(fdagProps.vLeftValue!=null && fdagProps.vRightValue!=null 
								&& !fdagProps.vLeftValue.toString().equals(fdagProps.vRightValue.toString())) {
							String changeStatusAttributeName = fdagProps.attributeName+"ChangeStatus";
							setValueDiff(valueDiff, changeStatusAttributeName, ChangeStatus.CONTRADICTING, DSDiffEClass, versionLeftInfo, fdagProps.originalAttributeClass);							
							setValueDiff(valueDiff, "changeStatus", ChangeStatus.CONTRADICTING, DSDiffEClass, null, null);	
						}
					}
				}	        			        					
			}
			
			else {
				//It has not any attribute diff of Pseudo-Conflict (Modify-Modify /Modify - ADD/REMOVE/MOVE)
				//It may has a class-diff in either sides 
			    //In this case it needs creating a DSDiffObject /or/ reuse of existing one
				
			//???//	if(fdag.originContainerMatchDiff != null && 
			//???//			fdag.conflictWithClassDiffs.stream().filter(f->f.diffKind == 
			//???//			DifferenceKind.MOVE).collect(Collectors.toList()).size()>0)
			//???//	{
					//fdag.originContainerMatchDiff is not a Diff class type
					//!!!//valueDiff = DiffMM_Factory.create(DSDiffEClass);
					//!!!//for (EAttribute attr: EDiffObjectEClass.getEAllAttributes()) {
					//!!!//    valueDiff.eSet(attr, fdag.originContainerMatch.eGet(attr));
					//!!!//}
			        
					//???//
					
					//???//FineDiffReference sortedFineDiffClass = fdag.conflictWithClassDiffs.stream().filter(f->f.diffKind == 
					//???//		DifferenceKind.MOVE).collect(Collectors.toList()).get(0);
			        
					//???//int i=-1;
					//???//for(EReference etype:sortedFineDiffClass.inputETypeRefsInMove)
					//???//{
					//???//	i++;
					//???//	SetEFeature(sortedFineDiffClass.inputDsDiffInMove.get(i), etype, valueDiff);
					//???//}	
			        
			        
			        
			        //Collection<Setting> usages = UsageCrossReferencer.find(fdag.originContainerMatch, rsourceDSMDiff);
			        //EcoreUtil.replace(fdag.originContainerMatch, DSDiffObject);				        
			        //for (EReference ref: EDiffObjectEClass.getEAllReferences()) {
			        //    DSDiffObject.eSet(ref, fdag.originContainerMatch.eGet(ref));
			        //}		        
			        //for (EReference ref: EcoreUtil.usa(EDiffObjectEClass)) {
			        //    DSDiffObject.eSet(ref, fdag.originContainerMatch.eGet(ref));
			        //}
					//???//final EObject df= valueDiff;
					//???//EReference eRef = null;
					//???//try {
					//???//	eRef = fdag.originContainerMatchDiff.eContainer().eClass().getEAllReferences().stream().filter(
					//???//		f->df.eClass().getEAllSuperTypes().contains(
					//???//				f.getEReferenceType())).collect(Collectors.toList()).get(0);
			        
					//???//SetEFeature(fdag.originContainerMatchDiff.eContainer(), eRef, valueDiff);
			//???// }catch(Exception ex) {
			//???//        	System.out.println("error: eRef = fdag.originContainerMatchDiff.eContainer().eClass()");
			//???//        	System.out.println("ex: "+ex.getLocalizedMessage());
			//???//        }
					
			      //???//if(fdag.conflictWithClassDiffs.size()>0) {
			      //???//FineDiffReference firstConflictingEObject = fdag.conflictWithClassDiffs.get(0);
			      //???//		DifferenceSource differenceSource = firstConflictingEObject.diff.getSource();
			      //???//		DifferenceKind differenceKind = firstConflictingEObject.diff.getKind();
			      //???//		setDiffKind("diff_kind",  "DiffKind", DSDiffEClass, EDiffObjectEClass,  
			      //???//					differenceSource, differenceKind, valueDiff);
			      //???//	}
			        
			      //???//  EcoreUtil.delete(fdag.originContainerMatchDiff);
			      //???//  fdag.originContainerMatchDiff = valueDiff;
			//???//	}
				
			//???//if(valueDiff == null && fdag.originContainerMatchDiff != null)
			//???//   	valueDiff	=	fdag.originContainerMatchDiff;
			//???//    if (valueDiff == null && fdag.originContainerMatchDiff == null) {
			//???//        valueDiff = DiffMM_Factory.create(DSDiffEClass);
			//???//        for (EAttribute attr: EDiffObjectEClass.getEAllAttributes()) {
			//???//	            valueDiff.eSet(attr, fdag.originContainerMatch.eGet(attr));
			//???//        }
			//???//  } 	
			
				for(FineDiffAttributeGroupProps fdagProps:fdag.fineDiffAttributeGroupProps) {
					fdagProps.isProcessed = true;
					String newAttributeName = "new_"+fdagProps.attributeName;
					if(fdagProps.vLeftValue!=null) {
						setValueDiff(valueDiff, newAttributeName, fdagProps.vLeftValue, DSDiffEClass, versionLeftInfo, null);
						setDiffKind("diff_kind",  "DiffKind", DSDiffEClass,   
								DifferenceSource.LEFT, DifferenceKind.CHANGE, valueDiff);
					}
					if(fdagProps.vRightValue!=null) {
						setValueDiff(valueDiff, newAttributeName, fdagProps.vRightValue, DSDiffEClass, versionRightInfo, null);
						setDiffKind("diff_kind",  "DiffKind", DSDiffEClass,   
								DifferenceSource.RIGHT, DifferenceKind.CHANGE, valueDiff);
					}	
					
					
					if(fdagProps.vLeftValue!=null && fdagProps.vRightValue!=null 
							&& !fdagProps.vLeftValue.toString().equals(fdagProps.vRightValue.toString())) {
						String changeStatusAttributeName = fdagProps.attributeName+"ChangeStatus";
						setValueDiff(valueDiff, changeStatusAttributeName, ChangeStatus.CONTRADICTING, DSDiffEClass, versionLeftInfo, fdagProps.originalAttributeClass);							
						setValueDiff(valueDiff, "changeStatus", ChangeStatus.CONTRADICTING, DSDiffEClass, null, null);	
					}
				}
			}
			/*//???////???//
			List<FineDiffAttributeGroupProps> notPseudoAttrDiffsLeft= 
					fdag.fineDiffAttributeGroupProps.stream().filter(
							f->f.vLeftValue!=null && f.changeStatus==ChangeStatus.EQUIVALENT).collect(Collectors.toList());
			List<FineDiffAttributeGroupProps> notPseudoAttrDiffsRight= 
					fdag.fineDiffAttributeGroupProps.stream().filter(
							f->f.vRightValue!=null && f.changeStatus==ChangeStatus.EQUIVALENT).collect(Collectors.toList());

    		if(notPseudoAttrDiffsLeft!=null && notPseudoAttrDiffsLeft.size()>0) {
    			setDiffKind("diff_kind",  "DiffKind", DSDiffEClass, EDiffObjectEClass,  
					DifferenceSource.LEFT, DifferenceKind.CHANGE, valueDiff);		
    		}
    		
    		if(notPseudoAttrDiffsRight!=null && notPseudoAttrDiffsRight.size()>0) {
				setDiffKind("diff_kind",  "DiffKind", DSDiffEClass, EDiffObjectEClass,  
						DifferenceSource.RIGHT, DifferenceKind.CHANGE, valueDiff);
    		}			    	
	    	
	    	if (fdag.originContainerMatchDiff != valueDiff)
		    {
		    	EObject oldObject = comparisonResult.comparisonCaDSMDiff.getMatch(fdag.originContainerMatch).getLeft();
		    	
		    	EObject root = EcoreUtil.getRootContainer((EObject) oldObject);
		    	// Replacing the object in the container
		    	EcoreUtil.replace((EObject) oldObject, (EObject) valueDiff);
		    	// Replacing the object in other references than the container.
		    	Collection<Setting> settings = UsageCrossReferencer.find((EObject) oldObject, root);
	    		for (Setting setting : settings) {
	    			try {
	    			setting.set(valueDiff);
	    			}catch(Exception ex) {
	    				System.out.println("Error Replacing the object in other references than the container. \nException: " + ex.getLocalizedMessage() );
	    			}		    			
	    		}
             
	    		if(oldObject.eContents()!=null && oldObject.eContents().size()>0) {
	    			//Copy eContents
	    			ArrayList<EObject> eContents = new ArrayList<EObject>();
	    					
	    			oldObject.eContents().forEach(o->{eContents.add(o);});
	    			
	    			
	    			
	    			for(EObject child:eContents) {
	    				String childClassName=child.eClass().getName();
	    				ArrayList<String> superTypeAndChildNames = new ArrayList<String>();
	    				superTypeAndChildNames.add(childClassName);
	    				if(child.eClass().getEAllSuperTypes()!= null && child.eClass().getEAllSuperTypes().size()>0)
	    				{
	    					for(EClass superTypeClass:child.eClass().getEAllSuperTypes()) {
	    						superTypeAndChildNames.add(superTypeClass.getName());
	    					}
	    				}
	    				//sourceOriginDiff
	    				EReference refType1= valueDiff.eClass().getEAllReferences().stream().filter(f->
                 			superTypeAndChildNames.contains(f.getEReferenceType().getName())).collect(Collectors.toList()).get(0);
	    				SetEFeature(valueDiff, refType1, child);
	    			}
	    		}
		    }
	    	
	    	if(		!EMFUtils.getAttrValueByAttrName(valueDiff,"diff_kind_Left").toString().equals("NON")
	    		&& 	!EMFUtils.getAttrValueByAttrName(valueDiff,"diff_kind_Right").toString().equals("NON")
	    		&& 	!EMFUtils.getAttrValueByAttrName(valueDiff,"diff_kind_Left").equals(
	    			EMFUtils.getAttrValueByAttrName(valueDiff,"diff_kind_Right"))) 
	    	{
	    		setValueDiff(valueDiff, "changeStatus", ChangeStatus.CONTRADICTING, DSDiffEClass, null, null);		    		
	    	}
	    	
	    	fdag.originContainerMatchDiff = valueDiff;
			fdag.isProcessed = true;					
			*/
		}
	}

	//******************************************************************************************
	
	public void findAllContainers(ArrayList<ClassDiffGroup> classDiffGroups) {				
		//classDiffGroup.containerDiff
		for(ClassDiffGroup classDiffGroup:classDiffGroups) {
			try {
				if(classDiffGroup.originValueMatch != null) {
					List<ClassDiffGroup> containerclassDiffGroupList=classDiffGroups.stream().filter(f->f.originValueMatch==classDiffGroup.originValueMatch.eContainer()).collect(Collectors.toList());
					if(containerclassDiffGroupList.size()>0)
					{
						ClassDiffGroup containerclassDiff = containerclassDiffGroupList.get(0);
						if(containerclassDiff.valueDiff != null)
							classDiffGroup.containerDiff = containerclassDiff.valueDiff;
						else
							classDiffGroup.containerDiff =  
							comparisonResult.comparisonCaDSMDiff.getMatch(classDiffGroup.originValueMatch.eContainer()).getLeft();//containerclassDiff.originValueMatch//sourceOriginDiff
						
					}
					else {
						if(classDiffGroup.originValueMatch.eContainer() != null)
							try {
							classDiffGroup.containerDiff =  
							comparisonResult.comparisonCaDSMDiff.getMatch(classDiffGroup.originValueMatch.eContainer()).getLeft();
							}catch(Exception ex) {
								System.out.println("findAllContainers : Error: "+ex.toString());
								//classDiffGroup.containerDiff = classDiffGroup.left.get(0).dependsOn.stream().filter(f->f.valueDiff !=null).collect(Collectors.toList()).get(0).valueDiff;
							}
						else 
							classDiffGroup.containerDiff = classDiffGroup.left.get(0).dependsOn.stream().filter(f->f.valueDiff !=null).collect(Collectors.toList()).get(0).valueDiff;
					}				
				}
				else if(
						classDiffGroup.left.size()>0 && 
						classDiffGroup.left.get(0).diffKind == DifferenceKind.ADD && classDiffGroup.left.get(0).originContainerMatch !=null){
					classDiffGroup.containerDiff =  
							comparisonResult.comparisonCaDSMDiff.getMatch(classDiffGroup.left.get(0).originContainerMatch).getLeft();
				}else if(
						classDiffGroup.left.size()>0 && 
						classDiffGroup.left.get(0).diffKind == DifferenceKind.ADD && classDiffGroup.left.get(0).dependsOn.size()>0){
					classDiffGroup.containerDiff = 
							classDiffGroup.left.get(0).dependsOn.stream().filter(
									f->f.valueDiff !=null).collect(Collectors.toList()).get(0).valueDiff;
				}
				else if(
						classDiffGroup.right.size()>0 && 
						classDiffGroup.right.get(0).diffKind == DifferenceKind.ADD&& classDiffGroup.right.get(0).originContainerMatch !=null){
					classDiffGroup.containerDiff =  
							comparisonResult.comparisonCaDSMDiff.getMatch(
									classDiffGroup.right.get(0).originContainerMatch).getLeft();
				}else if(
						classDiffGroup.right.size()>0 && 
						classDiffGroup.right.get(0).diffKind == DifferenceKind.ADD && classDiffGroup.left.get(0).dependsOn.size()>0){
					classDiffGroup.containerDiff =   
							classDiffGroup.right.get(0).dependsOn.stream().filter(
									f->f.valueDiff !=null).collect(Collectors.toList()).get(0).valueDiff;
				}		
				else {
					System.out.println("COULD NOT set the container !!! : " +classDiffGroup.valueDiff.toString());
				}
			}
			catch(Exception ex) 
			{
				System.out.println("COULD NOT set the container !!! : " + ex.toString());
			}
			
			
		}
		List<ClassDiffGroup> classDiffGroupsNotContainerFound = 
				classDiffGroups.stream().filter(f->f.containerDiff == null).collect(Collectors.toList());
		for(ClassDiffGroup classDiffGroup:classDiffGroupsNotContainerFound) {
			System.out.println("COULD NOT find the container !!! : " +classDiffGroup.toString());
		}
		
		
	}
	
	//******************************************************************************************
	public void createAllLinksFromContainer(ArrayList<ClassDiffGroup> classDiffGroups) {	
		for(ClassDiffGroup classDiffGroup:classDiffGroups) {
			//Not MOVE?/MOVE?
			if(classDiffGroup.containerDiff != null && classDiffGroup.valueDiff != null) {
				EReference refType = null;
				try {
					if(classDiffGroup.left.size()>0)					
						refType = classDiffGroup.containerDiff.eClass().getEAllReferences().stream().filter(
								r->r.getName().equalsIgnoreCase(
										classDiffGroup.left.get(0).referenceChangeDiff.getReference().getName())).collect(
											Collectors.toList()).get(0);
					else if(classDiffGroup.right.size()>0)					
						refType = classDiffGroup.containerDiff.eClass().getEAllReferences().stream().filter(
								r->r.getName().equalsIgnoreCase(
										classDiffGroup.right.get(0).referenceChangeDiff.getReference().getName())).collect(
											Collectors.toList()).get(0);
					else {
						//child class MODIFY
						refType = classDiffGroup.originValueMatch.eContainmentFeature();
					}
					if(refType == null) {
						System.out.println("COULD NOT find the refType !!! : " +classDiffGroup.toString());
					}
					else {
						
						SetEFeature(classDiffGroup.containerDiff, refType, classDiffGroup.valueDiff);
					}
				}catch(Exception ex) {
					System.out.println("COULD NOT find the refType !!! : " +classDiffGroup.toString());
				}
			}			
		}
	}
	

	//******************************************************************************************
	public EObject createNewAssociationDiffClassForMovedContainer(EObject sourceObject, EObject valueObject, DifferenceKind differenceKindLeft, DifferenceKind differenceKindRight) {
		EClass valueEClass = valueObject.eClass();
		String  diffRefClassName= "";
		try {
			diffRefClassName=sourceObject .eClass().getESuperTypes().size()>0 
					&& sourceObject .eClass().getName().toLowerCase().equals("diff"+sourceObject .eClass().getESuperTypes().get(0).getName().toLowerCase())?
							sourceObject .eClass().getName():	 "Diff" + sourceObject .eClass().getName();
		}catch(Exception ex) {
			if(sourceObject != null)
				diffRefClassName = "Diff" + sourceObject .eClass().getName();
			else
				return null;
		}	
				
		String  nameRefType = valueObject.eContainmentFeature().getName();
		String 	diffEReferenceClassName	= diffRefClassName + "_" + nameRefType;
		EClassifier diffEReferenceEClassifier	= valueEClass.getEPackage().getEClassifier(diffEReferenceClassName);
		EClass		diffEReferenceEClass		= (EClass)diffEReferenceEClassifier;						
		EObject 	diffEReferenceObject		= DiffMM_Factory.create(diffEReferenceEClass);
		if(differenceKindLeft != null)
			setDiffKind("diff_kind",  "DiffKind", diffEReferenceEClass,  
				DifferenceSource.LEFT, differenceKindLeft, diffEReferenceObject);
		if(differenceKindRight != null)
			setDiffKind("diff_kind",  "DiffKind", diffEReferenceEClass,  
				DifferenceSource.RIGHT, differenceKindRight, diffEReferenceObject);		

		return diffEReferenceObject;
	}
	
	//******************************************************************************************
	public EObject createNewAssociationDiffClass(EObject sourceObject, EReference reference, DifferenceKind differenceKindLeft, DifferenceKind differenceKindRight) {
		String  diffRefClassName=
				sourceObject .eClass().getESuperTypes().size()>0 
				&& sourceObject .eClass().getName().toLowerCase().equals("diff"+sourceObject .eClass().getESuperTypes().get(0).getName().toLowerCase())?
						sourceObject .eClass().getName():	 "Diff" + sourceObject .eClass().getName();
		String  nameReference = reference.getName();
		String 	diffEReferenceClassName	= diffRefClassName + "_" + nameReference;
		EClassifier diffEReferenceEClassifier	= DiffMM_Factory.getEPackage().getEClassifier(diffEReferenceClassName);
		EClass		diffEReferenceEClass		= (EClass)diffEReferenceEClassifier;						
		EObject 	diffEReferenceObject		= DiffMM_Factory.create(diffEReferenceEClass);
		if(differenceKindLeft != null)
			setDiffKind("diff_kind",  "DiffKind", diffEReferenceEClass,  
				DifferenceSource.LEFT, differenceKindLeft, diffEReferenceObject);
		if(differenceKindRight != null)
			setDiffKind("diff_kind",  "DiffKind", diffEReferenceEClass,  
				DifferenceSource.RIGHT, differenceKindRight, diffEReferenceObject);		

		return diffEReferenceObject;
	}
	//******************************************************************************************
	public void removeAllOriginValueMatch(ArrayList<ClassDiffGroup> classDiffGroups) {
		//*** Should be called at the end of the transformation
		for(ClassDiffGroup classDiffGroup:classDiffGroups) {
			if(classDiffGroup.originValueMatch != null && classDiffGroup.valueDiff != null 
					&& classDiffGroup.valueDiff.eClass().getEAllSuperTypes().contains(classDiffGroup.originValueMatch.eClass())) {
				EObject originValueMatchDiff012 = 
						comparisonResult.comparisonCaDSMDiff.getMatch(
								classDiffGroup.originValueMatch).getLeft();
				if(originValueMatchDiff012 != null) {
					int sizEContents=originValueMatchDiff012.eContents().size();
					for(int i=0;i<sizEContents;i++) {
						EObject eContentOriginValueDiff012=originValueMatchDiff012.eContents().get(0);
						EReference refType = eContentOriginValueDiff012.eContainmentFeature();						
						SetEFeature(classDiffGroup.valueDiff, refType, eContentOriginValueDiff012);
						//???// Need to copy all references from/to eContent
					}
					EcoreUtil.delete(originValueMatchDiff012);
				}
			}
		}
		
		/*
		for(ClassDiffGroup classDiffGroup:classDiffGroups) {
			if(classDiffGroup.originValueMatch != null && classDiffGroup.valueDiff != null) {
				EObject originValueMatchDiff012 = 
						comparisonResult.comparisonCaDSMDiff.getMatch(
								classDiffGroup.originValueMatch).getLeft();
				if(originValueMatchDiff012 != null) {//classDiffGroup.containerDiff.eContents().contains(originValueMatchDiff012)
					EcoreUtil.delete(originValueMatchDiff012);
				}
			}
		}
		*/
	}
	
	//******************************************************************************************
	
	//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&		
	//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&	
	public void transformClassMoveDiffs(ArrayList<ClassDiffGroup> moveClassDiffGroups) {	
		for(ClassDiffGroup classDiffGroup:moveClassDiffGroups) {						
			if(classDiffGroup.containerDiff != null 
					&& ((classDiffGroup.left.size()>0 && classDiffGroup.left.get(0).diffKind == DifferenceKind.MOVE)
						||(classDiffGroup.right.size()>0 && classDiffGroup.right.get(0).diffKind == DifferenceKind.MOVE))) 
			{	
				if((classDiffGroup.left.size()>0 && classDiffGroup.left.get(0).diffKind == DifferenceKind.MOVE)
					&& (classDiffGroup.right.size()==0 || (classDiffGroup.right.size()>0 && classDiffGroup.right.get(0).diffKind != DifferenceKind.MOVE))) 
				{//MOVE-NON , MOVE-(ADD-DELETE-MODIFY)
					try {

						FineDiffReference sortedFineDiffClassLeft = null;	
						//From source class = classDiffGroup.containerDiff (moved from container) -> DiffAssociation(diff_kind=DELETE)-> moved object
						sortedFineDiffClassLeft = classDiffGroup.left.get(0);
						EObject diffEReferenceDeleteObject = 
								createNewAssociationDiffClassForMovedContainer(classDiffGroup.containerDiff, classDiffGroup.originValueMatch, DifferenceKind.DELETE, null);
						
						EReference refTypeDeleteFrom = classDiffGroup.containerDiff .eClass().getEAllReferences().stream().filter(
								f->f.getEReferenceType().getName()== diffEReferenceDeleteObject.eClass().getName()).collect(Collectors.toList()).get(0);
						SetEFeature(classDiffGroup.containerDiff , refTypeDeleteFrom, diffEReferenceDeleteObject);
						EReference refTypeDeleteTo = diffEReferenceDeleteObject.eClass().getEAllReferences().stream().filter(
								f->f.getName().contains("eType")).collect(Collectors.toList()).get(0);		
					
						//From target class = sortedFineDiffClassLeft.originContainerMatch  (moved to container) -> DiffAssociation(diff_kind=ADD)-> moved object
						EObject diffEReferenceAddObject = 
								createNewAssociationDiffClassForMovedContainer(sortedFineDiffClassLeft.originContainerMatch, sortedFineDiffClassLeft.value, DifferenceKind.ADD, null);
						
						EReference refTypeAddFrom = sortedFineDiffClassLeft.originContainerMatch .eClass().getEAllReferences().stream().filter(
								f->f.getEReferenceType().getName()== diffEReferenceAddObject.eClass().getName()).collect(Collectors.toList()).get(0);

						FineDiffReference sortedFineDiffClassLeft2 = sortedFineDiffClassLeft ;
						
						//sortedFineDiffClassLeft.originContainerMatch (moved to)
						// Check if it is modified use it
						List<ClassDiffGroup> movedToClassDiffGroups =
								comparisonResult.classDiffGroups.stream().filter(f->f.originValueMatch == sortedFineDiffClassLeft2.originContainerMatch).collect(Collectors.toList());
						
						if(movedToClassDiffGroups.size()>0 && movedToClassDiffGroups.get(0).valueDiff != null)
							SetEFeature(movedToClassDiffGroups.get(0).valueDiff , refTypeAddFrom, diffEReferenceAddObject);
						else {
							// otherwise use counterpart of sortedFineDiffClassLeft.originContainerMatch in diff012
							EObject originContainerMatchInDiff012  = 
									comparisonResult.comparisonCaDSMDiff.getMatch(
											sortedFineDiffClassLeft.originContainerMatch).getLeft();
								SetEFeature(originContainerMatchInDiff012, refTypeAddFrom, diffEReferenceAddObject);
						}	
						//Find reference from diffEReferenceAddObject to moved value (sortedFineDiffClassLeft.originValueMatch)
						
						 EReference refTypeAddTo = diffEReferenceAddObject.eClass().getEAllReferences().stream().filter(
									f->f.getName().contains("eType")).collect(Collectors.toList()).get(0);	
						
						if(classDiffGroup.right.size()==0 && classDiffGroup.valueDiff == null)
						{
							EObject originValueMatchInDiff012  = 
								comparisonResult.comparisonCaDSMDiff.getMatch(
										sortedFineDiffClassLeft.originValueMatch).getLeft();
							SetEFeature(diffEReferenceDeleteObject, refTypeDeleteTo, originValueMatchInDiff012);
							SetEFeature(diffEReferenceAddObject, refTypeAddTo, originValueMatchInDiff012);
						}
						else {
							SetEFeature(diffEReferenceDeleteObject, refTypeDeleteTo, classDiffGroup.valueDiff);
							SetEFeature(diffEReferenceAddObject, refTypeAddTo, classDiffGroup.valueDiff);
						}
						classDiffGroup.moveAssociationDiffs.add(diffEReferenceDeleteObject);
						classDiffGroup.moveAssociationDiffs.add(diffEReferenceAddObject);
						
				}catch(Exception ex) {
					System.out.println("MOVE1: "+ex);
				}
				} 
				else if((classDiffGroup.left.size()==0  || (classDiffGroup.left.size()>0 && classDiffGroup.left.get(0).diffKind != DifferenceKind.MOVE))
						&& (classDiffGroup.right.size()>0 && classDiffGroup.right.get(0).diffKind == DifferenceKind.MOVE)) 
				{//NON-MOVE , (ADD-DELETE-MODIFY)-MOVE
					try{
						FineDiffReference sortedFineDiffClassRight = null;	
						//From source class = classDiffGroup.containerDiff (moved from container) -> DiffAssociation(diff_kind=DELETE)-> moved object
						sortedFineDiffClassRight = classDiffGroup.right.get(0);
						EObject diffEReferenceDeleteObject = 
								createNewAssociationDiffClassForMovedContainer(classDiffGroup.containerDiff, classDiffGroup.originValueMatch, null, DifferenceKind.DELETE);
						
						EReference refTypeDeleteFrom = classDiffGroup.containerDiff .eClass().getEAllReferences().stream().filter(
								f->f.getEReferenceType().getName()== diffEReferenceDeleteObject.eClass().getName()).collect(Collectors.toList()).get(0);
						SetEFeature(classDiffGroup.containerDiff , refTypeDeleteFrom, diffEReferenceDeleteObject);
						EReference refTypeDeleteTo = diffEReferenceDeleteObject.eClass().getEAllReferences().stream().filter(
								f->f.getName().contains("eType")).collect(Collectors.toList()).get(0);
						
						//From target class = sortedFineDiffClassLeft.originContainerMatch  (moved to container) -> DiffAssociation(diff_kind=ADD)-> moved object
						
						EObject diffEReferenceAddObject = 
								createNewAssociationDiffClassForMovedContainer(sortedFineDiffClassRight.originContainerMatch, sortedFineDiffClassRight.value, null, DifferenceKind.ADD);
						
						EReference refTypeAddFrom = sortedFineDiffClassRight.originContainerMatch .eClass().getEAllReferences().stream().filter(
								f->f.getEReferenceType().getName()== diffEReferenceAddObject.eClass().getName()).collect(Collectors.toList()).get(0);

						FineDiffReference sortedFineDiffClassLeft2 = sortedFineDiffClassRight ;
						
						//sortedFineDiffClassLeft.originContainerMatch (moved to)
						// Check if it is modified use it
						List<ClassDiffGroup> movedToClassDiffGroups =
								comparisonResult.classDiffGroups.stream().filter(f->f.originValueMatch == sortedFineDiffClassLeft2.originContainerMatch).collect(Collectors.toList());
						
						if(movedToClassDiffGroups.size()>0 && movedToClassDiffGroups.get(0).valueDiff != null)
							SetEFeature(movedToClassDiffGroups.get(0).valueDiff , refTypeAddFrom, diffEReferenceAddObject);
						else {
							// otherwise use counterpart of sortedFineDiffClassLeft.originContainerMatch in diff012
							EObject originContainerMatchInDiff012  = 
									comparisonResult.comparisonCaDSMDiff.getMatch(
											sortedFineDiffClassRight.originContainerMatch).getLeft();
								SetEFeature(originContainerMatchInDiff012, refTypeAddFrom, diffEReferenceAddObject);
						}	
						//Find reference from diffEReferenceAddObject to moved value (sortedFineDiffClassLeft.originValueMatch)
						
						 EReference refTypeAddTo = diffEReferenceAddObject.eClass().getEAllReferences().stream().filter(
									f->f.getName().contains("eType")).collect(Collectors.toList()).get(0);							

						if(classDiffGroup.left.size()==0 && classDiffGroup.valueDiff == null)
						{
							EObject originValueMatchInDiff012  = 
								comparisonResult.comparisonCaDSMDiff.getMatch(
										sortedFineDiffClassRight.originValueMatch).getLeft();
							SetEFeature(diffEReferenceDeleteObject, refTypeDeleteTo, originValueMatchInDiff012);
							SetEFeature(diffEReferenceAddObject, refTypeAddTo, originValueMatchInDiff012);
						}
						else {
							SetEFeature(diffEReferenceDeleteObject, refTypeDeleteTo, classDiffGroup.valueDiff);
							SetEFeature(diffEReferenceAddObject, refTypeAddTo, classDiffGroup.valueDiff);
						}

						classDiffGroup.moveAssociationDiffs.add(diffEReferenceDeleteObject);
						classDiffGroup.moveAssociationDiffs.add(diffEReferenceAddObject);
						
					}catch(Exception ex) {
						System.out.println("MOVE2: "+ex);
					}
				}
				else if(classDiffGroup.left.size()> 0 && classDiffGroup.left.get(0).diffKind == DifferenceKind.MOVE
						&& classDiffGroup.right.size()>0  &&  classDiffGroup.right.get(0).diffKind == DifferenceKind.MOVE) 
				{
					try {

						FineDiffReference sortedFineDiffClassLeft = null;	
						FineDiffReference sortedFineDiffClassRight = null;							
						sortedFineDiffClassLeft = classDiffGroup.left.get(0);
						sortedFineDiffClassRight = classDiffGroup.right.get(0);
						//They Both moved from same source
						// but may moved to same or different targets
						EObject 	diffEReferenceDeleteObject = createNewAssociationDiffClassForMovedContainer(classDiffGroup.containerDiff, classDiffGroup.originValueMatch, DifferenceKind.DELETE, DifferenceKind.DELETE);
												
						EReference refTypeDeleteFrom = classDiffGroup.containerDiff .eClass().getEAllReferences().stream().filter(
								f->f.getEReferenceType().getName()== diffEReferenceDeleteObject.eClass().getName()).collect(Collectors.toList()).get(0);
						SetEFeature(classDiffGroup.containerDiff , refTypeDeleteFrom, diffEReferenceDeleteObject);
						EReference refTypeDeleteTo = diffEReferenceDeleteObject.eClass().getEAllReferences().stream().filter(
								f->f.getName().contains("eType")).collect(Collectors.toList()).get(0);		

						classDiffGroup.moveAssociationDiffs.add(diffEReferenceDeleteObject);
						///////////////////////////////////
						if(sortedFineDiffClassLeft.originContainerMatch == sortedFineDiffClassRight.originContainerMatch)
						{//MOVE to the same Targets
							EObject 	diffEReferenceAddObject = createNewAssociationDiffClassForMovedContainer(sortedFineDiffClassRight.originContainerMatch, sortedFineDiffClassRight.value, DifferenceKind.ADD, DifferenceKind.ADD);
														
							EReference refTypeAddFrom = sortedFineDiffClassLeft.originContainerMatch .eClass().getEAllReferences().stream().filter(
									f->f.getEReferenceType().getName()== diffEReferenceAddObject.eClass().getName()).collect(Collectors.toList()).get(0);

							FineDiffReference sortedFineDiffClassLeft2 = sortedFineDiffClassLeft ;
							
							//sortedFineDiffClassLeft.originContainerMatch (moved to)
							// Check if it is modified use it
							List<ClassDiffGroup> movedToClassDiffGroups =
									comparisonResult.classDiffGroups.stream().filter(f->f.originValueMatch == sortedFineDiffClassLeft2.originContainerMatch).collect(Collectors.toList());
							
							if(movedToClassDiffGroups.size()>0 && movedToClassDiffGroups.get(0).valueDiff != null)
								SetEFeature(movedToClassDiffGroups.get(0).valueDiff , refTypeAddFrom, diffEReferenceAddObject);
							else {
								// otherwise use counterpart of sortedFineDiffClassLeft.originContainerMatch in diff012
								EObject originContainerMatchInDiff012  = 
										comparisonResult.comparisonCaDSMDiff.getMatch(
												sortedFineDiffClassLeft.originContainerMatch).getLeft();
									SetEFeature(originContainerMatchInDiff012, refTypeAddFrom, diffEReferenceAddObject);
							}
		
							//Find reference from diffEReferenceAddObject to moved value (sortedFineDiffClassLeft.originValueMatch)
							EReference refTypeAddTo = diffEReferenceAddObject.eClass().getEAllReferences().stream().filter(
										f->f.getName().contains("eType")).collect(Collectors.toList()).get(0);	
							
							if(classDiffGroup.valueDiff == null) //classDiffGroup.right.size()==0 && 
							{
								EObject originValueMatchInDiff012  = 
									comparisonResult.comparisonCaDSMDiff.getMatch(
											sortedFineDiffClassLeft.originValueMatch).getLeft();
								SetEFeature(diffEReferenceDeleteObject, refTypeDeleteTo, originValueMatchInDiff012);
								SetEFeature(diffEReferenceAddObject, refTypeAddTo, originValueMatchInDiff012);
							}
							else {
								SetEFeature(diffEReferenceDeleteObject, refTypeDeleteTo, classDiffGroup.valueDiff);
								SetEFeature(diffEReferenceAddObject, refTypeAddTo, classDiffGroup.valueDiff);
							}
							
							setChangeStatus(diffEReferenceDeleteObject, "changeStatus",changeStatusEQUIVALENT,diffEReferenceDeleteObject.eClass());	
							setChangeStatus(diffEReferenceAddObject, "changeStatus",changeStatusEQUIVALENT,diffEReferenceAddObject.eClass());	

							classDiffGroup.moveAssociationDiffs.add(diffEReferenceDeleteObject);
							classDiffGroup.moveAssociationDiffs.add(diffEReferenceAddObject);
						} 
						else {//MOVE to different Targets
							//First Target
							{
								EObject 	diffEReferenceAddObjectTarget1 = createNewAssociationDiffClassForMovedContainer(sortedFineDiffClassLeft.originContainerMatchMovedFrom, sortedFineDiffClassLeft.value, DifferenceKind.ADD, null);
															
								EReference refTypeAddFrom = sortedFineDiffClassLeft.originContainerMatchMovedFrom .eClass().getEAllReferences().stream().filter(
										f->f.getEReferenceType().getName()== diffEReferenceAddObjectTarget1.eClass().getName()).collect(Collectors.toList()).get(0);

								FineDiffReference sortedFineDiffClassLeft2 = sortedFineDiffClassLeft;
								
								//sortedFineDiffClassLeft.originContainerMatch (moved to)
								// Check if it is modified use it
								List<ClassDiffGroup> movedToClassDiffGroups =
										comparisonResult.classDiffGroups.stream().filter(f->f.originValueMatch == sortedFineDiffClassLeft2.dependsOn.get(0).valueDiff).collect(Collectors.toList());
								
								if(movedToClassDiffGroups.size()>0 && movedToClassDiffGroups.get(0).valueDiff != null)
									SetEFeature(movedToClassDiffGroups.get(0).valueDiff , refTypeAddFrom, diffEReferenceAddObjectTarget1);
								else if (sortedFineDiffClassLeft2.dependsOn.get(0).valueDiff != null)
									SetEFeature(sortedFineDiffClassLeft2.dependsOn.get(0).valueDiff , refTypeAddFrom, diffEReferenceAddObjectTarget1);
								else {
									// otherwise use counterpart of sortedFineDiffClassLeft.originContainerMatch in diff012
									EObject originContainerMatchInDiff012  = 
											comparisonResult.comparisonCaDSMDiff.getMatch(
													sortedFineDiffClassLeft.dependsOn.get(0).originValueMatch).getLeft();
										SetEFeature(originContainerMatchInDiff012, refTypeAddFrom, diffEReferenceAddObjectTarget1);
								}			
								//Find reference from diffEReferenceAddObject to moved value (sortedFineDiffClassLeft.originValueMatch)
								
								 EReference refTypeAddTo = diffEReferenceAddObjectTarget1.eClass().getEAllReferences().stream().filter(
											f->f.getName().contains("eType")).collect(Collectors.toList()).get(0);	
								
								if(classDiffGroup.valueDiff == null)
								{
									EObject originValueMatchInDiff012  = 
										comparisonResult.comparisonCaDSMDiff.getMatch(
												sortedFineDiffClassLeft.originValueMatch).getLeft();
									//The following needs to be repeated once
									SetEFeature(diffEReferenceDeleteObject, refTypeDeleteTo, originValueMatchInDiff012);
									SetEFeature(diffEReferenceAddObjectTarget1, refTypeAddTo, originValueMatchInDiff012);
								}
								else {
									//The following needs to be repeated once
									SetEFeature(diffEReferenceDeleteObject, refTypeDeleteTo, classDiffGroup.valueDiff);
									SetEFeature(diffEReferenceAddObjectTarget1, refTypeAddTo, classDiffGroup.valueDiff);
								}
								setChangeStatus(diffEReferenceDeleteObject, "changeStatus",changeStatusCONTRADICTING,diffEReferenceDeleteObject.eClass());	
								setChangeStatus(diffEReferenceAddObjectTarget1, "changeStatus",changeStatusCONTRADICTING,diffEReferenceAddObjectTarget1.eClass());

								classDiffGroup.moveAssociationDiffs.add(diffEReferenceAddObjectTarget1);
							}
							//Second Target
							{								
								EObject 	diffEReferenceAddObjectTarget2 = createNewAssociationDiffClassForMovedContainer(sortedFineDiffClassRight.originContainerMatchMovedFrom, sortedFineDiffClassRight.value, null, DifferenceKind.ADD);
								
								EReference refTypeAddFrom = sortedFineDiffClassRight.originContainerMatchMovedFrom .eClass().getEAllReferences().stream().filter(
										f->f.getEReferenceType().getName()== diffEReferenceAddObjectTarget2.eClass().getName()).collect(Collectors.toList()).get(0);
								//sortedFineDiffClassLeft.originContainerMatch (moved to)
								// Check if it is modified use it
								FineDiffReference sortedFineDiffClassLeft2 = sortedFineDiffClassRight ;
								List<ClassDiffGroup> movedToClassDiffGroups =
										comparisonResult.classDiffGroups.stream().filter(f->f.valueDiff!=null && f.originValueMatch == sortedFineDiffClassLeft2.dependsOn.get(0).valueDiff).collect(Collectors.toList());
								
								if(movedToClassDiffGroups.size()>0 && movedToClassDiffGroups.get(0).valueDiff != null)
									SetEFeature(movedToClassDiffGroups.get(0).valueDiff , refTypeAddFrom, diffEReferenceAddObjectTarget2);
								else {
									// otherwise use counterpart of sortedFineDiffClassLeft.originContainerMatch in diff012
									EObject originContainerMatchInDiff012  = 
											comparisonResult.comparisonCaDSMDiff.getMatch(
													sortedFineDiffClassRight.dependsOn.get(0).originValueMatch).getLeft();
										SetEFeature(originContainerMatchInDiff012, refTypeAddFrom, diffEReferenceAddObjectTarget2);
								}			
								//Find reference from diffEReferenceAddObject to moved value (sortedFineDiffClassLeft.originValueMatch)
								EReference refTypeAddTo = diffEReferenceAddObjectTarget2.eClass().getEAllReferences().stream().filter(
											f->f.getName().contains("eType")).collect(Collectors.toList()).get(0);	
								
								if(classDiffGroup.valueDiff == null)
								{
									EObject originValueMatchInDiff012  = 
										comparisonResult.comparisonCaDSMDiff.getMatch(
												sortedFineDiffClassRight.originValueMatch).getLeft();
									//The following needs to be repeated once
									SetEFeature(diffEReferenceDeleteObject, refTypeDeleteTo, originValueMatchInDiff012);
									SetEFeature(diffEReferenceAddObjectTarget2, refTypeAddTo, originValueMatchInDiff012);
								}
								else {
									//The following needs to be repeated once
									SetEFeature(diffEReferenceDeleteObject, refTypeDeleteTo, classDiffGroup.valueDiff);
									SetEFeature(diffEReferenceAddObjectTarget2, refTypeAddTo, classDiffGroup.valueDiff);
								}
								setChangeStatus(diffEReferenceDeleteObject, "changeStatus",changeStatusCONTRADICTING,diffEReferenceDeleteObject.eClass());	
								setChangeStatus(diffEReferenceAddObjectTarget2, "changeStatus",changeStatusCONTRADICTING,diffEReferenceAddObjectTarget2.eClass());
								classDiffGroup.moveAssociationDiffs.add(diffEReferenceAddObjectTarget2);
							}							
						}
					}catch(Exception ex) {
						System.out.println("MOVE3: "+ex);
					}				
				}
			}
		}
	}
	//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&	
	public void calculateFineDiffClassConflicts(ArrayList<ClassDiffGroup> classDiffGroups) {
		List<ClassDiffGroup> classDiffGroupsVDs =  classDiffGroups.stream().filter(f->f.valueDiff != null).collect(Collectors.toList());
		for(ClassDiffGroup cdr:classDiffGroupsVDs)
		{
			//Change Status for Attribute Diffs already calculated
			Object ChangeStatus =  EMFUtils.getAttrValueByAttrNameNullDefault(cdr.valueDiff, "ChangeStatus");
			if(ChangeStatus != null && ChangeStatus.toString().equals("CONTRADICTING"))
				continue;
			
			Set<Conflict> classConflicts= new HashSet<Conflict>();
			for(FineDiffReference fdr:cdr.left) 
			{
				if(fdr.diff.getConflict() != null)
					classConflicts.add(fdr.diff.getConflict());
			}
			for(FineDiffReference fdr:cdr.right)
			{
				if(fdr.diff.getConflict() != null)
					classConflicts.add(fdr.diff.getConflict());
			}
			
			for(Conflict c:classConflicts) {
				if(c.getKind() == ConflictKind.REAL)
				{
					setChangeStatus(cdr.valueDiff, "changeStatus",changeStatusCONTRADICTING, cdr.valueDiff.eClass());
				}
				else if(c.getKind() == ConflictKind.PSEUDO)
				{
					setChangeStatus(cdr.valueDiff, "changeStatus",changeStatusEQUIVALENT, cdr.valueDiff.eClass());
				}
					
			}
			
			
			
			/*
			Set<Conflict> attrConflicts= new HashSet<Conflict>();
			for(Entry<Object, List<FineDiffAttribute>> entryAttrGroup:cdr.fdag.attributesGroupByName.entrySet()) {
				Object attributeName = entryAttrGroup.getKey();
				List<FineDiffAttribute> fdAttrs = entryAttrGroup.getValue();
				for(FineDiffAttribute fdAttr:fdAttrs) {
					if(fdAttr.diff.getConflict() != null)
						attrConflicts.add(fdAttr.diff.getConflict());
				}				
			}
			*/
			
			
			//for(FineDiffAttributeGroupProps fdagProps:cdr.fdag.fineDiffAttributeGroupProps) {
			//	String attributeName = fdagProps.attributeName;
				
				//setValueDiff(valueDiff, changeStatusAttributeName, ChangeStatus.CONTRADICTING, DSDiffEClass, versionLeftInfo, fdagProps.originalAttributeClass);							

				/*fdagProps.isProcessed = true;
				String newAttributeName = "new_"+fdagProps.attributeName;
				if(fdagProps.vLeftValue!=null) {
					setValueDiff(valueDiff, newAttributeName, fdagProps.vLeftValue, DSDiffEClass, versionLeftInfo, null);
					setDiffKind("diff_kind",  "DiffKind", DSDiffEClass,   
							DifferenceSource.LEFT, DifferenceKind.CHANGE, valueDiff);
				}
				if(fdagProps.vRightValue!=null) {
					setValueDiff(valueDiff, newAttributeName, fdagProps.vRightValue, DSDiffEClass, versionRightInfo, null);
					setDiffKind("diff_kind",  "DiffKind", DSDiffEClass,   
							DifferenceSource.RIGHT, DifferenceKind.CHANGE, valueDiff);
				}	
				
				
				if(fdagProps.vLeftValue!=null && fdagProps.vRightValue!=null 
						&& !fdagProps.vLeftValue.toString().equals(fdagProps.vRightValue.toString())) {
					String changeStatusAttributeName = fdagProps.attributeName+"ChangeStatus";
					setValueDiff(valueDiff, changeStatusAttributeName, ChangeStatus.CONTRADICTING, DSDiffEClass, versionLeftInfo, fdagProps.originalAttributeClass);							
					setValueDiff(valueDiff, "changeStatus", ChangeStatus.CONTRADICTING, DSDiffEClass, null, null);	
				}*/
			//}
			
			
			
				
			
			//conflict.getLeftDifferences();
			//conflict.getRightDifferences();
				/*
			if(conflict == null)
				return;
			else if(conflict.getKind() == ConflictKind.PSEUDO) 
			{
				setChangeStatus(diffAssociation, "changeStatus",changeStatusEQUIVALENT, diffAssociation.eClass());
			}
			else if(conflict.getKind() == ConflictKind.REAL) 
			{
				setChangeStatus(diffAssociation, "changeStatus",changeStatusCONTRADICTING, diffAssociation.eClass());
			}*/
		}
		
		
		
	}


	
	//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
	
	
	public void calculateAssociationValueDiffContainerDiff(List<FineDiffReference> sortedFineDiffAssociations) {
		// container-diffs and value-diffs for newly added classes
		for(FineDiffReference fda:sortedFineDiffAssociations) {
			//(changed) Targets of the association
			if(fda.valueDiff==null) {
				if(fda.originValueMatch != null) {
					List<ClassDiffGroup> result = comparisonResult.classDiffGroups.stream().filter(f->f.originValueMatch == fda.originValueMatch).collect(Collectors.toList());
					if(result.size()>0)
						fda.valueDiff = result.get(0).valueDiff;
				}
				else if(fda.value != null) {
					List<ClassDiffGroup> result = comparisonResult.classDiffGroups.stream().filter(f->f.value == fda.value).collect(Collectors.toList());
					if(result.size()>0)
						fda.valueDiff = result.get(0).valueDiff;					
				}
			}
			//(changed) Sources of the association
			if(fda.containerDiff==null) {
				if(fda.originContainerMatch != null) {
					List<ClassDiffGroup> result = comparisonResult.classDiffGroups.stream().filter(f->f.valueDiff != null && f.originValueMatch == fda.originContainerMatch).collect(Collectors.toList());
					if(result.size()>0)
						fda.containerDiff = result.get(0).valueDiff;
				}
				else if(fda.leftContainerMatch != null) {
					List<ClassDiffGroup> result = comparisonResult.classDiffGroups.stream().filter(f->f.valueDiff != null && f.value == fda.leftContainerMatch).collect(Collectors.toList());
					if(result.size()>0)
						fda.containerDiff = result.get(0).valueDiff;					
				}
				else if(fda.rightContainerMatch != null) {
					List<ClassDiffGroup> result = comparisonResult.classDiffGroups.stream().filter(f->f.valueDiff != null && f.value == fda.rightContainerMatch).collect(Collectors.toList());
					if(result.size()>0)
						fda.containerDiff = result.get(0).valueDiff;					
				}
			}				
		}
	}
	//******************************************************************************************
	public void claculateAssociationDiffGroups(
			List<FineDiffReference> fineDiffAssociations,
			ArrayList<AssociationDiffGroup> associationDiffGroups) 
	{		
		Map<EObject, Map<EReference, List<FineDiffReference>>> mapGroupByContainerDiff= new HashMap();
		mapGroupByContainerDiff = 
				fineDiffAssociations.stream()
				.filter(p -> p.getContainerDiff() != null)
				.collect(Collectors.groupingBy(FineDiffReference::getContainerDiff, 
						Collectors.groupingBy(FineDiffReference::getReference)));
		
		for (Entry<EObject, Map<EReference, List<FineDiffReference>>> entryContainerDiff : mapGroupByContainerDiff.entrySet()) {			
			for (var entryEReference: entryContainerDiff.getValue().entrySet()) {	
				AssociationDiffGroup associationDiffGroup = new AssociationDiffGroup();
				associationDiffGroup.containerDiff_Source = entryContainerDiff.getKey();				
				associationDiffGroup.reference=entryEReference.getKey();
				associationDiffGroups.add(associationDiffGroup);
				
				//There are one or multiple targets
				for(FineDiffReference entryEReferenceValue:entryEReference.getValue()) {
					if(entryEReferenceValue.diff.getSource() == DifferenceSource.LEFT) {
						associationDiffGroup.left.add(entryEReferenceValue);
					}
					else {
						associationDiffGroup.right.add(entryEReferenceValue);
					}
				}				
			}
		}
		/////////////////////////////////
		Map<EObject, Map<EReference, List<FineDiffReference>>> mapOriginContainerMatch= new HashMap();
		mapOriginContainerMatch = 
				fineDiffAssociations.stream()
				.filter(p -> p.getOriginContainerMatch() != null)
				.collect(Collectors.groupingBy(FineDiffReference::getOriginContainerMatch, 
						Collectors.groupingBy(FineDiffReference::getReference)));
		
		for (Entry<EObject, Map<EReference, List<FineDiffReference>>> entryOriginContainer : mapOriginContainerMatch.entrySet()) {			
			for (var entryEReference: entryOriginContainer.getValue().entrySet()) {	
				AssociationDiffGroup associationDiffGroup = new AssociationDiffGroup();
				associationDiffGroup.originContainerMatch_Source = entryOriginContainer.getKey();				
				associationDiffGroup.reference=entryEReference.getKey();
				associationDiffGroups.add(associationDiffGroup);
				
				for(FineDiffReference entryEReferenceValue:entryEReference.getValue()) {					
					if(entryEReferenceValue.diff.getSource() == DifferenceSource.LEFT) {
						associationDiffGroup.left.add(entryEReferenceValue);
					}
					else {
						associationDiffGroup.right.add(entryEReferenceValue);
					}
				}				
			}
		}		
	}
	//******************************************************************************************	
	public EObject findSetSource(AssociationDiffGroup associationDiffGroup, FineDiffReference LeftOrRight) {
		EObject source = associationDiffGroup.containerDiff_Source;
		if(source == null && associationDiffGroup.originContainerMatch_Source !=null)
			source  = comparisonResult.comparisonCaDSMDiff.getMatch(associationDiffGroup.originContainerMatch_Source).getLeft();
		else if(source == null && associationDiffGroup.originContainerMatch_Source == null && LeftOrRight.containerDiff != null)
			source = associationDiffGroup.containerDiff_Source = LeftOrRight.containerDiff;
		else if(LeftOrRight.originContainerMatch != null)
			source = associationDiffGroup.originContainerMatch_Source =
					comparisonResult.comparisonCaDSMDiff.getMatch(LeftOrRight.originContainerMatch).getLeft();
	
		return source;
	}
	//******************************************************************************************
	public EObject findSetTarget(AssociationDiffGroup associationDiffGroup, FineDiffReference LeftOrRight) {
		EObject target = LeftOrRight.valueDiff;
		if(target == null && LeftOrRight.originValueMatch !=null)
			target = comparisonResult.comparisonCaDSMDiff.getMatch(LeftOrRight.originValueMatch).getLeft();
		if(target == null && LeftOrRight.originValueMatch == null && LeftOrRight.value != null 
				&& comparisonResult.comparisonCaDSMDiff.getMatch(LeftOrRight.value) != null)
			target = comparisonResult.comparisonCaDSMDiff.getMatch(LeftOrRight.value).getLeft();
		if(target == null) {
			String valueName = EMFUtils.getAttrValueByAttrNameNullDefault(LeftOrRight.value,"name").toString();
			List<ClassDiffGroup> valueList = comparisonResult.classDiffGroups.stream().filter(f->f.valueDiff!=null && 
					EMFUtils.getAttrValueByAttrNameNullDefault(f.valueDiff,"name").toString().equals(valueName)).collect(Collectors.toList());
			if(valueList.size()>0) {
				List<ClassDiffGroup> valDiffList = valueList.stream().filter(f->f.value == LeftOrRight.value).collect(Collectors.toList());
				if(valDiffList.size()>0)
					return valDiffList.get(0).valueDiff;
				else if(LeftOrRight.value.eContainer() != null)
				{
					valDiffList = valueList.stream().filter(f->f.originValueMatch != null && f.originValueMatch.eContainer()!= null && f.originValueMatch.eContainer() == LeftOrRight.value.eContainer()).collect(Collectors.toList());
					if(valDiffList.size()>0 && valDiffList.get(0).valueDiff != null)
						return valDiffList.get(0).valueDiff;
					else if(valDiffList.size()>0 && valDiffList.get(0).originValueMatch != null)
						return comparisonResult.comparisonCaDSMDiff.getMatch(valDiffList.get(0).originValueMatch).getLeft();
				}
			}
		}
		//MOVES
		if(target == null) {
			String valueName = EMFUtils.getAttrValueByAttrNameNullDefault(LeftOrRight.value,"name").toString();
			//List<ClassDiffGroup> valueList = comparisonResult.classDiffGroups.stream().filter(f->f.valueDiff!=null && 
			//		EMFUtils.getAttrValueByAttrNameNullDefault(f.valueDiff,"name").toString().equals(valueName)).collect(Collectors.toList());
			// 		EMFUtils.getAttrValueByAttrNameNullDefault(f.valueDiff,"name").toString().equals(valueName))
			List<ClassDiffGroup> valueList = comparisonResult.classDiffGroups.stream().filter(f->
			f.valueDiff!=null && 
			EMFUtils.getAttrValueByAttrNameNullDefault(f.valueDiff,"name").toString().equals(valueName)&&	
			f.value != LeftOrRight.value &&
			f.moveAssociationDiffs.size() > 0 ).collect(Collectors.toList());
			if(valueList.size()>0)
			{
				for(var v:valueList) {
					if(v.left.stream().filter(f->f.value.eContainer()==f.value.eContainer()).collect(Collectors.toList()).size() > 0)
						return v.valueDiff;
					else if(v.right.stream().filter(f->f.value.eContainer()==f.value.eContainer()).collect(Collectors.toList()).size() > 0)
						return v.valueDiff;
				}
			}
			

		}
		
		
		
	
		return target;
	}
	//******************************************************************************************
	public EObject findDiffObjectByOriginObject(EObject originObject) {
		List<ClassDiffGroup> result = 
				comparisonResult.classDiffGroups.stream().filter(f->f.originValueMatch == originObject).collect(Collectors.toList());
		if(result.size()>0 && result.get(0).valueDiff != null)
			return result.get(0).valueDiff;
		else if(comparisonResult.comparisonCaDSMDiff.getMatch(originObject) != null)
			return comparisonResult.comparisonCaDSMDiff.getMatch(originObject).getLeft();
		return null;
	}

	//******************************************************************************************	
	public void setChangeStatusDiffAssociation(FineDiffReference fdr, EObject diffAssociation) {
		Conflict conflict= fdr.diff.getConflict();
		//conflict.getLeftDifferences();
		//conflict.getRightDifferences();
		if(conflict == null)
			return;
		else if(conflict.getKind() == ConflictKind.PSEUDO) 
		{
			setChangeStatus(diffAssociation, "changeStatus",changeStatusEQUIVALENT, diffAssociation.eClass());
		}
		else if(conflict.getKind() == ConflictKind.REAL) 
		{
			setChangeStatus(diffAssociation, "changeStatus",changeStatusCONTRADICTING, diffAssociation.eClass());
		}
	}
	//******************************************************************************************	
	public void mergeEquivalentDiffAssociations(AssociationDiffGroup associationDiffGroup) {
		Set<Conflict> conflicts = new HashSet<Conflict>();
		ArrayList<EObject> diffAssociationToDelete = new ArrayList<EObject>();
		//Should to remove pdatsToDelete or keep it for future???
		//ArrayList<PairDiffAssociationTarget> pdatsToDelete = new ArrayList<PairDiffAssociationTarget>();
		for(PairDiffAssociationTarget pdat:associationDiffGroup.pdats) {
			if(pdat.diff.getConflict() != null)
				conflicts.add(pdat.diff.getConflict());
		}
		for(Conflict c:conflicts) {//diff association can only have two conflicting diff
			if(c.getKind() == ConflictKind.PSEUDO) {
				EList<Diff> diffs = c.getDifferences();
				List<PairDiffAssociationTarget> conflictingPdats = 
						associationDiffGroup.pdats.stream().filter(f->diffs.contains(f.diff)).collect(Collectors.toList());
				PairDiffAssociationTarget p1 = conflictingPdats.get(0);
				PairDiffAssociationTarget p2 = conflictingPdats.get(1);
				setDiffKind("diff_kind",  "DiffKind", p1.diffAssociation.eClass(), DifferenceSource.LEFT, p1.differenceKind, p1.diffAssociation);
				setDiffKind("diff_kind",  "DiffKind", p1.diffAssociation.eClass(), DifferenceSource.RIGHT, p1.differenceKind, p1.diffAssociation);
				diffAssociationToDelete.add(p2.diffAssociation);
				//pdatsToDelete.add(conflictingPdats.get(1));
			}
			else if(c.getKind() == ConflictKind.REAL) 
			{
				EList<Diff> diffs = c.getDifferences();
				Map<EObject, List<PairDiffAssociationTarget>> mapConflictingPdats = 
						associationDiffGroup.pdats.stream().filter(f->diffs.contains(f.diff)).collect(Collectors.groupingBy(PairDiffAssociationTarget::getTarget, Collectors.toList()));
				
				var mapConflictingPdatsValues = mapConflictingPdats.values();
				for(List<PairDiffAssociationTarget> conflictingPdats:mapConflictingPdatsValues) {	
					if(conflictingPdats.size()>=2) {
						PairDiffAssociationTarget p1 = conflictingPdats.get(0);
						PairDiffAssociationTarget p2 = conflictingPdats.get(1);
						//p1.target == p2.target
						if(p1.diff.getSource() != p2.diff.getSource()) {
							setDiffKind("diff_kind",  "DiffKind", p1.diffAssociation.eClass(), p1.diff.getSource(), p1.differenceKind, p1.diffAssociation);
							setDiffKind("diff_kind",  "DiffKind", p1.diffAssociation.eClass(), p2.diff.getSource(), p2.differenceKind, p1.diffAssociation);
							diffAssociationToDelete.add(p2.diffAssociation);						
						}
					}
				}
				
				
				/*for(PairDiffAssociationTarget p:conflictingPdats) 
				{
					setDiffKind("diff_kind",  "DiffKind", p.diffAssociation.eClass(), DifferenceSource.LEFT, p.differenceKind, p.diffAssociation);
					setDiffKind("diff_kind",  "DiffKind", p.diffAssociation.eClass(), DifferenceSource.RIGHT, p.differenceKind, p.diffAssociation);
				}*/
			}
		}
		EcoreUtil.deleteAll(diffAssociationToDelete, false);
		//associationDiffGroup.pdats.removeAll(pdatsToDelete);		
	}	
	//******************************************************************************************	
	public ArrayList<PairDiffAssociationTarget> transferAssociaionDiff(AssociationDiffGroup associationDiffGroup, FineDiffReference fdrLeftRight) {
		
		DifferenceKind  differenceKind = fdrLeftRight.diffKind;
		EObject source = findSetSource(associationDiffGroup, fdrLeftRight);
		EObject target = findSetTarget(associationDiffGroup, fdrLeftRight);
		//From source class = classDiffGroup.containerDiff (moved from container) -> DiffAssociation(diff_kind=DELETE)-> moved object	
		ArrayList<PairDiffAssociationTarget> pdats= new ArrayList<PairDiffAssociationTarget>();
		PairDiffAssociationTarget pdat = createDiffAssociation(source, target, associationDiffGroup,  differenceKind, fdrLeftRight);
		pdats.add(pdat);
		PairDiffAssociationTarget pdatDeleteSingleValued = 
				transferAssociaionDiffSingleValuedOldTarget(associationDiffGroup, fdrLeftRight, source, target, pdat);
		if(pdatDeleteSingleValued != null)
			pdats.add(pdatDeleteSingleValued);
		
		return pdats;
	}
	//******************************************************************************************	
	public PairDiffAssociationTarget createDiffAssociation(EObject source, EObject target, AssociationDiffGroup associationDiffGroup, DifferenceKind  differenceKind, FineDiffReference fdrLeftRight) {
		PairDiffAssociationTarget pdat= new PairDiffAssociationTarget();
		EObject diffAssociation = null;
		if(fdrLeftRight.diff.getSource() == DifferenceSource.LEFT)
			diffAssociation = createNewAssociationDiffClass(source, associationDiffGroup.reference, differenceKind, null);	
		else
			diffAssociation = createNewAssociationDiffClass(source, associationDiffGroup.reference, null, differenceKind);
		
		setChangeStatusDiffAssociation(fdrLeftRight, diffAssociation);
		
		
		String diffAssociationClassName = diffAssociation.eClass().getName();
		EReference refTypeFromSourceToDiffAssociation = source.eClass().getEAllReferences().stream().filter(
				f->f.getEReferenceType().getName()== diffAssociationClassName).collect(Collectors.toList()).get(0);
		SetEFeature(source, refTypeFromSourceToDiffAssociation, diffAssociation);
		EReference refTypeFromDiffAssociationToTarget = diffAssociation.eClass().getEAllReferences().stream().filter(
					f->f.getName().contains("eType")).collect(Collectors.toList()).get(0);								
		SetEFeature(diffAssociation, refTypeFromDiffAssociationToTarget, target);
		pdat.target = target;
		pdat.differenceKind = differenceKind;
		pdat.diffAssociation = diffAssociation;
		pdat.diff = fdrLeftRight.diff;
		return pdat;
	}
	
	//******************************************************************************************	
	public PairDiffAssociationTarget transferAssociaionDiffSingleValuedOldTarget(
			AssociationDiffGroup associationDiffGroup,
			FineDiffReference fdrLeftRight,
			EObject source,
			EObject target,
			PairDiffAssociationTarget pdatTarget) 
	{
		EReference reference = associationDiffGroup.reference;
		DifferenceKind  differenceKind = fdrLeftRight.diffKind;
		//single-valued change, EMF-compare returns changed target, we need to find the old target (deleted)
		if(reference.getUpperBound() == 1 && differenceKind == DifferenceKind.CHANGE && fdrLeftRight.originContainerMatch != null) 
		{	//(unset) 	Delete old target, no new target  
			//(change) 	Delete old target, and Modify to new target
			//(set)		Add a target
			EObject originOldTarget = (EObject) fdrLeftRight.originContainerMatch.eGet(reference);
			if(originOldTarget != null) {
				EObject oldTarget = findDiffObjectByOriginObject(originOldTarget);
				if(oldTarget != null && oldTarget != target) 
				{ 	//It is not a delete (it is really a modify)
					//add a delete diff for old target
					PairDiffAssociationTarget pdat = createDiffAssociation(source, oldTarget, associationDiffGroup,  DifferenceKind.DELETE, fdrLeftRight);
					return pdat;
				}
				else if(oldTarget != null && oldTarget == target) 
				{ 	//It is a single-valued delete
					//change Modify to delete	
					pdatTarget.differenceKind = DifferenceKind.DELETE;
					setDiffKind("diff_kind",  "DiffKind", 
							pdatTarget.diffAssociation.eClass(), 
							pdatTarget.diff.getSource(), 
							DifferenceKind.DELETE, 
							pdatTarget.diffAssociation);
					return null;					
				}
			}
			else
			{
				pdatTarget.differenceKind = DifferenceKind.ADD;
				setDiffKind("diff_kind",  "DiffKind", 
					pdatTarget.diffAssociation.eClass(), 
					pdatTarget.diff.getSource(), 
					DifferenceKind.ADD, 
					pdatTarget.diffAssociation);	
				return null;					
			}			
		}
		return null;
	}

	//******************************************************************************************	
	public void transferAssociaionDiffList(AssociationDiffGroup associationDiffGroup) {
		for(FineDiffReference fdr:associationDiffGroup.left) {
			try {
				associationDiffGroup.pdats.addAll(transferAssociaionDiff(associationDiffGroup, fdr));
			}catch(Exception ex)
			{
				
			}
		}
		for(FineDiffReference fdr:associationDiffGroup.right) {
			try {
				associationDiffGroup.pdats.addAll(transferAssociaionDiff(associationDiffGroup, fdr));
			}catch(Exception ex)
			{
				
			}
		}
	}
	//******************************************************************************************	
	public void transformAssociationDiffGroups(ArrayList<AssociationDiffGroup>  sssociationDiffGroups) {
		for(AssociationDiffGroup associationDiffGroup:sssociationDiffGroups) {
			transferAssociaionDiffList(associationDiffGroup);
			mergeEquivalentDiffAssociations(associationDiffGroup);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//******************************************************************************************	
	//******************************************************************************************	
	//******************************************************************************************	
	
	
	/*			
	if(associationDiffGroup.reference.getUpperBound()==1) {
		//It has at most one left and one right difference
		//In this case we have change (modify the target), add and delete differentkinds				
		//if it is change we set the new target as MODIFY
		transferAssociaionDiffListSingleValued(associationDiffGroup);
		//setDiffAssociationModify(associationDiffGroup);
		//setDiffAssociationChangeStatusSingleValued(associationDiffGroup);
	}
	else if(associationDiffGroup.reference.getUpperBound()>1 || associationDiffGroup.reference.getUpperBound() == -1) {
		transferAssociaionDiffListSingleValued(associationDiffGroup);
		//setDiffAssociationModify(associationDiffGroup);
		//setDiffAssociationChangeStatusSingleValued(associationDiffGroup);
		//It has m left and n right differences
		//There is no change (we only have add and delete)
		//Group in terms of container
		if(associationDiffGroup.reference.isOrdered()) {
			//changes in order by different users in different ways makes conflict
			
		}else {
			
			
		}
	}
	*/
	
	/*public void setDiffAssociationChangeStatusSingleValued(AssociationDiffGroup associationDiffGroup) {
	
	ArrayList<DifferenceKind> dKinds = new ArrayList<DifferenceKind>();
	Set<Conflict> dConflicts = new HashSet<Conflict>();
	ArrayList<Diff> dDiffs = new ArrayList<Diff>();
	ArrayList<Diff> cDiffs = new ArrayList<Diff>();
	
	for(FineDiffReference f:associationDiffGroup.left) {
		dKinds.add(f.diffKind);
		dConflicts.add(f.diff.getConflict());
		dDiffs.add(f.diff);
	}
	for(FineDiffReference f:associationDiffGroup.right) {
		dKinds.add(f.diffKind);
		dConflicts.add(f.diff.getConflict());
		dDiffs.add(f.diff);
	}
	for(Conflict c:dConflicts) {
		cDiffs.addAll(c.getDifferences());
	}
	
			
	ArrayList<EObject> diffAssociationToDelete = new ArrayList<EObject>();
	ArrayList<PairDiffAssociationTarget> pairDiffAssociationTarget = new ArrayList<PairDiffAssociationTarget>();
	for(PairDiffAssociationTarget l:associationDiffGroup.deleteLefts) {
		for(PairDiffAssociationTarget r:associationDiffGroup.deleteRights) {
			if(l.target == r.target && l.differenceKind == r.differenceKind) {
				setDiffKind("diff_kind",  "DiffKind", l.diffAssociation.eClass(), DifferenceSource.RIGHT, l.differenceKind, l.diffAssociation);
				setChangeStatus(l.diffAssociation, "changeStatus",changeStatusEQUIVALENT, l.diffAssociation.eClass());
				diffAssociationToDelete.add(r.diffAssociation);
			}else if((l.target != r.target) || (l.target == r.target && l.differenceKind != r.differenceKind)) {
				setDiffKind("diff_kind",  "DiffKind", l.diffAssociation.eClass(), DifferenceSource.RIGHT, l.differenceKind, l.diffAssociation);
				setChangeStatus(l.diffAssociation, "changeStatus",changeStatusCONTRADICTING, l.diffAssociation.eClass());
				diffAssociationToDelete.add(r.diffAssociation);		
			}
		}
	}
	for(PairDiffAssociationTarget l:associationDiffGroup.addLefts) {
		for(PairDiffAssociationTarget r:associationDiffGroup.addRights) {
			if(l.target == r.target && l.differenceKind == r.differenceKind) {
				setDiffKind("diff_kind",  "DiffKind", l.diffAssociation.eClass(), DifferenceSource.RIGHT, l.differenceKind, l.diffAssociation);
				setChangeStatus(l.diffAssociation, "changeStatus",changeStatusEQUIVALENT, l.diffAssociation.eClass());
				diffAssociationToDelete.add(r.diffAssociation);
			}else if((l.target != r.target) || (l.target == r.target && l.differenceKind != r.differenceKind)) {
				setDiffKind("diff_kind",  "DiffKind", l.diffAssociation.eClass(), DifferenceSource.LEFT, l.differenceKind, l.diffAssociation);
				setDiffKind("diff_kind",  "DiffKind", l.diffAssociation.eClass(), DifferenceSource.RIGHT, l.differenceKind, l.diffAssociation);
				setChangeStatus(l.diffAssociation, "changeStatus",changeStatusCONTRADICTING, l.diffAssociation.eClass());					
				setDiffKind("diff_kind",  "DiffKind", r.diffAssociation.eClass(), DifferenceSource.LEFT, r.differenceKind, r.diffAssociation);
				setDiffKind("diff_kind",  "DiffKind", r.diffAssociation.eClass(), DifferenceSource.RIGHT, r.differenceKind, r.diffAssociation);
				setChangeStatus(r.diffAssociation, "changeStatus",changeStatusCONTRADICTING, r.diffAssociation.eClass());
				//diffAssociationToDelete.add(r.diffAssociation);		
			}
		}
	}
	for(PairDiffAssociationTarget l:associationDiffGroup.changeLefts) {
		for(PairDiffAssociationTarget r:associationDiffGroup.changeRights) {
			if(l.target == r.target && l.differenceKind == r.differenceKind) {
				setDiffKind("diff_kind",  "DiffKind", l.diffAssociation.eClass(), DifferenceSource.RIGHT, l.differenceKind, l.diffAssociation);
				setChangeStatus(l.diffAssociation, "changeStatus",changeStatusEQUIVALENT, l.diffAssociation.eClass());
				diffAssociationToDelete.add(r.diffAssociation);
			}else if((l.target != r.target) || (l.target == r.target && l.differenceKind != r.differenceKind)) {
				setDiffKind("diff_kind",  "DiffKind", l.diffAssociation.eClass(), DifferenceSource.LEFT, l.differenceKind, l.diffAssociation);
				setDiffKind("diff_kind",  "DiffKind", l.diffAssociation.eClass(), DifferenceSource.RIGHT, l.differenceKind, l.diffAssociation);
				setChangeStatus(l.diffAssociation, "changeStatus",changeStatusCONTRADICTING, l.diffAssociation.eClass());					
				setDiffKind("diff_kind",  "DiffKind", r.diffAssociation.eClass(), DifferenceSource.LEFT, r.differenceKind, r.diffAssociation);
				setDiffKind("diff_kind",  "DiffKind", r.diffAssociation.eClass(), DifferenceSource.RIGHT, r.differenceKind, r.diffAssociation);
				setChangeStatus(r.diffAssociation, "changeStatus",changeStatusCONTRADICTING, r.diffAssociation.eClass());
				//diffAssociationToDelete.add(r.diffAssociation);		
			}
		}
	}
	EcoreUtil.deleteAll(diffAssociationToDelete, false);	
	
}*/
//******************************************************************************************	

	
	/*
	//LEFT
	List<FineDiffReference> delLefts = associationDiffGroup.left.stream().filter(f->f.diffKind == DifferenceKind.DELETE).collect(Collectors.toList());
	for(FineDiffReference delLeft:delLefts) {
		PairDiffAssociationTarget p = transferSingleAssociaionDiff(associationDiffGroup, delLeft);
		associationDiffGroup.deleteLefts.add(p);
	}
	List<FineDiffReference> addlefts = associationDiffGroup.left.stream().filter(f->f.diffKind == DifferenceKind.ADD).collect(Collectors.toList());
	for(FineDiffReference addLeft:addlefts) {
		PairDiffAssociationTarget p = transferSingleAssociaionDiff(associationDiffGroup, addLeft);
		associationDiffGroup.addLefts.add(p);
	}		
	List<FineDiffReference> changelefts = associationDiffGroup.left.stream().filter(f->f.diffKind == DifferenceKind.CHANGE).collect(Collectors.toList());
	for(FineDiffReference changeleft:changelefts) {
		PairDiffAssociationTarget p = transferSingleAssociaionDiff(associationDiffGroup, changeleft);
		associationDiffGroup.changeLefts.add(p);
	}
	
	//RIGHT
	List<FineDiffReference> delRights = associationDiffGroup.right.stream().filter(f->f.diffKind == DifferenceKind.DELETE).collect(Collectors.toList());
	for(FineDiffReference delRight:delRights) {
		PairDiffAssociationTarget p = transferSingleAssociaionDiff(associationDiffGroup, delRight);
		associationDiffGroup.deleteRights.add(p);
	}
	List<FineDiffReference> addrights = associationDiffGroup.right.stream().filter(f->f.diffKind == DifferenceKind.ADD).collect(Collectors.toList());
	for(FineDiffReference addRight:addrights) {
		PairDiffAssociationTarget p = transferSingleAssociaionDiff(associationDiffGroup, addRight);
		associationDiffGroup.addRights.add(p);
	}
	List<FineDiffReference> changerights = associationDiffGroup.right.stream().filter(f->f.diffKind == DifferenceKind.CHANGE).collect(Collectors.toList());
	for(FineDiffReference changeRight:changerights) {
		PairDiffAssociationTarget p = transferSingleAssociaionDiff(associationDiffGroup, changeRight);
		associationDiffGroup.changeRights.add(p);
	}
	*/	
	
	//******************************************************************************************	
	//******************************************************************************************			
	/*public void setDiffAssociationModify(AssociationDiffGroup associationDiffGroup) {
		//target changed -> ADD to Modify
		ArrayList<PairDiffAssociationTarget> tempLefts = new ArrayList<PairDiffAssociationTarget>();
		tempLefts.addAll(associationDiffGroup.addLefts);
		tempLefts.addAll(associationDiffGroup.changeLefts);
		for(PairDiffAssociationTarget p:associationDiffGroup.deleteLefts) {
			//Delete/Add same target
			List<PairDiffAssociationTarget> modifyTarget = 
					tempLefts.stream().filter(f->f.target != p.target).collect(Collectors.toList());
			if(modifyTarget.size()>0) {
				for(PairDiffAssociationTarget t:modifyTarget) {
					t.differenceKind = DifferenceKind.CHANGE;
					setDiffKind("diff_kind",  "DiffKind", t.diffAssociation.eClass(), DifferenceSource.LEFT, DifferenceKind.CHANGE, t.diffAssociation);
				}
			}
		}
		//RIGHT
		ArrayList<PairDiffAssociationTarget> tempRights = new ArrayList<PairDiffAssociationTarget>();
		tempRights.addAll(associationDiffGroup.addRights);
		tempRights.addAll(associationDiffGroup.changeRights);
		for(PairDiffAssociationTarget p:associationDiffGroup.deleteRights) {
			//Delete/Add same target
			List<PairDiffAssociationTarget> modifyTarget = 
					tempRights.stream().filter(f->f.target != p.target).collect(Collectors.toList());
			if(modifyTarget.size()>0) {
				for(PairDiffAssociationTarget t:modifyTarget) {
					t.differenceKind = DifferenceKind.CHANGE;
					setDiffKind("diff_kind",  "DiffKind", t.diffAssociation.eClass(), DifferenceSource.LEFT, DifferenceKind.CHANGE, t.diffAssociation);
				}
			}
		}
	}*/
	
}
