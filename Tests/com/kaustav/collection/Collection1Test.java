package com.kaustav.collection;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.kaustav.collection.Collection1;

public class Collection1Test {

	Collection1 col;
	
	@Before
	public void setup() {
		col = new Collection1();
		col.list = new ArrayList<Object>();
	}
	
	@Test
	public void integerTest() {
		
		col.list = col.addObject(col.list, 1);
		assertEquals(1,col.list.size());
		assertEquals(2,col.list.get(0));
		col.list = col.addObject(col.list, 1);
		assertEquals((float)3.0,col.list.get(0));
		col.list = col.addObject(col.list, 1);
		assertEquals('b',col.list.get(0));
		col.list = col.addObject(col.list, 1);
		assertEquals(false,col.list.get(0));
		col.list = col.addObject(col.list, 1);
		assertEquals("HELLO",col.list.get(0));
		assertEquals(5,col.list.size());

		
	}

}
