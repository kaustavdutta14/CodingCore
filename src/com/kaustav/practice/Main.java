package com.kaustav.practice;

public class Main {

	public static void main(String[] args) {
		
		int arr[] = {12, 13, 1, 10, 34, 2};
		int a[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		String input = "Kaustav";
		int n = a.length;
		
		StringBuilder s=StringReverse.usingStringBUilder(input);
		System.out.println(s);
		StringReverse.usingCharArray(input);
		SecondSmallest.print2Smallest(arr);
	    Zeros.pushZerosToEnd(a, n);
	        System.out.println("\nArray after pushing zeros to the back: ");
	        for (int i=0; i<n; i++)
	            System.out.print(a[i]+" ");

	}

}
