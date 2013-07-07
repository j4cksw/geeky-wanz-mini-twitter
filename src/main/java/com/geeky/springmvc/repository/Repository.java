package com.geeky.springmvc.repository;

import java.util.List;

public interface Repository<V> {
	
	void put(V entry);
	
	V get(V key);
	
	void delete(V key);
	
	List<V> getObjects();
}
