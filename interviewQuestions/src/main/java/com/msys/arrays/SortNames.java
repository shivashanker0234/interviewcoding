package com.msys.arrays;

import java.util.Arrays;

public class SortNames {

	public static void main(String args[]) {
		
		String[] names = { "shiva", "anil", "pavan", "gopi" };
		
		// Method 1 using sort method 
		Arrays.sort(names);
		
         for(String name : names) {
        	 System.out.println(name);
         }
         
         // Method 2 using Bubble Sort algorithm
	}

}
