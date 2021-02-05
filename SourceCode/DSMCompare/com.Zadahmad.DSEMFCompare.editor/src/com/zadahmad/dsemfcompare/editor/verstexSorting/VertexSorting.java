package com.zadahmad.dsemfcompare.editor.verstexSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.zadahmad.dsemfcompare.editor.dsmcHenshin.RuleAttributes;

public class VertexSorting {
	String graphFileName = "tinyDGNoScc.txt";

	ArrayList<String> _ruleNames;
	int[][] _conflictFineMatrix;
	ArrayList<RuleAttributes> _rulesFilter;

	static Digraph G = null;

	public ArrayList<Vertex> _vertices = new ArrayList<Vertex>();

	public ArrayList<Edge> _edges = new ArrayList<Edge>();

	public void main(String[] args) {
	}

	public VertexSorting() {
	}

	public Vertex VId(int id) {
		try {
			return _vertices.stream().filter(v -> v._id == id).collect(Collectors.toList()).get(0);
		} catch (Exception ex) {
			return null;
		}

	}

	public Vertex VName(String name) {
		return _vertices.stream().filter(v -> v._name == name).collect(Collectors.toList()).get(0);
	}

	public Digraph initGraph() {
		if (_vertices != null && _vertices.size() > 0 && _edges != null && _edges.size() > 0) {
			try {
				G = new Digraph(_vertices.size());
				for (Edge edge : _edges) {
					int v = edge._from._id;
					int w = edge._to._id;
					G.addEdge(v, w);
					// %%%%% We may need to reverse edges//G.addEdge(w, v);
				}
			} catch (NoSuchElementException e) {
				throw new IllegalArgumentException("invalid input format in Digraph constructor", e);
			}
			return G;
		} else
			return null;
	}

	public void printTopo(TopologicalX topological, List<Integer> itemsToRemove, Map<Integer, Integer> mapRR) {
		StdOut.println("Topological order:");
		if (topological.order() != null) {
			for (int v : topological.order()) {
				if (!itemsToRemove.contains(v)) {
					StdOut.println(mapRR.get(v));
				}
			}
		} else
			StdOut.println("The graph contains cycles. Topological order cannot be calculated.");
	}

	private ArrayList<Integer> order_vertices() {
		ArrayList<Integer> order = new ArrayList<Integer>();

		return order;
	}

	private int CalculateTotalIndegreeNumFineConflicts(int v) {
		int t = 0;
		List<Edge> incommingEdgess = _edges.stream().filter(f -> f._to._id == v).collect(Collectors.toList());
		for (Edge e : incommingEdgess) {
			t += e._numFineConflicts;
		}
		return t;
	}

	public void transpose(int[][] Matrix) {
		for (int i = 0; i < Matrix.length; i++)
			for (int j = 0; j < i; j++) {
				int temp = Matrix[i][j];
				Matrix[i][j] = Matrix[j][i];
				Matrix[j][i] = temp;
			}
	}

	public void ConflictResultToVSProblem(ArrayList<String> ruleNames, int[][] conflictFineMatrix,
			ArrayList<RuleAttributes> rulesFilter) {

		_ruleNames = ruleNames;
		_conflictFineMatrix = conflictFineMatrix;
		_rulesFilter = rulesFilter;
		_vertices = new ArrayList<Vertex>();
		_edges = new ArrayList<Edge>();

		int id = -1;
		for (String ruleName : _ruleNames) {
			++id;
			_vertices.add(new Vertex(ruleName, id, 1, // #semantics (it can be more than One)
					_rulesFilter.get(id)._filtersCount, // number of filters
					_rulesFilter.get(id)._elementsCount, // number of elements
					-1 // initial order
			));
		}

		transpose(_conflictFineMatrix);
		for (int i = 0; i < _conflictFineMatrix.length; i++) {
			for (int j = 0; j < _conflictFineMatrix.length; j++) {
				if (i != j && _conflictFineMatrix[i][j] > 0) {// !=0
					// %%%%// Reverse Edge is used to create Topological-sort
					// in a reverse order which has no conflicts
					_edges.add(new Edge(VId(i), VId(j), EdgeType.CONFLICT, _conflictFineMatrix[i][j]));
				}
			}
		}
	}

