'''
==========================================
Title:  Module to create, visualize, perform operations, and algorithms on directed labeled weighted graphs
Author: Eugene Syriani
Date:   18 Dec 2020
==========================================
'''

from functools import reduce
import random

# to print to a file
#import sys
#sys.stdout = open("output.txt", "w")

random.seed(1)

####################
# Heuristics options
####################

'''
Heuristics to compare vertices of a graph based on a specific attribute
'''
class GraphHeuristic:
    # The enumeration of possible optimizations
    MINIMIZE = 1
    MAXIMIZE = 2
    def __init__(self, optimization, next_heuristic=None, graph=None):
        self.optimization = optimization
        # We reverse the comparison because the user specifies the order of vertices, not the priority of vertex removal when converting the graph to a DAG
        if optimization == GraphHeuristic.MINIMIZE:
            self.opposite_optimization_function = lambda x,y: x > y
            self.optimize = max
        elif optimization == GraphHeuristic.MAXIMIZE:
            self.opposite_optimization_function = lambda x,y: x < y
            self.optimize = min
        else:
            raise Exception('Undefined optimization')
        self.graph = graph
        self.attribute = None
        self.set_next(next_heuristic)
    
    '''
    Sets the graph on which to apply the heuristic
    '''
    def set_graph(self, graph):
        self.graph = graph
        if self.has_next():
            self.next_heuristic.set_graph(graph)
    
    '''
    Sets the next heuristic
    '''
    def set_next(self, heuristic):
        self.next_heuristic = heuristic
    
    '''
    Verifies if it has a next heuristic
    '''
    def has_next(self):
        return not (self.next_heuristic is None or self.next_heuristic.isNone())
    
    '''
    Gets the next heuristic
    '''
    def get_next(self):
        return self.next_heuristic
    
    '''
    Gets the last heuristic
    '''
    def get_last(self):
        if self.has_next():
            return self.next_heuristic.get_last()
        else:
            return self
    
    '''
    Verifies if the heuristic has other dimensions
    '''
    def is_multidimensional(self):
        return False
    
    '''
    Verifies if this is not a heuristic
    '''
    def isNone(self):
        return False
    
    '''
    Verifies if this is a weight heuristic
    '''
    def isWeight(self):
        return False
    
    '''
    Compares if the first graph element is more optimal than the second
    @param x: the first element to compare
    @param y: the second element to compare
    @return: True if x is strictly more optimal than y; otherwise False 
    '''
    def is_more_optimal(self, x, y):
        return self.opposite_optimization_function(self.attribute(x), self.attribute(y))
    
    '''
    Checks if the heuristic of the two graph elements are equal
    @param x: the first element
    @param y: the second element
    @return: True if they are equal; otherwise False 
    '''
    def are_equal(self, x, y):
        return self.attribute(x) == self.attribute(y)
    
    '''
      Finds the vertices with optimal attribute in graph or in vertex list
      @param v_list: if provided, finds the optimal vertices from this list
      @return: a list of vertices that has the optimal attribute
    '''
    def optimal(self, v_list=None):
        if v_list is None:
            v_list = list(self.graph.get_all_vertices())
        values = map(self.attribute, v_list)
        optimal_value = self.optimize(values)
        optimal_vList = [v for v in v_list if self.attribute(v) == optimal_value]
        if len(optimal_vList) > 1 and self.has_next():
            return self.next_heuristic.optimal(optimal_vList)
        else:
            return optimal_vList
    
    '''
      Sorts the vertices in graph or in vertex list according to the attribute and optimization
      @param v_list: if provided, sorts the vertices of this list only
      @return: a list of vertices sorted
    '''
    def sort(self, v_list=None):
        return sorted(self.graph.get_all_vertices() if v_list is None else v_list,
                      key = self.attribute,
                      reverse = (self.optimization == GraphHeuristic.MAXIMIZE))
    
    '''
    Creates a copy of this heuristic
    '''
    def clone(self):
        return GraphHeuristic(self.optimization, self.clone_next(), self.graph)
    
    '''
    Creates a copy of the next heuristic
    '''
    def clone_next(self):
        h = None
        if self.has_next():
            h = self.next_heuristic.clone()
        return h
    
    def __str__(self):
        s = self.__class__.__name__.replace('Heuristic', '')
        if not self.has_next():
            return s
        else:
            return '%s->%s' % (s, self.next_heuristic)

class NoHeuristic(GraphHeuristic):
    def __init__(self, graph=None):
        super().__init__(GraphHeuristic.MINIMIZE, None, graph)
        self.next_heuristic = None
    
    def isNone(self):
        return True
    
    def is_more_optimal(self, x, y):
        return True
    
    def are_equal(self, x, y):
        return True
    
    def optimal(self, v_list=None):
        return self.graph.get_all_vertices() if v_list is None else v_list
    
    def sort(self, v_list=None):
        return self.graph.get_all_vertices() if v_list is None else v_list
    
    def clone(self):
        return NoHeuristic(self.graph)

class DegreeHeuristic(GraphHeuristic):
    def __init__(self, optimization, next_heuristics=None, graph=None):
        super().__init__(optimization, next_heuristics, graph)
        self.attribute = lambda v: self.graph.degree(v)
    
    def clone(self):
        return DegreeHeuristic(self.optimization, self.clone_next(), self.graph)

class WeightHeuristic(GraphHeuristic):
    def __init__(self, optimization, next_heuristics=None, graph=None):
        super().__init__(optimization, next_heuristics, graph)
        self.attribute = lambda v: self.graph.weight(v)
    
    def isWeight(self):
        return True
    
    def clone(self):
        return WeightHeuristic(self.optimization, self.clone_next(), self.graph)

class OutWeightHeuristic(GraphHeuristic):
    def __init__(self, optimization, next_heuristics=None, graph=None):
        super().__init__(optimization, next_heuristics, graph)
        self.attribute = lambda v: self.graph.out_weights(v)
    
    def clone(self):
        return OutWeightHeuristic(self.optimization, self.clone_next(), self.graph)

class InWeightHeuristic(GraphHeuristic):
    def __init__(self, optimization, next_heuristics=None, graph=None):
        super().__init__(optimization, next_heuristics, graph)
        self.attribute = lambda v: self.graph.in_weights(v)
    
    def clone(self):
        return OutWeightHeuristic(self.optimization, self.clone_next(), self.graph)

