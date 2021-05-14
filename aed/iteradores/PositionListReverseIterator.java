package aed.iteradores;

import java.util.Iterator;
import java.util.NoSuchElementException;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;

public class PositionListReverseIterator implements Iterator<Integer> {
	private PositionList<Integer> l;
	private Position<Integer> cursor;

	public PositionListReverseIterator(PositionList<Integer> l) {
		this.l = l;
		this.cursor = l.last();
	}

	@Override
	public boolean hasNext() {
		return l.prev(cursor) != null;
	}

	@Override
	public Integer next() throws NoSuchElementException{
		Integer res = null;
		if(cursor == null)
			throw new NoSuchElementException();
		res = cursor.element();
		cursor = l.prev(cursor);
		return res;
	}

	public void remove() throws NoSuchElementException{
		Position<Integer> p = cursor;
		cursor = l.prev(cursor);
		if (hasNext())
			l.remove(p);
		if(p == null)
			throw new NoSuchElementException();
			
	}

	public void add() {
		Position<Integer> p = cursor;
		cursor = l.prev(cursor);
		if (hasNext())
			l.addAfter(cursor, p.element());
	}

	public static <Integer> PositionList<Integer> reverse(PositionList<Integer> l) {
		PositionList<Integer> inverso = new NodePositionList<Integer>();
		Iterator<Integer> it = l.iterator();
		while (it.hasNext()) {
			inverso.addFirst(it.next());
		}
		return inverso;

	}

	public static int numElemens(PositionList<Integer> l, Integer elem) {
		int res = 0;
		Iterator<Integer> it = l.iterator();
		while (it.hasNext()) {
			if (elem.equals(it.next()) && it.next() != null)
				res++;
		}

		return res;
	}

	public static void main(String[] args) {
		PositionList<Integer> lista = new NodePositionList<Integer>();
		lista.addFirst(0);
		lista.addLast(1);
		lista.addLast(2);
		System.out.println(reverse(lista));
		System.out.println(numElemens(lista, 1));
		
		Iterator<Integer> it = new PositionListReverseIterator(lista);
		// Devolverá los elementos en orden inverso
		while(it.hasNext()) {
			System.out.print(it.next()+"\t");
		}

	}

}
