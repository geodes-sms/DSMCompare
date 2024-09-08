package com.zadahmad.dsmcompare.core;

import com.zadahmad.dsemfcompare.editor.dsmcHenshin.*;
import com.zadahmad.dsemfcompare.editor.verstexSorting.Edge;
import com.zadahmad.dsemfcompare.editor.verstexSorting.EdgeType;
import com.zadahmad.dsemfcompare.editor.verstexSorting.Vertex;
import com.zadahmad.dsemfcompare.editor.verstexSorting.VertexSorting;
import com.zadahmad.dsmcompare.core.threeWay.ClassDiffGroup;
import com.zadahmad.dsmcompare.core.threeWay.ComparisonResult;
import com.zadahmad.dsmcompare.core.threeWay.DiffReferenceChangeType;
import com.zadahmad.dsmcompare.core.threeWay.FineDiffAttributeGroup;
import com.zadahmad.dsmcompare.core.threeWay.FineDiffAttributeGroupProps;
import com.zadahmad.dsmcompare.core.threeWay.FineDiffChangeKind;
import com.zadahmad.dsmcompare.core.threeWay.FineDiffReference;
import com.zadahmad.dsmcompare.core.threeWay.ProcessComparisonResult;
import com.zadahmad.dsmcompare.core.threeWay.Version;
import com.zadahmad.dsmcompare.core.threeWay.VesrionInfo;
import com.zadahmad.dsmcompare.core.twoWayRuleMatch.ConstraintChecker;
import com.zadahmad.dsmcompare.core.twoWayRuleMatch.DSRuleMatched;
import com.zadahmad.dsmcompare.core.twoWayRuleMatch.DSRuleSpec;
import com.zadahmad.dsmcompare.core.twoWayRuleMatch.MRN;
import com.zadahmad.dsmcompare.core.twoWayRuleMatch.MVItem;
import com.zadahmad.dsmcompare.core.twoWayRuleMatch.MatchVariant;
import com.zadahmad.dsmcompare.core.twoWayRuleMatch.RuleDetail;

import dsmcompare.mmextension.MMExtension;
import dsmcompare.mmextension.utils.*;
import dsmcompare.mmextension.utils.EMFUtils.ChangeStatus;
import dsmcompare.mmextension.utils.EMFUtils.DiffKind;

/*
import refactoringDiffMM.RefactoringDiffMMFactory;
import refactoringDiffMM.RefactoringDiffMMPackage;
import refactoringRuleMM.RefactoringRuleMMFactory;
import refactoringRuleMM.RefactoringRuleMMPackage;*/


import com.google.common.base.Function;

import org.apache.commons.io.output.TeeOutputStream;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.AttributeChange;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.DifferenceSource;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.compare.conflict.DefaultConflictDetector;
import org.eclipse.emf.compare.conflict.IConflictDetector;
import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.equi.DefaultEquiEngine;
import org.eclipse.emf.compare.equi.IEquiEngine;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.eobject.IdentifierEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.postprocessor.IPostProcessor;
import org.eclipse.emf.compare.postprocessor.PostProcessorDescriptorRegistryImpl;
import org.eclipse.emf.compare.rcp.EMFCompareRCPPlugin;
import org.eclipse.emf.compare.req.DefaultReqEngine;
import org.eclipse.emf.compare.req.IReqEngine;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.change.ChangeKind;
import org.eclipse.emf.ecore.impl.EClassImpl.FeatureSubsetSupplier;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.henshin.cpa.result.Conflict;
import org.eclipse.emf.henshin.cpa.result.ConflictKind;
import org.eclipse.emf.henshin.cpa.result.CriticalPair;
import org.eclipse.emf.henshin.cpa.result.Dependency;
import org.eclipse.emf.ecore.util.EContentsEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer;
import org.eclipse.emf.ecore.util.EcoreUtil.UsageCrossReferencer;
import org.eclipse.xtext.xbase.lib.Exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.lang.ModuleLayer.Controller;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.junit.Test;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import org.eclipse.emf.ecore.EFactory;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.zadahmad.dsmcompare.core.threeWay.SemDiffUtils;

import org.eclipse.emf.cdo.compare.CDOCompare;
import org.eclipse.emf.cdo.compare.CDOCompare.*;
import org.eclipse.emf.cdo.compare.CDOCompareUtil;




public class DsmComparatorController {
	Resource rsourceDSMDiff = null;
	ArrayList<VesrionInfo> versionsInformation = null;
	VesrionInfo versionLeftInfo 	= null;
	VesrionInfo versionRightInfo 	= null;
	VesrionInfo versionCaInfo 		= null;
	String Root						= 	"";
	String RootApp					= 	"";
	
	String MMRootPath     			= 	"";
	private String DSMMPath  		= 	"";
	String DSDiffMMPath  			= 	"";
	String DSRuleMMPath  			= 	"";
	
	String ModelRootPath  			= 	"";
	private String vLeftPath 		= 	"";
 	private String vRightPath  		= 	"";	
 	private String vCAPath  		= 	"";//Common Ancestor (3-Way Merge)		
	private String resultFilePath   = 	"";	
 	private String DSMDiffPath 		= 	"";	
 	
 	String RuleRootPath				= 	"";
 	
 	
 	String MMPackageName			= 	"";	 	
 	String DiffMMPackageName		= 	""; 
 	String DiffMM_eNSURI 			= 	"";  	
 	Object DiffMM_eIN	 			=	null;
 	EFactory DiffMM_Factory			= 	null; 
 	
 	String RuleMMPackageName		= 	""; 
 	String RuleMM_eNSURI 			= 	""; 	
 	Object RuleMM_eIN	 			=	null;
 	EFactory RuleMM_Factory			=	null;
 		
 	List<DSRuleSpec>	DSRuleSpecs	= 	new ArrayList<DSRuleSpec>(); 	
 	List<String> 		rulesList	=	new ArrayList<String>();
 	
 	ComparisonResult	comparisonResult = null;
 	SemDiffUtils        semDiffUtils  = new SemDiffUtils();
 	
	 //******************************************************************************************
	 