class MultiWeightHeuristic(WeightHeuristic):
    def __init__(self, optimization, next_heuristics=None, graph=None, dimension=0):
        super().__init__(optimization, next_heuristics, graph)
        self.set_dimension(dimension)
        self.attribute = lambda v: self.graph.weight(v)[self.dimension]
    
    def is_multidimensional(self):
        return True
    
    def set_dimension(self, dim):
        self.dimension = dim
        if isinstance(self.next_heuristic, MultiWeightHeuristic):
            self.next_heuristic.set_dimension(self.dimension + 1)
    
    def clone(self):
        return MultiWeightHeuristic(self.optimization, self.clone_next(), self.graph)

class MinDegreeHeuristic(DegreeHeuristic):
    def __init__(self, next_heuristics=None, graph=None):
        super().__init__(GraphHeuristic.MINIMIZE, next_heuristics, graph)
    
    def clone(self):
        return MinDegreeHeuristic(self.clone_next(), self.graph)

class MaxDegreeHeuristic(DegreeHeuristic):
    def __init__(self, next_heuristics=None, graph=None):
        super().__init__(GraphHeuristic.MAXIMIZE, next_heuristics, graph)
    
    def clone(self):
        return MaxDegreeHeuristic(self.clone_next(), self.graph)

class MinWeightHeuristic(WeightHeuristic):
    def __init__(self, next_heuristics=None, graph=None):
        super().__init__(GraphHeuristic.MINIMIZE, next_heuristics, graph)
    
    def clone(self):
        return MinWeightHeuristic(self.clone_next(), self.graph)

class MaxWeightHeuristic(WeightHeuristic):
    def __init__(self, next_heuristics=None, graph=None):
        super().__init__(GraphHeuristic.MAXIMIZE, next_heuristics, graph)
    
    def clone(self):
        return MaxWeightHeuristic(self.clone_next(), self.graph)

class MinOutWeightHeuristic(OutWeightHeuristic):
    def __init__(self, next_heuristics=None, graph=None):
        super().__init__(GraphHeuristic.MINIMIZE, next_heuristics, graph)
    
    def clone(self):
        return MinOutWeightHeuristic(self.clone_next(), self.graph)

class MaxOutWeightHeuristic(OutWeightHeuristic):
    def __init__(self, next_heuristics=None, graph=None):
        super().__init__(GraphHeuristic.MAXIMIZE, next_heuristics, graph)
    
    def clone(self):
        return MaxOutWeightHeuristic(self.clone_next(), self.graph)

class MinInWeightHeuristic(InWeightHeuristic):
    def __init__(self, next_heuristics=None, graph=None):
        super().__init__(GraphHeuristic.MINIMIZE, next_heuristics, graph)
    
    def clone(self):
        return MinInWeightHeuristic(self.clone_next(), self.graph)

class MaxInWeightHeuristic(InWeightHeuristic):
    def __init__(self, next_heuristics=None, graph=None):
        super().__init__(GraphHeuristic.MAXIMIZE, next_heuristics, graph)
    
    def clone(self):
        return MaxInWeightHeuristic(self.clone_next(), self.graph)

class MinMultiWeightHeuristic(MultiWeightHeuristic):
    def __init__(self, next_heuristics=None, graph=None):
        super().__init__(GraphHeuristic.MINIMIZE, next_heuristics, graph)
    
    def clone(self):
        return MinMultiWeightHeuristic(self.clone_next(), self.graph)

class MaxMultiWeightHeuristic(MultiWeightHeuristic):
    def __init__(self, next_heuristics=None, graph=None):
        super().__init__(GraphHeuristic.MAXIMIZE, next_heuristics, graph)
    
    def clone(self):
        return MaxMultiWeightHeuristic(self.clone_next(), self.graph)




####################
# Visualize the graph in DOT with Graphviz online at https://dreampuf.github.io/GraphvizOnline
####################

class GraphViz:    
    def __init__(self, graph, show_v_weight=False, show_degree=False, show_e_weight=False):
        self.graph = graph
        self.show_v_weight = show_v_weight
        self.show_degree = show_degree
        self.show_e_weight = show_e_weight
        # DOT colors
        self.SVG_COLOR_SCHEME = ['aliceblue','antiquewhite','aqua','aquamarine','azure','beige','bisque','black','blanchedalmond','blue','blueviolet','brown','burlywood','cadetblue','chartreuse','chocolate','coral','cornflowerblue','cornsilk','crimson','cyan','deeppink','deepskyblue','dimgray','dimgrey','dodgerblue','firebrick','floralwhite','forestgreen','gainsboro','ghostwhite','gold','goldenrod','gray','grey','green','greenyellow','honeydew','hotpink','indianred','indigo','ivory','khaki','lavender','lavenderblush','lawngreen','lemonchiffon','lightblue','lightcoral','lightcyan','lightgoldenrodyellow','lightgray','lightgreen','lightgrey','lightpink','lightsalmon','lightseagreen','lightskyblue','lightslategray','lightslategrey','lightsteelblue','lightyellow','lime','limegreen','linen','magenta','maroon','mediumaquamarine','mediumblue','mediumorchid','mediumpurple','mediumseagreen','mediumslateblue','mediumspringgreen','mediumturquoise','mediumvioletred','midnightblue','mintcream','mistyrose','moccasin','navajowhite','oldlace','olivedrab','orange','orangered','orchid','palegoldenrod','palegreen','paleturquoise','palevioletred','papayawhip','peachpuff','peru','pink','plum','powderblue','purple','red','rosybrown','royalblue','saddlebrown','salmon','sandybrown','seagreen','seashell','sienna','silver','skyblue','slateblue','slategray','slategrey','snow','springgreen','steelblue','tan','thistle','tomato','turquoise','violet','wheat','white','whitesmoke','yellow','yellowgreen']
        
    def draw_vertex(self, v, color=''):
        index = self.graph.get_vertex_id(v)
        name = self.graph.getV(v)
        weight = ''
        if self.show_v_weight:
            w = self.graph.weight(v)
            weight = ('%s' if isinstance(w, tuple) else '(%s)') % str(w)
            weight = weight.replace(' ','')
            #weight = '\nfilter=%d\nelem=%d' % w
        degree = '[%s]' % self.graph.degree(v) if self.show_degree else ''
        label = 'label="%s%s%s"' % (name, weight, degree)
        style_color = 'fillcolor=%s, style=filled' % color if color else ''
        return '%s[%s];' % (index, ','.join((label, style_color)))
    
    def draw_edge(self, v, u, color=''):
        label = 'label="%s"' % self.graph.get_edge_weight(v, u) if self.show_e_weight else ''
        style_color = 'color=%s' % color if color else ''
        sep1 = ',' if label and style_color else ''
        undirected = 'dir=none' if not self.graph.directed else ''
        sep2 = ',' if sep1 and undirected else ''
        return '%s->%s[%s%s%s%s%s];' % (v, u, label, sep1, style_color, sep2, undirected)
    
    def draw(self):
        graph = 'digraph %s {\n%s\n%s\n}'    # first nodes, then edges
        nodes = []
        edges = []
        self._draw(nodes, edges)
        return graph % (self.graph.name, '\n'.join(nodes), '\n'.join(edges))
    
    def _draw(self, nodes, edges):
        raise NotImplementedError()

