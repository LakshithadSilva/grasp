/**
 * Interface for a map collection that supports multiple values per key.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/04/04
 *  	
 * @since		1.00
 * 
 */

package grasp.util.misc;

import java.util.Collection;
import java.util.Set;


public interface Multimap<K, V> {
	void clear();
	boolean containsKey(K key);
	boolean containsValue(V value);
	Collection<V> get(K key);
	int hashCode();
	boolean isEmpty();
	Set<K> keySet();
	Collection<V> put(K key, V value);
	Collection<V> remove(K key);
	int size();
	Collection<V> values();
}
