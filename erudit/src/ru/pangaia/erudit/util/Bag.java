package ru.pangaia.erudit.util;

import java.util.Collection;
import java.util.List;
/**
 * Коллекция элементов типа "мешок": кладем один или несколько элементов,
 * вытаскиваем один произвольный, наугад.
 * Для реализации случайного подбора букв в промежутках между ходами
 * Методы пока не работают...*/
public class Bag<T> {
	private List<T> items;
	public boolean put(T item) { return false; }
	public boolean put(Collection<T> items) { return false; }
	public T get() { return null; }

}
