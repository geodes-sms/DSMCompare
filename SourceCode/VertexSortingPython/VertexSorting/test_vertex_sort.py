import unittest
from vertex_sort import *


class TestVertexSort(unittest.TestCase):

    def testLinearGraph(self):
        g = Graph(5,[1,1,1,1,1], name='Linear')
        for i in range(4):
            g.add_edge(i, i+1)
        g.set_order_heuristics(MaxWeightHeuristic())
        order = g.order_vertices(reverse_edges=True)
        self.assertEqual(order, {4: 1, 3: 2, 2: 3, 1: 4, 0: 5}, 'The order should be linear descending and first vertex ordered last')

    def testCircularGraph(self):
        g = Graph(5,[1,1,1,1,1], name='Circular')
        for i in range(5):
            g.add_edge(i, (i+1) % 5) # vertex 4 has edge to vertex 0
        g.set_order_heuristics(MaxWeightHeuristic())
        g1 = g.clone()
        order = g.order_vertices(reverse_edges=True)
        g1.SCC()
        self.assertEqual(len(g1.scc), 1, 'incorrect number of SCCs found')
        # only check if all vertices have a unique order
        self.assertEqual(len(order.values()), len(set(order.values())), 'The order of every vertex should be unique')

    def testCompleteGraph(self):
        g = Graph(5,[1,1,1,1,1], name='Complete')
        for i in range(5):
            for j in range(5):
                if i != j:
                    g.add_edge(i,j)
        g.set_order_heuristics(MaxWeightHeuristic())
        order = g.order_vertices(reverse_edges=True)
        # only check if all vertices have a unique order
        self.assertEqual(len(order.values()), len(set(order.values())), 'The order of every vertex should be unique')

    def testCompleteWeightedGraph(self):
        g = Graph(5,[1,2,3,4,5], name='Complete')
        for i in range(5):
            for j in range(5):
                if i != j:
                    g.add_edge(i,j)
        g.set_order_heuristics(MaxWeightHeuristic())
        order = g.order_vertices(reverse_edges=True)
        self.assertEqual(order, {4: 1,
                                 3: 2,
                                 2: 3, 
                                 1: 4,
                                 0: 5}, 'The order is incorrect')

    def testDisjointGraph(self):
        g = Graph(10, name='Disjoint')  # 2 disjoint complete graphs
        V_half = int(g.V/2)
        for i in range(V_half):
            for j in range(V_half):
                if i != j:
                    g.add_edge(i,j)
        for i in range(V_half, g.V):
            for j in range(V_half, g.V):
                if i != j:
                    g.add_edge(i,j)
        g1 = g.clone()
        order = g.order_vertices(reverse_edges=True)
        g1.SCC()
        self.assertEqual(len(g1.scc), 2, 'incorrect number of SCCs found')
        self.assertEqual(len(g1.scc[0]) + len(g1.scc[1]), 10, 'incorrect size of SCC found')
        scc1 = {}
        for v in g1.scc[1]:
            scc1[v] = order[v]
        for v in g1.scc[0]:
            self.assertTrue(order[v] in scc1.values(), 'The two disjoint subgraphs should have identical orders')
    
    def testNamedGraph(self):
        g = Graph(4, [4,5,3,2], use_names=True, name='NamedMaxWeight')
        g.set_adjacency({'A':['B'],
                        'B':['C','D'],
                        'C':['A','D'],
                        'D':[]})
        g.set_order_heuristics(MaxWeightHeuristic())
        order = g.order_vertices(reverse_edges=False)
        self.assertEqual(order, {0: 1,
                                 1: 2,
                                 3: 3,
                                 2: 4}, 'The order is incorrect')
    
    def testCyclicGraph(self):
        g = Graph(5,[1,1,1,1,1], name='Cyclic')
        for i in range(5):
            g.add_edge(i, (i+1) % 4) # vertex 4 has edge to vertex 0
        g.set_order_heuristics(MaxWeightHeuristic())
        order = g.order_vertices(reverse_edges=False)
        self.assertEqual(order, {4: 1, 2: 1, 0: 1, 
                                 3: 2, 1: 2}, 'The order is incorrect')
        order = g.order_vertices(reverse_edges=True)
        possibilities = [
            {0: 1, 4: 1, 3: 2, 2: 3, 1: 4},
            {0: 2, 4: 2, 3: 3, 2: 4, 1: 1},
            {0: 3, 4: 3, 3: 4, 2: 1, 1: 2},
            {0: 4, 4: 4, 3: 1, 2: 2, 1: 3}
        ]
        self.assertTrue(order in possibilities, 'The order is incorrect')
    
    def testMaximizeWeightedReversedGraph(self):
        g = Graph(4, [4,5,3,2], name='MaxWeightReverse')
        g.set_adjacency({0:[1],
                        1:[2,3],
                        2:[0,3],
                        3:[]})
        g.set_order_heuristics(MaxWeightHeuristic())
        order = g.order_vertices(reverse_edges=True)
        self.assertEqual(order, {3: 1, 
                                 1: 2, 
                                 0: 3, 
                                 2: 4}, 'The order is incorrect')
    
    def testMinimizeWeightedReversedGraph(self):
        g = Graph(4, [4,5,3,2], name='MinWeightReverse')
        g.set_adjacency({0:[1],
                        1:[2,3],
                        2:[0,3],
                        3:[]})
        g.set_order_heuristics(MinWeightHeuristic())
        order = g.order_vertices(reverse_edges=True)
        self.assertEqual(order, {0: 1, 3: 1, 
                                 2: 2, 
                                 1: 3}, 'The order is incorrect')
    
    def testMaximizeWeightedGraph(self):
        g = Graph(4, [4,5,3,2], name='MaxWeight')
        g.set_adjacency({0:[1],
                        1:[2,3],
                        2:[0,3],
                        3:[]})
        g.set_order_heuristics(MaxWeightHeuristic())
        order = g.order_vertices(reverse_edges=False)
        self.assertEqual(order, {0: 1,
                                 1: 2,
                                 3: 3,
                                 2: 4}, 'The order is incorrect')
    
    def testMinimizeWeightedGraph(self):
        g = Graph(4, [4,5,3,2], name='MinWeight')
        g.set_adjacency({0:[1],
                        1:[2,3],
                        2:[0,3],
                        3:[]})
        g.set_order_heuristics(MinWeightHeuristic())
        order = g.order_vertices(reverse_edges=False)
        self.assertEqual(order, {2: 1, 
                                 0: 2, 3: 2, 
                                 1: 3}, 'The order is incorrect')
    
    def testMultiWeightedGraph(self):
        g = Graph(4, [(4,1),(5,3),(5,5),(2,2)], name='MultiWeight')
        g.set_adjacency({0:[1],
                        1:[2,3],
                        2:[0,3],
                        3:[]})
        g.set_order_heuristics(MinMultiWeightHeuristic(MaxMultiWeightHeuristic()))
        order = g.order_vertices(reverse_edges=False)
        self.assertEqual(order, {2: 1, 
                                 0: 2, 3: 2,
                                 1: 3}, 'The order is incorrect')
        g.set_order_heuristics(MaxMultiWeightHeuristic(MinMultiWeightHeuristic()))
        order = g.order_vertices(reverse_edges=True)
        self.assertEqual(order, {3: 1,
                                 2: 2,
                                 1: 3,
                                 0: 4}, 'The order is incorrect')
    
    def testAdjacencyMatrix(self):
        g = Graph(4, [4,5,3,2], name='AdjacencyMatrix')
        g.set_adjacency_matrix([
            [0,1,0,0],
            [0,0,1,1],
            [1,0,0,1],
            [0,0,0,0]
            ])
        g.set_order_heuristics(MinWeightHeuristic())
        order = g.order_vertices(reverse_edges=False)
        self.assertEqual(order, {2: 1, 
                                 0: 2, 3: 2, 
                                 1: 3}, 'The order is incorrect')
    
    def testMinimizeInWeightedGraph(self):
        g = Graph(4, [4,5,3,2], name='MinimizeInWeightedGraph')
        g.set_adjacency_matrix([
            [0,2,0,0],
            [0,0,3,4],
            [1,0,0,3],
            [0,0,0,0]
            ])
        g.set_order_heuristics(MinOutWeightHeuristic())
        order = g.order_vertices(reverse_edges=True)
        self.assertEqual(order, {0: 1, 3: 1,
                                 1: 3,
                                 2: 2}, 'The order is incorrect')
    
    def testMaximizeOutWeightedGraph(self):
        g = Graph(4, [4,5,3,2], name='MinimizeInWeightedGraph')
        g.set_adjacency_matrix([
            [0,2,0,0],
            [0,0,3,4],
            [1,0,0,3],
            [0,0,0,0]
            ])
        g.set_order_heuristics(MinOutWeightHeuristic())
        order = g.order_vertices(reverse_edges=True)
        self.assertEqual(order, {0: 1, 3: 1,
                                 1: 3,
                                 2: 2}, 'The order is incorrect')
    
    def testInOutOrderGraph(self):
        g = Graph(6, [(2,8),(1,7),(1,8),(2,9),(3,5),(3,5)], False, name='InOutOrder') # (#nodes,[(#filters, #elements), ...]
        g.set_order_heuristics(MinOutWeightHeuristic(MinDegreeHeuristic(MaxMultiWeightHeuristic(MinMultiWeightHeuristic()))))
        g.set_adjacency({
            0:[1,2,5],
            1:[3],
            2:[4,5],
            3:[4],
            4:[5],
            5:[3]
            })
        order = g.order_vertices(reverse_edges=True)
        self.assertEqual(order, {4: 1,
                                 3: 2, 2: 2,
                                 1: 3,
                                 0: 4,
                                 5: 5}, 'The order is incorrect')
        g.set_adjacency_matrix([
            [0,1,1,0,0,1],
            [0,0,0,1,0,0],
            [0,0,0,0,1,1],
            [0,0,0,0,4,0],
            [0,0,0,0,0,1],
            [0,0,0,1,0,0]
        ])
        order = g.order_vertices(reverse_edges=True)
        self.assertEqual(order, {5: 1, 1: 1,
                                 4: 2,
                                 2: 3, 3: 3,
                                 0: 4}, 'The order is incorrect')

if __name__ == "__main__":
    unittest.main()