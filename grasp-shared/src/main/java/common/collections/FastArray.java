/**
 * A fast and expandable array class. This is thin wrapper
 * over native Java arrays.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2012/08/08
 *  	
 * @since		1.00
 * 
 */

package common.collections;


public class FastArray<T> {
	//
	// Constants
	//
	private static final int MIN_ARRAY_SIZE = 10;

	//
	// Fields
	//
	private Object[] array;
	private int count;
	private final int initialSize;

	//
	// Constructors
	//
	public FastArray(int initialSize) {
		this.initialSize = initialSize <= MIN_ARRAY_SIZE ? MIN_ARRAY_SIZE : initialSize;
		this.array = new Object[this.initialSize];
		this.count = 0;
	}
	
	//
	// Public implementation
	//
	public boolean isValidIndex(int index) {
		return index >= 0 && index < this.count;
	}
	
	public boolean isEmpty() {
		return this.count == 0;
	}

	public int count() {
		return this.count;
	}

	public Object[] array() {
		return this.array;
	}

	@SuppressWarnings("unchecked")
	public T get(int index) {
		rangeCheck(index);
		return (T) this.array[index];
	}

	@SuppressWarnings("unchecked")
	public T set(int index, T element) {
		rangeCheck(index);
		T oldElement = (T) this.array[index];
		this.array[index] = element;
		return oldElement;
	}

	public void add(T element) {
		ensureCapacity();
		this.array[this.count] = element;
		this.count++;
	}
	
	public void clear() {
		// Just reset counter; no need to nullify elements
		this.count = 0;
	}

	//
	// Local implementation
	//
	private void rangeCheck(int index) {
		if (!isValidIndex(index)) {
			throw new IndexOutOfBoundsException();
		}
	}
	
	private void ensureCapacity() {
		// Grow array if it has been filled up
		// Growing is done by copying current data to a larger new array
		if (this.count >= this.array.length) {
			Object[] newArray = new Object[this.count + this.initialSize];
			System.arraycopy(this.array, 0, newArray, 0, this.count);
		}
	}
}
