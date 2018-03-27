package com.kaustav.collection;

import java.util.List;
import java.util.Map;

public class Collection4 {

	public static void main(String[] args) {
		
		PersonService service = new PersonService();
		List<Person> persons = service.generateList();
		System.out.println("Showing People:");
		service.show(persons);
		Map<Float,Person> map = service.transform(persons);
		System.out.println("\n\nShowing Map:");
		service.show(map);
	}

}
