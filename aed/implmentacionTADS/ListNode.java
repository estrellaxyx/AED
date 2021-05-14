package aed.implmentacionTADS;

import es.upm.aedlib.Position;
import es.upm.aedlib.Node;
import java.lang.IllegalArgumentException;

/**
 * A reimplementation of DNode.java from the net.datastructures library.
 * 
 * @author aed
 *
 * @param <E> The type of the elements contained in the Node
 */
class ListNode<E> extends Node<E, PositionList<E>> implements Position<E> {

  private ListNode<E> prev;
  private ListNode<E> next;

  public ListNode(PositionList<E> owner, 
		     	  ListNode<E> prev, 
		     	  E elem, 
		     	  ListNode<E> next) {
	  
    super(owner, elem);
    this.prev = prev;
    this.next = next;
  }

  public ListNode<E> getPrev() {
    return prev;
  }

  public ListNode<E> getNext() {
    return next;
  }

  public void setPrev(ListNode<E> prev) throws IllegalArgumentException {
    if (prev == null || this.kinOf(prev))
      this.prev = prev;
    else
      throw new IllegalArgumentException();
  }

  public void setNext(ListNode<E> next) throws IllegalArgumentException {
    if (next == null || this.kinOf(next))
      this.next = next;
    else
      throw new IllegalArgumentException();
  }

  public ListNode<E> checkNode(Position<E> p) {
    Node<E, ?> n = super.checkNode(p);

    if (!(n instanceof ListNode<?>))
      throw new IllegalArgumentException("no a list node: " + n);

    @SuppressWarnings("unchecked")
    ListNode<E> l = (ListNode<E>) n;

    if (l.getPrev() == null || l.getNext() == null)
      // null elements are allowed
      throw new IllegalArgumentException("unlinked position");

    return l;
  }
}
