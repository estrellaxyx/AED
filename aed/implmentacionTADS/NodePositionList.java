package aed.implmentacionTADS;

import es.upm.aedlib.Position;
import java.lang.IllegalArgumentException;
import java.util.Iterator;
import java.util.Arrays;

/**
 * Provides an implementation of the PositionList interface using 
 * doubly linked nodes.
 * 
 * @author aed
 *
 * @param <E> The type of the elements contained in the list
 */
public class NodePositionList<E> implements PositionList<E> {

	private int size;
	private ListNode<E> header; 
	private ListNode<E>trailer;

	/**
	 * A counter for detecting iteration (calls to next)
	 * after changes to the underlying data structure.
	 */
	protected long changeCounter;


	/**
	 * Creates an empty list
	 */
	public NodePositionList() {
		size    = 0;
		header  = new ListNode<E>(this, null, null, null);
		trailer = new ListNode<E>(this, header, null, null);
		header.setNext(trailer);
		changeCounter = 0;
	}

	/**
	 * Creates a list with the elements contained in arr in the same order
	 * @param arr The elements to create the new list
	 */
	public NodePositionList(E [] arr) {
		this();
		for (E e : arr) {
			this.addLast(e);
		}
	}

	/**
	 * Copy constructor. Creates a list with the elements contained in list in the same order
	 * @param list The elements to create the new list
	 */
	public NodePositionList(PositionList<E> list) { // Copy constructor
		this();
		for (E e : list) {
			this.addLast(e);
		}
	}

	public int size() { 
		return size; 
	}

	public boolean isEmpty() { 
		return size == 0; 
	}

	public Position<E> first() { 
		return isEmpty() ? null : header.getNext();  
	}

	public Position<E> last()  { 
		return isEmpty() ? null : trailer.getPrev(); 
	}

	public Position<E> next(Position<E> p) throws IllegalArgumentException {
		ListNode<E> n = checkPosition(p);
		return n.getNext() == trailer ? null : n.getNext();
	}

	public Position<E> prev(Position<E> p) throws IllegalArgumentException {
		ListNode<E> n = checkPosition(p);
		return n.getPrev() == header ? null : n.getPrev();
	}

	public void addFirst(E elem) {
		ListNode<E> newNode = new ListNode<E>(this, header, elem, 
											header.getNext());
		header.getNext().setPrev(newNode);
		header.setNext(newNode);
		size++;
		changeCounter++;
	}

	public void addLast(E elem) {
		ListNode<E> newNode = new ListNode<E>(this, trailer.getPrev(), elem, trailer);
		trailer.getPrev().setNext(newNode);
		trailer.setPrev(newNode);
		size++;
		changeCounter++;
	}


	public void addBefore(Position<E> p, E elem) throws IllegalArgumentException {
		ListNode<E> n = checkPosition(p);
		ListNode<E> newNode = new ListNode<E>(this, n.getPrev(), elem, n);
		n.getPrev().setNext(newNode);
		n.setPrev(newNode);
		changeCounter++;
		size++;
	}

	public void addAfter(Position<E> p, E elem) throws IllegalArgumentException {
		ListNode<E> n = checkPosition(p);
		ListNode<E> newNode = new ListNode<E>(this, n, elem, n.getNext());
		n.getNext().setPrev(newNode);
		n.setNext(newNode);
		changeCounter++;
		size++;
	}

	public E remove(Position<E> p) throws IllegalArgumentException {
		ListNode<E> n = checkPosition(p);
		E e = n.element();
		n.getPrev().setNext(n.getNext());
		n.getNext().setPrev(n.getPrev());
		n.setNext(null);   // help the gc
		n.setPrev(null);
		n.setElement(null);
		size--;
		changeCounter++;
		return e;
	}

	public E set(Position<E> p, E elem) throws IllegalArgumentException {
		ListNode<E> n = checkPosition(p);
		E e = n.element();
		n.setElement(elem);
		return e;
	}

	public Iterator<E> iterator() { 
		return new PositionListIterator<E>(this);
	}


	// Class-specific methods

	public String toString() {
		String s = "[";
		for (Position<E> cursor = first(); cursor != null; cursor = next(cursor)) {
			if (cursor.element() == null)
				s += "null";
			else
				s += cursor.element().toString();
			if (cursor != last()) s += ", ";
		}
		s += "]";
		return s;
	}

	/* Equals using iterator */

	public boolean equals(Object o) {
		if (o == this) return true;
		if (o instanceof PositionList<?>) {
			Iterator<E> p = this.iterator();
			@SuppressWarnings("unchecked")
			Iterator<E> q = ((PositionList<E>)o).iterator();
			boolean equal = true;
			while (p.hasNext() && q.hasNext() && equal) {
                          E pElem = p.next();
                          E qElem = q.next();
                          if (pElem == null) equal = (pElem == qElem);
                          else equal = pElem.equals(qElem);
                        }
			return p.hasNext() == q.hasNext() && equal;
		} else return false;  // also, o == null
	}

	// Note that if obj1.equal(obj2) then obj1.hashCode() must be identical to
	// obj2.hashCode()
	public int hashCode() {
		int hashCode = 0;

		Position<E> cursor = first();
		while (cursor != null) {
			E elem = cursor.element();
			hashCode = 31*hashCode + (elem==null ? 0 : elem.hashCode());
			cursor = next(cursor);
		}
		return hashCode;
	}

	public Object [] toArray() {
		Object [] arr = new Object[this.size()];
		int i = 0;
		Iterator<E> it = this.iterator();
		while (it.hasNext()) {
			arr[i++] = it.next();
		}
		return arr;
	}

	public E[] toArray(E[] a) {
		if (this.size() > a.length)
			a = (E[]) Arrays.copyOf(a,this.size());
		Iterator<E> it = this.iterator();
		int i = 0;
		while (it.hasNext()) {
			a[i++] = it.next();
		}
		if (i <  a.length)
			a[i] = null;
		return a;
	}

	protected ListNode<E> checkPosition(Position<E> n)
			throws IllegalArgumentException {
		return header.checkNode(n);
	}
}
