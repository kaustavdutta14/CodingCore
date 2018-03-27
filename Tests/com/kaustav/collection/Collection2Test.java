package com.kaustav.collection;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.kaustav.collection.AgeComparator;
import com.kaustav.collection.Employee;
import com.kaustav.collection.FirstNameComparator;
import com.kaustav.collection.LastNameComparator;

public class Collection2Test {

	Employee emp1;
	Employee emp2;
	AgeComparator age;
	FirstNameComparator fn;
	LastNameComparator ln;
	@Before
	public void setup() {
		emp1 = new Employee(20,"Harsha","Kovalluri");
		emp2 = new Employee(23,"Harsha","Nanda");
		age = new AgeComparator();
		fn = new FirstNameComparator();
		ln = new LastNameComparator();
	}
	
	
	@Test
	public void test() {
		
		assertEquals(-3,age.compare(emp1,emp2));
		assertEquals("Kovalluri".compareToIgnoreCase("Nanda"),fn.compare(emp1,emp2));
		assertEquals("Kovalluri".compareToIgnoreCase("Nanda"),ln.compare(emp1,emp2));
		//fail("Not yet implemented");
	}

}