class SCCGraphViz(GraphViz):
    def __init__(self, graph, show_v_weight=False, show_degree=False, show_e_weight=False):
        super().__init__(graph, show_v_weight, show_degree, show_e_weight)
    
    def _draw(self, nodes, edges):
        self.graph.SCC()
        for scc in self.graph.scc:
            # choose a unique random color for this SCC
            color = random.randint(0, len(self.SVG_COLOR_SCHEME) - 1)
            color = self.SVG_COLOR_SCHEME.pop(color)
            for v in scc:
                nodes.append(self.draw_vertex(v, color))
                scc_edges = self.graph.SCCEdges(v)
                for u in scc_edges:
                    edges.append(self.draw_edge(v, u, color))
                for u in diff(self.graph.get_out(v), scc_edges):
                    edges.append(self.draw_edge(v, u, color))
        not_scc = diff(range(self.graph.V), list(set(reduce(lambda i,j: i + j, self.graph.scc))))
        for v in not_scc:
            nodes.append(self.draw_vertex(v))
            for u in self.graph.get_out(v):
                edges.append(self.draw_edge(v, u))
        self.graph.clear()

class VertexColoringGraphViz(GraphViz):
    def __init__(self, graph, show_v_weight=False, show_degree=False, show_e_weight=False):
        super().__init__(graph, show_v_weight, show_degree, show_e_weight)
    
    def _draw(self, nodes, edges):
        vertex_color = self.graph.color_vertices() # get all the color ids
        colors = []
        for _ in set(vertex_color.values()):
            # choose a unique random color for this color id
            color = random.randint(0, len(self.SVG_COLOR_SCHEME) - 1)
            colors.append(self.SVG_COLOR_SCHEME.pop(color))
        for v in vertex_color:
            nodes.append(self.draw_vertex(v, colors[vertex_color[v]]))
            for u in self.graph.get_out(v):
                edges.append(self.draw_edge(v, u))


####################
# The main class: Graph
####################

