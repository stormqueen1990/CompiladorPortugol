package geral;

import java.util.ArrayList;
import java.util.Collection;

/**
 * List specialization to act like a ResultSet.
 * 
 * @author mauren
 */
public class AdvArrayList<T> extends ArrayList<T> {
	private static final long serialVersionUID = -7069004868447597088L;
	
	private Integer cursorPosition = -1;
	
	/**
	 * Avoids the default constructor supression.
	 */
	public AdvArrayList() {
		super();
	}
	
	/**
	 * Constructs a list with the initial capacity specified by <code>initialCapacity</code>.
	 * 
	 * @param initialCapacity
	 *            the specified initial capacity.
	 */
	public AdvArrayList(int initialCapacity) {
		super(initialCapacity);
	}
	
	/**
	 * Constructs a list with the elements present in <code>collection</code>.
	 * 
	 * @param collection
	 *            a collection of elements.
	 */
	public AdvArrayList(Collection<? extends T> collection) {
		super(collection);
	}
	
	/**
	 * Increments list cursor and fetches the element after the current pointer.
	 * 
	 * @return the next element of the list.
	 */
	public T next() {
		T element = null;
		
		if ((this.size() != 0) && (this.cursorPosition < (this.size() - 1))) {
			this.cursorPosition++;
			element = this.get(this.cursorPosition);
		}
		
		return element;
	}
	
	/**
	 * Decrements the list cursor and fetches the element pointed by the cursor.
	 * 
	 * @return the element before the current cursor position.
	 */
	public T prev() {
		T element = null;
		
		if ((this.size() != 0) && (this.cursorPosition > 0)) {
			this.cursorPosition--;
			element = this.get(this.cursorPosition);
		}
		
		return element;
	}
	
	/**
	 * Returns the current element of the list.
	 * 
	 * @return element currently pointed by the index.
	 */
	public T getCurrent() {
		T element = null;
		
		if ((this.size() != 0) && (this.cursorPosition < (this.size() - 1))) {
			element = this.get(this.cursorPosition);
		}
		
		return element;
	}
	
	/**
	 * Returns a sublist from the current element onwards.
	 * 
	 * @return sublist from the current element onwards.
	 */
	public AdvArrayList<T> sublist() {
		return (AdvArrayList<T>) this.subList(this.cursorPosition, this.size() - 1);
	}
}
