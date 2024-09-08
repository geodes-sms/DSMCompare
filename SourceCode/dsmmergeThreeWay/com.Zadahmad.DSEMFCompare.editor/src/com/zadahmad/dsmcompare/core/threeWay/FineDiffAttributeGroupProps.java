package com.zadahmad.dsmcompare.core.threeWay;

import org.eclipse.emf.ecore.EAttribute;

import dsmcompare.mmextension.utils.EMFUtils.ChangeStatus;


//FineDiffAttributeWithModifiedLeftRightValues
public class FineDiffAttributeGroupProps {
	public  boolean 		isProcessed = false;
	public  int				upperBound=0;
	public  String 			attributeName ="";
	public	Object      	caValue;
	public  Object			vLeftValue;
	public  Object			vRightValue;
	public  ChangeStatus 	changeStatus;	
	public EAttribute		originalAttributeClass; 
}
