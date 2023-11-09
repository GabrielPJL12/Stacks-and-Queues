package adt;

import java.util.Iterator;

/**
 * Interface for a generic stack data structure.
 *
 * @param <E> the type of elements in this stack
 */
public interface StackADT<E> {

    /**
     * Removes the object at the top of this stack and returns that object as the
     * value of this function.
     *
     * @return The object at the top of this stack
     * @throws java.util.NoSuchElementException if this stack is empty
     */
    E remove() throws java.util.NoSuchElementException;

    /**
     * Compares the specified object with this stack for equality.
     *
     * @param o the object to be compared for equality with this stack
     * @return true if the specified object is equal to this stack
     */
    boolean equals(Object o);

    /**
     * Returns the 1-based position where an object is on this stack. If the object
     * o occurs as an item in this stack,
     * this method returns the distance from the top of the stack of the occurrence
     * nearest the top of the stack;
     * the topmost item on the stack is considered to be at distance 1.
     *
     * @param o the desired object
     * @return the 1-based position from the top of the stack where the object is
     *         located; the return value -1
     *         indicates that the object is not on the stack
     */
    int search(E o);

    /**
     * Tests if this stack is empty.
     *
     * @return true if and only if this stack contains no items; false otherwise.
     */
    boolean isEmpty();

    /**
     * Accesses the element at the specified position in this stack.
     * 
     * @param index the index of the element to be accessed
     * @return the element at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range
     * @throws NullPointerException      if the element is null
     */
    E access(int index) throws IndexOutOfBoundsException;

    /**
     * Return as Iterator object for the stack.
     * 
     * @return an iterator for the stack.
     */
    Iterator<E> iterator();

    /**
     * Checks to see if the stack contains the specified element.
     * 
     * @param element the element to check for
     * @return true if the stack contains the element, false otherwise.
     * @throws NullPointerException if the element is null
     */
    boolean contains(E element);

    /**
     * Clears the stack of all elements.
     */
    void clear();

    void Add(E element);

    StackADT<E> New();

    E[] ToArray();

    int Size();
}
