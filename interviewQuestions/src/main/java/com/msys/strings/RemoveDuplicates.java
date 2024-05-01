package com.msys.strings;

import java.util.HashSet;

public class RemoveDuplicates {
	
	public static void main (String [] args) {
		
		String string = "sss";
		
		System.out.println(removeDuplicates(string));
		
	}

	
	public static String removeDuplicates(String string) {
		
		HashSet<Character> set = new HashSet<>();
		
		StringBuilder sf = new StringBuilder();
		
		
		for(int i=0; i<string.length();i++) {
			
			Character c = string.charAt(i);
			
			if(!set.contains(c)) {
				set.add(c);
				sf.append(c);
				
			}
			
		}
		
		return sf.toString();
	}
}
