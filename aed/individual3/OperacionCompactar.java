package aed.individual3;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;

public class OperacionCompactar {

	/**
	 * Metodo que reduce los elementos iguales consecutivos de una lista a una unica
	 * repeticion
	 * 
	 * @param lista Lista de entrada
	 * @return Lista nueva compactada sin elementos iguales consecutivos
	 */
	public static <E> PositionList<E> compactar(PositionList<E> lista) throws IllegalArgumentException {
		PositionList<E> res= new NodePositionList<E>();
		
		if(lista == null)
			throw new IllegalArgumentException();
		
		
			Position<E> cursor = lista.first();
			if (cursor != null) {
				res.addFirst(cursor.element());
				for (int i = 0; i < lista.size() - 1 && !lista.isEmpty(); i++) {
					if (res.last().element() != null && res.last().element().equals(cursor.element())) {
						cursor = lista.next(cursor);
					} else if (res.last().element() != null && !res.last().element().equals(cursor.element())) {
						res.addLast(cursor.element());
					}
				}
			}
		
		
		return res;
	}

		/*PositionList<E> res = new NodePositionList<E>();
		if (lista == null)
			throw new IllegalArgumentException();
		else if (lista.isEmpty())
			return res;
		else if (lista.size() == 1) {
			res.addLast(lista.first().element());
			return res;
		} else {
			Position<E> cursor = lista.first();
			int pos = 0;
			int veces = 0;
			Position<E> siguiente = lista.next(cursor);
			E eCursor;
			E eSig;
			while(pos < lista.size()-1) {
				eCursor = cursor.element();
				eSig = siguiente.element();
				if (eCursor == null && eSig == null
						||(eCursor != null && eSig != null && eSig.equals(eCursor))) {
					veces++;
					siguiente = lista.next(siguiente);
				} else if (eCursor == null || eSig == null
						|| (eCursor != null && eSig != null && ! eSig.equals(eCursor))) {
					res.addLast(eCursor);
					for(int i = 0; i<=veces; i++) {
						cursor = lista.next(cursor);
					}
					veces = 0;
					siguiente = lista.next(cursor);
				}
				pos++;
				if(lista.next(cursor) == null || siguiente == null)
					res.addLast(cursor.element());
			}
			return res;
		}*/
}