	public Digraph InitRightGraph(List<Integer> verticesToRemoveFromGraph, Map<Integer, Integer> mapItR) {
		if (_vertices != null && _vertices.size() > 0 && _edges != null && _edges.size() > 0
				&& verticesToRemoveFromGraph.size() > 0) {
			Digraph GR;
			try {
				ArrayList<Vertex> _Vs = new ArrayList<Vertex>();
				_vertices.stream().filter(v -> mapItR.containsKey(v._id)).forEach(v -> {
					_Vs.add(new Vertex(v._name, v._id, v._numSemantics, v._numFilters, v._numElements, v._order));
				});

				GR = new Digraph(_Vs.size());

				_edges.stream().filter(e -> mapItR.containsKey(e._from._id) && mapItR.containsKey(e._to._id))
						.forEach(e -> {
							int v = e._from._id;
							int w = e._to._id;
							GR.addEdge(mapItR.get(v), mapItR.get(w));
						});

			} catch (NoSuchElementException e) {
				throw new IllegalArgumentException("invalid input format in Digraph constructor", e);
			}
			return GR;
		} else
			return null;
	}

	public void execute(Digraph G, Map<Integer, Integer> mapRR, int previousOrder) {
		if (G == null) {
			initGraph();
			G = this.G;
			mapRR = new HashMap<Integer, Integer>();
			for (int i = 0; i < G.V(); i++) {
				mapRR.put(i, i); // insert key/value into map
			}
			previousOrder = 0;
			for (int v = 0; v < _vertices.size(); v++) {
				VId(v)._order = 1;
			}
		}

		List<Integer> itemsToRemoveInLeft = new ArrayList<Integer>();
		System.out.println("Graph:");
		System.out.print(G.toString());
		TopologicalX topological1 = new TopologicalX(G);
		printTopo(topological1, new ArrayList<Integer>(), mapRR);
		Digraph leftGraph = new Digraph(G);
		Digraph rightGraph = new Digraph(G); // # the graph with only the vertices removed from left
		boolean rightGraphHasCycle = false;

		while (new DirectedCycle(leftGraph).hasCycle()) {
			TarjanSCC scc = new TarjanSCC(leftGraph);
			int m = scc.count();
			rightGraphHasCycle = m > 0 ? true : false;
			Queue<Integer>[] components = (Queue<Integer>[]) new Queue[m];
			for (int i = 0; i < m; i++) {
				components[i] = new Queue<Integer>();
			}
			for (int v = 0; v < leftGraph.V(); v++) {
				components[scc.id(v)].enqueue(v);
			}
			System.out.println("SCC:");
			for (int i = 0; i < m; i++) {
				if (components[i].size() > 1) {
					int aVertex = components[i].peek();
					int vToRemoveByCriteria = aVertex;
					int aVertexRR = mapRR.get(aVertex);

					int vIndegreeNumFineConflicts = CalculateTotalIndegreeNumFineConflicts(aVertexRR);
					int vFilterCount = VId(aVertexRR)._numFilters;
					int vInOutEdgeCount = leftGraph.indegree(aVertex) + leftGraph.outdegree(aVertex);
					int vElementsCount = VId(aVertexRR)._numElements;
					System.out.println();
					System.out.print("Vertex[1-n] for Component: ");
					// Select a node to break the SCC based on 3 criteria
					for (int iVertex : components[i]) {
						System.out.print(iVertex + " - ");

						// %%%%

						int iVertexRR = mapRR.get(iVertex);
						if (VId(iVertexRR) == null)
							continue;

						int iIndegreeNumFineConflicts = CalculateTotalIndegreeNumFineConflicts(iVertexRR);
						int iFilterCount = VId(iVertexRR)._numFilters;
						int iInOutEdgeCount = leftGraph.indegree(iVertex) + leftGraph.outdegree(iVertex);
						int iElementsCount = VId(iVertexRR)._numElements;

						// Maximize number of semantic diffs
						// (we also need to consider VId(v)._numSemantics; currently it is One for 3
						// case studies)
						// WHEN REMOVING A NODE TO BREAK SCC,
						// CHOOSE NODE WITH SUM OF INCOMING WEIGHTS THAT IS MAXIMUM.
						// EDGE_WEIGHT IS FIRST, THEN DEGREE, THEN FILTERS, THEN ELEMENTS

						if (vIndegreeNumFineConflicts < iIndegreeNumFineConflicts) {
							vToRemoveByCriteria = iVertex;
							vIndegreeNumFineConflicts = iIndegreeNumFineConflicts;
							vFilterCount = iFilterCount;
							vInOutEdgeCount = iInOutEdgeCount;
							vElementsCount = iElementsCount;
						} else if (vIndegreeNumFineConflicts == iIndegreeNumFineConflicts) {
							// vInOutEdgeCount < iInOutEdgeCount
							if (vInOutEdgeCount < iInOutEdgeCount) {
								vToRemoveByCriteria = iVertex;
								vIndegreeNumFineConflicts = iIndegreeNumFineConflicts;
								vFilterCount = iFilterCount;
								vInOutEdgeCount = iInOutEdgeCount;
								vElementsCount = iElementsCount;
							} else if (vInOutEdgeCount == iInOutEdgeCount) {
								// vFilterCount > iFilterCount
								if (vFilterCount > iFilterCount) {
									vToRemoveByCriteria = iVertex;
									vIndegreeNumFineConflicts = iIndegreeNumFineConflicts;
									vFilterCount = iFilterCount;
									vInOutEdgeCount = iInOutEdgeCount;
									vElementsCount = iElementsCount;
								} else if (vFilterCount == iFilterCount) {
									// vElementsCount > iElementsCount
									if (vElementsCount > iElementsCount) {
										vToRemoveByCriteria = iVertex;
										vIndegreeNumFineConflicts = iIndegreeNumFineConflicts;
										vFilterCount = iFilterCount;
										vInOutEdgeCount = iInOutEdgeCount;
										vElementsCount = iElementsCount;
									}
								}
							}
						}
					}
					System.out.println();
					System.out
							.println("The vToRemoveByCriteria: " + vToRemoveByCriteria + " vIndegreeNumFineConflicts: "
									+ vIndegreeNumFineConflicts + " vInOutEdgeCount: " + vInOutEdgeCount
									+ " vFilterCount: " + vFilterCount + " vElementsCount: " + vElementsCount);
					if (components[i].size() > 1) {
						leftGraph = leftGraph.isolateNode(vToRemoveByCriteria);
						itemsToRemoveInLeft.add(vToRemoveByCriteria);
					}

					StdOut.println();
				}
			}
		}
		;

		System.out.print(leftGraph.toString());

		//////////////////////// # the graph with only the vertices removed from left
		for (int rL = 0; rL < leftGraph.V(); rL++) {
			if (!itemsToRemoveInLeft.contains(rL)) {
				rightGraph = rightGraph.isolateNode(rL);
			}
		}
		System.out.print("Right graph");
		System.out.print(rightGraph.toString());

		// %%% ToBeDevelopped
		/*
		 * ArrayList<String> idMap= new ArrayList<String>(); if(rightGraphHasCycle)////
		 * digraph is cyclic { VertexSorting vsR= new VertexSorting(); ArrayList<Vertex>
		 * vRs=(ArrayList<Vertex>)
		 * this._vertices.stream().filter(v->itemsToRemoveInLeft.contains(v._id)).
		 * collect(Collectors.toList()); vRs.forEach(vR->vsR._vertices.add(new
		 * Vertex(vR._name,vR._id, 1, vR._numFilters, vR._numElements, -1)));
		 * ArrayList<Edge> eRs= (ArrayList<Edge>)
		 * this._edges.stream().filter(e->itemsToRemoveInLeft.contains(e._from._id) &&
		 * itemsToRemoveInLeft.contains(e._to._id)).collect(Collectors.toList());
		 * eRs.forEach(eR->vsR._edges.add(new
		 * Edge(vsR.VId(eR._from._id),vsR.VId(eR._to._id),eR._edgeType))); int id=-1;
		 * for(Vertex v:vsR._vertices) { idMap.add(v._id +","+ (++id)); v._id=id; }
		 * 
		 * vsR.execute(); }
		 */
		/////////////////////

		topological1 = new TopologicalX(leftGraph);

		final int preOrder = previousOrder;
		final Map<Integer, Integer> maprr = mapRR;
		if (topological1.order() != null) {
			Iterable<Integer> topoOrders = topological1.order();
			ArrayList<Integer> topoOrderVisited = new ArrayList<Integer>();
			for (int v : topoOrders) {
				if (leftGraph.indegree(v) > 0) {
					ArrayList<Integer> inVs = leftGraph.inVertices(v);
					for (int w : topoOrderVisited) {
						inVs.forEach(wIn -> {
							if (w == wIn) {								
								VId(maprr.get(v))._order = VId(maprr.get(w))._order + preOrder + 1;
							}
						});
					}
				}
				else {
					VId(maprr.get(v))._order =preOrder + 1;
				}
				topoOrderVisited.add(v);
			}
			
			for (int v : topoOrderVisited) 
				if(VId(v)._order > previousOrder)
					previousOrder = VId(v)._order;
			
			
			/*int maxOrderTopo = VId(0)._order;
			 * for(int v=1; v<_vertices.size();v++) { if(maxOrderTopo<VId(1)._order)
			 * maxOrderTopo=VId(1)._order; }
			 * 
			 * for(int r: itemsToRemoveInLeft) { ArrayList<Integer> inVs= G.inVertices(r);
			 * if(inVs.size()>0) { int maxOrderR = VId(inVs.get(0))._order; for(int i=1;
			 * i<inVs.size();i++) if(maxOrderR<VId(inVs.get(i))._order)
			 * maxOrderR=VId(inVs.get(i))._order; VId(r)._order=maxOrderR+1>maxOrderTopo ?
			 * maxOrderR+1 : maxOrderTopo+1; } else { VId(r)._order=maxOrderTopo+1; } }
			 */

		}

		printTopo(topological1, itemsToRemoveInLeft, mapRR);

		System.out.println("itemsToRemove:");
		for (Integer v : itemsToRemoveInLeft) {
			System.out.print(v + " : " + mapRR.get(v) + ", ");
		}
		System.out.println();

		if (itemsToRemoveInLeft.size() > 1) {
			Collections.sort(itemsToRemoveInLeft);
			Map<Integer, Integer> mapR = new HashMap<Integer, Integer>();
			Map<Integer, Integer> mapRr = new HashMap<Integer, Integer>();
			for (int i = 0; i < itemsToRemoveInLeft.size(); i++) {
				mapR.put(mapRR.get(itemsToRemoveInLeft.get(i)), i); // insert key/value into map
				mapRr.put(i, mapRR.get(itemsToRemoveInLeft.get(i))); // insert key/value into map
			}
			Digraph rightG = InitRightGraph(itemsToRemoveInLeft, mapR);
			execute(rightG, mapRr, previousOrder);
		}
		else {
			if(itemsToRemoveInLeft.size()==1) {
				VId(maprr.get(itemsToRemoveInLeft.get(0)))._order=previousOrder+1;
			}
			Collections.sort(_vertices, new SortVerticesByOrder());
			System.out.println("\nresult:\n" + "\tId\t#Filters\t#Elements\tOrder\tName");
			for (Vertex n : _vertices) {
				System.out.println("\t " + n._id + "\t " + n._numFilters + "\t\t " + n._numElements + "\t\t " + n._order
						+ "\t " + n._name);
			}
		}

	}

}
