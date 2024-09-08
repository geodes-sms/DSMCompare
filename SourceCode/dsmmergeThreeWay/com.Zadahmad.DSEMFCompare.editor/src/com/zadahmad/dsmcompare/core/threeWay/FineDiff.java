package com.zadahmad.dsmcompare.core.threeWay;

import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.ecore.EObject;

public abstract class FineDiff {
	public FineDiffType 		fineDiffType;
	public Diff 				diff;
	public DifferenceKind 		diffKind;
	public FineDiffChangeKind 	changeKind;
	public String 				valueName;
	public String 				objectName;
	
	public EObject 				leftContainerMatch;
	public EObject 				rightContainerMatch;
	public EObject 				originContainerMatch;
	
	public EObject 				diffModelContainerMatch;
	public boolean 				isProcessed					=	false;
	public FineDiff    			pseudoConflict;	
}
