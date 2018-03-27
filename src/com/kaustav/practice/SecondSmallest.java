package com.kaustav.practice;

public class SecondSmallest {

	 static void print2Smallest(int array[])
	    {
	        int first, second, size = array.length;
	        first = second = Integer.MAX_VALUE;
	        for (int i = 0; i < size ; i ++)
	        {
	            if (array[i] < first)
	            {
	                second = first;
	                first = array[i];
	            }
	            else if (array[i] < second && array[i] != first)
	                second = array[i];
	        }
	            System.out.println("\nThe smallest element is " +
	                               first + " \nSecond Smallest" +
	                               " element is " + second);
	    }

}
