package ca.umontreal.geodes.dsmcompare.core.threeWay;

import java.util.ArrayList;

import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.DifferenceSource;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

public class FineDiffReference extends FineDiff{
	//public Diff 				diff;
	public ReferenceChange 		referenceChangeDiff;
	//public DifferenceKind 		diffKind;
	//public FineDiffChangeKind 	changeKind;
	//public String 				valueName;
	public EObject 				value;		// in classDiff it is the added/deleted class, in the referenceDiff it is target
	public EObject				valueDiff; 	// in classDiff it is the added/deleted diff-class, in the referenceDiff it is diff-target
	//public String 				objectName;
	
	public String 				referenceName;
	public EReference 			reference;
	
	//public EObject 				leftContainerMatch;
	//public EObject 				rightContainerMatch;
	//public EObject 				originContainerMatch;
	public EObject 				leftValueMatch;
	public EObject 				rightValueMatch;
	public EObject 				originValueMatch;
	
	//public EObject 				diffModelContainerMatch;
	public  ArrayList<FineDiffReference> 	dependsOn = new ArrayList<FineDiffReference>();
	
	//public FineDiffReference	pseudoConflict;
	
	public ArrayList<FineDiffReference>	conflictWithReferenceDiffs 	= 	new ArrayList<FineDiffReference>();
	public ArrayList<FineDiffAttribute>	conflictWithAttributeDiffs 	= 	new ArrayList<FineDiffAttribute>();
	public FineDiffAttributeGroup conflictWithFineDiffAttributeGroup;
	
	public DiffReferenceChangeType		diffReferenceChangeType;
	//public boolean 						isProcessed					=	false;
	
	public ArrayList<EReference>   	inputETypeRefsInMove 	= new ArrayList<EReference>();
	public ArrayList<EObject>   	inputDsDiffInMove 		= new ArrayList<EObject>();
	public EObject leftContainerMatchMovedFrom;
	public EObject rightContainerMatchMovedFrom;
	public EObject originContainerMatchMovedFrom;
	
	public EObject		containerDiff; //In association diff containers are the souce of the association
	
	public EObject getContainerDiff() {
		return containerDiff; //IN association containers are the source of association
	}
	public EObject getOriginContainerMatch() {
		return originContainerMatch; //IN association containers are the source of association
	}
	////////////
	public EObject getValueDiff() {
		return valueDiff;
	}
	public EObject getOriginValueMatch() {
		return originValueMatch;
	}
	public EObject getValue() {
		return value;
	}
	public EObject getLeftValueMatch() {
		return leftValueMatch;
	}
	public EObject getRightValueMatch() {
		return rightValueMatch;
	}
	///////////
	public DifferenceKind getDifferenceKind() {
		return referenceChangeDiff.getKind();
	}	
	public DifferenceSource  getDDifferenceSource() {
		return referenceChangeDiff.getSource();
	}
	public EReference getReference() {
		return reference;
	}	
	
	
	
}

