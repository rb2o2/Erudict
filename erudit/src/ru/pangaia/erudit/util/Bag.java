package ru.pangaia.erudit.util;

import java.util.Collection;
import java.util.List;

public class Bag<T> {
	private List<T> items;
	public boolean put(T item) { return false; }
	public boolean put(Collection<T> items) { return false; }
	public T get() { return null; }

}
