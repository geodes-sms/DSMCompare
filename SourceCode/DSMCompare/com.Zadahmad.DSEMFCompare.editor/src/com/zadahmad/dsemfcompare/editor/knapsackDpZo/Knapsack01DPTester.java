package com.zadahmad.dsemfcompare.editor.knapsackDpZo;
//import com.zadahmad.dsemfcompare.editor.knapsackDpZo.KnapsackDpZo;

import java.util.ArrayList;

public class Knapsack01DPTester {

	public static void main(String[] args) {
	    // we take the same instance of the problem displayed in the image
	    Item[] items = {new Item("Elt1", 4, 12), 
		                new Item("Elt2", 2, 1), 
						new Item("Elt3", 2, 2), 
						new Item("Elt4", 1, 1),
	                    new Item("Elt5", 10, 4)};
	    

	    Knapsack01DP knapsack = new Knapsack01DP(items, 15);
	    knapsack.display();
	    Solution solution = knapsack.solveClassicKS();
	    solution.display();
	    System.out.println("------------------------------------------------------------");
	    
	    //https://www.dyclassroom.com/dynamic-programming/0-1-knapsack-problem
	    // we take the same instance of the problem displayed in the image
	    Item[] items2 = {new Item("Elt1", 100, 3), 
		                new Item("Elt2", 20, 2), 
						new Item("Elt3", 60, 4), 
						new Item("Elt4", 40, 1)};
	    

	    knapsack = new Knapsack01DP(items2, 5);
	    knapsack.display();
	    solution = knapsack.solveClassicKS();
	    solution.display();
	    System.out.println("------------------------------------------------------------");
	    
	    //http://www.es.ele.tue.nl/education/5MC10/Solutions/knapsack.pdf
	    // we take the same instance of the problem displayed in the image
	    Item[] items3 = {new Item("Elt1", 10, 5), 
		                new Item("Elt2", 40, 4), 
						new Item("Elt3", 30, 6), 
						new Item("Elt4", 50, 3)};
	    

	    knapsack = new Knapsack01DP(items3, 10);
	    knapsack.display();
	    solution = knapsack.solveClassicKS();
	    solution.display();
	    System.out.println("------------------------------------------------------------");
	    
	    ArrayList<ConflictingOrderedCouple> coc= new ArrayList<>();
	    coc.add(new ConflictingOrderedCouple(items3[1], items3[3]));
	    
	    knapsack = new Knapsack01DP(items3, 10, coc);
	    knapsack.display();
	    solution = knapsack.solveDCKS();
	    solution.display();

	}

}
