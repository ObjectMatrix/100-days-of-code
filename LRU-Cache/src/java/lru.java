package lrucache;

import java.util.HashMap;
import java.util.LinkedList;

public class lru {
	int capacity;
	HashMap<Integer, Page> cache;
	LinkedList<Page> cache_vals;
	
	public lru ( int capacity) {
		this.capacity = capacity;
		cache = new HashMap<Integer, Page>(capacity);
		cache_vals = new LinkedList<Page>();
	}

	int get (int key) {
		Page page = cache.get(key);
		if(page == null) {
			return -1;
		} else {
			cache_vals.remove(page);
			cache_vals.addLast(page);
			return page.data;
		}
	}
	void set (int key, int value) {
		Page page = cache.get(key);
		if(page == null) {
			//evict as needed
			page = new Page (key, value);
			cache_vals.addLast(page);
			cache.put(key,  page);
		}else {
			page.data = value;
			cache_vals.remove(page);
			cache_vals.addLast(page);
		}
	}
	
	void eviction() {
		if(cache_vals.size() >= capacity) {
			Page page = cache_vals.remove();
			cache.remove(page.key);
		}
	}
}
