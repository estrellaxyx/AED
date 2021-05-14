package aed.indexedlist;

import java.lang.reflect.Array;

import es.upm.aedlib.indexedlist.*;

public class Utils {
	public static <E> IndexedList<E> deleteRepeated(IndexedList<E> l) {
		IndexedList<E> res = new ArrayIndexedList<E>();
		for (int i = 0; i < l.size(); i++) {
			res.add(i, l.get(i));
		}

		for (int i = 0; i < res.size(); i++) {
			for (int j = res.size() - 1; j > i; j--) {
				if ((res.get(j)).equals(res.get(i)))
					res.removeElementAt(j);
			}
		}

		return res;
	}
}
