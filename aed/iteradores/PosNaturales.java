package aed.iteradores;

import java.util.Set;
import java.util.HashSet;

public class PosNaturales {

	public static Set<Integer> posNats(int limit) {
		Set<Integer> l = new HashSet<Integer>();
		l.add(0);
		int preSize = 0;
		int postSize = l.size();
		do {
			preSize=l.size();
			//creamos una nueva lista 
			Set<Integer> added = new HashSet<Integer>();
			for (Integer i : l) {//for-each
				if (i + 2 < limit)
					l.add(i + 2);
				/*if (i + 4 < limit)
					l.add(i+4);
					//si anadimos esto, se va a lanzar la excepcion
					*/
			}
			l.addAll(added);
			postSize = l.size();
		} while (postSize != preSize);
		//puede salir error en el return si se detecta que entra un bucle infinito
		return l;
	}
	
	public static void main(String[] args) {
		System.out.println(posNats(10));
	}
}
