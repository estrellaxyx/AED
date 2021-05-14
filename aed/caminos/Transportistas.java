package aed.caminos;

import es.upm.aedlib.Entry;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.set.Set;
import es.upm.aedlib.set.PositionListSet;
import es.upm.aedlib.priorityqueue.PriorityQueue;
import es.upm.aedlib.priorityqueue.SortedListPriorityQueue;
import es.upm.aedlib.priorityqueue.HeapPriorityQueue;
import es.upm.aedlib.map.Map;
import es.upm.aedlib.map.HashTableMap;
import es.upm.aedlib.graph.Edge;
import es.upm.aedlib.graph.Vertex;
import es.upm.aedlib.graph.DirectedGraph;
import es.upm.aedlib.graph.DirectedAdjacencyListGraph;

public class Transportistas {
	private DirectedGraph<Point, Integer> graph;
	private Map<Point, Vertex<Point>> points2Vertices;

	public Transportistas(Integer[][] map) {
		graph = new DirectedAdjacencyListGraph<Point, Integer>();
		points2Vertices = new HashTableMap<Point, Vertex<Point>>();
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] != null) {
					insertVertex(new Point(i, j));
				}
			}
		}
		for (Vertex<Point> v : graph.vertices()) {
			buscarVecinos(map, v);
		}
	}

	private void buscarVecinos(Integer[][] map, Vertex<Point> vertice) {
		Point p = vertice.element();
		int x = p.getX();
		int y = p.getY();
		Point p2 = new Point(x + 1, y);
		if (points2Vertices.containsKey(p2)) {
			insertDirectedEdge(p, p2, Math.max(map[p2.getX()][p2.getY()] - map[p.getX()][p.getY()], 0) + 1);
		}
		p2 = new Point(x - 1, y);
		if (x - 1 >= 0 && points2Vertices.containsKey(p2)) {
			insertDirectedEdge(p, p2, Math.max(map[p2.getX()][p2.getY()] - map[p.getX()][p.getY()], 0) + 1);
		}
		p2 = new Point(x, y + 1);
		if (points2Vertices.containsKey(p2)) {
			insertDirectedEdge(p, p2, Math.max(map[p2.getX()][p2.getY()] - map[p.getX()][p.getY()], 0) + 1);
		}
		p2 = new Point(x, y - 1);
		if (y - 1 >= 0 && points2Vertices.containsKey(p2)) {
			insertDirectedEdge(p, p2, Math.max(map[p2.getX()][p2.getY()] - map[p.getX()][p.getY()], 0) + 1);
		}
	}

	private Vertex<Point> insertVertex(Point p) {
		Vertex<Point> v = graph.insertVertex(p);
		points2Vertices.put(v.element(), v);
		return v;
	}

	private void insertDirectedEdge(Point inicio, Point fin, Integer coste) {
		Vertex<Point> v1 = points2Vertices.get(inicio);
		Vertex<Point> v2 = points2Vertices.get(fin);
		graph.insertDirectedEdge(v1, v2, coste);
	}

	public PositionList<Point> pathFromTo(Point fromPoint, Point toPoint) {
		PositionList<Edge<Integer>> listaAristas = new NodePositionList<Edge<Integer>>();
		Vertex<Point> from = points2Vertices.get(fromPoint);
		Vertex<Point> to = points2Vertices.get(toPoint);
		listaAristas = caminoAristas(from, to, listaAristas);
		return caminoPuntos(fromPoint, toPoint, listaAristas);
	}

	private PositionList<Point> caminoPuntos(Point fromPoint, Point toPoint, PositionList<Edge<Integer>> listaAristas) {
		PositionList<Point> res = new NodePositionList<Point>();
		if (listaAristas.isEmpty() || listaAristas == null)
			return res;
		res.addFirst(graph.startVertex(listaAristas.first().element()).element());
		for (Edge<Integer> arista : listaAristas) {
			res.addLast(graph.endVertex(arista).element());
		}
		return res;

	}

	private PositionList<Edge<Integer>> caminoAristas(Vertex<Point> from, Vertex<Point> to,
			PositionList<Edge<Integer>> listaAristas) {
		if (from == to)
			return listaAristas;
		if (caminoContiene(listaAristas, from))
			return null;
		for (Edge<Integer> arista : graph.outgoingEdges(from)) {
			listaAristas.addLast(arista);
			PositionList<Edge<Integer>> lista = caminoAristas(graph.endVertex(arista), to, listaAristas);
			if (lista != null)
				return lista;
			else
				listaAristas.remove(listaAristas.last());
		}
		return null;
	}

	private boolean caminoContiene(PositionList<Edge<Integer>> lista, Vertex<Point> v) {
		for (Edge<Integer> arista : lista) {
			if (v == graph.startVertex(arista))
				return true;
		}
		return false;
	}

	public PositionList<Point> bestPathFromTo(Point fromPoint, Point toPoint) {
		PriorityQueue<Integer, Vertex<Point>> pq = new HeapPriorityQueue<Integer, Vertex<Point>>();
		Map<Vertex<Point>, Entry<Integer, Vertex<Point>>> vertices = new HashTableMap<Vertex<Point>, Entry<Integer, Vertex<Point>>>();
		Map<Vertex<Point>, Edge<Integer>> froms = new HashTableMap<Vertex<Point>, Edge<Integer>>();
		for (Vertex<Point> v : graph.vertices()) {
			if (v == points2Vertices.get(fromPoint))
				pq.enqueue(0, v);
			else
				pq.enqueue(Integer.MAX_VALUE, v);
		}
		for (Entry<Integer, Vertex<Point>> entrada : pq) {
			vertices.put(entrada.getValue(), entrada);
		}

		dijkstra(pq, vertices, froms);
		Vertex<Point> from = points2Vertices.get(fromPoint);
		Vertex<Point> to = points2Vertices.get(toPoint);
		return camino(from, to, froms);
	}

	private void dijkstra(PriorityQueue<Integer, Vertex<Point>> pq,
			Map<Vertex<Point>, Entry<Integer, Vertex<Point>>> vertices, Map<Vertex<Point>, Edge<Integer>> froms) {
		if (pq.isEmpty())
			return;
		Entry<Integer, Vertex<Point>> min = pq.dequeue();
		Vertex<Point> vMin = min.getValue();
		Integer costeMin = min.getKey();
		vertices.remove(vMin);
		for (Edge<Integer> e : graph.edges()) {
			if (vMin == graph.startVertex(e)) {
				Vertex<Point> vEnd = graph.endVertex(e);
				if (vertices.containsKey(vEnd)) {
					Entry<Integer, Vertex<Point>> entryEnd = vertices.get(vEnd);
					if (costeMin + e.element() < entryEnd.getKey()) {
						pq.replaceKey(entryEnd, costeMin);
					}
					froms.put(vMin, e);
				}
			}
		}
		dijkstra(pq, vertices, froms);
	}

	private PositionList<Point> camino(Vertex<Point> from, Vertex<Point> to, 
			Map<Vertex<Point>, Edge<Integer>> froms) {
		PositionList<Point> res = new NodePositionList<Point>();
		caminoRec(from, to, froms, res);
		return res;
	}
	private void caminoRec(Vertex<Point> from, Vertex<Point> to,
			Map<Vertex<Point>, Edge<Integer>> froms, 
			PositionList<Point> res) {
		if (from.equals(to)) {
			res.addLast(to.element());
			return ;
		}
		if(froms.containsKey(from)) {
			Edge<Integer> e = froms.get(from);
			res.addLast(from.element());
			caminoRec(graph.endVertex(e),to,froms,res);
		}else
			res = null;
	}
}