	 private EObject setDiffKind(String diffAttributeName, String customMapClassName, 
			 EClass valueDiffEClass, EClass valueEClass,  DifferenceSource differenceSource, 
			 DifferenceKind differenceKind, EObject valueDiff) {	 
		 try {
			 final String changedAttributeName= 
					 differenceSource == DifferenceSource.LEFT ? diffAttributeName+"_Left":diffAttributeName+"_Right";
			 
		 	 EAttribute diffKindAttribute = valueDiffEClass.getEAllAttributes().stream().filter(
		 			 f->f.getName().contains(changedAttributeName)).collect(Collectors.toList()).get(0);
			 if(customMapClassName == "DiffKind" || customMapClassName == "DiffKind") {					
					//Set the ClassOp(DiffKind) attribute, it can be of ADD or DELETE
					EEnum classDiffKind = (EEnum)  valueEClass.getEPackage().getEClassifier(customMapClassName);
					//sortedFineDiffReference.valueDiff.eSet(attrOperation,ClassOpAdd);		
					Object classDiffKindValue = null;
					if(differenceKind == DifferenceKind.DELETE)
					{					
						classDiffKindValue = DiffMM_Factory.createFromString(classDiffKind, "DELETE");
					}else if(differenceKind == DifferenceKind.ADD) {					
						classDiffKindValue = DiffMM_Factory.createFromString(classDiffKind, "ADD");	
					}else if(customMapClassName == "DiffKind" && differenceKind == DifferenceKind.CHANGE) {					
						classDiffKindValue = DiffMM_Factory.createFromString(classDiffKind, "MODIFY");
					}else if(differenceKind == DifferenceKind.MOVE) {//conflicting Move	with an attribute Modify			
						classDiffKindValue = DiffMM_Factory.createFromString(classDiffKind, "DELETE");
					}	
					
					try {
						Object v = valueDiff.eGet(diffKindAttribute);
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
	 
	 private void setChangeStatus(EObject DSDiffObject, String diffAttributeName,Object attrValueToBeSet,EClass valueDiffEClass) {

		 try {
			 EAttribute changeStatusAttribute = valueDiffEClass.getEAllAttributes().stream().filter(
						f->f.getName().equals(diffAttributeName)).collect(Collectors.toList()).get(0);	
			 EEnum ChangeStatusType = (EEnum)  valueDiffEClass.getEPackage().getEClassifier("ChangeStatus");
			 Object changeStatus = DiffMM_Factory.createFromString(ChangeStatusType, attrValueToBeSet.toString());
			 try {
	  		 DSDiffObject.eSet(changeStatusAttribute, changeStatus);
			 }catch(Throwable ex) {
				 System.out.println("Cannot setValueDiff(...) \n DSDiffObject: " 
			 + DSDiffObject+ "\n changeStatusAttribute: " + changeStatusAttribute+"\n " +changeStatus);
			 }
		 }catch(Exception ex) {
			 System.out.println("\n setChangeStatus(...): " + ex.getLocalizedMessage());
		 }
		 
	 }
	 
	 private EObject setValueDiff(EObject DSDiffObject, String diffAttributeName, 
			 Object attrValueToBeSet, EClass valueDiffEClass, VesrionInfo version, EAttribute	originalAttributeClass) {
		 	 
		 if(diffAttributeName.toLowerCase().contains("changestatus")) {		 
			 setChangeStatus(DSDiffObject, diffAttributeName,attrValueToBeSet,valueDiffEClass);			 
			 createSemanticFine(DSDiffObject, diffAttributeName, attrValueToBeSet, valueDiffEClass, originalAttributeClass);
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
	  			DSDiffObject.eSet(newAttribute, attrValueToBeSet);
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
	  				 System.out.println("\n setValueDiff(...): "+ ex.getMessage());
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
			SetEFeature(DSDiffObject, refDiffKinkMap, mapClassDiffKindObject);
			return mapClassDiffKindObject;	
		 }
	 }
	 
	 //differenceKind = Pseudo
	 public void setPseudo(FineDiffReference sortedFineDiffReference,String diffKind,
				EClass DSDiffEClass,EClass valueEClass,  
				DifferenceSource differenceSourcePseudo,
				DifferenceKind differenceKindPseudo, EObject DSDiffObject){
			if(sortedFineDiffReference.pseudoConflict!=null) {
				sortedFineDiffReference.pseudoConflict.isProcessed = true;	
				if(sortedFineDiffReference.diff.getSource() == DifferenceSource.LEFT)				
					setDiffKind("diff_kind",  diffKind, DSDiffEClass, valueEClass,  
						differenceSourcePseudo, differenceKindPseudo, DSDiffObject);
				
				//EEnum ChangeStatusType = (EEnum)  DSDiffEClass.getEPackage().getEClassifier("ChangeStatus");
				//Object changeStatusEQUIVALENT = DiffMM_Factory.createFromString(ChangeStatusType, "EQUIVALENT");
				//setValueDiff(DSDiffObject, "changeStatus", changeStatusEQUIVALENT, DSDiffEClass, null, null);
				//setChangeStatus(DSDiffObject, "changeStatus",changeStatusEQUIVALENT,DSDiffEClass);	
			}
	 }
	 
	 //****************************************************************************************** 	
	 	 
	 public ArrayList<RuleDetail> getRulesConstraintsDetail(ArrayList<String> ruleFilePathes, String RuleMM_eNSURI, Object RuleMM_eIN, EObject rootDSDiff) {
		 if(ruleFilePathes!=null && ruleFilePathes.size() > 0){
			 ArrayList<RuleDetail> rulesDetail = 
					 new ArrayList<RuleDetail>();
			 try{
				    for (String rulePath : ruleFilePathes) {	
				    	RuleDetail ruleDetail= new RuleDetail();
				    	ruleDetail.init(rulePath, RuleMM_eNSURI, RuleMM_eIN, rootDSDiff);
				    	
				    	ArrayList<ConstraintType> ruleConstraintCollection  = 
				    			ruleDetail.calculateRuleConstraintsDetail();
				    	if(ruleConstraintCollection!=null && ruleConstraintCollection.size()>0) {
				    		rulesDetail.add(ruleDetail);
				    	}
				    }				    	
		    	}catch(Exception ex){
		    	}
			 return rulesDetail;
		 }
		 return null;
	 }
	 
	 
	 //******************************************************************************************
	 
	 	
	public void setSemanticFineChangeStatusAfterTransformation(String diffPostFilePath, String DiffMM_eNSURI, Object DiffMM_eIN) {
		System.out.println("The start of set Semantic Fine Change Status After Transformation:");
		File diffPostFile 			= new File(diffPostFilePath);
		Charset charset 			= StandardCharsets.UTF_8;
		ResourceSet rsetDSMDiff		= setResourceSet(diffPostFilePath,DiffMM_eNSURI, DiffMM_eIN);	
		rsourceDSMDiff				= rsetDSMDiff.getResource(URI.createFileURI(diffPostFilePath) , true);	
		EObject rootDSDiff 			= rsourceDSMDiff.getContents().get(0);	
		//EPackage 	ePackage	 	= rootDSDiff.eClass().getEPackage();
		//EEnum ChangeStatusType = (EEnum)  ePackage.getEClassifier("ChangeStatus");
		//Object changeStatusEQUIVALENT = DiffMM_Factory.createFromString(ChangeStatusType, "EQUIVALENT");
		//Object changeStatusCONTRADICTING = DiffMM_Factory.createFromString(ChangeStatusType, "CONTRADICTING");
		//setChangeStatus(DSDiffObject, "changeStatus",changeStatusEQUIVALENT,DSDiffObject.eClass());
		findAllFineDiffConflicts(rootDSDiff);	

		
		try {
			rsourceDSMDiff.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The END of set Semantic Fine Change Status After Transformation:");
		
	}
	
	
	private void findAllFineDiffConflicts(EObject rootDSDiff) {
		Stack<EObject> sEObj		=	new Stack<EObject>();
		ArrayList<EObject> qVisited		=	new ArrayList<EObject>();
		
		sEObj.add(rootDSDiff);
		
		while(!sEObj.isEmpty()) {
			EObject s = sEObj.pop();
			qVisited.add(s);
			List<EAttribute> attrCS = null;
			try {
				attrCS = s.eClass().getEAllAttributes().stream().filter(a->a.getName().toLowerCase().contains("changestatus")).collect(Collectors.toList());
			}catch(Exception ex) {
				attrCS = null;
			}
			if(attrCS != null && attrCS.size()>0) {
				for(EAttribute a:attrCS) {
					Object val = EMFUtils.getAttrValueByAttrNameNullDefault(s, a.getName());
					if(!val.toString().toLowerCase().equals("non")) {
						createSemanticFine(s, a.getName(), val, s.eClass(),a);
					}
				}
			}			
			for(EObject o:s.eContents()) {
				if(!qVisited.contains(o))
					sEObj.add(o);
			}
		}

	}
	
	
	public void postRuleApplicationAuthorSet(String diffPostFilePath, String DiffMM_eNSURI, Object DiffMM_eIN, String[][] stringElementAndRuleSet) {
		System.out.println("The start of post rule applicaion - author value set method: " + diffPostFilePath);
		File diffPostFile 	= new File(diffPostFilePath);
		Charset charset 	= StandardCharsets.UTF_8;
		ResourceSet rsetDSMDiff	=	setResourceSet(diffPostFilePath,DiffMM_eNSURI, DiffMM_eIN);	
		rsourceDSMDiff	=	rsetDSMDiff.getResource(URI.createFileURI(diffPostFilePath) , true);	
		EObject rootDSDiff = rsourceDSMDiff.getContents().get(0);		
		EReference refTypeDSD = rootDSDiff.eClass().getEAllReferences().stream().filter(
				r->r.getName().equalsIgnoreCase("domainspecificdiffs")).collect(
								Collectors.toList()).get(0);		
		List<EObject>	sDiffObject = (List<EObject>) rootDSDiff.eGet(refTypeDSD);		
		EEnum authorEClassifier = (EEnum)  rootDSDiff.eClass().getEPackage().getEClassifier("AUTHOR");
		EFactory DiffMM_Factory = rootDSDiff.eClass().getEPackage().getEFactoryInstance();
		String elementName = "";	
		
		for(EObject d:sDiffObject){
			String 	dName		= (String)EMFUtils.getAttrValueByAttrNameNullDefault(d, "name");
			EList<EObject> dECrossReferences 	= d.eCrossReferences();
			EAttribute authorAttribute = d.eClass().getEAllAttributes().stream().filter(
					f->f.getName().equals("author")).collect(Collectors.toList()).get(0);	
			
			//ArrayList<Object> diff_kind_LeftList= new ArrayList<Object>();
			//ArrayList<Object> diff_kind_RightList= new ArrayList<Object>();
			
			if(dName !=null && dName.trim().toLowerCase().startsWith("rename"))
				elementName = "name";
			else {			
				for(String[] entry:stringElementAndRuleSet)
				{
					if(entry[0].toLowerCase().replace(" ", "").equals(dName.toLowerCase().replace(" ", ""))) {
						elementName = entry[1];
						break;
					}
				}
			}
			
			
			if(elementName != ""){
				for(EObject rTarget: dECrossReferences) {
					Object diff_kind_Left = EMFUtils.getAttrValueByAttrNameNullDefault(rTarget, "diff_kind_Left");
					if(diff_kind_Left == null)
						continue;
					Object diff_kind_Right = EMFUtils.getAttrValueByAttrNameNullDefault(rTarget, "diff_kind_Right");
					Object elementChangeStatus = EMFUtils.getAttrValueByAttrNameNullDefault(rTarget, elementName+"ChangeStatus");
					
					if(elementChangeStatus!=null &&  elementChangeStatus.toString().equals("EQUIVALENT")) {
						d.eSet(authorAttribute,DiffMM_Factory.createFromString(authorEClassifier, "EQUAL"));		
						break;
					}
					else if(diff_kind_Left!=null &&  !diff_kind_Left.toString().equals("NON")) {
						d.eSet(authorAttribute,DiffMM_Factory.createFromString(authorEClassifier, "LEFT"));		
						break;
					}
					else if(diff_kind_Right!=null &&  !diff_kind_Right.toString().equals("NON")) {
						d.eSet(authorAttribute,DiffMM_Factory.createFromString(authorEClassifier, "RIGHT"));	
						break;
					} else if(elementChangeStatus!=null &&  elementChangeStatus.toString().equals("CONTRADICTING")) {
						d.eSet(authorAttribute,DiffMM_Factory.createFromString(authorEClassifier, "MIXED"));	
						break;
					}
				}					
				
			}
			else {
			
				for(EObject rTarget:dECrossReferences) {
					Object diff_kind_Left = EMFUtils.getAttrValueByAttrNameNullDefault(rTarget, "diff_kind_Left");
					Object diff_kind_Right = EMFUtils.getAttrValueByAttrNameNullDefault(rTarget, "diff_kind_Right");
					if(diff_kind_Left != null && diff_kind_Right != null 
							&& !diff_kind_Left.toString().equals("NON")
							&& !diff_kind_Right.toString().equals("NON")
							&& diff_kind_Left.toString().equals(diff_kind_Right.toString())) {
						d.eSet(authorAttribute,DiffMM_Factory.createFromString(authorEClassifier, "EQUAL"));
						//If one diff element is EQUAL, it dosn't mean all other fine-diff elements are EQUAL
						// we need to look to the others
					}
					else if(diff_kind_Left != null && !diff_kind_Left.toString().equals("NON")) {
						d.eSet(authorAttribute,DiffMM_Factory.createFromString(authorEClassifier, "LEFT"));
						continue;
					} 
					else if(diff_kind_Right != null && !diff_kind_Right.toString().equals("NON")) {
						d.eSet(authorAttribute,DiffMM_Factory.createFromString(authorEClassifier, "RIGHT"));
						continue;
					} 
					//else if(diff_kind_Left != null && diff_kind_Right != null 
					//		&& !diff_kind_Left.toString().equals("NON")
					//		&& !diff_kind_Right.toString().equals("NON")
					//		&& !diff_kind_Left.toString().equals(diff_kind_Right.toString())) {
					//	d.eSet(authorAttribute,DiffMM_Factory.createFromString(authorEClassifier, "MIXED"));
					//} 
				}
			}
			if(EMFUtils.getAttrValueByAttrNameNullDefault(d, "author").toString().equals("NON")) {
				System.out.println("Could not set Author for: " + d.toString());
			}
		}
				
		try {
			Map<String, Object> saveOptions = new HashMap<String, Object>();
			//saveOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
			rsourceDSMDiff.save(saveOptions);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		System.out.println("The end of set Semantic Fine Change Status After Transformation:");
		
	}
	
	
	
	
	public void postStringElementChange(String diffPostFilePath, 
			 String DiffMM_eNSURI, Object DiffMM_eIN, String[][] stringElementAndRuleSet) {

		System.out.println("The start of postRenameElement method:");
		File diffPostFile 	= new File(diffPostFilePath);
		Charset charset 	= StandardCharsets.UTF_8;
		ResourceSet rsetDSMDiff	=	setResourceSet(diffPostFilePath,DiffMM_eNSURI, DiffMM_eIN);	
		rsourceDSMDiff	=	rsetDSMDiff.getResource(URI.createFileURI(diffPostFilePath) , true);	
		EObject rootDSDiff = rsourceDSMDiff.getContents().get(0);		
		EReference refTypeDSD = rootDSDiff.eClass().getEAllReferences().stream().filter(
				r->r.getName().equalsIgnoreCase("domainspecificdiffs")).collect(
								Collectors.toList()).get(0);		
		List<EObject>	sDiffObject = (List<EObject>) rootDSDiff.eGet(refTypeDSD);		
		EEnum authorEClassifier = (EEnum)  rootDSDiff.eClass().getEPackage().getEClassifier("AUTHOR");
		EFactory DiffMM_Factory = rootDSDiff.eClass().getEPackage().getEFactoryInstance();
		String elementName = "";		
		for(EObject d:sDiffObject){
			String 	dName		= (String)EMFUtils.getAttrValueByAttrNameNullDefault(d, "name");
			for(String[] entry:stringElementAndRuleSet)
			{
				if(entry[0].toLowerCase().replace(" ", "").equals(dName.toLowerCase().replace(" ", ""))) {
					elementName = entry[1];
					break;
				}
			}
			if(dName !=null && dName.trim().toLowerCase().startsWith("rename"))
				elementName = "name";
			
			if(elementName != ""){
				//String elementName = dName.replace("rename", "");				
				EList<EObject> dECrossReferences 	= d.eCrossReferences();
				EAttribute authorAttribute = d.eClass().getEAllAttributes().stream().filter(
						f->f.getName().equals("author")).collect(Collectors.toList()).get(0);	
				for(EObject rTarget: dECrossReferences) {
					Object diff_kind_Left = EMFUtils.getAttrValueByAttrNameNullDefault(rTarget, "diff_kind_Left");
					if(diff_kind_Left == null)
						continue;
					Object diff_kind_Right = EMFUtils.getAttrValueByAttrNameNullDefault(rTarget, "diff_kind_Right");
					Object elementChangeStatus = EMFUtils.getAttrValueByAttrNameNullDefault(rTarget, elementName+"ChangeStatus");
					
					if(elementChangeStatus!=null &&  elementChangeStatus.toString().equals("CONTRADICTING")) {
						d.eSet(authorAttribute,DiffMM_Factory.createFromString(authorEClassifier, "MIXED"));	
						break;
					}
					else if(elementChangeStatus!=null &&  elementChangeStatus.toString().equals("EQUIVALENT")) {
						d.eSet(authorAttribute,DiffMM_Factory.createFromString(authorEClassifier, "EQUAL"));		
						break;
					}
					else if(diff_kind_Left!=null &&  !diff_kind_Left.toString().equals("NON")) {
						d.eSet(authorAttribute,DiffMM_Factory.createFromString(authorEClassifier, "LEFT"));		
						break;
					}
					else if(diff_kind_Right!=null &&  !diff_kind_Right.toString().equals("NON")) {
						d.eSet(authorAttribute,DiffMM_Factory.createFromString(authorEClassifier, "RIGHT"));	
						break;
					}
					//else {
					//	System.out.println(d.toString());
					//}
				}	
				
				if(EMFUtils.getAttrValueByAttrNameNullDefault(d, "author").toString().equals("NON")) {
					System.out.println("Could not set Author for: " + d.toString());
				}
			}
		}
		

		
		try {
			Map<String, Object> saveOptions = new HashMap<String, Object>();
			//saveOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
			rsourceDSMDiff.save(saveOptions);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		System.out.println("The End of postRenameElement method.");
		
	}
	
	
	 private void createSemanticFine(EObject DSDiffObject, String changeStatusAttributeName, 
			 Object changeStatusValueToBeSet, EClass valueDiffEClass, 
			 EAttribute originalAttributeClass) {
		 try {
			EPackage 	ePackage 					= DSDiffObject.eClass().getEPackage();
			EObject     rootDSDiff 					= rsourceDSMDiff.getContents().get(0);
			EFactory	DiffMM_Factory				= ePackage.getEFactoryInstance();
			String   	conflictClassName 			= "SemanticConflict";						
			EClassifier conflictClassEClassifier	= ePackage.getEClassifier(conflictClassName);	
			EClass		conflictClass				= (EClass)conflictClassEClassifier;	
			//String  	refC_DName					= "SemanticConflict_DomainSpecificDiff";	
			String		refSemanticconflictsName	= "semanticconflicts";
			EReference  refSemanticConflicts		= 
					EMFUtils.getEReferenceByNameNullDefault(rootDSDiff,refSemanticconflictsName);
			
			
			Object diff_kind_Left = EMFUtils.getAttrValueByAttrNameNullDefault(DSDiffObject, "diff_kind_Left");
			Object diff_kind_Right = EMFUtils.getAttrValueByAttrNameNullDefault(DSDiffObject, "diff_kind_Right");
			Object diffEObjectName = EMFUtils.getAttrValueByAttrNameNullDefault(DSDiffObject, "name");
			String 	ocName	= valueDiffEClass.getName()+ ".[" + diffEObjectName + "]." + changeStatusAttributeName;
			if(diffEObjectName == null)
				ocName	= valueDiffEClass.getName()+ "." + changeStatusAttributeName;
			
			if(originalAttributeClass!=null && 
					!originalAttributeClass.getName().toLowerCase().equals(changeStatusAttributeName.toLowerCase()))
				ocName += "["+originalAttributeClass.getName()+"]";
			String 	conflictName	= 
					ocName + " - " + changeStatusValueToBeSet.toString() 
					+ " ( "+diff_kind_Left.toString()+" | "+diff_kind_Right.toString()+" )";
			
			EObject conflictClassEObject		= DiffMM_Factory.create(conflictClass);
			EAttribute nameAttribute = conflictClass.getEAllAttributes().stream().filter(
						f->f.getName().equals("name")).collect(Collectors.toList()).get(0);	
			conflictClassEObject.eSet(nameAttribute, conflictName);	
			String  refC_OName	= "SemanticConflict_"+DSDiffObject.eClass().getName();
			//EReference refC_D=EMFUtils.getEReferenceByNameNullDefault(conflictClassEObject,refC_DName);
			EReference refC_O=EMFUtils.getEReferenceByNameNullDefault(conflictClassEObject,refC_OName);						
			//SetEFeature(conflictClassEObject, refC_D, d);				
			SetEFeature(conflictClassEObject, refC_O, DSDiffObject);					
			SetEFeature(rootDSDiff, refSemanticConflicts, conflictClassEObject);	
		 } catch (Exception ex) {
			 System.out.println("Exception/Error in Create Semantic Fine: "+ex.toString());
		}


			
	 }
	
	 
	public void findSemanticFineDiffConflicts(String diffPostFilePath, 
			 String DiffMM_eNSURI, Object DiffMM_eIN, String RuleMM_eNSURI, Object RuleMM_eIN, 
			 ArrayList<String> ruleFilePathes, ArrayList<ConflictCPA> changeConflictsCPA, 
			 ArrayList<ConflictCPA> semanticFineConflictsMultiCDA, boolean removeRepSemConName) {

		System.out.println("The start of finding difference between Semantic and Fine-grained differences:");
		File diffPostFile 	= new File(diffPostFilePath);
		Charset charset 	= StandardCharsets.UTF_8;
		ResourceSet rsetDSMDiff	=	setResourceSet(diffPostFilePath,DiffMM_eNSURI, DiffMM_eIN);	
		rsourceDSMDiff	=	rsetDSMDiff.getResource(URI.createFileURI(diffPostFilePath) , true);	
		EObject rootDSDiff = rsourceDSMDiff.getContents().get(0);		
		ArrayList<RuleDetail> rulesDetail= getRulesConstraintsDetail(ruleFilePathes, RuleMM_eNSURI, RuleMM_eIN, rootDSDiff);
		EReference refTypeDSD = rootDSDiff.eClass().getEAllReferences().stream().filter(
				r->r.getName().equalsIgnoreCase("domainspecificdiffs")).collect(
								Collectors.toList()).get(0);		
		List<EObject>	sDiffObject = (List<EObject>) rootDSDiff.eGet(refTypeDSD);	
		
		/*	Semantic / Fine-Diff (change) conflict 
		  	1. 	For each SDiffObject: d
				1. For each DSDiff links: L			
					1. Set o <-L.target()			
					2. Get all SDiffObject connected to o: D			
					3. if (d, D) in CDA and conflict:
						1. Set conflict for (d, d_j) where d_j in D	
		*/
		EPackage 	ePackage 					= rootDSDiff.eClass().getEPackage();
		EFactory	DiffMM_Factory				= ePackage.getEFactoryInstance();
		String   	conflictClassName 			= "SemanticConflict";						
		EClassifier conflictClassEClassifier	= ePackage.getEClassifier(conflictClassName);	
		EClass		conflictClass				= (EClass)conflictClassEClassifier;	
		String  	refC_DName					= "SemanticConflict_DomainSpecificDiff";	
		String		refSemanticconflictsName	= "semanticconflicts";
		EReference  refSemanticconflicts		= EMFUtils.getEReferenceByNameNullDefault(rootDSDiff,refSemanticconflictsName);		
		EList<EObject> semanticConflicts		= (EList<EObject>) rootDSDiff.eGet(refSemanticconflicts);
		EcoreUtil.removeAll(semanticConflicts);
		
		
		// Find all Fine Diff Conflicts
		
		findAllFineDiffConflicts(rootDSDiff);	
		
		
		ArrayList<EObject> semDiffVisited		=	new ArrayList<EObject>();
		ArrayList<EObject> semFineDiffVisited	=	new ArrayList<EObject>();
		
		for(EObject d:sDiffObject){
			
			// Semantic-Semantic        (For more detail we can look at the model fragements, but may seems not necessary)
			
			//The Author needs to already be set
			
			Object author = EMFUtils.getAttrValueByAttrNameNullDefault(d, "Author");
			if(author!=null && author.toString().equals("EQUAL")) {//BOTH
				String 	dName		= (String)EMFUtils.getAttrValueByAttrNameNullDefault(d, "name");	
				//allAreEQUIVALENT = true;
				String conflictName	= dName + " - " + dName + " - " + "EQUIVALENT";
				EObject conflictClassEObject		= DiffMM_Factory.create(conflictClass);
				EAttribute nameAttribute = conflictClass.getEAllAttributes().stream().filter(
							f->f.getName().equals("name")).collect(Collectors.toList()).get(0);	
				conflictClassEObject.eSet(nameAttribute, conflictName);				
				EReference refC_D=EMFUtils.getEReferenceByNameNullDefault(conflictClassEObject,refC_DName);					
				SetEFeature(conflictClassEObject, refC_D, d);					
				//SetEFeature(conflictClassEObject, refC_D, dd);					
				SetEFeature(rootDSDiff, refSemanticconflicts, conflictClassEObject);						
			}				
			
			semDiffVisited.add(d);	
			semFineDiffVisited.add(d);	
			for(EObject dd:sDiffObject){
				ArrayList<EObject> d_dd = new ArrayList<EObject>();
				d_dd.add(d);
				d_dd.add(dd);
				//Check if this two checked before
								
				if(!semDiffVisited.containsAll(d_dd)) {				
					String 	dName		= (String)EMFUtils.getAttrValueByAttrNameNullDefault(d, "name");	
					String 	ddName		= (String)EMFUtils.getAttrValueByAttrNameNullDefault(dd, "name");	
					String  dRuleId 	= dName.replaceAll(" ","").toLowerCase();
					String  ddRuleId 	= ddName.replaceAll(" ","").toLowerCase();
					//Object author = EMFUtils.getAttrValueByAttrNameNullDefault(dd, "author");
					List<ConflictCPA>  conflictDD = 
							semanticFineConflictsMultiCDA.stream().filter( c->( 
										(dRuleId.equals(c.firstRule.toLowerCase()) 
												&& ddRuleId.equals(c.secondRule.toLowerCase()) 
												&& c.conflictCount > 0)
										|| 
										(dRuleId.equals(c.secondRule.toLowerCase()) 
												&& ddRuleId.equals(c.firstRule.toLowerCase()) 
												&& c.conflictCount > 0)
										)).collect(Collectors.toList());	
							
					if(conflictDD.size()>0) {
						EList<EObject> dECrossReferences 	= d.eCrossReferences();
						EList<EObject> ddECrossReferences 	= dd.eCrossReferences();
						EObject conflictingCrossReference = null;
						String semsemEquContra = "";
						
						ArrayList<EObject> conflicting = new ArrayList<EObject>(dECrossReferences);
						conflicting.retainAll(ddECrossReferences);						
						conflicting.remove(rootDSDiff);
						
						//We commented if(changeStatus!=null)
						//So that we also can find USE conflicts
						
						/*for(EObject c: conflicting) {
							Object changeStatus = EMFUtils.getAttrValueByAttrNameNullDefault(c, "changeStatus");
							if(changeStatus!=null) {
								semsemEquContra = "CONTRADICTING";
								conflictingCrossReference = c;
								break;
							}
						}*/					
						String 	conflictName	= "";
						
						if(conflicting.size()>0) {//semsemEquContra == "CONTRADICTING") {// || semsemEquContra == "EQUIVALENT") {
							//if(semsemEquContra == "CONTRADICTING") {
								//String 	conflictingCReClassName		= conflictingCrossReference.eClass().getName();							
								//String 	conflictingCRName		= (String)EMFUtils.getAttrValueByAttrNameNullDefault(conflictingCrossReference, "name");
							
							String strConflicting = "";
							for(EObject c: conflicting) {
								Object nameC = EMFUtils.getAttrValueByAttrNameNullDefault(c, "name");
								if(nameC!=null)
									strConflicting += nameC.toString() + "| ";						
								
							}
							strConflicting = strConflicting.trim();						
							
							if(strConflicting!="") {
								strConflicting = strConflicting.substring(0,strConflicting.length() - 1);
								conflictName	= dName + " - " + ddName + "[" + strConflicting + "] - CONTRADICTING";
							}
							else
								conflictName	= dName + " - " + ddName + " - CONTRADICTING";
							//if(conflictingCRName.trim()!="")
								//	conflictName+= ".[" + conflictingCRName;
								//conflictName+=  "]" + " - " + semsemEquContra;
							//} //else if(semsemEquContra == "EQUIVALENT") {								
							//conflictName	= dName + " - " + ddName + " - " + semsemEquContra;
							//}
								
							EObject conflictClassEObject		= DiffMM_Factory.create(conflictClass);
							EAttribute nameAttribute = conflictClass.getEAllAttributes().stream().filter(
										f->f.getName().equals("name")).collect(Collectors.toList()).get(0);	
							conflictClassEObject.eSet(nameAttribute, conflictName);				
							EReference refC_D=EMFUtils.getEReferenceByNameNullDefault(conflictClassEObject,refC_DName);					
							SetEFeature(conflictClassEObject, refC_D, d);					
							SetEFeature(conflictClassEObject, refC_D, dd);					
							SetEFeature(rootDSDiff, refSemanticconflicts, conflictClassEObject);
							for(EObject c: conflicting) {
								//TBD
								//Create reference to all conflicting objects
								
								
							}
							
						}
					}			
					semDiffVisited.add(dd);	
				}			
			}			

			//Semantic-Association Diff 			
			//Semantic-Class Add/Delete
			//if(author!=null && !author.toString().equals("EQUAL"))
			for(EReference dRef:d.eClass().getEAllReferences()) {
				
				//TO-DO %%
				//Here we also can check semanticFineConflictsMultiCDA list
				//for static conflict between semantic diff and fine-diffs
				//if it exists we can continue to look the rest
				
				EList<EObject> dRefTargets = (EList<EObject>) d.eGet(dRef);
				if(dRefTargets.size()==0)
					continue;	
				
				String 	dName		= (String)EMFUtils.getAttrValueByAttrNameNullDefault(d, "name");	
				String  dRuleId 	= dName.replaceAll(" ","").toLowerCase();
				for(EObject rTarget:dRefTargets) {	
					semFineDiffVisited.add(rTarget);
					ArrayList<EObject> d_dd = new ArrayList<EObject>();
					d_dd.add(d);
					d_dd.add(rTarget);
					//Check if this two checked before
					if(!semFineDiffVisited.containsAll(d_dd)) {					
						Object diff_kind_Left = EMFUtils.getAttrValueByAttrNameNullDefault(rTarget, "diff_kind_Left");
						Object diff_kind_Right = EMFUtils.getAttrValueByAttrNameNullDefault(rTarget, "diff_kind_Right");
						
						if(diff_kind_Left!=null && diff_kind_Right!=null 
								&& diff_kind_Left.toString().equals(diff_kind_Right.toString()) 
								&& diff_kind_Left.toString().equals("MODIFY"))
							continue;
						
						Object changeStatus = EMFUtils.getAttrValueByAttrNameNullDefault(rTarget, "changeStatus");
						if(changeStatus!=null && changeStatus.toString().equals("CONTRADICTING")) {
							String 	ocClassName	= rTarget.eClass().getName();
							String 	rTargetAttrNameValue	= (String)EMFUtils.getAttrValueByAttrNameNullDefault(rTarget, "name");
							String 	conflictName	= dName + " - " + ocClassName+ ".["	+rTargetAttrNameValue+"]";
							
							String 	changeStatusText	= " - " + changeStatus.toString() 
									+ " ( "+diff_kind_Left.toString()+" | "+diff_kind_Right.toString()+" )";
							conflictName += changeStatusText;
							
							EObject conflictClassEObject		= DiffMM_Factory.create(conflictClass);
							EAttribute nameAttribute = conflictClass.getEAllAttributes().stream().filter(
										f->f.getName().equals("name")).collect(Collectors.toList()).get(0);	
							conflictClassEObject.eSet(nameAttribute, conflictName);						
							String  refC_OName	= "SemanticConflict_"+rTarget.eClass().getName();
							EReference refC_D=EMFUtils.getEReferenceByNameNullDefault(conflictClassEObject,refC_DName);
							EReference refC_O=EMFUtils.getEReferenceByNameNullDefault(conflictClassEObject,refC_OName);						
							SetEFeature(conflictClassEObject, refC_D, d);					
							SetEFeature(conflictClassEObject, refC_O, rTarget);					
							SetEFeature(rootDSDiff, refSemanticconflicts, conflictClassEObject);
						}
					}
				}
			}
			
			
			//Semantic-Class-Modify
			//if(author!=null && !author.toString().equals("EQUAL"))
			for(EReference dRef:d.eClass().getEAllReferences()) {
				EList<EObject> dRefTargets = (EList<EObject>) d.eGet(dRef);
				if(dRefTargets.size()==0)
					continue;	

				String 	dName		= (String)EMFUtils.getAttrValueByAttrNameNullDefault(d, "name");	
				String  dRuleId 	= dName.replaceAll(" ","").toLowerCase();
				for(EObject rTarget:dRefTargets) {					
					Object changeStatus = EMFUtils.getAttrValueByAttrNameNullDefault(rTarget, "changeStatus");
					Object diff_kind_Left = EMFUtils.getAttrValueByAttrNameNullDefault(rTarget, "diff_kind_Left");
					Object diff_kind_Right = EMFUtils.getAttrValueByAttrNameNullDefault(rTarget, "diff_kind_Right");
					String 	rTargetEClassName	= rTarget.eClass().getName();
					String 	rTargetAttrNameValue	= (String)EMFUtils.getAttrValueByAttrNameNullDefault(rTarget, "name");
					
					List<ConflictCPA>  conflictDO = 
							changeConflictsCPA.stream().filter(
									c->(dRuleId.equals(c.firstRule.toLowerCase()) || dRuleId.equals(c.secondRule.toLowerCase()))
									&& c.firstRule.toLowerCase().contains("change"+rTargetEClassName.toLowerCase().replace("diff", ""))
										|| c.secondRule.toLowerCase().contains("change"+rTargetEClassName.toLowerCase().replace("diff", ""))
									&& c.conflictKind==ConflictKind.CHANGE_USE_ATTR_CONFLICT 
										|| c.conflictKind==ConflictKind.CHANGE_FORBID_ATTR_CONFLICT
									).collect(Collectors.toList());	
					
					ArrayList<String> rTargetConflictingAttributes = new ArrayList<String>();
					for(ConflictCPA c:conflictDO) {
						if(c.firstRule.toLowerCase().contains("change"+rTargetEClassName.toLowerCase().replace("diff", "")))
								rTargetConflictingAttributes.add(c.firstRule.split("_")[1]);
						if(c.secondRule.toLowerCase().contains("change"+rTargetEClassName.toLowerCase().replace("diff", "")))
								rTargetConflictingAttributes.add(c.firstRule.split("_")[1]);						
					}
										
					boolean isConflictingAnyConstraintAttribute = false;
					RuleDetail 		r = null;
					String			conflictingMODIFIED = "";
					if(changeStatus!=null && !changeStatus.toString().equals("NON") 
							&& (diff_kind_Left.toString().equals("MODIFY") || diff_kind_Right.toString().equals("MODIFY"))) {
						try {
							// Check conflicting attributes reported by Henshin CPA
							if(rTargetConflictingAttributes.size()>0) {
								for(String cAttr:rTargetConflictingAttributes) {
									Object attrChangeStatus = EMFUtils.getAttrValueByAttrNameNullDefault(rTarget, cAttr+"ChangeStatus");
									if(!attrChangeStatus.toString().equals("NON")) {
										isConflictingAnyConstraintAttribute = true;
										conflictingMODIFIED += cAttr + " ( " + cAttr+"ChangeStatus = " + attrChangeStatus.toString() + " ) ";
										break;
									}
								}								
							}
							// Check conflicting attributes reported by used in the constraints
							if(isConflictingAnyConstraintAttribute == false ) {
								r = rulesDetail.stream().filter(f->f.semanticName.equals(dName)).collect(Collectors.toList()).get(0);
								r.calculateRuleConstraintsDetail();//constraintCollection
								for(ConstraintType c:r.constraintCollection) {
									if(EMFUtils.getAttrValueByAttrNameNullDefault(rTarget, c.attrLhs)!=null) {
										Object attrChangeStatus = EMFUtils.getAttrValueByAttrNameNullDefault(rTarget, c.attrLhs+"ChangeStatus");
										if(!attrChangeStatus.toString().equals("NON")) {
											isConflictingAnyConstraintAttribute = true;
											conflictingMODIFIED +=c.attrLhs + " ( " + c.attrLhs+"ChangeStatus = " + attrChangeStatus.toString() + " ) ";
											break;
										}
									}								
								}								
							}
						}catch(Exception ex) {
							r = null;
						}
					}
					if(changeStatus!=null && (isConflictingAnyConstraintAttribute || changeStatus.toString().equals("CONTRADICTING"))) {
					//if(changeStatus!=null && changeStatus.toString().equals("CONTRADICTING")) {
						//Create a conflict object c
						//Set its name to d.Name - o.Name
						//create a reference c->d, c->o
						
						//String 	ocName	= rTarget.eClass().getName();
						
						String 	ocClassName	= rTarget.eClass().getName();
						String 	conflictName	= dName + " - " + ocClassName+ ".["	+rTargetAttrNameValue;
						if(conflictingMODIFIED.trim()!="")
							conflictName += " | "+conflictingMODIFIED+"]";
						else
							conflictName += "]";
						
						String 	changeStatusText	= 
								" - " + rTargetEClassName +".["+rTargetAttrNameValue+"]"+ "." + changeStatus.toString() + " ( "+diff_kind_Left.toString()+" | "+diff_kind_Right.toString()+" )";
						conflictName += changeStatusText;
							
						
						
						
						//String 	conflictName	= dName + " - " + ocName+conflictingMODIFIED;						
						EObject conflictClassEObject		= DiffMM_Factory.create(conflictClass);
						EAttribute nameAttribute = conflictClass.getEAllAttributes().stream().filter(
									f->f.getName().equals("name")).collect(Collectors.toList()).get(0);	
						conflictClassEObject.eSet(nameAttribute, conflictName);						
						String  refC_OName	= "SemanticConflict_"+rTarget.eClass().getName();
						EReference refC_D=EMFUtils.getEReferenceByNameNullDefault(conflictClassEObject,refC_DName);
						EReference refC_O=EMFUtils.getEReferenceByNameNullDefault(conflictClassEObject,refC_OName);						
						SetEFeature(conflictClassEObject, refC_D, d);					
						SetEFeature(conflictClassEObject, refC_O, rTarget);					
						SetEFeature(rootDSDiff, refSemanticconflicts, conflictClassEObject);
					}
				}
			}	
			
			
			//Semantic (Delete) / Fine-Diff Modify (We already checked it: TO-DO- Check it)
			
			
		}
		
		
		if(removeRepSemConName) {
			semanticConflicts		= (EList<EObject>) rootDSDiff.eGet(refSemanticconflicts);
			ArrayList<EObject> repSemanticConflicts		= new ArrayList<EObject>();
			ArrayList<EObject> visited		= new ArrayList<EObject>();
			for(EObject sc:semanticConflicts)
			{
				if(repSemanticConflicts.contains(sc))
					continue;
				visited.add(sc);
				Object scName= EMFUtils.getAttrValueByAttrNameNullDefault(sc, "name");
				if(!repSemanticConflicts.contains(sc) && scName != null) {				
					//List<EObject> scReps = semanticConflicts.stream().filter(s-> s!=sc && EMFUtils.getAttrValueByAttrNameNullDefault(s, "name")!=null && sc.equals(EMFUtils.getAttrValueByAttrNameNullDefault(s, "name"))).collect(Collectors.toList());
					ArrayList<EObject> scReps = new ArrayList<EObject>();
					for(EObject s:semanticConflicts) {
						if(!visited.contains(s)) {
							Object sName= EMFUtils.getAttrValueByAttrNameNullDefault(s, "name");
							if(sName!=null && scName.equals(sName.toString())) {
								scReps.add(s);
							}
						}					
					}
					
					if(scReps!=null && scReps.size()>0) {
						for(EObject r:scReps) {
							// && sc.eCrossReferences().equals(s.eCrossReferences())
							if(!repSemanticConflicts.contains(r) && !visited.contains(r))
								repSemanticConflicts.add(r);
						}
					}
				}			
			}
			EcoreUtil.removeAll(repSemanticConflicts);
		}		
		
		
		try {
			Map<String, Object> saveOptions = new HashMap<String, Object>();
			//saveOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
			rsourceDSMDiff.save(saveOptions);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//semanticConflicts	= (EList<EObject>) rootDSDiff.eGet(refSemanticconflicts);
		//Get semantic-Semantic conflicts
		//Get semantic-Fine 	conflicts  	(Structural-Structural)
		//Get Fine-Fine 		conflicts	(Structural-Semantic)
		/*
		for(EObject semanticConflict:semanticConflicts) {
			EReference  refSemanticConflict_DiffEAttribute	= 
					EMFUtils.getEReferenceByNameNullDefault(semanticConflict,"SemanticConflict_DiffEAttribute");
			EList<EObject> semanticConflict_DiffEAttribute = null;
			if(refSemanticConflict_DiffEAttribute!=null)
				semanticConflict_DiffEAttribute	= 
					(EList<EObject>) rootDSDiff.eGet(refSemanticConflict_DiffEAttribute);
			
			EReference  refSemanticConflict_DiffEClass	= 
					EMFUtils.getEReferenceByNameNullDefault(semanticConflict,"SemanticConflict_DiffEClass");		
			EList<EObject> semanticConflict_DiffEClass	= null;			
			if(refSemanticConflict_DiffEClass!=null)
				semanticConflict_DiffEClass	= 
					(EList<EObject>) rootDSDiff.eGet(refSemanticConflict_DiffEClass);
			
			EReference  refSemanticConflict_DiffEOperation	= 
					EMFUtils.getEReferenceByNameNullDefault(semanticConflict,"SemanticConflict_DiffEOperation");	
			EList<EObject> semanticConflict_DiffEOperation	= null;			
			if(refSemanticConflict_DiffEOperation!=null)
				semanticConflict_DiffEOperation	= 
					(EList<EObject>) rootDSDiff.eGet(refSemanticConflict_DiffEOperation);
			
			EReference  refSemanticConflict_DiffEReference	= 
					EMFUtils.getEReferenceByNameNullDefault(semanticConflict,"SemanticConflict_DiffEReference");
			EList<EObject> semanticConflict_DiffEReference	= null;
			if(refSemanticConflict_DiffEReference!=null)
				semanticConflict_DiffEReference	= 
					(EList<EObject>) rootDSDiff.eGet(refSemanticConflict_DiffEReference);		
			

			EReference  refSemanticConflict_DomainSpecificDiff	= 
					EMFUtils.getEReferenceByNameNullDefault(semanticConflict,"SemanticConflict_DomainSpecificDiff");		
			EList<EObject> semanticConflict_DomainSpecificDiff	= null;
			if(refSemanticConflict_DomainSpecificDiff!=null)
				semanticConflict_DomainSpecificDiff	=
					(EList<EObject>) rootDSDiff.eGet(refSemanticConflict_DomainSpecificDiff);
		}
		*/
		System.out.println("The End of finding difference between Semantic and Fine-grained differences.");

		
	 }
	 
	 
	 
	/*
	public Object Item(int ID_PatternValue, String valAttrName) 
	 	{
	 		for(MVItem m: matchVariant.matchList)
	 		{
	 			EAttribute attrID_Pattern= getEAttributeByName(m.nodeRule,\"ID_Pattern\");
	 			if (m.nodeRule.eGet(attrID_Pattern).toString().equals(ID_PatternValue.toString()))
	 				{
	 				return m.nodeDSD.eGet(DsModelComparatorTest.getEAttributeByName(m.nodeDSD,valAttrName));
	  			}
	 		}
	 
	 	    return null;
	 	}
	 */
	
	
	/*
	 //Init EMFCompare
	  //Method3
			//Comparing from an Eclipse plugin
			/*
			IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
			IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
			IMatchEngine matchEngine = new DefaultMatchEngine(matcher, comparisonFactory);
		        IMatchEngine.Factory.Registry matchEngineRegistry = EMFCompareRCPPlugin.getDefault().getMatchEngineFactoryRegistry();
		        IPostProcessor.Descriptor.Registry<String> postProcessorRegistry = EMFCompareRCPPlugin.getDefault().getPostProcessorRegistry();
			EMFCompare comparator = EMFCompare.builder()
		                                           .setMatchEngineFactoryRegistry(matchEngineRegistry)
		                                           .setPostProcessorRegistry(postProcessorRegistry)
		                                           .build();
			
			IComparisonScope scope = EMFCompare.createDefaultScope(rsBranch1, rsBranch2,rsCommonAncestor);
			comparison3Way = comparator.compare(scope);
			*/

			
			
			//Method1
			
			/*
			IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
			IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
			IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory);
		        matchEngineFactory.setRanking(20);
		        IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
		        matchEngineRegistry.add(matchEngineFactory);
			EMFCompare comparator = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry).build();
			
			IComparisonScope scope = EMFCompare.createDefaultScope(rsBranch1, rsBranch2,rsCommonAncestor);
			comparison3Way = comparator.compare(scope);
			//*/
			
			
			
			
			//Method2
			
			/*
			Function<EObject, String> idFunction = new Function<EObject, String>() {
				public String apply(EObject input) {
					if (input instanceof EObject) {
						String idAttributeName = "name";//default
						EAttribute idAttribute = ((EObject)input).eClass().getEIDAttribute();
						if(idAttribute != null)
							idAttributeName= idAttribute.getName();
						
						String idAttributeNameValue = EMFUtils.getAttrValueByAttrNameNullDefault(((EObject)input),idAttributeName).toString();
						
						///*
						String idAttributeNameEContainerValue = "";
						if(((EObject)input).eContainer()!=null) {
							String idAttributeNameEContainer = "name";//default
							EAttribute idAttributeEContainer = ((EObject)input).eContainer().eClass().getEIDAttribute();
							if(idAttributeEContainer != null)
								idAttributeNameEContainer= idAttributeEContainer.getName();
							
							idAttributeNameEContainerValue = EMFUtils.getAttrValueByAttrNameNullDefault(((EObject)input),idAttributeName).toString();
						}
						return idAttributeNameEContainerValue+"."+idAttributeNameValue;
						//* /
						return idAttributeNameValue;
					}
					// a null return here tells the match engine to fall back to the other matchers
					return null;
				}
			};
			// Using this matcher as fall back, EMF Compare will still search for XMI IDs on EObjects
			// for which we had no custom id function.
			IEObjectMatcher fallBackMatcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.WHEN_AVAILABLE);
			IEObjectMatcher customIDMatcher = new IdentifierEObjectMatcher(fallBackMatcher, idFunction);
			 
			IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
			 
			IMatchEngine.Factory.Registry registry = MatchEngineFactoryRegistryImpl.createStandaloneInstance();
			// for OSGi (IDE, RCP) usage
			// IMatchEngine.Factory.Registry registry = EMFCompareRCPPlugin.getDefault().getMatchEngineFactoryRegistry();
			final MatchEngineFactoryImpl matchEngineFactory = new MatchEngineFactoryImpl(customIDMatcher, comparisonFactory);
			matchEngineFactory.setRanking(20); // default engine ranking is 10, must be higher to override.
			registry.add(matchEngineFactory);
			
			IComparisonScope scope = EMFCompare.createDefaultScope(rsBranch1, rsBranch2,rsCommonAncestor);
			
			EMFCompare comparator = EMFCompare.builder().setMatchEngineFactoryRegistry(registry).build();

			comparison3Way = comparator.compare(scope);
			//*/
			
			
			//comparison3Way = new DsEMFComparator().compareCoreThreeWay(rsBranch1, rsBranch2, rsCommonAncestor);

	 
	public Resource ThreeWayEMFCompareDiffsToDSMCFineDiffs(
			 String VCommonAncestorPath, String vBranchLeftPath, String vBranchRightPath, 
			 String DSMDiffPath, String resultFilePath)  throws IOException
	 {
		 /* Map EmfCompare 3-Way Diffs To Fine-granular DSMDiffs 
		  	1.   	EMFCompare(Version Common Ancestor, Version in Branch 1, Version in Branch 2) -> EDiff
			2. 		Create Diff Model
			2.1. 		Get DiffElements from EDiff'
			3.2. 		Create DSDiff Model containing the fine-granular DiffElements added to VCommonAncestor file'
		  */	
		System.out.println("The start of transforming EMFCompare 3-way Diffs to DSMC-Diff");
	 	File VCommonAncestor_File=new File(VCommonAncestorPath);
		File vBranchLeft_File=new File(vBranchLeftPath);
		File vBranchRight_File=new File(vBranchRightPath);
		//For ThreeWay Test Begin
		//File VerOrigin_File=new File(VerOriginPath);
		//For ThreeWay Test End
		Charset charset = StandardCharsets.UTF_8;
		String contentVCommonAncestorFile = new String(Files.readAllBytes(VCommonAncestor_File.toPath()), charset);
		String contentVBranchLeftFile = new String(Files.readAllBytes(vBranchLeft_File.toPath()), charset);
		String contentVBranchRightFile = new String(Files.readAllBytes(vBranchRight_File.toPath()), charset);		
		
		Comparison comparison3Way = null;
		Comparison comparisonCaDSMDiff = null;
		comparisonResult= null;
		ArrayList<FineDiffReference> 	sortedFineDiffReferences = null;	
				
		try {
				String content = new String(contentVCommonAncestorFile);		    	
		    	content = content.replaceAll(MMPackageName, DiffMMPackageName);
				Files.write(VCommonAncestor_File.toPath(), content.getBytes(charset));
		    				
				content = new String(contentVBranchLeftFile);
				content = content.replaceAll(MMPackageName, DiffMMPackageName);
				Files.write(vBranchLeft_File.toPath(), content.getBytes(charset));
				
				content = new String(contentVBranchRightFile);
				content = content.replaceAll(MMPackageName, DiffMMPackageName);
				Files.write(vBranchRight_File.toPath(), content.getBytes(charset));
				
				ResourceSet 
				rsCommonAncestor=setResourceSet(VCommonAncestorPath,DiffMM_eNSURI, DiffMM_eIN), 
				rsBranch1=setResourceSet(vBranchLeftPath, DiffMM_eNSURI, DiffMM_eIN),
				rsBranch2=setResourceSet(vBranchRightPath, DiffMM_eNSURI, DiffMM_eIN);
				
				Files.deleteIfExists(new File(DSMDiffPath).toPath());
				
				IComparisonScope scope = null;
				EMFCompare comparator  = null;
				
				try {
				// Configure EMF Compare
				//Method4			
				///*
				IEObjectMatcher cdoMatcher = 
						CDOCompare.CDOMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.WHEN_AVAILABLE);//NEVER
				//// DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
				IComparisonFactory comparisonFactory = 
						new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
							
				//CDO			
				IMatchEngine.Factory matchEngineFactory = 
						new MatchEngineFactoryImpl(cdoMatcher, comparisonFactory);
			        matchEngineFactory.setRanking(20);
			        IMatchEngine.Factory.Registry matchEngineRegistry = 
			        		new MatchEngineFactoryRegistryImpl();
			        matchEngineRegistry.add(matchEngineFactory);		        
			        
			    IDiffEngine cdoDiffEngine = new CDOCompare.CDODiffEngine();	
			    
			    //Default - EMFCompare
			    IEquiEngine equiEngine = new DefaultEquiEngine();
			    IReqEngine  reqEngine = new DefaultReqEngine();
			    IConflictDetector confDetector = new DefaultConflictDetector();
			    IPostProcessor.Descriptor.Registry<String> postProcessorRegistry = 
			    		new PostProcessorDescriptorRegistryImpl<String>();
	
			    //Comparison Builder
				comparator = EMFCompare.builder()
						.setMatchEngineFactoryRegistry(matchEngineRegistry) 
						.setDiffEngine(cdoDiffEngine)  
						.setEquivalenceEngine(equiEngine)
						.setRequirementEngine(reqEngine)
						.setConflictDetector(confDetector)
						.setPostProcessorRegistry(postProcessorRegistry)
						.build();
				
				scope = EMFCompare.createDefaultScope(rsBranch1, rsBranch2,rsCommonAncestor);
				comparison3Way = comparator.compare(scope);
			}catch(Exception ex) {
				IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
				IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
				IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory);
			        matchEngineFactory.setRanking(20);
			        IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
			        matchEngineRegistry.add(matchEngineFactory);
				comparator = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry).build();
				
				scope = EMFCompare.createDefaultScope(rsBranch1, rsBranch2,rsCommonAncestor);
				comparison3Way = comparator.compare(scope);
			}
			
			comparisonResult= new ComparisonResult();
			comparisonResult.setComparison3Way(comparison3Way);
			comparisonResult = ProcessComparisonResult.processThreeWayComparison(comparison3Way, resultFilePath); 
			comparisonResult.calculateDependencies();
			comparisonResult.calculateConflicts();
			comparisonResult.calculateFineDiffAttributeGroupAndConflict();
			comparisonResult.fineDiffAttributeGroups.forEach(f->{
				f.calculateFineDiffAttributeGroupProps();
			});
			
			sortedFineDiffReferences = comparisonResult.sortFineDiffReferenceByDependencies(comparisonResult.fineDiffReferences, false);
			
			//Remove all repeated
			HashSet<Object> seen=new HashSet<>();
			sortedFineDiffReferences.removeIf(e->!seen.add(e.diff));			
			
			File DSMDiff_File=new File(DSMDiffPath);
			// Copy all objects that were in Common Ancestor (origin) version to initialize the DSMDiff file
			// Then we will change DSMDiff file according to Diff result returned from 3-way comparison module
			Files.copy(VCommonAncestor_File.toPath(), DSMDiff_File.toPath());	
			ResourceSet rsetDSMDiff=setResourceSet(DSMDiffPath,DiffMM_eNSURI, DiffMM_eIN);	
			rsourceDSMDiff=rsetDSMDiff.getResource(URI.createFileURI(DSMDiffPath) , true);					
			// calculate One-to-One relation between CommonAncestor (origin) and its copy 
			// We need it beacuse what we have is the objects created in CommonAncestor
			// But we need to access the corresponding object in the DSDiff file
			
			scope = EMFCompare.createDefaultScope(rsetDSMDiff, rsCommonAncestor);
			comparisonCaDSMDiff = comparator.compare(scope);			
			//comparisonCaDSMDiff = new DsEMFComparator().compareCoreTwoWay(rsetDSMDiff, rsCommonAncestor);
			comparisonResult.setComparisonCaDSMDiff(comparisonCaDSMDiff);
			//*************************************************
			//Transform class Differences			
			List<FineDiffReference> sortedFineDiffClasses=sortedFineDiffReferences.stream().filter(
					d-> d.diffReferenceChangeType == DiffReferenceChangeType.ClassChange ).collect(Collectors.toList());

			semDiffUtils.comparisonResult = comparisonResult;
			semDiffUtils.DiffMM_Factory   = DiffMM_Factory;
			semDiffUtils.versionCaInfo = versionCaInfo;
			semDiffUtils.versionLeftInfo = versionLeftInfo;
			semDiffUtils.versionRightInfo = versionRightInfo;
			semDiffUtils.ChangeStatusType = (EEnum)  DiffMM_Factory.getEPackage().getEClassifier("ChangeStatus");
			semDiffUtils.changeStatusEQUIVALENT = DiffMM_Factory.createFromString(semDiffUtils.ChangeStatusType, "EQUIVALENT");
			semDiffUtils.changeStatusCONTRADICTING = DiffMM_Factory.createFromString(semDiffUtils.ChangeStatusType, "CONTRADICTING");
			
			semDiffUtils.claculateClassDiffGroups(sortedFineDiffClasses);
			semDiffUtils.transformClassDiffGroup(comparisonResult.classDiffGroups);
			semDiffUtils.createAllLinksFromContainer(comparisonResult.classDiffGroups); 
			//Remove all repetitive elements in terms of Id Attribute from container
			semDiffUtils.removeAllOriginValueMatch(comparisonResult.classDiffGroups);
			
			semDiffUtils.calculateFineDiffClassConflicts(comparisonResult.classDiffGroups);
			
			List<FineDiffReference> fineDiffReferences= sortedFineDiffReferences.stream().filter(
					d->d.diffReferenceChangeType == DiffReferenceChangeType.ReferenceChange ).collect(Collectors.toList());
			semDiffUtils.calculateAssociationValueDiffContainerDiff(fineDiffReferences);
			semDiffUtils.claculateAssociationDiffGroups(fineDiffReferences, comparisonResult.associationDiffGroups);
			semDiffUtils.transformAssociationDiffGroups(comparisonResult.associationDiffGroups);
			
			Map<String, Object> saveOptions = new HashMap<String, Object>();
			//saveOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
			rsourceDSMDiff.save(saveOptions);
							
		}catch (Throwable _e) 
    	{
			Files.write(vBranchLeft_File.toPath(), contentVBranchLeftFile.getBytes(charset));
			Files.write(vBranchRight_File.toPath(), contentVBranchRightFile.getBytes(charset));
			Files.write(VCommonAncestor_File.toPath(), contentVCommonAncestorFile.getBytes(charset));
	    	System.out.println(_e);   	
			
			System.out.println("The end of transforming EMF-Diff to DSMC-Diff -- Inside last catch");
	    	
    		//throw Exceptions.sneakyThrow(_e);
			return null;
    	}	

		Files.write(vBranchLeft_File.toPath(), contentVBranchLeftFile.getBytes(charset));
		Files.write(vBranchRight_File.toPath(), contentVBranchRightFile.getBytes(charset));
		Files.write(VCommonAncestor_File.toPath(), contentVCommonAncestorFile.getBytes(charset));
		
		System.out.println("The end of transforming EMF-Diff to DSMC-Diff");
		return rsourceDSMDiff;
	 }
	 

	 //***********************************************************
	 
	 public void MapEmfCompareDiffsToFineGranularDSMDiffs(String VerBasePath, String VerNewPath, String DSMDiffPath, String result) throws IOException
	 {

			System.out.println("The start of transforming EMF-Diff to DSMC-Diff");
		 
			 /* Map EmfCompare Diffs (EDiff) To Fine Granular DSMDiffs 
			  	2.   EMFCompare(MBase,Mnew) -> EDiff
	
				3.1. Convert EDiff -> DiffElements'
	
				3.2. Add DiffElements' on MBase' -> DSMDiff'
			  */
			
					 
		 	File VerBase_File=new File(VerBasePath);
			File VerNew_File=new File(VerNewPath);
			//For ThreeWay Test Begin
			//File VerOrigin_File=new File(VerOriginPath);
			//For ThreeWay Test End
			Charset charset = StandardCharsets.UTF_8;
			String contentBaseFile = new String(Files.readAllBytes(VerBase_File.toPath()), charset);
			String contentNewFile = new String(Files.readAllBytes(VerNew_File.toPath()), charset);
			Resource rsourceDSMDiff = null;
		    try {
		    	
		    	String content = new String(contentBaseFile);		    	
		    	content = content.replaceAll(MMPackageName, DiffMMPackageName);
		    	//content = content.replaceAll(MMFileName, DiffMMFileName);
				Files.write(VerBase_File.toPath(), content.getBytes(charset));
		    	
				
				content = new String(contentNewFile);
				content = content.replaceAll(MMPackageName, DiffMMPackageName);
				//content = content.replaceAll(MMFileName, DiffMMFileName);
				Files.write(VerNew_File.toPath(), content.getBytes(charset));
		    	
		    	
				FileOutputStream fileOutputStream=new FileOutputStream(result);
				PrintStream printStream=new PrintStream(fileOutputStream);
				
				
				//For ThreeWay Test Begin
				/*
				String contentOriginFile = new String(Files.readAllBytes(VerOrigin_File.toPath()), charset);
				content = new String(contentOriginFile);
				content = content.replaceAll(MMPackageName, DiffMMPackageName);
				Files.write(VerOrigin_File.toPath(), content.getBytes(charset));
				ResourceSet rsOrigin=setResourceSet(VerOriginPath,DiffMM_eNSURI, DiffMM_eIN);
				*/
				//For ThreeWay Test End
				
				
				ResourceSet rsBase=setResourceSet(VerBasePath,DiffMM_eNSURI, DiffMM_eIN), 
							rsNew=setResourceSet(VerNewPath, DiffMM_eNSURI, DiffMM_eIN);
				
				
				final Comparison comparisonBaseNew = new DsEMFComparator().compareCoreTwoWay(rsNew, rsBase); //.compareCoreThreeWay(rsNew, rsBase, rsOrigin);//
				final EList<Diff> differences=comparisonBaseNew.getDifferences();
				
				ComparisonResult	comparisonResult= new ComparisonResult();
				comparisonResult = ProcessComparisonResult.processThreeWayComparison(comparisonBaseNew, getResultFilePath()); 
				comparisonResult.calculateDependencies();							
				Files.deleteIfExists(new File(DSMDiffPath).toPath());
				
				
				File DSMDiff_File=new File(DSMDiffPath);
				// Transform all objects that were in first (Base) version 
				Files.copy( (new File(VerBasePath)).toPath(), DSMDiff_File.toPath());
				
				ResourceSet rsetDSMDiff=setResourceSet(DSMDiffPath,DiffMM_eNSURI, DiffMM_eIN);
				//ResourceSet rsetDSMDiff=setResourceSet(DSMDiffPath,PacmanGoAugmentedPackage.eNS_URI, PacmanGoAugmentedPackage.eINSTANCE);
				final Comparison comparisonBaseDSMDiff = new DsEMFComparator().compareCoreTwoWay(rsetDSMDiff, rsBase); 
				
				final Comparison comparisonNewDSMDiff = new DsEMFComparator().compareCoreTwoWay(rsetDSMDiff, rsNew); 
				
				//rsetDSMDiff=setResourceSet(DSMDiffPath,PacmanGoDiffMMPackage.eNS_URI, PacmanGoDiffMMPackage.eINSTANCE);
				rsourceDSMDiff=rsetDSMDiff.getResource(URI.createFileURI(DSMDiffPath) , true);				

				((XMLResource) rsourceDSMDiff).getDefaultLoadOptions().put(org.eclipse.emf.ecore.xmi.XMLResource.OPTION_PROCESS_DANGLING_HREF,Boolean.FALSE);					
							
				//PacmanGoAugmented.Root rootDSMDiff= (PacmanGoAugmented.Root)rsourceDSMDiff.getContents().get(0);
				//PacmanGoDiffMM.Game rootDSMDiff=(PacmanGoDiffMM.Game)rsourceDSMDiff.getContents().get(0);				
				
				EObject[][] diffsMatch = new EObject[differences.size()][3];
									
				int s=-1;
				
				//Transform Diffs representing classes which are added or deleted
				ArrayList<Diff> differencesToLookAgain= new ArrayList<Diff>();
				final ArrayList<Diff> differencesToReview= SortByDependencies(differences, false);
				ArrayList<Diff> differencesOfEOtherTypes= new ArrayList<Diff>();
				ArrayList<EObject> objectsToDelete= new ArrayList<EObject>();
				
				//differencesToReview = SortByDependencies(differences, false);
				
				
				differences.forEach(d->{
					if(d != null){
							EList<Diff> requiredByList= d.getRequiredBy();
							
						}
					}
				);				
				
				
/*				
				for(Diff d:differences){
					if(d instanceof ReferenceChange && (((ReferenceChange)d).getValue().getClass().getName().contains("EClass")) && d.getKind()==DifferenceKind.ADD) {
						String leftContainerType= "", rightContainerType= "";	
						try {
							leftContainerType=d.getMatch().getLeft().eContainer().eClass().getName();
						}catch(Exception ex)
						{
							leftContainerType="";
						}
						try {
							rightContainerType=d.getMatch().getRight().eContainer().eClass().getName();
						}catch(Exception ex)
						{
							rightContainerType="";
						}					
						
						if(leftContainerType.equals("EPackage") || rightContainerType.equals("EPackage")) {
								differencesToReview.add(d);
						}
					}
				}
				
				for(Diff d:differences){
					if(d instanceof ReferenceChange && (((ReferenceChange)d).getValue().getClass().getName().contains("EClass")) && d.getKind()==DifferenceKind.DELETE) {
						String leftContainerType= "", rightContainerType= "";	
						try {
							leftContainerType=d.getMatch().getLeft().eContainer().eClass().getName();
						}catch(Exception ex)
						{
							leftContainerType="";
						}
						try {
							rightContainerType=d.getMatch().getRight().eContainer().eClass().getName();
						}catch(Exception ex)
						{
							rightContainerType="";
						}					
						
						if(leftContainerType.equals("EPackage") || rightContainerType.equals("EPackage")) {
								differencesToReview.add(d);
						}
					}
				}							
*/				
				differences.forEach(d->{
						if((d instanceof ReferenceChange)
								&&(d.getKind()==DifferenceKind.DELETE)
								&&!differencesToReview.contains(d)
								/*&&(((ReferenceChange)d).getValue().getClass().getName().contains("EClass"))*/) {
							differencesToReview.add(d);//differencesOfEClassType
						}
					}
				);
				differences.forEach(d->{
					if((d instanceof ReferenceChange)
							&&(d.getKind()==DifferenceKind.ADD)
							&&!differencesToReview.contains(d)
							/*&&(((ReferenceChange)d).getValue().getClass().getName().contains("EClass"))*/) {
						differencesToReview.add(d);//differencesOfEClassType
						}
					}
				);	
				
				
/*				
				for(Diff d:differences){
					if(d instanceof ReferenceChange && d.getKind()==DifferenceKind.MOVE) {
						String leftContainerType= "", rightContainerType= "";	
						try {
							leftContainerType=d.getMatch().getLeft().eContainer().eClass().getName();
						}catch(Exception ex)
						{
							leftContainerType="";
						}
						try {
							rightContainerType=d.getMatch().getRight().eContainer().eClass().getName();
						}catch(Exception ex)
						{
							rightContainerType="";
						}					
						
						if(leftContainerType.equals("EPackage") || rightContainerType.equals("EPackage")) {
								differencesToReview.add(d);
						}
					}
				}				
*/
				
				differences.forEach(d->{
					if((d instanceof ReferenceChange)
							&&(d.getKind()==DifferenceKind.MOVE)
							&&!differencesToReview.contains(d)
							/*&&(((ReferenceChange)d).getValue().getClass().getName().contains("EClass"))*/) {
							differencesToReview.add(d);//differencesOfEClassType
						}
					}
				);
				
				differences.forEach(d->{
					if(!differencesToReview.contains(d)){
						differencesToReview.add(d);
						}
					}
				);
				
				/*
				for(Diff diff:differencesToReview)
				{
					if(diff.getMatch().getLeft().eContainer().eClass().getName().equals("EPackage"))
					{
						int itemPos = differencesToReview.indexOf(diff);
						differencesToReview.remove(itemPos);
						differencesToReview.add(itemPos, diff);
					}
				}*/
				
				
				//differencesToReview.sort
				
				
				//differencesOfEOtherTypes.forEach(d->differencesToReview.add(d));
				
//********************************************				
				//int rep=0;
				//do {
					//rep++;
					//System.out.println("** N"+rep);
				//do {
				//Transform class differences 
				//But it is not work correct
				// since the condition may return the reference change and not a class diff
				// and as a result a class diff may be added/removed
				for(Diff diff:differencesToReview)
				{
					if (diff instanceof ReferenceChange  
							&& (diff.getKind() == DifferenceKind.DELETE 
								|| diff.getKind() == DifferenceKind.ADD 
								|| diff.getKind() == DifferenceKind.MOVE))
					{
						final ReferenceChange refAddDel = (ReferenceChange)diff;											
						//Target of the association  == refAddDel.getValue()
						//in DifferenceKind.DELETE, getValue returns value in the (Base) version , 
						// and in DifferenceKind.ADD, it returns value in the (New) version
						EObject 	EDiffObject			= refAddDel.getValue(); 
						EObject 	DSDiffObject		= findInDiffMatchs(diffsMatch, EDiffObject,s);
						
						EClass 		EDiffObjectEClass 	= EDiffObject.eClass();								
						EClassifier DSDiffEClassifier	= EDiffObjectEClass.getEPackage().getEClassifier("Diff"+EDiffObjectEClass.getName());	
						EClass		DSDiffEClass		= (EClass)DSDiffEClassifier;						
						if(DSDiffObject==null) {
							DSDiffObject		=    DiffMM_Factory.create(DSDiffEClass);//  PacmanGoDiffMMFactory.eINSTANCE.create(DSDiffEClass);
							// %%% Can be solved next by inheritance DiffMM_FactoryClass inherits from ArduinoDiffMMFactory
							//DiffMM_Factory = ArduinoDiffMMFactory, PacmanGoDiffMMFactory.eINSTANCE;
								
							//PacmanGoDiffMMFactory.eINSTANCE.create(DSDiffEClass);
							//EObject 	DSDiffObject		= PacmanGoAugmentedFactory.eINSTANCE.create(DSDiffEClass);
						
							for(EAttribute attr:EDiffObjectEClass.getEAllAttributes())
							{
								DSDiffObject.eSet(attr,EDiffObject.eGet(attr));
							}
						}												
						
						EAttribute attrOperation=DSDiffEClass.getEAllAttributes().stream().filter(f->f.getName()=="diff_kind").collect(Collectors.toList()).get(0);
						/*
						for(EAttribute attr:DSDiffEClass.getEAllAttributes())
						{
							if(attr.getName()=="diff_kind")
								attrOperation=attr;
						}*/	
						
						
						//As we have both roots (match) in the left and right of the value
						//i.e. // (!Objects.equal(refChange.getMatch().getRight(), null) && !Objects.equal(refChange.getMatch().getLeft(), null))
						//We take right because we have decided to build the DSMDiff from base
						EObject rootMatchBase = null;
						EObject rootMatchDSMDiff = null;
						
						try {//TO-DO: Need to investigate
								if(refAddDel.getSource() == DifferenceSource.LEFT) {
									try {
									rootMatchBase=refAddDel.getMatch().getRight(); //Source of the association
									rootMatchDSMDiff=comparisonBaseDSMDiff.getMatch(rootMatchBase).getLeft();
									}
									catch(Exception ex) {
										rootMatchBase=refAddDel.getMatch().getLeft(); //Source of the association
										rootMatchDSMDiff=comparisonBaseDSMDiff.getMatch(rootMatchBase).getRight();
									}
								}
								else {
									try {
								
									rootMatchBase=refAddDel.getMatch().getLeft(); //Source of the association
									rootMatchDSMDiff=comparisonBaseDSMDiff.getMatch(rootMatchBase).getRight();
									}
									catch(Exception ex) {
										rootMatchBase=refAddDel.getMatch().getRight(); //Source of the association
										rootMatchDSMDiff=comparisonBaseDSMDiff.getMatch(rootMatchBase).getLeft();
									}
								
								}
						}
						catch(Exception ex) {
							rootMatchDSMDiff=findInDiffMatchs(diffsMatch, rootMatchBase,s);
							if(rootMatchDSMDiff==null)
								rootMatchDSMDiff=findInDiffMatchs(diffsMatch,EDiffObject.eContainer(), s);
							System.out.println("\n" + s+ ". Exception - line 1217 - Kind: "+refAddDel.getKind()+"\n  -DSDiffObject= "+DSDiffObject.toString() + "\n  -refAddDel:"+refAddDel);// + "/ root= "+rootMatchDSMDiff!=null?rootMatchDSMDiff.toString():"");
							System.out.println("  -ex= "+ex);
							System.out.println("  -rootMatchBase= "+rootMatchBase);
							differencesToLookAgain.add(diff);
							//differences.add(diff);
							//continue;
						}						
						
						EEnum ClassOpType = (EEnum)  EDiffObjectEClass.getEPackage().getEClassifier("DiffKind");//DiffMM_Factory.create((EClass)						
						Object ClassOpAdd = DiffMM_Factory.createFromString(ClassOpType, "ADD");
						//refAddDel.getKind() == DifferenceKind.ADD || refAddDel.getKind() == DifferenceKind.MOVE
						
						DSDiffObject.eSet(attrOperation,ClassOpAdd);						
						Object ClassOpDelete = DiffMM_Factory.createFromString(ClassOpType, "DELETE");
						
						if(refAddDel.getKind() == DifferenceKind.DELETE)
							DSDiffObject.eSet(attrOperation,ClassOpDelete);
						//if(refAddDel.getKind() == DifferenceKind.ADD)
							//DSDiffObject.eSet(attrOperation,ClassOp.ADD);
						

						//System.out.println(DSDiffObject);
						if(rootMatchDSMDiff==null) {//%%%%%%  Highly need to check
							// %%%%%%%%
							// It needs a post processing
							// We need to sor this kind of class-diffs in an array and review them again 
							//		untill they all finish 
							// %%%%%%%%
							//The root container exists and it also is a kind of diff
							// but enters to the loop later than its child (the current diff)
							
							//DSDiffObject.eContainer().
							
							
							
							/*///&&&&&&&&&&&&&&&&&&&&&
							EObject theRoot= EDiffObject.eContainer();
							//%%%%%% rootMatchBase = findInDiffMatchs(diffsMatch, theRoot,s) returns null
							
							
							if(theRoot!=null)
								System.out.println("theRoot= EDiffObject.eContainer() = "+theRoot.toString());
							else
								System.out.println("theRoot= EDiffObject.eContainer() also was null");
							
							rsourceDSMDiff.getContents().add(DSDiffObject);		
							&&&&&&&&&&&&&&&&&&&&&&&&&& */
							try {//***// DSDiffObject did not added anywhere
								////addToPackage(rsourceDSMDiff.getContents().get(0), DSDiffObject);
								//***//rsourceDSMDiff.save(null);
							}
							catch(Exception exF) {
								System.out.println(s +" : Not saved (1238): " + exF.toString());
							}
							
						}
						else
						{
							EReference refType=null;	
							
							refType= rootMatchDSMDiff.eClass().getEAllReferences().stream().filter(r->r.getName().equalsIgnoreCase(refAddDel.getReference().getName())).collect(Collectors.toList()).get(0);
							
							/*for(EReference ref:rootMatchDSMDiff.eClass().getEAllReferences()) //rootDSMDiff
							{
								if(ref.getName()==refAddDel.getReference().getName()) //ref.getEReferenceType().getName()==refAddDel.eClass().getName() &&
									refType=ref;					//TO-DO: Did not work : if(ref.getName().equals("diff"+refAddDel.getReference().getName())) 
							}*/
							
							//System.out.println(rootMatchDSMDiff.eContents());
							
							
							try {//TO-DO
								//if(refType!=null) {
									SetEFeature(rootMatchDSMDiff, refType, DSDiffObject);
									//***//rsourceDSMDiff.save(null);
								//}
							}catch(Exception ex) {
								try
								{
									refType= rootMatchDSMDiff.eClass().getEAllReferences().stream().filter(r->r.getName().equalsIgnoreCase("diff"+refAddDel.getReference().getName())).collect(Collectors.toList()).get(0);
									/*for(EReference ref:rootMatchDSMDiff.eClass().getEAllReferences()) //rootDSMDiff
									{
										if(ref.getName()=="diff"+refAddDel.getReference().getName()) 
											refType=ref;					
									}*/
									//if(refType!=null) {
										SetEFeature(rootMatchDSMDiff, refType, DSDiffObject);
										//***//rsourceDSMDiff.save(null);
									//}
								}
								catch(Exception ex1) {
									//The following works for refactoring.ecore
									//refType=rsourceDSMDiff.getContents().get(0).eClass().getEAllReferences().stream().filter(r->r.getName().equalsIgnoreCase("eclassifiers")).collect(Collectors.toList()).get(0);
									//SetEFeature(rsourceDSMDiff.getContents().get(0), refType, DSDiffObject);
									//rsourceDSMDiff.getContents().add(DSDiffObject);
									try {//***// DSDiffObject did not added anywhere
										////addToPackage(rsourceDSMDiff.getContents().get(0), DSDiffObject);
										//***//rsourceDSMDiff.save(null);
									}
									catch(Exception exF) {
										System.out.println(s + " : Not saved (1294): " + exF.toString());										
									}
									
								}								
							}
						}										
						
						
						
						//System.out.println(rootMatchDSMDiff.eContents());

						s++;
						if(refAddDel.getKind() == DifferenceKind.DELETE)// refAddDel.getKind() == DifferenceKind.MOVE
						{
							diffsMatch[s][0]=EDiffObject;
							diffsMatch[s][1]=null;
							diffsMatch[s][2]=DSDiffObject;
							EObject eObjectToDelete=comparisonBaseDSMDiff.getMatch(EDiffObject).getLeft();	
							//if(!getAttrValueByAttrName(eObjectToDelete, "name").toString().contains("Diff"))
							System.out.println("\ns = " +s+ ",DifferenceKind.DELETE,  eObjectToDelete= "+ eObjectToDelete + " refAddDel ="+refAddDel);
							
							EcoreUtil.delete(eObjectToDelete);	
							objectsToDelete.add(eObjectToDelete);
						}
						if(refAddDel.getKind() == DifferenceKind.ADD)
						{							
							diffsMatch[s][0]=null;
							diffsMatch[s][1]=EDiffObject;
							diffsMatch[s][2]=DSDiffObject;	
						}

						if(refAddDel.getKind() == DifferenceKind.MOVE)
						{					
							diffsMatch[s][0]=EDiffObject;
							diffsMatch[s][1]=null;
							diffsMatch[s][2]=DSDiffObject;
							EObject DSDiffObjectCopy=null;
							try {
								EObject eObjectToDelete=comparisonBaseDSMDiff.getMatch(comparisonNewDSMDiff.getMatch(EDiffObject).getLeft()).getLeft();							
								EObject eObjectToDeleteContainer=eObjectToDelete.eContainer();
								System.out.println("\ns = " +s+ ",DifferenceKind.MOVE,  eObjectToDelete= "+ eObjectToDelete + " refAddDel ="+refAddDel);
								
								EcoreUtil.delete(eObjectToDelete);
								objectsToDelete.add(eObjectToDelete);
								// As we do not have MOVE in our MM (Move interpreted as DELETE from/ADD to
								
								DSDiffObjectCopy=EcoreUtil.copy(DSDiffObject);
								EAttribute attrOperationD= DSDiffObjectCopy.eClass().getEAllAttributes().stream().filter(f->f.getName()=="diff_kind").collect(Collectors.toList()).get(0);
								DSDiffObjectCopy.eSet(attrOperationD,ClassOpDelete);	
								EReference refType=null;								
								refType= rootMatchDSMDiff.eClass().getEAllReferences().stream().filter(r->r.getName().equalsIgnoreCase(refAddDel.getReference().getName())).collect(Collectors.toList()).get(0);
								SetEFeature(eObjectToDeleteContainer, refType, DSDiffObjectCopy);
							}
							catch(Exception ex2) 
							{
								//addToPackage(rsourceDSMDiff.getContents().get(0), DSDiffObjectCopy);
								System.out.println("\n" + s+ ". Exception -line 1368 - Kind: "+ refAddDel.getKind()+ "\n  -DSDiffObject=" +DSDiffObject+ "\n  -refAddDel=" +refAddDel.toString()+"; Broken. NEED to be solved later");
								System.out.println("  -ex Move= "+ex2);
								System.out.println("  -rootMatchBase= "+rootMatchBase);
							}
							
							
						}
					}
				}
				//differencesToReview.clear();
				//differencesToLookAgain.forEach(d->differencesToReview.add(d));
			//}while(differencesToReview.size()>0);
				
//***************************************				
				//Transform Diffs representing references which are added or deleted
				for(Diff diff:differencesToReview)
				{
					if (diff instanceof ReferenceChange && diff.getKind() == DifferenceKind.CHANGE)
					{
						final ReferenceChange  refChange= (ReferenceChange)diff;
						
						EObject 	EDiffObjectTarget			= refChange.getValue(); //in Delete case getValue returns value in the (Base) version , and in Add it returns value in the (New) version
						EClass 		EDiffObjectEClassTarget 	= EDiffObjectTarget.eClass();
						EObject 	DSDiffObjectTarget			= null;					
						
						//As we have both roots (match) in the left and right of the value
						//i.e. // (!Objects.equal(refChange.getMatch().getRight(), null) && !Objects.equal(refChange.getMatch().getLeft(), null))
						//We take right as we build the DSMDiff from base						
						
						EObject rootMatchSource 		= null;//refChange.getMatch().getRight(); 
						EObject rootMatchDSMDiffSource 	= null;//comparisonBaseDSMDiff.getMatch(rootMatchBase).getLeft();						
						
						try {//TO-DO: Need to fix
							if(refChange.getSource()==DifferenceSource.RIGHT)
							{
								
								try {
								rootMatchSource			= refChange.getMatch().getLeft();
								if(rootMatchSource==null) {
									rootMatchSource			= refChange.getMatch().getRight();
								}
								
								}catch(Exception ex1) {
									rootMatchSource			= refChange.getMatch().getRight();	
								}								
								
								rootMatchDSMDiffSource= findInDiffMatchs(diffsMatch, rootMatchSource,s);							
								if(rootMatchDSMDiffSource==null)							
									rootMatchDSMDiffSource	= comparisonBaseDSMDiff.getMatch(comparisonBaseNew.getMatch(rootMatchSource).getRight()).getLeft();
								DSDiffObjectTarget		= comparisonBaseDSMDiff.getMatch(comparisonBaseNew.getMatch(EDiffObjectTarget).getRight()).getLeft();
							}
							else if(refChange.getSource()==DifferenceSource.LEFT)			
							{
								try {
									rootMatchSource			= refChange.getMatch().getRight();	
									if(rootMatchSource==null) {
										rootMatchSource			= refChange.getMatch().getLeft();
									}
								
								}catch(Exception ex1) {
									//%%%%%%//Need to be considered 2019-10-28   rootMatchSource			= refChange.getMatch().getLeft();
								}					
								rootMatchDSMDiffSource= findInDiffMatchs(diffsMatch, rootMatchSource,s);							
								if(rootMatchDSMDiffSource==null)
									rootMatchDSMDiffSource	= comparisonBaseDSMDiff.getMatch(rootMatchSource).getLeft();								
								DSDiffObjectTarget	= findInDiffMatchs(diffsMatch, EDiffObjectTarget,s);	
								if (DSDiffObjectTarget == null )
								{
									try {
									DSDiffObjectTarget		= comparisonBaseDSMDiff.getMatch(EDiffObjectTarget).getLeft();
									}
									catch(Exception ex3) {
										DSDiffObjectTarget		= comparisonNewDSMDiff.getMatch(EDiffObjectTarget).getLeft();
									}								

								}
							}
						}catch(Exception ex) {
							
							try {
									DSDiffObjectTarget		= comparisonBaseDSMDiff.getMatch(comparisonBaseNew.getMatch(EDiffObjectTarget).getRight()).getLeft();
							}catch(Exception ex2) {
								System.out.println("//%%%%%%//Need to be considered 2019-10-28");
								System.out.println(refChange.getSource().toString());
								System.out.println(diff.getKind().toString());
								System.out.println(refChange.getReference().getName());
								System.out.println(refChange.getReference().toString());
								System.out.println(ex.toString());	
								System.out.println("------------------------------------------");
								continue; //%%%%%%//Need to be considered 2019-10-28
							}
						}				 
						
						
						
						String refName="diff"+refChange.getReference().getName();
						EReference refType=null;						
						for(EReference ref:rootMatchDSMDiffSource.eClass().getEAllReferences()) //rootDSMDiff
						{
							if(ref.getName().contains(refName))
								refType=ref;
						}					
						String refTypeName= ((EClass)refType.eCrossReferences().get(0)).getName();
						//Corresponding class for Association
						String DiffEReferenceClassName	= refTypeName;// "Diff"+ refChange.getReference().getEReferenceType().getName()+"_"+refChange.getReference().getName();
						EClassifier DSDiffEClassifier	= EDiffObjectEClassTarget.getEPackage().getEClassifier(DiffEReferenceClassName);// EDiffObjectEClassTarget.getName());	
						EClass		DSDiffEClass		= (EClass)DSDiffEClassifier;						
						EObject 	DSDiffObject		= DiffMM_Factory.create(DSDiffEClass);// PacmanGoDiffMMFactory.eINSTANCE.create(DSDiffEClass);
																//ArduinoDiffMMFactory , PacmanGoDiffMMFactory
						//EObject 	DSDiffObject		= PacmanGoDiffMMFactory.eINSTANCE.create(DSDiffEClass);
													
					
						EAttribute 	attrOperation=DSDiffEClass.getEAllAttributes().stream().filter(f->f.getName()=="diff_kind").collect(Collectors.toList()).get(0);

						/*
						for(EAttribute attr:DSDiffEClass.getEAllAttributes())
						{
							if(attr.getName()=="diff_kind")
								attrOperation=attr;
						}*/
						
						EEnum AscOpType = (EEnum)  EDiffObjectEClassTarget.getEPackage().getEClassifier("DiffKind");								
						Object AscOpMODIFY = DiffMM_Factory.createFromString(AscOpType, "ADD");	

						
						
						DSDiffObject.eSet(attrOperation, AscOpMODIFY); 
						if (refChange.getMatch().getRight()!=null && refChange.getMatch().getRight().eCrossReferences()!=null)
						  for (EContentsEList.FeatureIterator featureIterator = 
							        (EContentsEList.FeatureIterator)refChange.getMatch().getRight().eCrossReferences().iterator();
							       featureIterator.hasNext(); )
							  {
							  	featureIterator.next();
							    EReference eReference = (EReference)featureIterator.feature();
							    if(eReference == refChange.getReference()) {
							    	Object AscOpDELETE = DiffMM_Factory.createFromString(AscOpType, "DELETE");	
							    	DSDiffObject.eSet(attrOperation, AscOpDELETE); 
							    }
							  }			
						
						EReference refType1= rootMatchDSMDiffSource.eClass().getEAllReferences().stream().filter(f->f.getEReferenceType().getName()==DSDiffObject.eClass().getName()).collect(Collectors.toList()).get(0);
						
						/*
						for(EReference ref:rootMatchDSMDiffSource.eClass().getEAllReferences()) 
						{
							if(ref.getEReferenceType().getName()==DSDiffObject.eClass().getName())
								refType1=ref;
						}*/

						try {//TO-DO: fix
							
							SetEFeature(rootMatchDSMDiffSource, refType1, DSDiffObject);
						}catch(Exception ex) {

							System.out.println("Error: Exception "+DSDiffObject.eContainer().toString() +" / "+DSDiffObject.toString());
						}
						
						
						EReference refType2=DSDiffObject.eClass().getEAllReferences().stream().filter(f->f.getName().contains("eType")).collect(Collectors.toList()).get(0);
						/*
						for(EReference ref:DSDiffObject.eClass().getEAllReferences())
						{
							if(ref.getName().contains("eType"))//ref.getEReferenceType().getName().toLowerCase()==refChange.getValue().eClass().getName())
								refType2=ref;
						}*/
												
						try {//TO-DO: fix
						SetEFeature(DSDiffObject, refType2, DSDiffObjectTarget);
						}
						catch(Exception ex) {
							System.out.println(ex.toString());
						}
						//System.out.println(DSDiffObject.eGet(refType2));
						
						//System.out.println();
						try {//TO-DO: fix
							//***//rsourceDSMDiff.save(null);	
						}
						catch(Exception ex) {
							System.out.println("Error: Exception "+DSDiffObject.eContainer().toString() +" / "+DSDiffObject.toString());
						}					
					}
					
				}
				
//****************************************				
				
				//Transform Diffs representing attributes which are modified
				for(Diff diff:differencesToReview)
				{
					if (diff instanceof AttributeChange) 
					{
						final AttributeChange attChange = (AttributeChange)diff;
						
					    EObject 	EDiffObjectBase		= attChange.getMatch().getRight(); 					// (Base) version
						
						EClass 		EDiffObjectEClass 	= EDiffObjectBase.eClass();								
						EClassifier DSDiffEClassifier	= EDiffObjectEClass.getEPackage().getEClassifier("Diff"+EDiffObjectEClass.getName());	
						EClass		DSDiffEClass		= (EClass)DSDiffEClassifier;
						
						EObject 	DSDiffObject		=findInDiffMatchs(diffsMatch, EDiffObjectBase,s);
						if(DSDiffObject==null)
						{
							DSDiffObject		=  DiffMM_Factory.create(DSDiffEClass);// PacmanGoDiffMMFactory.eINSTANCE.create(DSDiffEClass);	
							// %%%%%%%
							// DSDiffObject		= ArduinoDiffMMFactory , 
							//PacmanGoDiffMMFactory.eINSTANCE.create(DSDiffEClass);											
							//EObject 	DSDiffObject		= PacmanGoAugmentedFactory.eINSTANCE.create(DSDiffEClass);				
							
							for(EAttribute attr:EDiffObjectEClass.getEAllAttributes())
							{
								DSDiffObject.eSet(attr,EDiffObjectBase.eGet(attr));
							}			
						}
						EAttribute attrOperation 	= null;
						EAttribute attrNew 			= null;
						
						List<EAttribute> lstEAtrrsNoNew= DSDiffEClass.getEAllAttributes().stream().filter(at -> !at.getName().contains("new_")).collect(Collectors.toList());

						for(EAttribute eAtrrsNoNew:lstEAtrrsNoNew)
						{
							if(eAtrrsNoNew.getName()!="diff_kind")
							{
								EAttribute eAtrrNewEq=DSDiffEClass.getEAllAttributes().stream().filter(at -> at.getName().contains("new_" + eAtrrsNoNew.getName())).collect(Collectors.toList()).get(0);
								if(eAtrrNewEq!=null) {
									DSDiffObject.eSet(eAtrrNewEq,DSDiffObject.eGet(eAtrrsNoNew));
									if(eAtrrNewEq.getName().contains("new_"+attChange.getAttribute().getName()))
									{
										attrNew=eAtrrNewEq;
										DSDiffObject.eSet(attrNew,attChange.getValue());
									}										
								}
							}
							else if(eAtrrsNoNew.getName()=="diff_kind") {
								EEnum ClassOpType = (EEnum)  EDiffObjectEClass.getEPackage().getEClassifier("DiffKind");//DiffMM_Factory.create((EClass)						
								Object ClassOpMODIFY = DiffMM_Factory.createFromString(ClassOpType, "MODIFY");																				
								
								//EEnum ClassOp = (EEnum) EDiffObjectEClass.getEPackage().getEClassifier("DiffKind"); //DiffMM_Factory.create((EClass)
								attrOperation=eAtrrsNoNew;
								DSDiffObject.eSet(attrOperation,ClassOpMODIFY);
							}
						}						
						//DSDiffObject.eSet(attrNew,attChange.getValue());					
						
						
						//There maybe multiple attribute change for the same object
						//For the first one we come accross, a new DSDiffObject will be created
						//for the others, we extract it from the diffsMatch array
						EObject 	DSDiffObjectOfBase		= findInDiffMatchs(diffsMatch, EDiffObjectBase,s);	// (DSD) version of Base Vesrion 							
						if(	DSDiffObjectOfBase==null)
						{
							DSDiffObjectOfBase				= comparisonBaseDSMDiff.getMatch(EDiffObjectBase).getLeft();	
							EcoreUtil.replace(DSDiffObjectOfBase, DSDiffObject);
							s++;
							diffsMatch[s][0]=EDiffObjectBase;
							diffsMatch[s][1]=null;
							diffsMatch[s][2]=DSDiffObject;
							EObject eObjectToDelete=comparisonBaseDSMDiff.getMatch(EDiffObjectBase).getLeft();	
						}		
						
						try {//TO-DO: Need to fix					;
							//***//rsourceDSMDiff.save(null);
						}catch(Exception ex) {//***// DSDiffObject did not added anywhere
							////addToPackage(rsourceDSMDiff.getContents().get(0), DSDiffObject);
							////rsourceDSMDiff.getContents().add(DSDiffObject);
							//***//rsourceDSMDiff.save(null);
							System.out.println(ex.toString());
						}
						//EcoreUtil.delete(eObjectToDelete);	
					}					
				}		
//***********************************				
				
				
				
				try {//TO-DO: fix
					rsourceDSMDiff.save(null);
					}
				catch(Exception ex) {
					System.out.println(ex.toString());
				}				
				
				//objectsToDelete.forEach(obj->{EcoreUtil.delete(obj);});
	    	} 
		    catch (Throwable _e) 
	    	{
				Files.write(VerBase_File.toPath(), contentBaseFile.getBytes(charset));
				Files.write(VerNew_File.toPath(), contentNewFile.getBytes(charset));
		    	System.out.println(_e);   	
		    	//rsourceDSMDiff.save(null);
				//For ThreeWay Test Begin
				//Files.write(VerOrigin_File.toPath(), contentNewFile.getBytes(charset));
				//For ThreeWay Test End
				
				System.out.println("The end of transforming EMF-Diff to DSMC-Diff -- Inside last catch");
		    	
	    		throw Exceptions.sneakyThrow(_e);
	    	}	
		    
			Files.write(VerBase_File.toPath(), contentBaseFile.getBytes(charset));
			Files.write(VerNew_File.toPath(), contentNewFile.getBytes(charset));
			//For ThreeWay Test Begin
			//Files.write(VerOrigin_File.toPath(), contentNewFile.getBytes(charset));
			//For ThreeWay Test End
			
			System.out.println("The end of transforming EMF-Diff to DSMC-Diff");
		 
	 }
	 
	 private boolean isRepeatetive(EObject e, EObject d) {
		 return e.eClass().getName().equals(d.eClass().getName()) 
				 && getAttrValueByAttrName(e, "name").equals(getAttrValueByAttrName(d,"name"));
	 }
	 
	 private boolean addToPackage(EObject p, EObject DSDiffObject) {
		 //p=rsourceDSMDiff.getContents().get(0); == The root of the Package
		 try {
		 int s= p.eContents().stream().filter(
				 e-> isRepeatetive(e,DSDiffObject)
				 ).collect(Collectors.toList()).size();
		 if( s > 0)
		 {
		 		return true;
		 }}
		 catch(Exception ex) {
			 return false;
		 }
		 for(EReference refType:p.eClass().getEAllReferences()) {
			 try {	
				 //getattributevalue
				 	/*if( p.eContents().stream().filter(
				 			e-> getAttrValueByAttrName(e, "name").equals(
				 					getAttrValueByAttrName(DSDiffObject,"name")))
				 			.collect(Collectors.toList()).size() > 0) */
				 	
				 	SetEFeature(p, refType, DSDiffObject);
				 	return true;
			 }catch(Exception ex) {
				 return false;
			 }
		 }
		 return false;		 
	 }
 
	 
//***************************************
	 
	public String getDSMMPath() {
		return DSMMPath;
	}

	public void setDSMMPath(String dSMMPath) {
		DSMMPath = dSMMPath;
	}

	public String getDSMDiffPath() {
		return DSMDiffPath;
	}

	public void setDSMDiffPath(String dSMDiffPath) {
		DSMDiffPath = dSMDiffPath;
	}

	public String getResultFilePath() {
		return resultFilePath;
	}

	public void setResultFilePath(String resultFilePath) {
		this.resultFilePath = resultFilePath;
	}

	public String getVRightPath() {
		return vRightPath;
	}

	public void setVRightPath(String VRightPath) {
		vRightPath = VRightPath;
	}

	public String getVLeftPath() {
		return vLeftPath;
	}

	public void setVLeftPath(String VLeftPath) {
		vLeftPath = VLeftPath;
	}

	public String getVCAPath() {
		return vCAPath;
	}

	public void setVCAPath(String VCAPath) {
		vCAPath = VCAPath;
	}
 
	 
//***************************************	 

	public static EObject getNodeByID_Pattern(ArrayList<EObject> nodes, String idPatternValue )
	{
		try {
		EObject node=nodes.stream()
				.filter(n->idPatternValue.equals(getAttrValueByAttrName(n,"ID_Pattern").toString()))
				.collect(Collectors.toList()).get(0);
	
		return node;
		}
		catch(Exception ex) {
			return null;
		}
	}
	
	public static Object getAttrValueByAttrName(EObject obj, String AttrName){
	 	try{
	 		return  obj.eGet(getEAttributeByName(obj,AttrName));
	 	}
	 	catch(Exception ex){
	 		return false;
	 	}
	 }
	
	public static String getAttrDataTypeNameByAttrName(EObject obj, String AttrName){
	 	try{
	 		return  getEAttributeByName(obj,AttrName).getEAttributeType().getName();
	 	}
	 	catch(Exception ex){
	 		return "";
	 	}
	 }
	
	public static ArrayList<EObject> getAllNodes(EObject n, Boolean isRecursive, Boolean excludeRule)
	{
		ArrayList<EObject> ns= new ArrayList<EObject>();
		if(!isRecursive)
			getAllNodesHelperFlat(n, ns);
		else
			getAllNodesHelperRecursive(n, ns);
		
		if(excludeRule)
			ns.remove(n);
		
		//Collections.sort(ns,(n1,n2)-> 
		//((int)(EMFUtils.getAttrValueByAttrNameNullDefault(n1,"ID_Pattern"))).compareTo( 
		//((int)(EMFUtils.getAttrValueByAttrNameNullDefault(n2,"ID_Pattern"))))
		//);
		
		Collections.sort(ns, new Comparator<EObject>(){
		    public int compare(EObject n1, EObject n2) {
		    	int id1=(int)(EMFUtils.getAttrValueByAttrNameNullDefault(n1,"ID_Pattern"));
		    	int id2=(int)(EMFUtils.getAttrValueByAttrNameNullDefault(n2,"ID_Pattern"));
		        return id1-id2;
		    }
		});
		
		return ns;
	}
	
	public static void getAllNodesHelperFlat(EObject n, ArrayList<EObject> ns)
	{
		if(!ns.contains(n))//Visited
		{	
			ns.add(n);
			if(n.eContents()!=null && n.eContents().size()>0)
			{
			  	for(EObject nI : n.eContents())
			  	{	  		
			  		ns.add(nI);
			  	} 			
			} 			
		}
	 }	
			
	public static void getAllNodesHelperRecursive(EObject n, ArrayList<EObject> ns)
	{
		if(!ns.contains(n))//Visited
		{	
			ns.add(n);
			try {
				if(n.eContents()!=null && n.eContents().size()>0)
				{
				  	for(EObject nI : n.eContents())
				  	{	  		
				  		getAllNodesHelperRecursive(nI, ns);
				  	} 			
				} 
				
				if(n.eCrossReferences()!=null && n.eCrossReferences().size()>0)
				{
				  	for(EObject nI : n.eCrossReferences())
				  	{
				  		if(n!=nI) {
				  			getAllNodesHelperRecursive(nI, ns);
				  		}
				  	} 			
				}
			}catch(Exception ex)
			{
				
			}
		}
	 }	
	
	public static List<EObject> getAllTargets(EObject source, EReference r) {
		List<EObject> targets = new ArrayList<EObject>();				 
		 try
		 {
			 targets= (List<EObject>) source.eGet(r);
		 }
		 catch(Exception ex1)
		 {				 
			 targets.add((EObject) source.eGet(r));
		 }		 
		 		 
		 return targets;
	}
//**************************************
	private EObject findInDiffMatchs(EObject[][] diffsMatch, EObject match, int s)
	{
		 //System.out.println("match: "+match);

	    if (match == null || diffsMatch == null) return null;

	    for(int rowIndex=0;rowIndex<=s;rowIndex++)//int rowIndex = 0; rowIndex < diffsMatch.length; rowIndex++ ) 
	    {
	    	EObject[] row = diffsMatch[rowIndex];
	    	if (row != null) 
	    	{	
	    		try
	    		{
		    		if (match.equals(row[0]))//((ReferenceChange)row[0]).getValue())) 
		    			return row[2];	    			
	    		}
	    		catch(Exception ex)
	    		{
	    		}
	    		try
	    		{
		    		if (match.equals(row[1]))//((ReferenceChange)row[0]).getValue())) 
		    			return row[2];	    			
	    		}
	    		catch(Exception ex)
	    		{
	    		}
	    	}
	    }
	    return null; // value not found in array
	}

//**************************************

 	public ComparisonResult getComparisonResult() {
 		return comparisonResult;
 	}
 	
 	//All the following variables should be replaced by metaModelFilePhysicalPath, modelFilePhysicalPath, v1FileName, v2FileName, rulesFolderPhysicalPath or easier
 	public boolean initializeThreeWayComparison(
 			String metaModelFolderPhysicalPath, 
 			String modelFolderPhysicalPath, 
 			String rulesFolderPhysicalPath, 
 			String dsdiffFolderPhysicalPath, 
 			String metaModelFileName, 
 			ArrayList<VesrionInfo> versionsInfo) {//vCAFileName=Common Ansector
 		try {
 			MMRootPath			=	metaModelFolderPhysicalPath;
 			setDSMMPath(MMRootPath + metaModelFileName);	
 			DSDiffMMPath  		= 	MMRootPath + "DSDiffMM.ecore";
 			DSRuleMMPath  		= 	MMRootPath + "DSRuleMM.ecore";
 			ModelRootPath		=	modelFolderPhysicalPath;
 			versionsInformation = 	versionsInfo;
 			

 			versionLeftInfo = versionsInformation.stream().filter(
 					v->v.version==Version.LEFT).collect(Collectors.toList()).get(0);
 			versionRightInfo = versionsInformation.stream().filter(
 					v->v.version==Version.RIGHT).collect(Collectors.toList()).get(0);
 			versionCaInfo = versionsInformation.stream().filter(
 					v->v.version==Version.ORIGIN).collect(Collectors.toList()).get(0);
 			
 			setVLeftPath(ModelRootPath 	+ versionLeftInfo.fileName);
 		 	setVRightPath(ModelRootPath 	+ versionRightInfo.fileName); 
 		 	setVCAPath(ModelRootPath 	+ versionCaInfo.fileName);//Common Ancestor (3-Way)
 			setResultFilePath(dsdiffFolderPhysicalPath + "result.txt");	
 		 	setDSMDiffPath(dsdiffFolderPhysicalPath + "DSMDiff.xmi");	
 		 	RuleRootPath		= 	rulesFolderPhysicalPath;
 			return true;
 		}catch(Exception ex) {
 			return false;
 		}
 	}
 	
 	public boolean setDsdRulePackages(
 			ArrayList<String> ruleList, 
 			String diffMM_eNSURI, 
 			Object diffMM_eIN, 
 			EFactory diffMM_Factory,
 			String ruleMM_eNSURI, 
 			Object ruleMM_eIN, 
 			EFactory ruleMM_Factory,
 			String mmPackageName) {		
 		try {
 		 	rulesList			=	ruleList;
 		 	DiffMM_eNSURI		= 	diffMM_eNSURI;
 		 	DiffMM_eIN			=	diffMM_eIN;
 		 	DiffMM_Factory		= 	diffMM_Factory;
 		 	RuleMM_eNSURI		= 	ruleMM_eNSURI;
 		 	RuleMM_eIN			= 	ruleMM_eIN;
 		 	RuleMM_Factory		=	ruleMM_Factory;
 		 	MMPackageName		=	mmPackageName;
 		 	DiffMMPackageName 	=	MMPackageName +"DiffMM";
 		 	RuleMMPackageName	=	MMPackageName +"RuleMM";
 		 	return true;
 		}catch(Exception ex) {
 			return false;
 		}
 	}
 	
	
	//final String RootApp= "R:/Thesis/DSMCompare/";
	/*
	final String RootApp= "D:/_UdeM/trunk/Thesis/DSMCompare/DSMCompare/";
	
	final String MMRootPath     = RootApp+"com.Zadahmad.DSEMFCompare/ardMMs/";
	final String DSMMPath  		= MMRootPath + "arduino.ecore";	
	final String DSDiffMMPath  	= MMRootPath + "DSDiffMM.ecore";
	final String DSRuleMMPath  	= MMRootPath + "DSRuleMM.ecore";
	
	final String ModelRootPath  = RootApp+"com.Zadahmad.DSEMFCompare.editor/model/ard/";
	final String VerOriginPath 	= "";//ModelRootPath + "test/V0.xmi";
	
	final String caseName		= "fadelight";
	
	final String VerBasePath 	=  ModelRootPath + caseName +"/"+ "v3_GenerateWhile" + ".xmi";
 	final String VerNewPath  	=  ModelRootPath + caseName +"/"+ "v5_Fedlight" + ".xmi";
	final String result      	=  ModelRootPath + caseName +"/"+ "result_FedlightV3_V5" + ".txt";
	final String DSMDiffPath 	=  ModelRootPath + caseName +"/"+ "DSMDiff_FedlightV3_V5" + ".xmi";
		 	 	
 	String MMFileName   		= "arduino";
 	String MMPackageName		= "arduino"; 
 	
 	String DiffMMFileName   	= "arduinoDiffMM";
 	String DiffMMPackageName	= "arduinoDiffMM";
 	
 	String RuleMMFileName   	= "arduinoRuleMM";
 	String RuleMMPackageName	= "arduinoRuleMM";
 	
 	String DiffMM_eNSURI 		= ArduinoDiffMMPackage.eNS_URI; 	
 	Object DiffMM_eIN	 		= ArduinoDiffMMPackage.eINSTANCE;
 	Object DiffMM_Factory	 	= ArduinoDiffMMFactory.eINSTANCE;
 	
 	String RuleMM_eNSURI 		= ArduinoRuleMMPackage.eNS_URI; 	
 	Object RuleMM_eIN	 		= ArduinoRuleMMPackage.eINSTANCE;
 	Object RuleMM_Factory	 	= ArduinoRuleMMFactory.eINSTANCE;
	*/
	
 	
 	 //**********UTILITIES*********
 	
	 public static void copyFile( File from, File to ) throws IOException {
		    Files.copy( from.toPath(), to.toPath() );
		}

	
	 //********* EMF UTILITIES*****
	 public static ResourceSet setResourceSet(String rPath, String eNSURI, Object eINS ) 
	 {
		 
		File v = new File(rPath);
		URI uri = URI.createFileURI(v.getPath()); 
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		ResourceSet resourceSet = new ResourceSetImpl();		
		resourceSet.getPackageRegistry().put(eNSURI, eINS);
		resourceSet.getResource(uri, true);		
		return resourceSet;
	  }

	 void SetEFeature(EObject ERoot, EStructuralFeature feature, EObject newValue)
	 {
		 if(ERoot == null || feature == null || newValue == null) {
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
	 
	 public final List<EObject> getReferencingObjects(EObject target) {
		 return null;
		//TBC %%% //
		 /*
		    LinkedList<EObject> result = new LinkedList<EObject>();
		    Collection<EStructuralFeature.Setting> settings = null;
		    try {//%%%%%%%%%%%Need a review
			     settings = UsageCrossReferencer.find(target, target.eResource().getResourceSet());

		    }
			catch(Exception ex)
			{
				settings =null;
			}
		    //Same as above //CrossReferencer.find(target.eResource().getContents()).get(target);
		    //same as above//UsageCrossReferencer.find(source.eResource().getContents()).get(source);
		    
		    if (settings == null) {
		        return Collections.emptyList();
		    }
		    
		    for (Setting setting : settings) {
		        result.add(setting.getEObject());
		        //System.out.println("setting.getEStructuralFeature: "+setting.getEStructuralFeature().toString());
		    }
		    return result;*/
		}
 
	 public Resource retPackResouceMM(String MMPath)
	 {	 	
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		URI fileURI = URI.createFileURI(MMPath);//ecore.getFullPath().toOSString());		
		Resource resource = resourceSet.getResource(fileURI, true);	
		return resource;
	 }
	 
	 public Resource retPackResouceM(String modelPath, String eNSURI, Object eIN)
	 {	 	
		ResourceSet resourceSet = setResourceSet(modelPath,eNSURI, eIN);
		URI fileURI = URI.createFileURI(modelPath);
		Resource resource = resourceSet.getResource(fileURI, true);	
		return resource;
	 }
	 
	 public List<EPackage> retPackMM(Resource resourceMM)
	 {
		ResourceSet resourceSet=resourceMM.getResourceSet();
		List<EPackage> metamodel = new ArrayList<EPackage>();
		for (EObject obj : resourceMM.getContents()) {
			if (obj instanceof EPackage) {
				EPackage.Registry.INSTANCE.put		(((EPackage)obj).getNsURI(), ((EPackage)obj).getEFactoryInstance().getEPackage());
				resourceSet.getPackageRegistry().put(((EPackage)obj).getNsURI(), ((EPackage)obj).getEFactoryInstance().getEPackage());
				metamodel.add((EPackage)obj);
			}
		}
		return metamodel;
	 }
	 
	 public EPackage retPackHavingEClassNameMM(List<EPackage> metamodel, String eClassName)
	 {
		 //EClassName = "rule"
		 //other criteria are to find EClass of "domainspecific" name or with patternPrefix = "pattern_"
		 for(EPackage pack: metamodel)
		 {
			 if(pack.eContents().stream().filter(e -> e.eClass().getName().toLowerCase().contains(eClassName.toLowerCase().trim())).findAny() != null)
				 return pack;
		 }
		 return null;
	 }
	  
	 //Find EAttribute by Name from EObject	 
	 public static EAttribute getEAttributeByName(EObject eObj,String aAttrName)
	 {
		 try
		 {
		 return eObj.eClass().getEAllAttributes().stream().filter(a -> a.getName().toLowerCase().contains(aAttrName.toLowerCase())).findFirst().get();
		 }
		 catch(Exception ex)
		 {
			 return null;
		 }
	 }	 

	 	 
	 public static EReference getEReferenceByName(EObject eObj,String eRefName)
	 {
		 try
		 {
			 return eObj.eClass().getEReferences().stream().filter(a -> a.getName().toLowerCase().contains(eRefName.toLowerCase())).findFirst().get();
		 }
		 catch(Exception ex)
		 {
			 return null;
		 }
		 
	 }
	 
	 public <K,V> Map<K, Map<K,List<V>>> groupByFields2 (List<V> modelList,Function<? super V, ? extends K> classifier1,Function<? super V, ? extends K> classifier2) 
	  {

		    Collector<V, ?, Map<K, List<V>>> groupingBy2 = Collectors.groupingBy(classifier2);
		    Collector<V, ?, Map<K, Map<K,List<V>>>> groupingBy = Collectors.groupingBy(classifier1, groupingBy2);
		    return modelList.stream().collect(groupingBy);
	  }
	 
	 
	 //*******REPORT UTILITIES**********
	 void PrintMRN(MRN MatchedRN, String printHeader)
	 {		
		System.out.println(printHeader);
		System.out.println("Rule   Ref :--- "+MatchedRN.Ref);
		System.out.println("Rule   Clas:--- "+MatchedRN.Clas);	
		System.out.println("Rule   Node:--- "+MatchedRN.ruleNode.toString());
		System.out.println("DSDiff Node:--- "+MatchedRN.matchedNode.toString());			
			
		Map map = groupByFields2(MatchedRN.refMRN , MRN::getRef, MRN::getClas);
		//System.out.println(">>==============");
		for(Object R:map.entrySet())
		{
			//System.out.println(">>-------------");
			 System.out.println();
			 System.out.println(((Map.Entry)R).getKey());//** /
			 Map<Class, List<MRN>> dd= (Map<Class, List<MRN>>) (((Map.Entry)R).getValue());
			 for(Object d:dd.entrySet())
			 {
				 printHeader=">>.............";
				 System.out.println();
				 System.out.println(((Map.Entry)d).getKey());//** /
				 List<MRN> mm= (List<MRN>) ((Map.Entry)d).getValue();
				 
				 Map<EObject,List<MRN>> mmm=  mm.stream().collect(Collectors.groupingBy(MRN::getRuleNode));
				 
				 for(Object m3:mmm.entrySet())
				 {
					 
					 List<MRN> m3Values= (List<MRN>) ((Map.Entry)m3).getValue();
					 
					 System.out.println();
					 System.out.println("----Size: " + m3Values.size() + " -- of Rule Node ---" + ((Map.Entry)m3).getKey());
					 
					 
					 for(MRN m:m3Values)
					 {
						 PrintMRN(m, printHeader);
					 }
				 }
				 
				 /*
				 for(MRN m:mm)
				 {
					 //** /System.out.println(m.matchedNode);
					 PrintMRN(m, printHeader);
				 }*/
				 System.out.println();
			 }			 
		}

	 }
 
	 	 
	 //MAIN MODULES
	 //*************MM ===to===> DIFF-MM && RULE-MM************* 	 
	 //@Test
	 /****
	 public void generateDIFFMM_RuleMM(String rootClassName)
	 {
		 URI fileURI = URI.createFileURI(getDSMMPath());
		 MMExtension extender    = new MMExtension();
		 Resource       mmextension = extender.extend2(fileURI, rootClassName);
		 System.out.println("MMs generated!");
	 }
	 ****/
	 
	 	 
	 //*************CREATE DS-FINE-GRANULAR-DIFFS************* 	 
	 
	 public ArrayList<Diff> SortByDependencies( EList<Diff> diffs, boolean throwOnCycle /*= false */)
	 {
	     var sorted = new ArrayList<Diff>();
	     var visited = new HashSet<Diff>();

	     for( Diff item : diffs )
	         Visit( item, visited, sorted, throwOnCycle );

	     return sorted;
	 }

	 private void Visit(Diff item, HashSet<Diff> visited, ArrayList<Diff> sorted, boolean throwOnCycle )
	 {
	     if(!visited.contains(item ))
	     {
	         visited.add( item );

	         for( Diff dep : item.getRequiredBy() )
	             Visit( dep, visited, sorted, throwOnCycle );

	         sorted.add( item );
	     }
	     else
	     {
	         if( throwOnCycle && !sorted.contains( item ) )
	             System.out.println( "Cyclic dependency found: " + item.toString() );
	     }
	 }

	 //****************************************************************
		public static Iterable<MatchResult> allMatches(
			      final Pattern p, final CharSequence input) {
			  return new Iterable<MatchResult>() {
			    public Iterator<MatchResult> iterator() {
			      return new Iterator<MatchResult>() {
			        // Use a matcher internally.
			        final Matcher matcher = p.matcher(input);
			        // Keep a match around that supports any interleaving of hasNext/next calls.
			        MatchResult pending;

			        public boolean hasNext() {
			          // Lazily fill pending, and avoid calling find() multiple times if the
			          // clients call hasNext() repeatedly before sampling via next().
			          if (pending == null && matcher.find()) {
			            pending = matcher.toMatchResult();
			          }
			          return pending != null;
			        }

			        public MatchResult next() {
			          // Fill pending if necessary (as when clients call next() without
			          // checking hasNext()), throw if not possible.
			          if (!hasNext()) { throw new NoSuchElementException(); }
			          // Consume pending so next call to hasNext() does a find().
			          MatchResult next = pending;
			          pending = null;
			          return next;
			        }

			        /** Required to satisfy the interface, but unsupported. */
			        public void remove() { throw new UnsupportedOperationException(); }
			      };
			    }
			  };
			}
				 
		
	 	
		 private EClass  createMapClassDiffKind(String changedAttributeName, EClass valueDiffEClass) {
			 EReference refDiffKinkMap = 
				 		valueDiffEClass.getEAllReferences().stream().filter(
						f->f.getName() == changedAttributeName).collect(Collectors.toList()).get(0);
				 //Create DiffKind custom map class 
				 EClassifier     mapClassDiffKindEClassifier = refDiffKinkMap.getEType();
				 EClass			mapClassDiffKind			= (EClass) mapClassDiffKindEClassifier;	
				 return mapClassDiffKind;
		 }
  
}