package com.msys.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Find1stNonRepatingCharacter {
	
	
	public static void main ( String args[]) {
		
		String string = "shivash";
		System.out.println(find1stNonRepeatingCharacter(string));
	}
	
	public static char find1stNonRepeatingCharacter(String string) {
		
		Map<Character, Integer> countMap = new LinkedHashMap<>();
		
		   for(char ch : string.toCharArray()) {
			   
			   countMap.put(ch, countMap.containsKey(ch) ? countMap.get(ch)+1 : 1);
		   }
		   
		   for(Entry<Character, Integer> entry : countMap.entrySet()) {
			   
			   if(entry.getValue()==1) {
				   
				   return entry.getKey();
			   }
			   
		   }
		
		   throw new RuntimeException("NO NON REPEATING Characters are there");
		
	}
}
