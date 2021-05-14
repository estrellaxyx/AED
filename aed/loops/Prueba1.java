package aed.loops;

import aed.loops.TesterInd1.MaxNumRepeated;

public class Prueba1 {

	public static void main(String[] args) {
		int[] test1 = { 1,3 };
		int elem = 1;
		System.out.println(maxNumRepeated(test1, elem));

	}

	public static int maxNumRepeated(int[] a, int elem) {
		int res = 0;
		int pos = 0;
		int res2 = 0;
		int resf = 0;
		boolean esta = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i]==(elem))
				esta = true;

			if (esta) {
				pos++;
				res2 = pos;
				System.out.println(res2+".");
			} else {
				if (pos > 0) {
					res = pos;
					pos = 0;
					System.out.println(res+",");
				}
			}
		}
		if (res2 >= res)
			resf = res2;
		else
			resf = res;

		return resf;
	}

}
