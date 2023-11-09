package adt;
import java.util.Iterator;

/**
 * Interface for a generic queue data structure.
 *
 * @param <E> the type of elements in this queue
 */
public interface QueueADT<E> {

    /**
     * Returns true if this queue contains no elements.
     *
     * @return true if this queue is empty, false otherwise.
     */
    boolean isEmpty();

    /**
     * Returns an array containing all of the elements in this queue in proper
     * sequence (from first to last element).
     *
     * @return an array containing all of the elements in this queue
     */
    Object[] toArray();

    /**
     * Accesses the element at the specified position in this queue.
     *
     * @param index the index of the element to be accessed
     * @return the element at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    E access(int index) throws IndexOutOfBoundsException;

    /**
     * Adds a new element to the queue.
     *
     * @param element the element to add
     * @return true if the addition is successful
     * @throws IllegalStateException if the element cannot be added at this time due
     *                               to capacity restrictions
     */
    boolean add(E element) throws IllegalStateException;

    /**
     * Removes the element at the specified position in this queue.
     *
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    E remove(int index) throws IndexOutOfBoundsException;

    /**
     * Iterator for the queue.
     * 
     * @return an iterator for the queue.
     */
    Iterator<E> iterator();

    /**
     * returns the size of the queue.
     * 
     * @return the size of the queue.
     */ 
    int size();

    void Clear();
	
	boolean isFull();
	
	boolean Equals(QueueADT<E> other);
	
	void Add(E Element);
}
