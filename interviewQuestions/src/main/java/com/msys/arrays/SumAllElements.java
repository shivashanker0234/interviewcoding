package com.msys.arrays;

import java.util.Arrays;

public class SumAllElements {
	
	public static void main (String args []) {
		
		int [] array = {1,2,3};
		
		int sum = Arrays.stream(array).sum();
		System.out.println(sum);
		
		
		int sum1= Arrays.stream(array).reduce((x, y)-> x+y).getAsInt();
		
		System.out.println(sum1);
	}

}
