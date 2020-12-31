/**
 * This class implements map structure using the Multimap interface to supports
 * multiple values per key. This is a light weight class implemented to satisfy
 * the needs of this application and not a comprehensive MultiMap solution.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/04/04
 *  	
 * @since		1.00
 * 
 */

package grasp.util.misc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class HashMultimap<K, V> implements Multimap<K,V> {
	//
	// Fields
	//
	private final Map<K, List<V>> mmap = new HashMap<K, List<V>>();

	//
	// Multimap implementation
	//
	@Override
	public void clear() {
		this.mmap.clear();
	}

	@Override
	public boolean containsKey(K key) {
		return this.mmap.containsKey(key);
	}

	@Override
	public boolean containsValue(V value) {
		for (List<V> vc : this.mmap.values()) {
			if (vc.contains(value))
				return true;
		}
		return false;
	}

	@Override
	public Collection<V> get(K key) {
		return this.mmap.get(key);
	}

	@Override
	public boolean isEmpty() {
		return this.isEmpty();
	}

	@Override
	public Set<K> keySet() {
		return this.mmap.keySet();
	}

	@Override
	public Collection<V> put(K key, V value) {
		if (!containsKey(key)) {
			this.mmap.put(key, new ArrayList<V>());
		}
		this.mmap.get(key).add(value);
		return null;
	}

	@Override
	public Collection<V> remove(K key) {
		this.mmap.remove(key);
		return null;
	}

	@Override
	public int size() {
		return this.mmap.size();
	}

	@Override
	public Collection<V> values() {
		Collection<V> values = new ArrayList<V>(this.mmap.size() * 10);
		for (List<V> vc : this.mmap.values()) {
			values.addAll(vc);
		}
		return values;
	}
}