class Graph:
    '''
    Creates a weighted, directed, labeled graph.
    @param num_vertices: number of vertices.
    @param v_weights: the weight of each vertex. You can have multiple weight dimensions by using a tuple for each value of the list. The length of the weight list should be equal to the number of vertices.
    @param use_names: when True, we use the name label of a vertex when referring to it. By default, we use a single letter. Otherwise, we use its internal id.
    @param name: the name of the graph.
    @param directed: when True, the edges are directed. Otherwise, for each edge created, we also create its reverse.
    '''
    def __init__(self, num_vertices, v_weights=[], use_names=False, v_names=[], name='', directed=True):
        self.V = num_vertices
        self.E = 0          # num_edges
        self.e_weights = dict()
        self.graph = dict()
        # normalize weights
        w_int = False
        w_tuple = False
        for w in v_weights:
            if isinstance(w, int):
                w_int = True
            elif isinstance(w, tuple):
                w_tuple = True
            else:
                raise Exception('vertices weights must be integers or tuples of integers')
        if w_tuple:     # at least one weight is a tuple
            if w_int:   # some are integers, need to convert them to integers
                normalized_weights = []
                for w in v_weights:
                    if isinstance(w, int):
                        normalized_weights.append((w,))
                    else:
                        normalized_weights.append(w)
                v_weights = normalized_weights
        
        for v in range(self.V):
            self.graph[v] = {'weight': v_weights[v] if v < len(v_weights) else 0,    # unspecified weights are set to 0
                             'name': v_names[v] if v < len(v_names) else chr(ord('A') + v), # unspecified names are assigned to an ASCII symbol
                             'out_edge': [],
                             'in_edge': []}
        self.directed = directed
        self.heuristics = NoHeuristic(self) #MinOutWeightHeuristic(next_heuristics=MinDegreeHeuristic(graph=self), graph=self)
        self.use_names = use_names
        self.name = name
        self.clear()

    '''
    Sets the heuristics for each weight dimension
    @param heuristics: when ordering the vertices of the graph, provide the optimization for each weight dimension (in addition to maximal degree). E.g., MinWeightHeuristic() will prioritize the vertices with minimal weight in a SCC.
    '''
    def set_order_heuristics(self, heuristics):
        heuristics.set_graph(self)
        #h = self.heuristics.get_last()
        #h.set_next(heuristics)    # because we have predefined the first heuristic in the constructor. Every time this function is called, we reset the next heuristic
        self.heuristics = heuristics    # no heuristic is predefined anymore

    '''
    Resets all computed data
    '''
    def clear(self):
        self.Time = 0
        self.scc = []
        self.topo_sorted = []
        self.order = None

    '''
    Creates a copy of the graph
    '''
    def clone(self, new_name=''):
        clone = Graph(self.V, v_weights=[], use_names=self.use_names, 
                      v_names=[], name=new_name if new_name != '' else self.name, directed=True)
        clone.graph = dict()
        for v in self.graph.keys():
            clone.graph[v] = {'weight': self.graph[v]['weight'],
                              'name': self.graph[v]['name'],
                              'out_edge': [],
                              'in_edge': []}
            for u in self.graph[v]['out_edge']:
                clone.graph[v]['out_edge'].append(u)
                clone.E += 1
            for u in self.graph[v]['in_edge']:
                clone.graph[v]['in_edge'].append(u)
        clone.e_weights = dict()
        for u,v in self.e_weights:
            clone.e_weights[(u,v)] = self.e_weights[(u,v)]
        clone.directed = self.directed
        #if self.heuristics.has_next():
            #h = self.heuristics.get_next().clone()    # skip the first one because it is set by default in the constructor
            #clone.set_order_heuristics(h)
        h = self.heuristics.clone()    # no heuristic is set by default in the constructor
        h.set_graph(self)
        clone.set_order_heuristics(h)
        return clone

    '''
    Outputs and formats the graph and its properties as a string
    '''
    def __str__(self):
        s = 'Graph %s\n' % (self.name)
        s += 'Total vertices: %d --- Total edges: %d\n' % (self.V, self.E)
        s += 'Contains cycles: %s --- Number of SCC: %d\n' % ('No' if self.isDAG() else 'Yes', len(self.scc))
        s += 'Heuristics: %s\n' % self.heuristics
        s += 'Id\tVertex\tWeight\tDegree\tOut Edges\tIn Edges\tOut Weight\n'
        for v in self.graph:
            s += str(v)
            s += '\t'
            s += self.getV(v)
            s += '\t'
            s += str(self.graph[v]['weight'])
            s += '\t'
            s += str(self.degree(v))
            s += '\t'
            if len(self.graph[v]['out_edge']) > 0:
                s += reduce(lambda u,v: '%s %s' % (u,v),
                            list(map(lambda x: self.getV(x), self.graph[v]['out_edge'])))
            s += '\t'
            if len(self.graph[v]['in_edge']) > 0:
                s += reduce(lambda u,v: '%s %s' % (u,v),
                            list(map(lambda x: self.getV(x), self.graph[v]['in_edge'])))
            s += '\t'
            s += str(self.out_weights(v))
            s += '\n'
        if not self.isDAG():
            s += '\nStrongly connected components:\n'
            s += self.SCC2str()
        return s

    '''
    Represents the graph in DOT visualizable with Graphviz online at https://dreampuf.github.io/GraphvizOnline
    '''
    def dot(self, show_v_weight=False, show_degree=False, show_e_weight=False):
        dot = SCCGraphViz(self, show_v_weight, show_degree, show_e_weight)
        return dot.draw()

    '''
    Represents the graph in DOT visualizable with Graphviz online at https://dreampuf.github.io/GraphvizOnline
    '''
    def dot_color(self, show_v_weight=False, show_degree=False, show_e_weight=False):
        dot = VertexColoringGraphViz(self, show_v_weight, show_degree, show_e_weight)
        return dot.draw()
        
    '''
    Outputs and formats the list of vertices in a string
    '''
    def vertexList2str(self, v_list):
        s = ''
        for v in v_list:
            name = self.graph[v]['name'] if self.use_names else v
            s += '%s ' % name
        return s
    
    '''
    Gets a vertex by name or by id
    @param v: the vertex name or the vertex id
    @return: the name of the string if uses_names==True; otherwise the id of v
    '''
    def getV(self, v):
        v = self.get_vertex_id(v)
        return self.graph[v]['name'] if self.use_names else str(v)
    
    '''
    Gets the weight of an edge from u to v
    @param u: the vertex name or the vertex id
    @param v: the vertex name or the vertex id
    @return: the weight of the edge or 0 if there is no edge from u to v
    '''
    def get_edge_weight(self, u, v):
        u = self.get_vertex_id(u)
        v = self.get_vertex_id(v)
        if (u,v) in self.e_weights:
            return self.e_weights[(u,v)]
        else:
            return 0
    
    '''
    Gets the id of a vertex
    @param v: the vertex name or the vertex id
    '''
    def get_vertex_id(self, v):
        if isinstance(v,str):
            if len(v) != 1:
                raise Exception('Vertex %s does not exist' % v)
            v = ord(v) - ord('A')
        elif v not in self.graph.keys():
            raise Exception('Vertex %s does not exist' % v)
        return v
    
    '''
    Adds a vertex to the graph
    @param name: the vertex name (optional)
    @param weight: the weight of the vertex as a single integer or a tuple of integers. A weight of 0 is assigned to the vertex if no weight is provided.
    '''
    def add_vertex(self, name='', weight=0):
        v = self.get_vertex_id(name)
        if v in self.graph.keys():
            raise Exception('Vertex %s already exists' % name)
        else:
            v = max(self.graph.keys()) + 1
            self.graph[v] = {'weight':weight, 'name':name, 'out_edge':[], 'in_edge':[]}
        return v
    
    '''
    Removes a vertex from the graph
    @param v: the vertex name or the vertex id
    '''
    def remove_vertex(self, v):
        v = self.get_vertex_id(v)
        # remove edges from v to u
        out_edges = [i for i in self.graph[v]['out_edge']]  # list is changing in the loop, so need to copy it
        for u in out_edges:
            self.remove_edge(v,u)
        for u in self.graph.keys():
            # remove edges from u to v
            while v in self.graph[u]['out_edge']:
                self.remove_edge(u,v)
        # remove v
        del self.graph[v]
        self.V -= 1
        self.clear()
    
    '''
    Gets all the edges of the graph
    @param use_names: if True, uses the name of the vertices instead of their id
    @return: a dictionary mapping the name or id of each vertex to a list of its outgoing neighbors
    '''
    def get_all_vertices(self, use_names=False):
        if use_names:
            return map(lambda v: self.getV(v), self.graph.keys())
        else:
            return self.graph.keys()
        
    '''
    Adds an edge from vertex u to vertex v
    @param u: the vertex name or the vertex id
    @param v: the vertex name or the vertex id
    '''
    def add_edge(self, u, v, weight=1):
        u = self.get_vertex_id(u)
        v = self.get_vertex_id(v)
        self.graph[u]['out_edge'].append(v)
        self.graph[v]['in_edge'].append(u)
        self.e_weights[(u,v)] = weight
        self.E += 1
        if not self.directed:
            self.graph[v]['out_edge'].append(u)
            self.graph[u]['in_edge'].append(v)
            self.e_weights[(v,u)] = weight
            self.E += 1
        self.clear()
    
    '''
    Removes an edge from vertex u to vertex v
    @param u: the vertex name or the vertex id
    @param v: the vertex name or the vertex id
    '''
    def remove_edge(self, u, v):
        u = self.get_vertex_id(u)
        v = self.get_vertex_id(v)
        while v in self.graph[u]['out_edge']:
            self.graph[u]['out_edge'].remove(v)
            self.graph[v]['in_edge'].remove(u)
            self.E -= 1
            del self.e_weights[(u,v)]
        if not self.directed:
            while u in self.graph[v]['out_edge']:
                self.graph[v]['out_edge'].remove(u)
                self.graph[u]['in_edge'].remove(v)
                self.E -= 1
                del self.e_weights[(v,u)]
        self.clear()
    
    '''
    Removes all edges in the graph
    '''
    def remove_all_edges(self):
        for v in self.graph.keys():
            self.graph[v]['out_edge'] = []
            self.graph[v]['in_edge'] = []
        self.e_weights = dict()
        self.clear()
    
    '''
    Resets all the edges of the graph to the provided adjacency specification. If undirected, then only 1 direction of the edge suffices.
    @param adjacency: a dictionary mapping the name or id of each vertex to a list of its outgoing neighbors
    '''
    def set_adjacency(self, adjacency):
        self.remove_all_edges()
        for v in adjacency:
            v_id = self.get_vertex_id(v)
            for u in adjacency[v]:
                u_id = self.get_vertex_id(u)
                self.add_edge(v_id,u_id)
        self.clear()
    
    '''
    Resets all the edges of the graph to the provided matrix specification. If undirected, then only 1 direction of the edge suffices.
    @param matrix: a 2-dimensional array. If matrix[u][v] > 0, then it represents the weight of the edge from u to v. Otherwise there is no edge from u to v.
    '''
    def set_adjacency_matrix(self, matrix):
        self.remove_all_edges()
        for u in range(len(matrix)):
            u_id = self.get_vertex_id(u)
            for v in range(len(matrix)):
                if matrix[u][v] > 0:
                    v_id = self.get_vertex_id(v)
                    self.add_edge(u_id, v_id, matrix[u][v])
        self.clear()
    
    '''
    Gets the outgoing edges of the vertex
    @param v: the vertex name or the vertex id
    @param use_names: if True, uses the name of the vertices instead of their id
    @return: a list of the outgoing neighbors of v
    '''
    def get_out(self, v, use_names=False):
        v = self.get_vertex_id(v)
        edges = self.graph[v]['out_edge']
        if use_names:
            edges = map(lambda u: self.getV(u), edges)
        return edges
    
    '''
    Gets the incoming edges of the vertex
    @param v: the vertex name or the vertex id
    @param use_names: if True, uses the name of the vertices instead of their id
    @return: a list of the incoming neighbors of v
    '''
    def get_in(self, v, use_names=False):
        v = self.get_vertex_id(v)
        edges = self.graph[v]['in_edge']
        if use_names:
            edges = map(lambda u: self.getV(u), edges)
        return edges
    
    '''
    Gets all the edges of the graph
    @param use_names: if True, uses the name of the vertices instead of their id
    @return: a dictionary mapping the name or id of each vertex to a list of its outgoing neighbors
    '''
    def get_all_edges(self, use_names=False):
        edges = {}
        for v in self.graph.keys():
            e = self.graph[v]['out_edge']
            if use_names:
                v = self.getV(v)
                edges[v] = map(lambda u: self.getV(u), e)
            else:
                edges[v] = e
        return edges
    
    '''
    Counts the edges adjacent to vertex v
    @return: the number of incoming and outgoing edges of v
    '''
    def degree(self, v):
        v = self.get_vertex_id(v)
        return len(self.graph[v]['out_edge']) + len(self.graph[v]['in_edge'])
    
    '''
    Gets the sum of the edges outgoing from vertex v
    @return: the total weight of outgoing edges of v
    '''
    def out_weights(self, v):
        return self.__inout_weights(v, False)
    
    '''
    Gets the sum of the edges incoming from vertex v
    @return: the total weight of incoming edges of v
    '''
    def in_weights(self, v):
        return self.__inout_weights(v, True)
    
    '''
    Internal function to compute the sum weighted edges adjacent to vertex v
    '''
    def __inout_weights(self, v, incoming):
        weight = 0
        v = self.get_vertex_id(v)
        for i,j in self.e_weights:
            if (incoming and j == v) or (not incoming and i == v):
                weight += self.e_weights[(i,j)]
        return weight
    
    '''
    Gets the weight of a vertex v
    '''
    def weight(self, v):
        v = self.get_vertex_id(v)
        return self.graph[v]['weight']
    
    '''
    Finds the vertex with lowest degree in the graph or in a list of vertices
    '''
    def getVertexMinDegree(self, v_list=None):
        h = MaxDegreeHeuristic(graph=self)    # need to use the opposite
        return h.optimal(v_list=v_list)
    
    '''
    Finds the vertex with highest degree in the graph or in a list of vertices
    '''
    def getVertexMaxDegree(self, v_list=None):
        h = MinDegreeHeuristic(graph=self)    # need to use the opposite
        return h.optimal(v_list=v_list)
    
    '''
    Finds the vertex with lowest weight in the graph or in a list of vertices
    '''
    def getVertexMinWeight(self, v_list=None):
        h = MaxWeightHeuristic(graph=self)    # need to use the opposite
        return h.optimal(v_list=v_list)
    
    '''
    Finds the vertex with highest weight in the graph or in a list of vertices
    '''
    def getVertexMaxWeight(self, v_list=None):
        h = MinWeightHeuristic(graph=self)    # need to use the opposite
        return h.optimal(v_list=v_list)

    '''
    Sort vertices in list according to the heuristics
    '''
    def sorted(self, v_list=None):
        return self.heuristics.sort(v_list)
    
    '''
    Gets the first weight heuristic
    '''
    def getWeightHeursitic(self, heuristics):
        if heuristics.isWeight():
            return heuristics
        elif heuristics.has_next():
            return self.getWeightHeursitic(heuristics.get_next())
        else:
            return NoHeuristic(self)

    '''
    Sort vertices in list by weight according to the heuristics
    '''
    def sortedByWeight(self, v_list=None):
        return self.getWeightHeursitic(self.heuristics).sort(v_list)
    
    '''
    Sort vertices in graph by degree
    '''
    def sortedByDegree(self, v_list=None, ascending=True):
        if ascending:
            return MaxDegreeHeuristic(graph=self).sort(v_list)   # need to use the opposite
        else:
            return MinDegreeHeuristic(graph=self).sort(v_list)   # need to use the opposite
    
    '''
    Sort vertices in graph by the sum of the weights of their outgoing edges
    '''
    def sortedByOutWeight(self, v_list=None, ascending=True):
        if ascending:
            return MaxOutWeightHeuristic(graph=self).sort(v_list)   # need to use the opposite
        else:
            return MinOutWeightHeuristic(graph=self).sort(v_list)   # need to use the opposite
    
    '''
    Sort vertices in graph by the sum of the weights of their incoming edges
    '''
    def sortedByInWeight(self, v_list=None, ascending=True):
        if ascending:
            return MaxInWeightHeuristic(graph=self).sort(v_list)   # need to use the opposite
        else:
            return MinInWeightHeuristic(graph=self).sort(v_list)   # need to use the opposite
    
    '''
    Find the cross edges from a SCC containing vertex v to any other SCC
    '''
    def get_cross_edges(self, v):
        cross_edges = []
        for scc in self.scc:
            if v in scc:
                # Found the SCC of v, now find the edges
                for u in scc:
                    edge = self.diff(self.graph[u]['out_edge'], scc)
                    if edge:
                        cross_edges.append([u] + edge)
        return cross_edges
    
    '''
    Find the edges from vertex v to any vertex within the SCC containing v
    '''
    def SCCEdges(self, v):
        scc_edges = []
        for scc in self.scc:
            if v in scc:
                # Found the SCC of v, now find the edges
                edge = intersect(scc, self.graph[v]['out_edge'])
                for u in edge:
                    scc_edges.append(u)
        return scc_edges

    '''
    Checks if the graph is a DAG by computing the SCCs
    '''
    def isDAG(self):
        if not self.scc:
            self.SCC()
        # if it's a DAG, then each vertex is a SCC
        return len(self.scc) == self.V

    '''
    Convert the graph to a DAG by removing vertices and return the removed vertices
    '''
    def to_DAG(self):
        removed_vertices = []
        while not self.isDAG():
            cyclic_scc = filter(lambda scc: len(scc) > 1, self.scc) # get all SCCs with cycles
            optimal_vertices = self.heuristics.optimal(reduce(lambda x,y: x + y, cyclic_scc))
            # remove the optimal vertex in the SCC according to the heuristics
            optimal_vertex = random.choice(optimal_vertices)
            self.remove_vertex(optimal_vertex)
            removed_vertices.append(optimal_vertex)
        return removed_vertices

    '''
    Gives a partial order of the vertices according to their topology and the heuristics
    @param reverse_edges: if True, it will order vertices according to the reverse directions of the edges
    @param debug: if True, enables debug mode which prints detailed steps of the algorithm
    @return: a dictionary mapping the id of each vertex to its order
    '''
    def order_vertices(self, reverse_edges=True, debug=False):
        self.clear()
        if debug:
            print('*' * 20)
            print('* ORDER_VERTICES IN DEBUG MODE')
            print('*' * 20)
            print('Initial graph:')
            print(self)
        left = self.clone('%s_LEFT' % self.name)        # the graph as DAG
        right = self.clone('%s_RIGHT' % self.name)      # the graph with only the vertices removed from left
        removed_vertices = left.to_DAG()
        if debug:
            print('Removed vertices:')
            print(self.vertexList2str(removed_vertices))
            print()
            print('<<< LEFT', left)
        left.topological_sort(reverse_edges)
        if debug:
            print('Sorted vertices:\n', left.sort2str())
            print()
        for v in left.graph.keys():
            right.remove_vertex(v)
        if debug:
            print('>>> RIGHT', right)
        if not right.isDAG():
            right.order_vertices(reverse_edges, debug) # recursively order the right graph
            right.topo_sorted = sorted(right.order, key=lambda x: right.order[x])  # force the topological sort to be the order
        else:
            right.topological_sort(reverse_edges) # it is for sure a DAG, because each vertex is from a different SCC
        topo_sort = left.topo_sorted + right.topo_sorted
        # initialize the order of each vertex to 1
        self.order = { i : 1 for i in topo_sort }
        for i in range(len(topo_sort)):
            v = topo_sort[i]
            # find the vertex u topologically before v that is in the edge_list
            before = list(filter(lambda u: topo_sort.index(u) < i, self.graph[v]['out_edge'] + self.graph[v]['in_edge']))
            if len(before) > 0:
                before_order = map(lambda u: self.order[u], before)
                self.order[v] = max(before_order) + 1
        if debug:
            print('Order', self.name,':')
            print(self.ordered2str(reverse_edges))
        return self.order

    '''
    Outputs and formats the ordered vertices in a string
    '''
    def ordered2str(self, reverse_edges=True, debug=False):
        if self.order is None:
            self.order_vertices(reverse_edges, debug)
        s = 'Id\tVertex\tOrder\n'
        for v in sorted(self.order, key=lambda x: self.order[x]):
            s += '%s\t%s\t%s\n' % (v, self.getV(v), self.order[v])
        s += '\n'
        return s
    
    '''
    Outputs and formats the strongly connected components in a string
    '''
    def SCC2str(self):
        s = ''
        for scc in self.scc:
            s += '%s\n' % self.vertexList2str(scc)
        s += '\n'
        return s
    
    '''
    A recursive function that finds strongly connected components using DFS traversal
    @param u int: The vertex to be visited next
    @param disc list: Stores discovery times of visited vertices
    @param low list: earliest visited vertex (the vertex with minimum discovery time) that can be reached from subtree rooted with current vertex
    @param st list: To store all the connected ancestors (could be part of SCC)
    @param stackMember list: bit/index array for faster check whether a node is in stack
    '''
    def __SCCUtil(self, u, low, disc, stackMember, st):
        # Initialize discovery time and low value
        disc[u] = self.Time
        low[u] = self.Time
        self.Time += 1
        stackMember[u] = True
        st.append(u)
        # Go through all vertices adjacent to this
        for v in self.graph[u]['out_edge']:
            # If v is not visited yet, then recur for it
            if disc[v] == -1 :
                self.__SCCUtil(v, low, disc, stackMember, st)
                # Check if the subtree rooted with v has a connection to one of the ancestors of u
                # This is case 1 (per above discussion on Disc and Low value)
                low[u] = min(low[u], low[v])
            elif stackMember[v]:
                # Update low value of 'u' only if 'v' is still in stack (i.e. it's a back edge, not cross edge)
                # This is case 2 (per above discussion on Disc and Low value)
                low[u] = min(low[u], disc[v])
        # head node found, pop the stack and print an SCC
        w = -1 #To store stack extracted vertices
        if low[u] == disc[u]:
            scc = []
            while w != u:
                w = st.pop()
                stackMember[w] = False
                scc.append(w)
            self.scc.append(scc)
    
    '''
    Finds the strongly connected components of the graph
    '''
    def SCC(self):
        # Mark all the vertices as not visited and Initialize parent and visited, and ap(articulation point) arrays
        disc = dict()
        low = dict()
        stackMember = dict()
        for u in self.graph.keys():
            disc[u] = -1
            low[u] = -1
            stackMember[u] = False
        st =[]
        # Call the recursive helper function to find articulation points in DFS tree rooted with vertex 'i'
        for i in self.graph.keys():
            if disc[i] == -1:
                self.__SCCUtil(i, low, disc, stackMember, st)
    
    '''
    A recursive function used by topological_sort
    ''' 
    def __topological_sort_util(self, v, visited, stack, reverse_edges=True): 
        # Mark the current node as visited. 
        visited[v] = True
        # Recur for all the vertices adjacent to this vertex 
        for u in self.graph[v]['out_edge']: 
            if not visited[u]: 
                self.__topological_sort_util(u, visited, stack)
        if reverse_edges:
            # order following reverse edge direction: Enqueue current vertex at end of queue which stores result
            stack.append(v)
        else:
            # order following edge direction: Push current vertex in stack which stores result
            stack.insert(0,v)
  
    '''
    The function to do sort all vertices of the graph topologically. It assumes the graph is a DAG.
    '''
    def topological_sort(self, reverse_edges=True):
        visited = dict()
        # Mark all the vertices as not visited 
        for u in self.graph.keys():
            visited[u] = False
        self.topo_sorted = []
        # Call the recursive helper function to store Topological 
        # Sort starting from all vertices one by one 
        for u in self.sortedByWeight():
            if not visited[u]: 
                self.__topological_sort_util(u, visited, self.topo_sorted, reverse_edges)
        return self.topo_sorted
    
    '''
    Outputs and formats the list of vertices sorted in topological order in a string
    '''
    def sort2str(self):
        return self.vertexList2str(self.topo_sorted)
    
    '''
    Graph coloring: assign a color to a vertex such that adjacent vertices have different colors
    @param use_names: if True, uses the name of the vertices instead of their id
    @return: a dictionary mapping each vertex to a number (representing a color)
    '''
    def color_vertices(self, use_names=False):
        color_map = {}
        # Consider nodes in descending degree
        for v in self.sortedByDegree(None, ascending=False):
            adjacent_colors = set(color_map.get(u) for u in self.graph[v]['out_edge'])
            if use_names:
                v = self.getV(v)
            color_map[v] = next(color for color in range(self.V) if color not in adjacent_colors)
        return color_map

