package aed.arboles;



import java.util.Iterator;

import es.upm.aedlib.Position;
import es.upm.aedlib.lifo.LIFO;
import es.upm.aedlib.lifo.LIFOList;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.tree.BinaryTree;
import es.upm.aedlib.tree.GeneralTree;
import es.upm.aedlib.tree.LinkedBinaryTree;
import es.upm.aedlib.tree.LinkedGeneralTree;
import es.upm.aedlib.tree.Tree;

public class EjemplosClase {

	//metodo recursivo
	public static <E> boolean member(Tree<E> t, E e) {
		return member(t, e, t.root());
	}
	public static <E> boolean member(Tree<E> t, E e, Position<E> p) {
		if (p == null)
			return false;
		if (p.element().equals(e))
			return true;

		for (Position<E> child : t.children(p)) {//pre-orden
			if (member(t, e, child))
				return true;
		}
		return false;

	}

	//metodo no recursivo
	/**
	 * crear una pila LIFO para guardar los elementos del arbol,
	 * comparar e con los del LIFO
	 * @param <E>
	 * @param t
	 * @param e
	 * @return
	 */
	public static <E> boolean memberNonRec(Tree<E> t, E e) {
		LIFO<Position<E>> l = new LIFOList<Position<E>>();
		l.push(t.root());
		
		while(! l.isEmpty()) {
			Position<E> cursor = l.pop();
			if(cursor.element().equals(e))
				return true;
			for(Position<E> child : t.children(cursor))
				l.push(child);
		}
		return false;
	}
	//Ejercicio 2_1
	public static <E> String printPreOrden(Tree<E> t) {
		if(t.isEmpty())
			return "";
		return printPreOrden(t, t.root());
		
		
	}
	private static <E> String printPreOrden(Tree<E> t,Position<E> v) {
		String res = ""+v.element();
		for(Position<E> w : t.children(v)) {
			res+=","+printPreOrden(t,w);
		}
		return res;
	}
	//Ejercicio 2_2
	public static <E> void printPostOrden(Tree<E> t) {
		if(t.isEmpty())
			return ;
		printPostOrden(t, t.root());
		
	}
	private static <E> void printPostOrden(Tree<E> t,Position<E> v) {
		for(Position<E> w : t.children(v)) {
			printPostOrden(t,w);
		}
		System.out.print(v.element()+", ");
	}
	//Ejercicio 2_3
	public static <E> int sizeRec(Tree<E> t) {
		if(t.isEmpty())
			return 0;
		return sizeRec(t,t.root());
		
	}
	private static <E> int sizeRec(Tree<E> t, Position<E> p) {
		int res = 1;
		if(t.isExternal(p))
			return res;
		for(Position<E> hijos : t.children(p)) {
			res = res+sizeRec(t, hijos);
		}
		return res;
	}
	
	//Ejercicio 2_4
	public static <E> int sizeNoRec(Tree<E> t) {
		if(t.isEmpty())
			return 0;
		return 0;
	}
	public static <E> PositionList<E> getExternalChildren(Tree<E> t){
		PositionList<E> res = new NodePositionList<E>();
		if(t.isEmpty())
			return res;
		getExternalChildren(t,t.root(),res);
		return res;
	}
	private static <E> void getExternalChildren(Tree<E> t, Position<E> v, PositionList<E> res) {
		boolean found = false;
		Iterator<Position<E>> it = t.children(v).iterator();
		while(it.hasNext() && ! found) {
			found = t.isExternal(it.next());
		}
		if(found)
			res.addLast(v.element());
		
		for(Position<E> w : t.children(v))
			getExternalChildren(t, w, res);
		
	}
	public static boolean heap(Tree<Integer> tree) {
		return tree.isEmpty() || heap(tree, tree.root());
	}
	private static boolean heap(Tree<Integer> tree, Position<Integer> v) {
		
		for(Position<Integer> w : tree.children(v)) {
			if(w.element().compareTo(v.element())<0)
				return false;
			else
				return heap(tree,w);
		}
		return true;
		
	}
	public static void recorrerInOrden(BinaryTree<Integer> t) {
		if(t.isEmpty())
			return ;
		recorrer(t,t.root());
		System.out.println();
	}
	private static void recorrer(BinaryTree<Integer> t, Position<Integer> v) {
		
		if(t.hasLeft(v))
			recorrer(t, t.left(v));
		System.out.print(v.element()+", ");
		if(t.hasRight(v))
			recorrer(t, t.right(v));
		
	}
	public static Integer maximoCamino(BinaryTree<Integer> tree) {
		return maximoCamino(tree,tree.root());
	}
	private static Integer maximoCamino(BinaryTree<Integer> tree, Position<Integer> v) {
		Integer l = 0,r=0;
		if(tree.hasLeft(v))
			l = maximoCamino(tree, tree.left(v));
		if(tree.hasRight(v))
			r = maximoCamino(tree, tree.right(v));
		return v.element()+Math.max(l, r);
	}
	public static void main(String[] args) {
		//Ejercicio 1
		GeneralTree<Integer> t1 = new LinkedGeneralTree<Integer>();
		Position<Integer> root = t1.addRoot(1);
		Position<Integer> c1 = t1.addChildFirst(root, 2);
		Position<Integer> c2 = t1.addChildLast(root, 3);
		
		Position<Integer> c11 = t1.addChildFirst(c1, 4);
		Position<Integer> c12 = t1.insertSiblingAfter(c11, 5);
		Position<Integer> c13 = t1.insertSiblingAfter(c12, 6);
		
		Position<Integer> c21 = t1.addChildFirst(c2, 7);
		Position<Integer> c22 = t1.addChildLast(c2, 8);
		
		Position<Integer> c221 = t1.addChildFirst(c22, 9);
		
		System.out.println("EJERCICIO_1:\n"+t1.toString());
		System.out.println(getExternalChildren(t1));
		System.out.println(heap(t1));
		System.out.println();
		System.out.println("EJERCICIO_2_1:\n"+printPreOrden(t1));
		System.out.println();
		System.out.println("EJERCICIO_2_2:");
		printPostOrden(t1);
		System.out.println();
		System.out.println();
		System.out.println("EJERCICIO_2_4:\n"+sizeRec(t1));
		
		BinaryTree<Integer> t2 = new LinkedBinaryTree<Integer>();
		t2.addRoot(1);
		Position<Integer> p2 = t2.insertLeft(t2.root(), 2);
		Position<Integer> p3 = t2.insertRight(t2.root(), 3);
		Position<Integer> p4 = t2.insertLeft(p2, 4);
		Position<Integer> p5 = t2.insertRight(p2, 5);
		Position<Integer> p6 = t2.insertLeft(p3, 6);
		Position<Integer> p7 = t2.insertRight(p3, 7);
		recorrerInOrden(t2);
		System.out.println(maximoCamino(t2));
	}
	

}
