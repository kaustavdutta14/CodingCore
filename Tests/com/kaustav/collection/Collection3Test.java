package com.kaustav.collection;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.kaustav.collection.Set;

public class Collection3Test {

	Set set;
	
	@Before
	public void setup() {
		set = new Set();
	}
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		set.add(1);
		assertEquals(1,set.array[0]);
		set.add(true);
		assertEquals(true,set.array[1]);
		set.add("Hello");
		assertEquals("Hello",set.array[2]);
		set.remove(true);
		assertEquals("Hello",set.array[1]);
		
	}

}