####################
# Utility functions
####################
'''
Difference between two lists
@return: all items of first that are not in second
'''
def diff(first, second):
    second = set(second)
    return [item for item in first if item not in second]

'''
Intersection of two lists
'''
def intersect(first, second):
    second = set(second)
    return [item for item in first if item in second]


####################
# Examples on how to use the library
####################
if __name__ == "__main__":
    
    DEBUG = False
    
    print('UML-Refactoring')
    uml = Graph(20, [   (1,7),(1,7),(2,8),(2,8),(2,9),
                        (2,9),(2,8),(2,7),(2,7),(1,7),
                        (1,7),(1,7),(1,7),(1,7),(1,7),
                        (1,7),(2,9),(0,5),(0,5),(0,5)], True, ["extractSuperclassAttr", "extractSuperclassRef", "flattenHierarchyAttr", "flattenHierarchyRef","mergeMetaclassAttr","mergeMetaclassRef", "mergeReference","moveAttribute","moveMethod","moveReference","pullUpAttribute","pullUpMethod","pullUpReference","pushDownAttribute","pushDownMethod","pushDownReference","removeMiddleMan","renameAttribute","renameMethod","renameReference"], name='UML')
    uml.set_order_heuristics(MinOutWeightHeuristic(MinDegreeHeuristic(MaxMultiWeightHeuristic(MinMultiWeightHeuristic()))))
    uml.set_adjacency_matrix([
        [0, 0, 2, 0,  3,  0,  0, 2, 0, 0, 2, 0, 0, 2, 0, 0,  0, 1, 0, 0],
        [0, 0, 0, 2,  0,  3,  3, 0, 0, 2, 0, 0, 2, 0, 0, 2,  3, 0, 0, 1],
        [2, 0, 0, 1,  3,  0,  0, 2, 0, 0, 2, 0, 0, 2, 0, 0,  0, 1, 0, 0],
        [0, 2, 1, 0,  0,  3,  3, 0, 0, 2, 0, 0, 2, 0, 0, 2,  3, 0, 0, 1],
        [6, 0, 6, 0,  0,  0,  0, 6, 0, 0, 6, 0, 0, 6, 0, 0,  0, 2, 0, 0],
        [0, 6, 0, 6,  0,  0, 10, 0, 0, 6, 0, 0, 6, 0, 0, 6, 10, 0, 0, 2],
        [0, 2, 0, 2,  0,  3,  0, 0, 0, 2, 0, 0, 2, 0, 0, 2,  3, 0, 0, 1],
        [2, 0, 2, 0,  3,  0,  0, 0, 0, 0, 2, 0, 0, 2, 0, 0,  0, 1, 0, 0],
        [0, 0, 0, 0,  0,  0,  0, 0, 0, 0, 0, 2, 0, 0, 2, 0,  0, 0, 1, 0],
        [0, 2, 0, 2,  0,  3,  3, 0, 0, 0, 0, 0, 2, 0, 0, 2,  3, 0, 0, 1],
        [2, 0, 2, 0,  3,  0,  0, 2, 0, 0, 0, 0, 0, 2, 0, 0,  0, 1, 0, 0],
        [0, 0, 0, 0,  0,  0,  0, 0, 2, 0, 0, 0, 0, 0, 2, 0,  0, 0, 1, 0],
        [0, 2, 0, 2,  0,  3,  3, 0, 0, 2, 0, 0, 0, 0, 0, 2,  3, 0, 0, 1],
        [2, 0, 2, 0,  3,  0,  0, 2, 0, 0, 2, 0, 0, 0, 0, 0,  0, 1, 0, 0],
        [0, 0, 0, 0,  0,  0,  0, 0, 2, 0, 0, 2, 0, 0, 0, 0,  0, 0, 1, 0],
        [0, 2, 0, 2,  0,  3,  3, 0, 0, 2, 0, 0, 2, 0, 0, 0,  3, 0, 0, 1],
        [0, 6, 0, 6,  0, 12, 10, 0, 0, 6, 0, 0, 6, 0, 0, 6,  0, 0, 0, 2],
        [0, 0, 0, 0,  0,  0,  0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0, 0, 0, 0],
        [0, 0, 0, 0,  0,  0,  0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0, 0, 0, 0],
        [0, 0, 0, 0,  0,  0,  0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0, 0, 0, 0]
        ])

    print(uml.dot(show_v_weight=True, show_degree=True, show_e_weight=True))
    uml.order_vertices(reverse_edges=True, debug=DEBUG)
    print(uml.ordered2str())
    
    ############################# Pacman-Pacman-Pacman
    print('Pacman')
    pacman = Graph(12, [(1,8),(1,8),(1,8),(1,8),(1,8),(1,7),(1,8),(1,8),(1,8),(1,8),(1,8),(1,8)], True, ["ghostmoves","ghostmovesbottom","ghostmovesleft","ghostmovesright","ghostmovesup","pacmandies","pacmaneatsfood","pacmanmoves","pacmanmovesbottom","pacmanmovesleft","pacmanmovesright","pacmanmovesup"], name='Pacman') 
    # (#nodes,[(#filters, #elements), ...]
    pacman.set_order_heuristics(MinOutWeightHeuristic(MinDegreeHeuristic(MaxMultiWeightHeuristic(MinMultiWeightHeuristic()))))
    # pacman.set_adjacency_matrix([
    #     [0, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0],
    #     [2, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0],
    #     [2, 2, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0],
    #     [2, 2, 2, 0, 2, 0, 0, 0, 0, 0, 0, 0],
    #     [2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0],
    #     [0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2],
    #     [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
    #     [0, 0, 0, 0, 0, 1, 0, 0, 2, 2, 2, 2],
    #     [0, 0, 0, 0, 0, 1, 0, 2, 0, 2, 2, 2],
    #     [0, 0, 0, 0, 0, 1, 0, 2, 2, 0, 2, 2],
    #     [0, 0, 0, 0, 0, 1, 0, 2, 2, 2, 0, 2],
    #     [0, 0, 0, 0, 0, 1, 0, 2, 2, 2, 2, 0]
    #     ])
    pacman.set_adjacency_matrix([
        [0, 6, 6, 6, 6, 0, 0, 0, 0, 0, 0, 0],
        [2, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0],
        [2, 2, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0],
        [2, 2, 2, 0, 2, 0, 0, 0, 0, 0, 0, 0],
        [2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0],
        [0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2],
        [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
        [0, 0, 0, 0, 0, 2, 0, 0, 6, 6, 6, 6],
        [0, 0, 0, 0, 0, 1, 0, 2, 0, 2, 2, 2],
        [0, 0, 0, 0, 0, 1, 0, 2, 2, 0, 2, 2],
        [0, 0, 0, 0, 0, 1, 0, 2, 2, 2, 0, 2],
        [0, 0, 0, 0, 0, 1, 0, 2, 2, 2, 2, 0]
        ])

    #print(pacman.dot(show_v_weight=True, show_degree=True))
    pacman.order_vertices(reverse_edges=True, debug=DEBUG)
    print(pacman.ordered2str())

    '''
    print('Oracle-Rule set 1')
    oracle1 = Graph(4, [(1,7),(1,7),(1,6),(3,9)], False, name='Oracle-Rule set 1') # (#nodes,[(#filters, #elements), ...]
    oracle1.set_order_heuristics(MinOutWeightHeuristic(MinDegreeHeuristic(MaxMultiWeightHeuristic(MinMultiWeightHeuristic()))))
    oracle1.set_adjacency_matrix([
        [0, 0, 1, 4],
        [0, 0, 0, 0],
        [2, 0, 0, 4],
        [6, 0, 3, 0]
        ])
    #print(oracle1.dot(show_v_weight=True, show_degree=True))
    oracle1.order_vertices(reverse_edges=True, debug=DEBUG)
    print(oracle1.ordered2str())
    
    print('Oracle-Rule set 2')
    oracle2 = Graph(4, [(2,8),(1,7),(1,8),(2,9)], True, v_names=['A','B','C','D'], name='Oracle-Rule set 2') # (#nodes,[(#filters, #elements), ...]
    oracle2.set_order_heuristics(MinOutWeightHeuristic(MinDegreeHeuristic(MaxMultiWeightHeuristic(MinMultiWeightHeuristic()))))
    oracle2.set_adjacency_matrix([
        [0, 0, 0, 10],
        [1, 0, 0,  1],
        [0, 0, 0,  0],
        [4, 0, 0,  0]
    ])
    #print(oracle2.dot(show_v_weight=True, show_e_weight=True))
    oracle2.order_vertices(reverse_edges=True, debug=DEBUG)
    print(oracle2.ordered2str())
    
    print('Oracle-Rule set 3')
    oracle3 = Graph(4, [(3,11),(2,9),(3,12),(4,13)], False, name='Oracle-Rule set 3') # (#nodes,[(#filters, #elements), ...]
    oracle3.set_order_heuristics(MinOutWeightHeuristic(MinDegreeHeuristic(MaxMultiWeightHeuristic(MinMultiWeightHeuristic()))))
    oracle3.set_adjacency_matrix([
        [0,  2, 0, 16],
        [2,  0, 0,  2],
        [0,  0, 0,  0],
        [16, 2, 0,  0]
        ])
    #print(oracle3.dot(show_v_weight=True, show_degree=True))
    oracle3.order_vertices(reverse_edges=True, debug=DEBUG)
    print(oracle3.ordered2str())

    print('Oracle-Rule set 4')
    oracle4 = Graph(4, [(3,8),(1,7),(1,8),(2,9)], False, name='Oracle-Rule set 4') # (#nodes,[(#filters, #elements), ...]
    oracle4.set_order_heuristics(MinOutWeightHeuristic(MinDegreeHeuristic(MaxMultiWeightHeuristic(MinMultiWeightHeuristic()))))
    oracle4.set_adjacency_matrix([
        [0, 2, 0, 16],
        [1, 0, 0,  1],
        [0, 0, 0,  0],
        [4, 0, 0,  0]
        ])
    #print(oracle4.dot(show_v_weight=True, show_degree=True, show_e_weight=True))
    oracle4.order_vertices(reverse_edges=True, debug=DEBUG)
    print(oracle4.ordered2str())
    
    print('Pacman2')
    pacman2 = Graph(6, [(1,7),(1,9),(1,12),(1,10),(1,10),(2,10)], True, v_names=['Eat','Move','Bottom','Left','Right','Up'], name='Pacman2') # (#nodes,[(#filters, #elements), ...]
    pacman2.set_order_heuristics(MinOutWeightHeuristic(MinDegreeHeuristic(MaxMultiWeightHeuristic(MinMultiWeightHeuristic()))))
    pacman2.set_adjacency_matrix([
        [0, 0, 0, 0, 0, 0],
        [0, 0, 6, 6, 6, 6],
        [0, 2, 0, 2, 2, 2],
        [0, 2, 2, 0, 2, 2],
        [0, 2, 2, 2, 0, 2],
        [0, 2, 2, 2, 2, 0]
    ])

    #print(pacman2.dot(show_v_weight=True, show_e_weight=True))
    pacman2.order_vertices(reverse_edges=True, debug=True)
    print(pacman2.ordered2str())
    
    lab = Graph(20, use_names=True, name='Lab', directed=False)
    lab.set_adjacency({
        'A':['B','C','D'],
        'B':['C','D'],
        'C':['D','N'],
        'F':['E'],
        'H':['G'],
        'I':['K'],
        'J':['L'],
        'K':['M'],
        'K':['L'],
        'I':['J'],
        'F':['G'],
        'M':['H'],
        'L':['H']
    })

    print(lab.dot_color())
    #lab.order_vertices(reverse_edges=True, debug=DEBUG)
    #print(lab.ordered2str())
    '''
