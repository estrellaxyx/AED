package aed.multisets;

import java.util.Iterator;

import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.positionlist.NodePositionList;

/**
 * An implementation of a multiset using a positionlist.
 */
public class MultiSetList<Element> implements MultiSet<Element> {

	/**
	 * Datastructure for storing the multiset.
	 */
	private PositionList<Pair<Element, Integer>> elements;

	private int size;

	/**
	 * Constructs an empty multiset.
	 */
	public MultiSetList() {
		this.elements = new NodePositionList<Pair<Element, Integer>>();
	}

	@Override
	/**
	 * crea una PositionList nueva con los elementos del multiconjunto, y devuelve
	 * su iterador
	 */
	public Iterator<Element> iterator() {
		PositionList<Element> lista = new NodePositionList<Element>();
		for (Pair<Element, Integer> p : elements) {
			for (int i = 0; i < p.getRight(); i++) {
				lista.addFirst(p.getLeft());
			}
		}
		return lista.iterator();
	}

	@Override
	/**
	 * anadir el elem al set
	 */
	public void add(Element elem) {
		add(elem, 1);

	}

	@Override
	/**
	 * anadir elem al set n veces
	 */
	public void add(Element elem, int n) throws IllegalArgumentException{
		if (n < 0)
			throw new IllegalArgumentException();
		if(n == 0)
			return;
		Position<Pair<Element, Integer>> pos = buscar(elem);
		if (pos == null) 
			elements.addFirst(new Pair<Element, Integer>(elem, n));
		else 
			pos.element().setRight(pos.element().getRight() + n);
		size += n;

	}

	@Override
	/**
	 * Borra un elemento
	 */
	public boolean remove(Element elem) {
		return remove(elem, 1);

	}

	@Override
	/**
	 * Borra elem n veces, si n>=nº de elem borra todo,
	 * True si se puede borrar y false si no se puede
	 */
	public boolean remove(Element elem, int n) throws IllegalArgumentException{
		if(n < 0)
			throw new IllegalArgumentException();
		if(n==0)
			return false;
		Position<Pair<Element, Integer>> pos= buscar(elem);
		if (pos == null)
			return false;
		int cantidad = count(elem);
		pos.element().setRight(cantidad-n);
		if(n >= cantidad) {
			elements.remove(pos);
		}
		size -= n>cantidad? cantidad: n;
		return true;
	}

	@Override
	/**
	 * nº de elementos
	 */
	public int count(Element elem) {
		Position<Pair<Element, Integer>> pos = buscar(elem);
		if (pos != null)
			return pos.element().getRight();
		return 0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	/**
	 * Interseccion de dos MultiSets, 
	 * s3.count(e) = min(s1.count(e), s2.count(e))
	 */
	public MultiSet<Element> intersection(MultiSet<Element> s) {
		MultiSet<Element> res = new MultiSetList<Element>();
		if (this.isEmpty() || s.isEmpty())
			return res;
		boolean encontrado;
		Iterator<Element> it;
		Element e;
		for (Pair<Element, Integer> p : elements) {
			encontrado = false;
			it = s.iterator();
			while (it.hasNext() && !encontrado) {
				e = p.getLeft();
				encontrado = evaluar(e, it.next());
				if (encontrado) {
					res.add(e, Math.min(this.count(e), s.count(e)));
				}
			}
		}
		return res;
	}

	@Override
	/**
	 * Union de dos multiSets,
	 * s3.count(e) = s1.count(e) + s2.count(e)
	 */
	public MultiSet<Element> sum(MultiSet<Element> s) {
		MultiSet<Element> res = new MultiSetList<Element>();
		Iterator<Element> it = s.iterator();
		while(it.hasNext()) {
			res.add(it.next());
		}
		for (Pair<Element,Integer> p : elements) {
			res.add(p.getLeft(), p.getRight());
		}
		return res;
	}

	/**
	 * Metodo auxiliar para evaluar si dos elementos de tipo Element son iguales
	 * @param elem1
	 * @param elem2
	 * @return
	 */
	private boolean evaluar(Element elem1, Element elem2) {
		boolean iguales = false;
		if (elem1 == null && elem2 == null)
			iguales = true;
		else if (elem1 != null && elem2 != null)
			iguales = elem1.equals(elem2);
		return iguales;
	}

	/**
	 * Metodo auxiliar, devuelve la posicion del par de elements
	 * @param e
	 * @return
	 */
	private Position<Pair<Element, Integer>> buscar(Element e) {
		Position<Pair<Element,Integer>> cursor = elements.first();
		boolean encontrado = false;
		while(cursor!=null && !encontrado) {
			encontrado = evaluar(e, cursor.element().getLeft());
			cursor = encontrado? cursor: elements.next(cursor);
		}
		return encontrado? cursor: null;
	}
}
