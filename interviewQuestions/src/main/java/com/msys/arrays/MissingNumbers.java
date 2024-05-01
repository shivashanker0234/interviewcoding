package com.msys.arrays;

import java.util.HashSet;

//{3,5,1,6,8,9,0}
//output {2,4,7}
public class MissingNumbers {

	public static void main(String args[]) {

		Integer[] array = { 4, 7, 9, 2, 8,6};

		missingNumbers(array);
	}

	public static void missingNumbers(Integer[] array) {

		HashSet<Integer> set = new HashSet<>();
         for(int num : array) {
        	 set.add(num);
         }
		
		for(int i =0; i<10; i++) {
//			System.out.println(j);
			if(!set.contains(i)) {
				System.out.println("Missing Numbers"+i);
			}
		}
		
	}

}
