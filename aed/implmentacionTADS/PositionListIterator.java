package aed.implmentacionTADS;

import es.upm.aedlib.Position;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ConcurrentModificationException;
import java.lang.UnsupportedOperationException;

/**
 * Implements an iterator over a PositionList
 * @author aed 
 *
 * @param <E> The type of the element contained in the list
 */
public class PositionListIterator<E> implements Iterator<E> {

	private PositionList<E> list;
	private Position<E> cursor;

	// Attributes for detecting changes to underlying datastructure
	// while iterating
	private NodePositionList<?> nlist;
	final long changeCounter;

	public PositionListIterator(PositionList<E> list) {
		if (list == null ) {
			throw new IllegalArgumentException ("The list cannot be null"); 
		}
		this.list   = list;
		this.cursor = list.first();

		if (list instanceof NodePositionList<?>) {
			this.nlist = (NodePositionList<?>) list;
			this.changeCounter = nlist.changeCounter;
		}
		else {
			nlist = null;
			changeCounter = 0;
		}
	}

	public boolean hasNext() { 
		return cursor != null; 
	}

	public E next() throws NoSuchElementException, ConcurrentModificationException {
		// Signal modifications to underlying datastructure
		// while iterating
		if (nlist != null && changeCounter != nlist.changeCounter)
			throw new ConcurrentModificationException();

		if (cursor == null) {
			throw new NoSuchElementException();
		}
		E e = cursor.element();
		cursor = list.next(cursor);
		return e;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}










