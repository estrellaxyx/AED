package aed.recursion;

import java.util.Iterator;

import es.upm.aedlib.Position;
import es.upm.aedlib.indexedlist.ArrayIndexedList;
import es.upm.aedlib.indexedlist.IndexedList;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;

public class NumerosRecusion {

	public static void main(String[] args) {
		System.out.println(sum(1, 5));
		System.out.println(sum(5, 5, 5));
		System.out.println(isPrime(4));
		System.out.println(decToBinario(77));
		System.out.println(decToHex(30));
		Integer[] array = { 1, 2, 3, 4, 5 };
		System.out.println(search(array, 3));
		IndexedList<Integer> inList = new ArrayIndexedList<Integer>();
		inList.add(0, 1);
		inList.add(1, 2);
		inList.add(2, 3);
		inList.add(3, 4);
		inList.add(4, 5);
		inList.add(5, 6);
		System.out.println(search(inList, 2));
		PositionList<Integer> posList = new NodePositionList<Integer>();
		posList.addLast(1);
		posList.addLast(2);
		posList.addLast(3);
		posList.addLast(4);
		posList.addLast(5);
		posList.addLast(6);
		System.out.println(search(posList, -1));
		int[] array2 = { 0, 3, 1, 2, 3 };
		System.out.println(decimalToNat(array2));
		System.out.println(media(array2));
		PositionList<Integer> posList2 = new NodePositionList<Integer>();
		posList2.addLast(null);
		posList2.addLast(null);
		posList2.addLast(null);
		posList2.addLast(null);
		posList2.addLast(null);
		posList2.addLast(6);
		System.out.println(allNull(posList2));
		System.out.println(countNull(posList2));
		duplicateBigNums(posList, 3);
		System.out.println(posList.toString());
		System.out.println(natToDecimal(123));
		multiplyAdnClean(posList2, 3);
		System.out.println(posList2);
		System.out.println(copiarHastaElem(posList, 9));
		PositionList<Integer> posList3 = new NodePositionList<Integer>();
		posList.addLast(1);
		posList.addLast(2);
		posList.addLast(3);
		posList.addLast(8);
		posList.addLast(9);
		System.out.println(merge(posList, posList3));
		delete(posList, posList.first(), posList.next(posList.first()));
		System.out.println(posList);
	}

	public static int sum(int i, int j) {// sin recursion de cola
		if (i > j)
			return sum(j, i);
		else if (i == j)
			return j;
		else {
			return i + sum(i + 1, j);
		}
	}

