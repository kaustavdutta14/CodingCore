package com.kaustav.collection;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class Set {

	public Object[] array;
	
	public Set() {
		this.array = new Object[0];
	}
	public int add(Object obj) {
		if(obj == null) return -1;
		for(Object o:this.array) {
			if(o == obj) return -1;
		}
		this.array = Arrays.copyOf(this.array, this.array.length+1);
		this.array[this.array.length-1] = obj;
		return this.array.length -1;
		
	}
	
	public void remove(Object obj) {
		this.array = ArrayUtils.removeElement(this.array, obj);
	}
	
	public void showAll() {
		String display = "";
		for(Object o:this.array) {
			display = display + " "+o;
		}
		System.out.println(display);
		
	}


}
