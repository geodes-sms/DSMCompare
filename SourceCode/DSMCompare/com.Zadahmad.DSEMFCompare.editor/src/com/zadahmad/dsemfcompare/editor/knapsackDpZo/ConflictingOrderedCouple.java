package com.zadahmad.dsemfcompare.editor.knapsackDpZo;

public class ConflictingOrderedCouple {
	//It is not possible to add secondItem to Knapsack if it already include firstItem,
	//	but it is doesn't mean that we cannot add firstItem to knapsack after secondItem 
	
	Item 	firstItem;
	Item	secondItem;
	
	public ConflictingOrderedCouple(Item item1, Item item2) {
		firstItem=item1;
		secondItem=item2;
	}
	
	boolean IsMatch(Item item1, Item item2) {
		return firstItem==item1 && secondItem==item2;
	}
}
