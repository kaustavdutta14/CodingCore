package com.kaustav.collection;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.kaustav.collection.Person;
import com.kaustav.collection.PersonService;

public class Collection4Test {

	List<Person> list;
	List<Person> list2;
	Map<Float,Person> map;
	
	
	@Before
	public void setup() {
		list = new ArrayList<Person>();
		list2 = new ArrayList<Person>();
		list.add(new Person(1,"Harsha",60000));
		list.add(new Person(1,"Sreenivas",150000));
		list2.add(new Person(1,"Harsha",(float)60000));
		list2.add(new Person(1,"Sreenivas",(float)150000));
		map = new HashMap<Float,Person>();
		map.put((float)1, list2.get(0));
		map.put((float)1.1, list2.get(1));
	}
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(map,new PersonService().transform(list));
	}

}
