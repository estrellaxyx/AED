package aed.multisets;

import es.upm.aedlib.positionlist.PositionList;

/**
 * Defines the methods a multiset provides,
 * i.e., a data structure similar to a set
 * except that elements may occur multiple times.
 * For example, {1,2,3,1} is a multiset, but not a set, since 1 occurs twice.
 */
public interface MultiSet<Element> extends Iterable<Element> {
  
  /**
   * Adds an element to the multiset.
   *
   * @param elem  the element to add; note that
   * <code>null</code> arguments are permitted
   */
  public void add(Element elem);

  /**
   * Adds an element n times to the multiset. That
   * is, add("hola",2); is the same as add("hola"); add("hola").
   *
   * @param elem  the element to add; note that
   * <code>null</code> arguments are permitted
   * @raises IllegalArgumentException if n<0.
   */
  public void add(Element elem, int n);
  
  /**
   * Removes an element from the multiset.
   *
   * @param elem   the element to remove. Note that <code>null</code> is permitted
   * as an argument
   * @return <code>true</code> if the multiset contained the element; <code>false</code> otherwise
   */
  public boolean remove(Element elem);
  
  /**
   * Removes an element up to n times from the multiset.
   * That is, remove("hola",2); is the same as remove("hola"); remove("hola"),
   * except that true is returned if the multiset contained at least
   * one element.
   *
   * @param elem   the element to remove. Note that <code>null</code> is permitted
   * as an argument
   * @return <code>true</code> if the multiset contained the element; <code>false</code> otherwise
   * @raises IllegalArgumentException if n<0.
   */
  public boolean remove(Element elem, int n);
  
  /**
   * Counts the number of occurrences of an element in the multiset.
   *
   * @param elem   the element to count. Note that <code>null</code> is permitted
   * as an argument
   * @return the number of occurences of the element in the multiset
   */
  public int count(Element elem);
  
  /**
   * Returns the number of elements in the multiset.
   *
   * @return the number of elements in the multiset
   */
  public int size();

  
  /**
   * Checks if the multiset is empty.
   *
   * @return true if the multiset is empty, and false otherwise.
   */
  public boolean isEmpty();

  /**
   * Returns a new multiset corresponding to the "intersection" of 
   * the object multiset, and the argument multiset. That is, 
   * if s3 = s1.intersection(s2)
   * then for any element e, s3.count(e) = min(s1.count(e),s2.count(e)).
   * @return the multiset corresponding to the intersection of the multisets.
   */
  public MultiSet<Element> intersection(MultiSet<Element> s);

  /**
   * Returns a new multiset corresponding to the "sum" of 
   * the object multiset, and the argument multiset. That is, 
   * if s3 = s1.intersection(s2)
   * then for any element e, s3.count(e) = s1.count(e) + s2.count(e).
   * @return the multiset corresponding to the sum of the multisets.
   */
  public MultiSet<Element> sum(MultiSet<Element> s);
}
