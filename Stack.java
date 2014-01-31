public interface Stack<T> {
	/**
	 * Adds an object to the top of the stack.
	 * @param T object The object to add.
	 */
	public void push(T object);
	/**
	 * Retrieves the object of the top of the 
	 * stack and removes it from the stack.
	 * @return T The topmost object.
	 */
	public T pop();
	/**
	 * Retrieves the object of the top of the 
	 * stack without removing it from the stack.
	 * @return T The topmost object.
	 */	
	public T top();
	/**
	 * Get the size of the stack.
	 * @return int The size of the stack.
	 */
	public int size();
	/**
	 * Returns true if the stack is empty.
	 * @return boolean True if empty.
	 */
	public boolean isEmpty();
}