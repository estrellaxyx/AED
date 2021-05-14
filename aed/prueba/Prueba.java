package aed.prueba;

import es.upm.aedlib.Entry;
import es.upm.aedlib.graph.DirectedAdjacencyListGraph;
import es.upm.aedlib.graph.DirectedGraph;
import es.upm.aedlib.graph.Edge;
import es.upm.aedlib.graph.Vertex;
import es.upm.aedlib.map.HashTableMap;
import es.upm.aedlib.map.Map;

public class Prueba {

	public static <E> void main(String[] args) {
		DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
		Vertex<Integer> v_0 = graph.insertVertex(5) ;
		  Vertex<Integer> v_1 = graph.insertVertex(4) ;
		  Vertex<Integer> v_2 = graph.insertVertex(5) ;
		  graph.insertDirectedEdge(v_2,v_1,null) ;
		  graph.insertDirectedEdge(v_1,v_0,null) ;
		  graph.insertDirectedEdge(v_0,v_2,null) ;

	}
	
	public static <E> Map<Vertex<Integer>, Integer> sumVertices(DirectedGraph<Integer, E> g) {
		Map<Vertex<Integer>, Integer> res = new HashTableMap<Vertex<Integer>, Integer>();
		int suma;
		for (Vertex<Integer> vertice : g.vertices()) {
			suma = 0;
			for(Entry<Vertex<Integer>, Integer> entries : reachableVertices(g, vertice).entries())
			suma += entries.getValue();
			res.put(vertice, suma);
			/*res.put(vertice, vertice.element());
			if (g.outDegree(vertice) > 0) {
				int suma = vertice.element();
				for (Edge<E> edges : g.outgoingEdges(vertice)) {
					suma += g.endVertex(edges).element();
				}
				res.put(vertice, suma);
			}*/
			System.out.println(res.get(vertice));
		}
		
		return res;
	}
	public static <E> Map<Vertex<Integer>,Integer> reachableVertices(DirectedGraph<Integer, E> g, Vertex<Integer> startVertex) {
		Map<Vertex<Integer>, Integer> vertices = new HashTableMap<Vertex<Integer>, Integer>();
		visit(g, startVertex, vertices);
		return vertices;
	}

	private static <E> void visit(DirectedGraph<Integer, E> g, Vertex<Integer> vertex, Map<Vertex<Integer>,Integer> vertices) {
		if (vertices.containsKey(vertex)) {
			return;
		}
		vertices.put(vertex,vertex.element());
		for (Edge<E> edge : g.outgoingEdges(vertex)) {
			visit(g, g.endVertex(edge), vertices);
		}
	}

}
