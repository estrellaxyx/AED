package aed.grafos;

import es.upm.aedlib.Entry;
import es.upm.aedlib.graph.Edge;
import es.upm.aedlib.graph.UndirectedAdjacencyListGraph;
import es.upm.aedlib.graph.UndirectedGraph;
import es.upm.aedlib.graph.Vertex;
import es.upm.aedlib.map.HashTableMap;
import es.upm.aedlib.map.Map;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.priorityqueue.HeapPriorityQueue;
import es.upm.aedlib.priorityqueue.PriorityQueue;
import es.upm.aedlib.set.HashTableMapSet;
import es.upm.aedlib.set.Set;

public class EjemplosGrafo {

	/**
	 * imprime los nodos (cada nodo solo una vez!) alcanzables desde from.
	 * 
	 * @param <V>
	 * @param <E>
	 * @param g
	 * @param from
	 */
	public static <V, E> void printReachable(UndirectedGraph<V, E> g, Vertex<V> from) {
		// PriorityQueue<Integer, V> nodos = new HeapPriorityQueue<Integer, V>();
		// Map<Vertex<V>, Entry<Integer,Vertex<V>>> tabla = new HashTableMap <Vertex<V>,
		// Entry<Integer,Vertex<V>>>();
		Set<Vertex<V>> nodosAlc = new HashTableMapSet<Vertex<V>>();
		printReachableRec(g, from, nodosAlc);
		System.out.print("Vertice " + from + ": " + nodosAlc.toString() + "\t");
		System.out.println();

	}

	private static <V, E> void printReachableRec(UndirectedGraph<V, E> g, Vertex<V> from, Set<Vertex<V>> nodosAlc) {
		for (Edge<E> arista : g.edges(from)) {
			Vertex<V> vertice = g.opposite(from, arista);
			if (!nodosAlc.contains(vertice)) {
				nodosAlc.add(vertice);
				printReachableRec(g, vertice, nodosAlc);
			}
		}

	}

	/**
	 * devuelve un camino entre from y to, y null si no existe ningun camino.
	 * 
	 * @param <V>
	 * @param <E>
	 * @param g
	 * @param from
	 * @param to
	 * @return
	 */
	public static <V, E> PositionList<Vertex<V>> findPath(UndirectedGraph<V, E> g, Vertex<V> from, Vertex<V> to) {
		PositionList<Vertex<V>> lista = new NodePositionList<Vertex<V>>();
		findPathRec(g, from, to, lista);
		lista.addFirst(from);
		if (lista.size() == 1)
			return null;
		return lista;

	}

	private static <V, E> void findPathRec(UndirectedGraph<V, E> g, Vertex<V> from, Vertex<V> to,
			PositionList<Vertex<V>> lista) {
		if (g.isEmpty())
			return;

		for (Edge<E> arista : g.edges(from)) {
			if (lista.isEmpty() || lista.last() == null || !lista.last().equals(to)) {
				Vertex<V> vertice = g.opposite(from, arista);
				if (g.areAdjacent(vertice, to) || vertice.equals(to)) {
					lista.addFirst(to);
					findPathRec(g, from, vertice, lista);
				} else
					findPathRec(g, vertice, to, lista);
			}
		}
	}

	static <V, E> Set<Vertex<V>> getVerticesAlcanzables(UndirectedGraph<V, E> g, Vertex<V> n) {
		Set<Vertex<V>> visited = new HashTableMapSet<Vertex<V>>();
		getVerticesAlcanzablesRec(g, n, visited);
		return visited;
	}

	static <V, E> void getVerticesAlcanzablesRec(UndirectedGraph<V, E> g, Vertex<V> n, Set<Vertex<V>> visited) {
		if (visited.contains(n)) {
			return;
		}
		visited.add(n);
		for (Edge<E> e : g.edges(n)) {
			getVerticesAlcanzablesRec(g, g.opposite(n, e), visited);
		}
	}

	public static void main(String[] args) {
		UndirectedGraph<String, Integer> g = new UndirectedAdjacencyListGraph<String, Integer>();
		Vertex<String> v1 = g.insertVertex("1");
		Vertex<String> v2 = g.insertVertex("2");
		Vertex<String> v3 = g.insertVertex("3");
		Vertex<String> v4 = g.insertVertex("4");
		Vertex<String> v5 = g.insertVertex("5");
		Vertex<String> v6 = g.insertVertex("6");
		g.insertUndirectedEdge(v1, v2, 5);
		g.insertUndirectedEdge(v1, v3, 3);
		g.insertUndirectedEdge(v2, v4, 6);
		g.insertUndirectedEdge(v3, v4, 4);
		g.insertUndirectedEdge(v4, v5, 9);
		printReachable(g, v1);
		printReachable(g, v6);

		//findPath(g, v1, v5);
		System.out.println(g.toString());
		System.out.println(getVerticesAlcanzables(g,v1));
	}

}
