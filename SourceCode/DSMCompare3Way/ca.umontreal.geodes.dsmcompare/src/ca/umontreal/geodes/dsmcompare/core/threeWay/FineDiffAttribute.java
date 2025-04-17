package ca.umontreal.geodes.dsmcompare.core.threeWay;

import java.util.ArrayList;

import org.eclipse.emf.compare.AttributeChange;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

public class FineDiffAttribute extends FineDiff{
	//public Diff 				diff;
	public AttributeChange 		attributeChangeDiff;
	//public DifferenceKind 		diffKind;
	//public FineDiffChangeKind 	changeKind;
	//public String 				valueName;
	public Object 				value;
	//public String 				objectName;
	public String 				attributeName;
	
	//public EObject 				leftContainerMatch;
	//public EObject 				rightContainerMatch;
	//public EObject 				originContainerMatch;	
	public EObject				originContainerMatchDiff;
	
	//public EObject 				diffModelContainerMatch;
	//public ArrayList<FineDiffReference>	conflictWithReferenceDiffs 	= 	new ArrayList<FineDiffReference>();
	//public ArrayList<FineDiffAttribute>	conflictWithAttributeDiffs 	= 	new ArrayList<FineDiffAttribute>();
	//public ArrayList<FineDiffAttribute> modificationCluster 		= 	new ArrayList<FineDiffAttribute>();
	//public boolean 				isProcessed					=	false;
	//public FineDiffAttribute    pseudoConflict;
}
