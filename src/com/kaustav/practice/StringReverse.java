package com.kaustav.practice;

public class StringReverse {

	static StringBuilder usingStringBUilder(String input) {
		StringBuilder input1 = new StringBuilder();
	     input1.append(input);
	     input1 = input1.reverse();
	     
	     System.out.println("Using StringBuilder:");
	     return input1;
	}
	
	static void usingCharArray(String input) {
		char[] rev = input.toCharArray();
		System.out.println("Using Character Array:");
		for (int i = rev.length-1; i>=0; i--)
            System.out.print(rev[i]);
		
		
	}
}


