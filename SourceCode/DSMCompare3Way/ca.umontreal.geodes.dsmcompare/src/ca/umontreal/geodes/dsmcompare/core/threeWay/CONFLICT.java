package ca.umontreal.geodes.dsmcompare.core.threeWay;

import java.util.ArrayList;

public abstract class CONFLICT {
	ConflictType 		conflictType;
	ModelConflictType 	modelConflictType;
	//Conflict Diff Type => fineDiff.FineDiffType {ClassDiff, AttributeDiff, ReferenceDiff}
	ArrayList<FineDiff> 	fineDiffs;
	

}
