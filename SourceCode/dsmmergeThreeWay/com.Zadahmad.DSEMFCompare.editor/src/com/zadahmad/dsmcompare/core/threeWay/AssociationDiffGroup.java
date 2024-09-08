package com.zadahmad.dsmcompare.core.threeWay;

import java.util.ArrayList;

import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import dsmcompare.mmextension.utils.EMFUtils;

public class AssociationDiffGroup {

	public boolean 	isProcessed	= false;
	//
	public ArrayList<FineDiffReference> left = new ArrayList<FineDiffReference>();
	public ArrayList<FineDiffReference> right = new ArrayList<FineDiffReference>();
	
	//Target of the Association
	//It is useless, We may have multiple targets, instead use pairDiffAssociationTarget lists
	public EObject 	value_Target = null;         	 
	public EObject 	originValueMatch_Target = null; 
	public EObject 	valueDiff_Target = null;   
	
	//Source of the association
	public EObject 	container_Source = null;         	 
	public EObject 	originContainerMatch_Source = null; 
	public EObject 	containerDiff_Source = null; 
	
	//Association 
	public EReference reference = null;	
	
	//DifferenceKind
	public DifferenceKind differenceKind= null;
	

	public EMFUtils.ChangeStatus changeStatus = EMFUtils.ChangeStatus.NON;	
	public ArrayList<PairDiffAssociationTarget> pdats= new ArrayList<PairDiffAssociationTarget>();	
}




