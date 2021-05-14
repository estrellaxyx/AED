package aed.loops;

public class Utils {
	public static int maxNumRepeated(Integer[] a, Integer elem) {
		int res =0;
		int contador = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i].equals(elem)) {
				contador++;
				if (i < a.length)
					i++;
			}
			if (contador > 0) {
				if (contador > res)
					res = contador;
				contador = 0;
			}
		}

		return res;
	}
		/*int res = 0;
		int pos = 0;
		int res2 = 0;
		int resf = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i].equals(elem)) {
				pos++;
				res2 = pos;
			} else {
				if (pos > 0) {
					if (pos > res)
						res = pos;
					pos = 0;
				}
			}
		}
		if (res2 >= res)
			resf = res2;
		else
			resf = res;

		return resf;
	}*/
}
