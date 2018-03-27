package com.kaustav.collection;

public class Collection3 {

	public static void main(String[] args) {

		Set set = new Set();
		set.add(1);
		set.add("String");
		set.add(true);
		set.add('K');
		set.add("String");
		set.showAll();
		set.remove('K');
		set.showAll();

	}

}
