package aed.positionlist;

import java.util.Comparator;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;

public class Prueba_cuaderno {

	public static <E> PositionList<E> ordenar(PositionList<E> list, Comparator<E> cmp){
		PositionList<E> ordenacion = new NodePositionList<E>();
		Position<E> cursor = list.first();
		E eCursor = cursor.element();
		while(cursor != null) {
			ordenacion.addLast(eCursor);
		}
		Position<E> cursor1 = ordenacion.first();
		E eCursor1 = cursor1.element();
		Position<E> siguiente = ordenacion.next(cursor1);
		E eSig = siguiente.element();
		
		while(cursor != null) {
			if(cmp.compare(eCursor1, eSig)>0) {
				ordenacion.set(cursor1, eSig);
				ordenacion.set(siguiente, eCursor1);
			}
			cursor1 = ordenacion.next(cursor1);
		}
		return ordenacion;
		
	}
	public static void main(String[] args) {
		PositionList<Integer> l1 = new NodePositionList<Integer>();
		l1.addLast(1);
		l1.addLast(0);
		l1.addLast(9);
		l1.addLast(5);
		l1.addLast(4);
		l1.addLast(7);
		
		Comparator<Integer> cm = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1>o2)
					return 1;
				else if(o1 == o2)
					return 0;
				else
					return -1;
			}
		};
		System.out.println(ordenar(l1,cm));
	}

}
