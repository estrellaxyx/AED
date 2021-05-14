package aed.individual6;

import es.upm.aedlib.graph.Edge;
import es.upm.aedlib.graph.Vertex;
import es.upm.aedlib.Entry;
import es.upm.aedlib.graph.DirectedGraph;
import es.upm.aedlib.map.Map;
import es.upm.aedlib.map.HashTableMap;

public class Suma {
	
	public static <E> Map<Vertex<Integer>, Integer> sumVertices(DirectedGraph<Integer, E> g) {
		Map<Vertex<Integer>, Integer> res = new HashTableMap<Vertex<Integer>, Integer>();
		int suma;
		//recorrer todos los vertices del grafo g
		for (Vertex<Integer> vertice : g.vertices()) {
			//renovar el valor de la suma de vertices para cada vertice distinto
			suma = 0;
			//recorrer las entradas de los vertices alcanzables(incluye si mismo)
			for(Entry<Vertex<Integer>, Integer> entradas : verticesAlcanzables(g, vertice).entries())
				//anadir el valor del elemento que contiene cada vertice a la suma. 
				suma += entradas.getValue();
			//lo anado en el mapa devuelto
			res.put(vertice, suma);
		}
		return res;
	}

	/**
	 * metodo auxiliar para guardar todos los vertices alcanzables de startVertice
	 * @param <E>
	 * @param g
	 * @param startVertice
	 * @return un mapa donde el key es el vertice alcanzable y el valor es el elemento que contiene.
	 */
	private static <E> Map<Vertex<Integer>,Integer> verticesAlcanzables(DirectedGraph<Integer, E> g, Vertex<Integer> startVertice) {
		Map<Vertex<Integer>, Integer> vertices = new HashTableMap<Vertex<Integer>, Integer>();
		verticesAlcanzables(g, startVertice, vertices);
		return vertices;
	}

	private static <E> void verticesAlcanzables(DirectedGraph<Integer, E> g, Vertex<Integer> startVertice, Map<Vertex<Integer>,Integer> vertices) {
		if (vertices.containsKey(startVertice)) {
			//caso base para ciclos: el mapa ya contiene el vertice con el que empezamos
			return;
		}
		//anadimos el vertice al mapa
		vertices.put(startVertice,startVertice.element());
		//usamos un for-each para recorrer todas las aristas salientes de dicho vertice
		//y ademas si el vertice no tiene aristas salientes el metodo acaba. 
		for (Edge<E> aristas : g.outgoingEdges(startVertice)) {
			//recursividad de los vertices que son los finales de las aristas 
			//para ver si son alcanzables y anadirlos en el mapa
			verticesAlcanzables(g, g.endVertex(aristas), vertices);
		}
	}
}
