package com.zadahmad.dsmcompare.core.threeWay;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import dsmcompare.mmextension.utils.EMFUtils;

public class ClassDiffGroup{
	public boolean 	isProcessed	= false;
	public ArrayList<FineDiffReference> left = new ArrayList<FineDiffReference>();
	public ArrayList<FineDiffReference> right = new ArrayList<FineDiffReference>();
	public EMFUtils.ChangeStatus changeStatus = EMFUtils.ChangeStatus.NON;	
	public EObject 	value = null;         	//value   (changed instance in diff object)
	public EObject 	originValueMatch = null;//value not changed
	public EObject 	valueDiff = null;     	//value     in diff012 model (not changed or diff class instance)
	public EObject 	containerDiff = null; 	//container in diff012 model (not changed or diff class instance)
	public FineDiffAttributeGroup fdag = null; // modified attribute values
	public ArrayList<EObject> moveAssociationDiffs = new ArrayList<EObject>();//Two or three association diff classes showing the move of the contained object to another target or two different targets
}
