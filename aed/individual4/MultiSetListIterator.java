package aed.individual4;

import java.util.Iterator;
import java.util.NoSuchElementException;

import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;

public class MultiSetListIterator<E> implements Iterator<E> {
	PositionList<Pair<E, Integer>> list;

	Position<Pair<E, Integer>> cursor;
	int counter;
	Position<Pair<E, Integer>> prevCursor;
	boolean puedeEliminar;

	public MultiSetListIterator(PositionList<Pair<E, Integer>> list) {
		this.list = list;
		this.cursor = list.first(); // posicion del iterador
		if (!list.isEmpty()) {
			this.counter = cursor.element().getRight(); // numero del elemento dentro de la posicion
			this.prevCursor = this.list.prev(cursor);// guardar la posicion del elemento devuelto por next()
		}
		this.puedeEliminar = false;// mirar si ha llamado un next antes de remove
	}

	public boolean hasNext() {
		return cursor != null;
	}

	public E next() {
		if (!hasNext())
			throw new NoSuchElementException();
		prevCursor = cursor;
		counter--;
		if (counter <= 0) {
			cursor = list.next(cursor);
			if (cursor != null)
				counter = cursor.element().getRight();
		}
		puedeEliminar = true;
		return prevCursor.element().getLeft();
	}

	public void remove() {
		// opcionalmente se puede modificar para obtener mas puntos
		// NO ES OBLIGATORIO
		if (!puedeEliminar)
			throw new IllegalStateException();
		if (prevCursor != null && puedeEliminar) {
			prevCursor.element().setRight(prevCursor.element().getRight() - 1);
			if (prevCursor.element().getRight() <= 0)
				list.remove(prevCursor);
			puedeEliminar = false;
		}
	}
}
