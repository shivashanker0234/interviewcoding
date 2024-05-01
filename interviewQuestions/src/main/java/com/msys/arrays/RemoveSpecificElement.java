package com.msys.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveSpecificElement {

	
	public static void main(String [] args) {
		
		int [] array = {2,5,25,6,32,7,6};
		int element =6;
		
		int [] newArray = removeElement(array, element);
		System.out.println(Arrays.toString(array));

		System.out.println(Arrays.toString(newArray));
	}
	
	public static int[] removeElement(int[] array, int element) {
		
		
		int [] newArray = new int[array.length-1];
		int index =0;
		
		for(int i=0; i<array.length; i++) {
			 
			if(array[i]!=element) {
				
				newArray[index]=array[i];
				index++;
			}
			
		}
		
		return newArray;
		
	}
}
