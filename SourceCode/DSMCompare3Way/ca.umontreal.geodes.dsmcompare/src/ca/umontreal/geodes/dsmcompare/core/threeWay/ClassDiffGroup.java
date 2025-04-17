package ca.umontreal.geodes.dsmcompare.core.threeWay;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import ca.umontreal.geodes.dsmcompare.mmextension.utils.DsmcHelpers;

public class ClassDiffGroup{
	public boolean 	isProcessed	= false;
	public boolean 	isMerged 	= false;
	public ArrayList<FineDiffReference> left = new ArrayList<FineDiffReference>();
	public ArrayList<FineDiffReference> right = new ArrayList<FineDiffReference>();
	public DsmcHelpers.ChangeStatus changeStatus = DsmcHelpers.ChangeStatus.NON;	
	public EObject 	value = null;         	//value   (changed instance in diff object)
	public EObject 	originValueMatch = null;//value not changed
	public EObject 	valueDiff = null;     	//value     in diff012 model (not changed or diff class instance)
	public EObject 	containerDiff = null; 	//container in diff012 model (not changed or diff class instance)
	public FineDiffAttributeGroup fdag = null; // modified attribute values
	public ArrayList<EObject> moveAssociationDiffs = new ArrayList<EObject>();//Two or three association diff classes showing the move of the contained object to another target or two different targets
	//public ArrayList<PairDiffAssociationTarget> pdatsMove = new ArrayList<PairDiffAssociationTarget>(); // If it is moved
}
