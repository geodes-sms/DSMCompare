package com.zadahmad.dsemfcompare.editor.verstexSorting;

import java.util.Comparator;

public class Vertex {
	public String _name;
	public int _id;
	public int _numSemantics;
	public int _numFilters;
	public int _numElements;
	public int _order;
	
	public Vertex(String name, int id, int numSemantics, int numFilters, int numElements, int order) {
		_name=name;
		_id=id;
		_numSemantics=numSemantics;
		_numFilters=numFilters;
		_numElements=numElements;
		_order=order;
	}
}


class SortVerticesByOrder implements Comparator<Vertex> 
{ 
    // Used for sorting in ascending order of 
    // roll number 
    public int compare(Vertex a, Vertex b) 
    { 
        return a._order - b._order; 
    } 
} 