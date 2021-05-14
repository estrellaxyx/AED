package aed.implmentacionTADS;

import java.lang.IllegalArgumentException;

/**
 * A generic node which stores an element and has an owner object.
 *
 * @param <E> The type of the elements contained in the Node
 * @param <O> The type of the owner
 */
public class Node<E, O> implements Position<E> {

  private final O owner;
  private E elem;

  /**
   * Creates a new node owned by owner and storing elem.
   */
  public Node(O owner, E elem) {
    this.owner = owner;
    this.elem = elem;
  }


  /**
   * Returns the element contained in the node
   * 
   * @return the element contained in the node
   */

  public E element() {
    return elem;
  }

  /**
   * Returns the owner of the node.
   * 
   * @return the owner of the node.
   */
  public O owner() {
    return owner;
  }

  /**
   * Returns true if n belongs to the object
   * 
   * @param n entry node
   * @return true if n belongs to the object
   */
  public boolean kinOf(Object n) {
    if (n == null)
      return false;
    if (!(n instanceof Node<?, ?>))
      return false;
    else {
      Node<?, ?> node = (Node<?, ?>) n;
      return owner.equals(node.owner());
    }
  }

  /**
   * Stores the parameter elem in the node
   */
  public void setElement(E elem) {
    this.elem = elem;
  }

  /**
   * Verifies that the position parameter p is owned by the object (this), and returns the
   * corresponding node.
   * 
   * @return the node corresponding to the position
   * @throws IllegalArgumentException if the parameter is null, or if the parameter is not owned by
   *         the object (this).
   */
  public Node<E, ?> checkNode(Position<E> p) {
    if (p == null || !(p instanceof Node<?, ?>))
      throw new IllegalArgumentException("not a node: " + p);
    else {
      @SuppressWarnings("unchecked")
      Node<E, ?> n = (Node<E, ?>) p;

      if (!kinOf(n))
        throw new IllegalArgumentException("foreign position " + n);

      return n;
    }
  }

  public String toString() {
    if (elem == null) return "null";
    else return elem.toString();
  }
}
