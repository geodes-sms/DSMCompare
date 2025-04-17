package ca.umontreal.geodes.dsmcompare.core.threeWay;

import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.ecore.EObject;

public class PairDiffAssociationTarget{
	public Diff	diff = null;
	public EObject diffAssociation = null;
	public EObject target = null;	
	public DifferenceKind differenceKind = null;
	public EObject getTarget() {
		return target;
	}
	
}
