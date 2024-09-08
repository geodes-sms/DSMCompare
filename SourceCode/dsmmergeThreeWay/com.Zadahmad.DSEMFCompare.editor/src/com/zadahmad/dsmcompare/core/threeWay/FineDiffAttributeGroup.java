package com.zadahmad.dsmcompare.core.threeWay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.DifferenceSource;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

import dsmcompare.mmextension.utils.EMFUtils.ChangeStatus;

public class FineDiffAttributeGroup {
	public  boolean 						isProcessed = false;
	public 	EObject 						originContainerMatch;	//Original Class Instance
	public 	EObject							originContainerMatchDiff;
	//public  ArrayList<FineDiffAttribute> 	allModifiedAttributesOfClassInstance	= 	new ArrayList<FineDiffAttribute>();
	Map<Object, List<FineDiffAttribute>> 	attributesGroupByName;
	public ArrayList<FineDiffAttributeGroupProps>	fineDiffAttributeGroupProps = 
			new ArrayList<FineDiffAttributeGroupProps>();
	public ArrayList<FineDiffReference>		conflictWithClassDiffs 	= 	new ArrayList<FineDiffReference>();	
	public ArrayList<FineDiffAttribute>		conflictWithAttributeDiffs 	= 	new ArrayList<FineDiffAttribute>();	
	
	public void calculateFineDiffAttributeGroupProps() {
		//Iterate Each Attribute of the class Grouped by Name
		Iterator itAttributeGroupedByName = attributesGroupByName.entrySet().iterator();
		while (itAttributeGroupedByName.hasNext()) {
			Map.Entry entryAttrGrpByName = (Map.Entry)itAttributeGroupedByName.next(); 
			String attributeName = ((Map.Entry)entryAttrGrpByName).getKey().toString();
			List<FineDiffAttribute> listAttrGrpByName = 
					(List<FineDiffAttribute>) ((Map.Entry)entryAttrGrpByName).getValue();
			
		    //add the changed values into the new attribute 
	    	EAttribute orgAttrClass = originContainerMatch.eClass().getEAllAttributes().stream().filter(
	        		at -> at.getName().contains(attributeName)).collect(Collectors.toList()).get(0);
	    	List<FineDiffAttribute> listAttrGrpByNameLeft = listAttrGrpByName.stream().filter(
	    			f->f.diff.getSource() == DifferenceSource.LEFT).collect(Collectors.toList());
	    	List<FineDiffAttribute> listAttrGrpByNameRight = listAttrGrpByName.stream().filter(
	    			f->f.diff.getSource() == DifferenceSource.RIGHT).collect(Collectors.toList());
	    	
	    	int upperBound = orgAttrClass.getUpperBound();
    		FineDiffAttributeGroupProps attrGrpProps= new FineDiffAttributeGroupProps();
	    	if(upperBound == 1) {
	    		attrGrpProps.originalAttributeClass = orgAttrClass;
	    		attrGrpProps.attributeName=attributeName;
	    		attrGrpProps.upperBound = upperBound;
	    		attrGrpProps.isProcessed=false;
	    		attrGrpProps.caValue=originContainerMatch.eGet(orgAttrClass);
	    		if(listAttrGrpByNameLeft.size()>0) 
	    			attrGrpProps.vLeftValue=listAttrGrpByNameLeft.get(0).value;
	    		if(listAttrGrpByNameRight.size()>0) 
	    			attrGrpProps.vRightValue=listAttrGrpByNameRight.get(0).value;
	    		if(attrGrpProps.vLeftValue!=null && 
	    				attrGrpProps.vRightValue!=null &&
	    				attrGrpProps.vLeftValue.toString().trim().equalsIgnoreCase(
	    				attrGrpProps.vRightValue.toString().trim())) {
	    			attrGrpProps.changeStatus=ChangeStatus.EQUIVALENT;
	    		}
	    	}else if(upperBound == -1 || upperBound > 1){	
	    		attrGrpProps.originalAttributeClass = orgAttrClass;
	    		attrGrpProps.attributeName=attributeName;
	    		attrGrpProps.upperBound = upperBound;
	    		attrGrpProps.isProcessed=false;
	    		attrGrpProps.caValue=originContainerMatch.eGet(orgAttrClass);
	    		if(listAttrGrpByNameLeft.size()>0) 
		    		attrGrpProps.vLeftValue = 
		    				aggregateDiffAttrListValues(orgAttrClass, listAttrGrpByNameLeft);
	    		if(listAttrGrpByNameRight.size()>0) 
		    		attrGrpProps.vRightValue = 
    				aggregateDiffAttrListValues(orgAttrClass, listAttrGrpByNameRight);
	    		if(attrGrpProps.vLeftValue!=null && 
	    				attrGrpProps.vRightValue!=null) {
	    			List<FineDiffAttribute> list1= (List<FineDiffAttribute>) attrGrpProps.vLeftValue;
	    			List<FineDiffAttribute> list2= (List<FineDiffAttribute>) attrGrpProps.vRightValue;
	    			
	    			attrGrpProps.changeStatus= ChangeStatus.NON;
	    			if(list1.equals(list2))
	    				attrGrpProps.changeStatus= ChangeStatus.EQUIVALENT;
	    		}	    		
	    	}
    		fineDiffAttributeGroupProps.add(attrGrpProps);	
		}		
	}
	
	private Object aggregateDiffAttrListValues(EAttribute originalAttributeClass, List<FineDiffAttribute> attributeDiffClusterLeftVersion) {
		EList oldAttributeValue = ((EList) originContainerMatch.eGet(originalAttributeClass));	
		BasicEList newAttributeValue= new BasicEList();
		newAttributeValue.addAll(oldAttributeValue);
		for(FineDiffAttribute aDiff : attributeDiffClusterLeftVersion) {
			Object attrValueToBeSet = aDiff.value;
			if(aDiff.diff.getKind() == DifferenceKind.ADD) {
				newAttributeValue.add(attrValueToBeSet);
			}else if(aDiff.diff.getKind() == DifferenceKind.DELETE) {
				newAttributeValue.remove(attrValueToBeSet);
			}			    			
		}	    			
		return (Object)newAttributeValue;
	}

}

