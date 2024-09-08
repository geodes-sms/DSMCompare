package com.zadahmad.dsmcompare.core.threeWay;

public enum ModelConflictType {
	//Concurrent update and deletion of the same element, 
	//	or due to an update of an element and the deletion of 
	// 	the container element, e.g., a property is added 
	//	and the corresponding class is deleted
	Contradicting_Fine_Grained_UpdateUpdate,	// of any feature
	Contradicting_Fine_Grained_UpdateDelete,
	Contradicting_Fine_Grained_AddAdd,			//Not completely equal additions 
	Equivalent_Fine_Grained_UpdateUpdate,	//PSEUDO of any feature
	Equivalent_Fine_Grained_AddAdd,			//PSEUDO || Semantic
	Equivalent_Fine_Grained_DeleteDelete,	//PSEUDO || ...
	Equivalent_Fine_Grained_UpdateAdd     	//Update existing one/Add similar to the updated one
}
