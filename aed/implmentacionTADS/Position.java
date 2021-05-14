 package aed.implmentacionTADS;
/**
 *
 */

/**
 *  Interface for abstract nodes which are used as cursors for
 * navigating data structures (e.g., lists and trees).
 * A position stores an element.
 *
 * @author aed
 *
 * @param <E> The type of the element contained in the Position
 */
public interface Position<E> {
	/**
	 * Returns the element contained in the node
	 * @return  the element contained in the node
	 */
	public E element();
}