	// la entrada de r =i
	public static int sum(int r, int i, int j) {// con recursion de cola
		if (i > j)
			return sum(j, i);
		else if (i == j)
			return r;
		else {
			return r + sum(i + 1, j);
		}
	}

	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		else if (n == 2)
			return true;
		else
			return isPrime(n, 2);
	}

	private static boolean isPrime(int n, int a) {// entrada de a = 2
		boolean res = true;
		if (n % a == 0)
			return false;
		else {
			res = isPrime(n, a + 1);
			if (a > Math.sqrt(n) - 1)
				res = true;
		}
		return res;

	}

	public static String decToBinario(int n) {
		String res = "";
		if (n < 2)
			return n + "";
		// 11/2=5...1/2=2...1/2=1...0
		// 11=1011
		// 10/2=5...0/2=2...1/2=1...0
		res = n % 2 + res;
		res = decToBinario(n / 2) + res;
		return res;
	}

	public static String decToHex(int n) {
		String[] arr = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };
		if (n < 16)
			return arr[n];
		else {
			String res = arr[n % 16];
			res = decToHex(n % 16);
			return res;
		}
	}

	public static <E> int search(E[] list, E elem) {
		return searchElem(list, elem, 0, list.length - 1);

	}

	private static <E> int searchElem(E[] list, E elem, int first, int last) {
		if (last < 1)
			return -1;
		if (list[first].equals(elem))
			return first;
		if (list[last].equals(elem))
			return last;
		return searchElem(list, elem, first + 1, last - 1);
	}

	public static <E> int search(IndexedList<E> list, E elem) {
		return searchElem(list, elem, 0, list.size() - 1);
	}

	private static <E> int searchElem(IndexedList<E> list, E elem, int first, int last) {
		if (last < 1)
			return -1;
		if (list.get(first).equals(elem))
			return first;
		if (list.get(last).equals(elem))
			return last;
		return searchElem(list, elem, first + 1, last - 1);
	}

	public static <E> Position<E> search(PositionList<E> list, E elem) {
		return searchElem(list, elem, list.first());
	}

	private static <E> Position<E> searchElem(PositionList<E> list, E elem, Position<E> cursor) {
		return cursor == null || cursor.element().equals(elem) ? cursor : searchElem(list, elem, list.next(cursor));
	}

	/**
	 * Dado un array arr de numeros naturales 0  n  9 escrito en notacion decimal
	 * calcula el numero entero que corresponde. Por ejemplo, si arr = [0 ,0 ,1 ,2
	 * ,3] decimalToNat (arr ) =>0*1000+0*1000+1*100+2*10+3 = 123
	 * 
	 * @param arr solo tiene numeros de 0 a 9
	 * @return
	 */
	public static int decimalToNat(int[] arr) {
		return decimalToNat(arr, arr.length - 1, 1);
	}

	private static int decimalToNat(int[] arr, int indice, int n) {
		if (indice == 0)
			return arr[0] * n;
		else if (indice >= 1)
			return arr[indice] * n + decimalToNat(arr, indice - 1, n * 10);
		return -1;
	}

	public static int media(int[] arr) {
		return suma(arr, 0) / arr.length;
	}

	private static int suma(int[] arr, int indice) {
		if (indice <= arr.length - 1) {
			return arr[indice] + suma(arr, indice + 1);
		} else
			return -1;
	}

	public static <X> boolean allNull(PositionList<X> l) {
		if (l.isEmpty() || l == null)
			return false;

		return allNull(l, l.first());
	}

	private static <X> boolean allNull(PositionList<X> l, Position<X> cursor) {
		if (cursor != null) {
			if (cursor.element() == null && cursor.equals(l.last()))
				return true;
			else if (cursor.element() == null && !cursor.equals(l.last()))
				return allNull(l, l.next(cursor));
			else
				return false;
		}
		return false;
	}

	public static <X> int countNull(PositionList<X> l) {
		if (l.isEmpty() || l == null)
			return -1;
		return countNull(l, l.first());
	}

	private static <X> int countNull(PositionList<X> l, Position<X> cursor) {
		if (cursor != null) {
			if (cursor.element() == null)
				return 1 + countNull(l, l.next(cursor));
			else
				return countNull(l, l.next(cursor));
		}
		return 0;
	}

	/**
	 * duplica todos los numeros en list que son majores que n. list no contiene
	 * nulls. Si list =[1 ,10 ,2 ,6 ,4 ,5 ,10 ,7 ,1] y llamamos duplicateBigNums
	 * (list ,6) despues list =[1 ,10 ,10 ,2 ,6 ,4 ,5 ,10 ,10 ,7 ,7 ,1]
	 * 
	 * @param list
	 * @param n
	 */
	public static void duplicateBigNums(PositionList<Integer> list, int n) {
		if (list.isEmpty() || list == null)
			return;
		duplicateBigNums(list, n, list.first());
	}

	private static void duplicateBigNums(PositionList<Integer> list, int n, Position<Integer> cursor) {
		if (cursor != null) {
			if (cursor.element() > n)
				list.addBefore(cursor, cursor.element());
			duplicateBigNums(list, n, list.next(cursor));
		}
	}
	/**
	 * Dado un numero natural n 
	 * devuelve una positionlist en notacion decimal 
	 * con los numeros naturales 0  x  9 que corresponde. 
	 * Por ejemplo:
	 * natToDecimal (0) => [0]
	 * natToDecimal (123) => [1 ,2 ,3]
	 * @param n
	 * @return
	 */
	public static PositionList<Integer> natToDecimal(int n){
		PositionList<Integer> res = new NodePositionList<Integer>();
			return natToDecimal(n, res);
	}
	private static PositionList<Integer> natToDecimal(int n, PositionList<Integer> res){
		if(n<10)
			res.addFirst(n);
		else {
			res.addFirst(n%10);
			return natToDecimal(n/10);
		}
		return res;
	}
	
	//Comprobacion de examen
	public static void multiplyAdnClean(PositionList<Integer> list, int n) {
		if(list.isEmpty())
			return ;
		Position<Integer> cursor = list.first();
		while(cursor != null) {
			Position<Integer> aux = cursor;
			cursor = list.next(cursor);
			if(aux.element() !=null)
				list.set(aux, aux.element()*n);
			else
				list.remove(aux);
		}
	}
	
	public static Integer primerDesordenado(Iterable<Integer> iterable) {
		//Integer res =  null;
		Iterator<Integer> it = iterable.iterator();
		if(! it.hasNext()) return null;
		Integer prev = it.next();
	    while (it.hasNext()) {
	        Integer curr = it.next();
	        if (prev.compareTo(curr)>0) {
	            return curr;
	        }
	        prev = curr;
	    }
	    
	    return null;
	}
	
	public static <E> PositionList<E> copiarHastaElem(PositionList<E> list, E elem){
		PositionList<E> res = new NodePositionList<E>();
		if(list == null)
			throw new IllegalArgumentException();
		boolean found = false;
		Position<E> cursor = list.first();
		while(cursor != null && ! found) {
			if(elem.equals(cursor.element()))
				found = true;
			else
				cursor = list.next(cursor);
		}
		if(found == false) {
			Position<E> aux  = list.first();
			while(aux != null) {
				res.addLast(aux.element());
				aux = list.next(aux);
			}
			return res;
		}
		copiarHastaElemRec(list,elem,list.first(),res);
		return res;
	}

	private static <E> void copiarHastaElemRec(PositionList<E> list, 
												E elem, 
												Position<E> cursor, 
												PositionList<E> res) {
		if(cursor.element().equals(elem))
			return ;
		res.addLast(cursor.element());
		copiarHastaElemRec(list, elem, list.next(cursor), res);
		
	}

	/**
	 * si l1=[1,2,3,8,9] y l2=[2,4,10] la lista nueva
	 * deberia ser [1,2,2,3,4,8,9,10]. 
	 * Las listas nuncan contienen nulls.
	 */
	public static <E extends Comparable <E>> PositionList <E> merge(PositionList <E> l1 ,
																	PositionList <E> l2) {
		Position<E> cursor1 = l1.first();
		Position<E> cursor2 = l2.first();
		PositionList<E> res = new NodePositionList<E>();
		while(cursor1 != null) {
			res.addLast(cursor1.element());
			cursor1 = l1.next(cursor1);
		}
		Position<E> cursor3 = res.first();
		while(cursor2 != null) {
			while(cursor3 != null) {
				if(cursor2.element().compareTo(cursor3.element())>=0 && cursor2.element().compareTo(res.next(cursor3).element())<0) {
					res.addAfter(cursor3, cursor2.element());
				}
				cursor2 = l2.next(cursor2);
				cursor3 = res.next(cursor3);
			}
		}
		return res;
	}
	
	public static <E> void delete(PositionList<E> list, Position<E> pos1, Position<E> pos2) {
		Position<E> aux = pos1;
		Position<E> aux2 =pos2;
		if(pos1==pos2)
			list.remove(pos1);
		else {
			if(izquierda(list,pos1,pos2)) {
				while(pos1 != pos2) {
					pos1= list.next(pos1);
					list.remove(aux);
				}
				list.remove(pos2);
			}else if(izquierda(list,pos2,pos1)) {
				while(pos2 != pos1) {
					pos2= list.next(pos2);
					list.remove(aux2);
				}
				list.remove(pos1);
			}
		}
	}
	private static <E> boolean izquierda(PositionList<E> list, Position<E> pos1, Position<E> pos2) {
		Position<E> cursor = pos1;
		while(cursor !=null) {
			if(cursor == pos2)
				return true;
			else
				cursor = list.next(cursor);
		}
		return false;
	}
	
	public static <E> int getNumApariciones (PositionList<E> lista, E elem) {
		if(lista == null || lista.isEmpty()) return 0;
		return getNumApariciones(lista, elem, lista.first());
	}
	private static <E> int getNumApariciones (PositionList<E> lista, E elem, Position<E> cursor) {
		if(cursor.element().equals(elem))
			return 1+getNumApariciones(lista,elem,lista.next(cursor));
		else
			return getNumApariciones(lista,elem,lista.next(cursor));
	}
	
	public static <E> PositionList<E> invertir (PositionList<E> list){
		if(list==null) return null;
		PositionList<E> res = new NodePositionList<E>();
		invertir(list,list.first(),res);
		return res;
	}

	private static <E> void invertir(PositionList<E> list, Position<E> cursor, PositionList<E> res) {
		if(cursor != null) {
			res.addFirst(cursor.element());
			invertir(list,list.next(cursor),res);
		}
		
	}
}
