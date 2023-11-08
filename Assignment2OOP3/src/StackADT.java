/**
 * Interface for a generic stack data structure.
 *
 * @param <E> the type of elements in this stack
 */
public interface StackADT<E> {

    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
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
     * Returns the 1-based position where an object is on this stack. If the object o occurs as an item in this stack,
     * this method returns the distance from the top of the stack of the occurrence nearest the top of the stack;
     * the topmost item on the stack is considered to be at distance 1.
     *
     * @param o the desired object
     * @return the 1-based position from the top of the stack where the object is located; the return value -1
     * indicates that the object is not on the stack
     */
    int search(E o);

    /**
     * Tests if this stack is empty.
     *
     * @return true if and only if this stack contains no items; false otherwise.
     */
    boolean isEmpty();
}
