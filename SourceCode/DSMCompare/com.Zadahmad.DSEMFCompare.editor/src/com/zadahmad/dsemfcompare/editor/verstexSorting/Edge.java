package com.zadahmad.dsemfcompare.editor.verstexSorting;

public class Edge {
	public Vertex _from;
	public Vertex _to;
	public EdgeType _edgeType;
	public int _numFineConflicts;
	
	public Edge(Vertex from, Vertex to, EdgeType edgeType, int numFineConflicts) {
		_from=from;
		_to=to;
		_edgeType=edgeType;
		_numFineConflicts=numFineConflicts;
	}
}
