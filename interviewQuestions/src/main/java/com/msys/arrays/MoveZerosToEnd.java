package com.msys.arrays;

import java.util.Arrays;

public class MoveZerosToEnd {

	/*
	 * given an array {0,2,0,4,5,0,7} move all the zeros to end in the same array
	 * and print
	 */

	public static void main(String args[]) {

		int array[] = { 0, 1,2 };

		moveZerosToEnd(array);
	}

	public static void moveZerosToEnd(int array[]) {

		int n = array.length;
		int index = 0;

		for (int i = 0; i < n; i++) {
			if (array[i] != 0) {
				array[index] = array[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println(index);


		// Fill the rest of the array with zeros
		while (index < n) {
			array[index] = 0;
			index++;
		}

		// Print the modified array
		System.out.println(Arrays.toString(array));

	}
}
