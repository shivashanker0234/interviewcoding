package com.msys.strings;

import java.util.Arrays;

public class Anagram {
	
	public static void main (String [] args) {
		
		String string1 = "java";
		String string2 = "java";
		
		System.out.println(anagramCheck(string1, string2));
		
	}
	
	public static boolean anagramCheck(String string1, String string2) {
		
		char [] charArray1 = string1.toCharArray();
		char [] charArray2 = string2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		

		return Arrays.equals(charArray1, charArray2);
	
	}

}
