package com.assignment2.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class BookMap {

	public static void main(String[] args) {
		Map<Integer, Book> bookList = new HashMap<>();
		bookList.put(1, new Book(1, "Learn C++", 500));
		bookList.put(3, new Book(3, "Learn JAVA", 450));
		bookList.put(5, new Book(5, "Learn C#", 540));
		bookList.put(2, new Book(2, "Learn Angular", 530));
		bookList.put(4, new Book(4, "Learn ReactJS", 200));
		System.out.println("Using Lmbda");
		bookList.forEach((key, value) -> System.out.println(key + " -> " + value));

		System.out.println("\nUsing Iterator");
		Iterator<Entry<Integer, Book>> itr = bookList.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, Book> set = (Map.Entry<Integer, Book>) itr.next();
			System.out.println(set.getKey() + " -> " + set.getValue());
		}
		System.out.println("\nBooks having pages between 500 and 550");
		Map<Integer, Book> customerList = bookList.entrySet().stream()
				.filter(e -> e.getValue().getPages() > 500 && e.getValue().getPages()<550)
				.collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
		customerList.forEach((key, value) -> System.out.println(key + " -> " + value));
	}

}
