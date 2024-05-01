package com.msys.arrays;

import java.util.HashSet;

public class FindCommonElements {

	public static void main(String args[]) {

		int array1[] = { 1, 2, 3, 4, 5 };
		int array2[] = { 6, 7, 5, 8, 9 };
		
	findCommonElementsInArray(array1, array2);

	}

	public static void findCommonElementsInArray(int array1[], int array2[]) {

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < array1.length ; i++) {

			set.add(array1[i]);
		}
		
		for(int i=0; i<array2.length; i++) {
			
			if(set.contains(array2[i])) {
				System.out.println(array2[i]);
			}
		}

	}

}
