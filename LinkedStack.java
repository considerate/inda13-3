import java.util.EmptyStackException;

/**
 * An implementation of a stack using a linked list.
 */
public class LinkedStack<T> implements Stack<T> {
	private LinkedList<T> list;

	public LinkedStack() {
		list = new LinkedList<T>();
	}

	public void push(T object) {
		list.addFirst(object);
	}

	public T pop() throws EmptyStackException {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		T object = list.removeFirst();
		return object;
	}	

	public T top() throws EmptyStackException {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		T object = list.getFirst();
		return object;
	}
	/**
	 * Alias for the method top();
	 **/
	public T peek() throws EmptyStackException {
		return top();
	}

	public int size() {
		return list.size();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}
}