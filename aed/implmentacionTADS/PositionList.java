package aed.implmentacionTADS;

import es.upm.aedlib.Position;


/**
 * A list data structure which enables forward and backward navigation of
 * the list using a cursor (a position). Note that there are no methods
 * for index based access (i.e., using integer indices) to this list
 * data structure.
 * @author aed
 *
 * @param <E> The type of the element contained in the Position
 */
public interface PositionList<E> extends Iterable<E> {

	/**
	 * Returns the number of nodes in the list 
	 * @return Returns the number of nodes in the list
	 */
	public int size();


	/**
	 * Returns true if the list is empty (has no nodes), false if it's not.
	 * @return Returns true if the list is empty (has no nodes), false if it's not.
	 */
	public boolean isEmpty();


	/**
	 * Returns the first node of the list, or null if the list is empty.
	 * @return Returns the first node of the list, or null if the list is empty. 
	*/
	public Position<E> first();


	/**
	 * Returns the last node of the list, or null if the list is empty
	 * @return Returns the last node of the list, or null if the list is empty
	 */
	public Position<E> last();


	
	/**
	 * Either returns the next node to the right of parameter node 'p' in the
	 *  list, or returns null if 'p' doesn't have a next node to the right.
	 * @param p Position to get it's next node
	 * @return returns the next node to the right of parameter node 'p' in the
	 *  list, or returns null if 'p' doesn't have a next node to the right
	 * @throws IllegalArgumentException Raises the exception if 'p' is null or is not a node of the list. 
	 */
	public Position<E> next(Position<E> p) throws IllegalArgumentException;


	/** Either returns the previous node to the left of parameter node 'p' in
	 *  the list, or returns null if 'p' doesn't have a previous node to the
	 *  left
	 * @param p Position to get it's previous node
	 * @return returns the previous node to the left of parameter node 'p' in
	 *  the list, or returns null if 'p' doesn't have a previous node to the
	 *  left 
	 * @throws IllegalArgumentException Raises the exception if p is null or is not a node of the list.
	 */
	public Position<E> prev(Position<E> p) throws IllegalArgumentException;


	/**
	 * Inserts a new first node to the list with 'elem' as element
	 * @param elem The element to be inserted
	 */
	public void addFirst(E elem);


	/**
	 * Inserts a new last node to the list with 'elem' as element
	 * @param elem The element to be inserted
	 */
	public void addLast(E elem);


	/**
	 * Inserts a new node with 'elem' as element to the list right before
	 * parameter node 'p'.
	 * @param p The node where the element is inserted before
	 * @param elem The element to be added
	 * @throws IllegalArgumentException Raises the exception if 'p' is null or is not a node
	 *  of the list.
	 */
	public void addBefore(Position<E> p, E elem) throws IllegalArgumentException;


	/**
	 * Inserts a new node with 'elem' as element to the list right after
	 * parameter node 'p'
	 * @param p The node where the element is inserted after
	 * @param elem The element to be added
	 * @throws IllegalArgumentException Raises the exception if 'p' is null or is not a node
	 *  of the list.
	 */
	public void addAfter(Position<E> p, E elem) throws IllegalArgumentException;


	/**
	 * Removes node 'p' from the list and returns its element.
         * Note that after removing the node the element field
         * is set to null, that is, calling the method element 
         * on a removed node will return null.
	 * @param p The position to be removed 
	 * @return The element that has been removed
	 * @throws IllegalArgumentException Raises the
	 *  exception if 'p' is null or is not a node of the list.
	 */
	public E remove(Position<E> p) throws IllegalArgumentException;


	/**
	 * Sets the element of node 'p' on the list to 'elem', and returns 
	 * the previous element.
	 * @param p The position where the element is et
	 * @param elem The element contained in p before the update
	 * @return the old element in 'p'
	 * @throws IllegalArgumentException Raises the exception if 'p' is null or is not a node of
	 *  the list.
	 */
	public E set(Position<E> p, E elem) throws IllegalArgumentException;


	/**
	 * Returns an array with all the elements of the list in the proper 
	 * sequence (from first to the end of the list) or an empty array
	 *  of length zero if the list is empty.
	 * @return Returns an array with all the elements of the list or an empty array
	 *  of length zero if the list is empty.
	 */
	public Object [] toArray();

	/**
	 * Returns an array with all the elements of the list in the proper
	 * sequence (from first to the end of the list);
	 * the runtime type of the returned array is that of the 
	 * specified argument array. 
	 * If the list fits in the specified array, it is returned therein. 
	 * Otherwise, a new array is allocated with the runtime type of the 
	 * specified array and the size of this list.
	 *
	 * If the list fits in the specified array with room to spare 
	 * (i.e., the array has more elements than the list), 
	 * the element in the array immediately following the end of the list 
	 * is set to null.
	 * @return Returns an array with all the elements of the list.
	 */
	public E [] toArray(E[] a);
}
