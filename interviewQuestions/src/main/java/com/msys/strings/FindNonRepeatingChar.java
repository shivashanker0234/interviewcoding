package com.msys.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class FindNonRepeatingChar {

	public static void main(String args[]) {

		String string = "sshiaa";

		System.out.println(findNonReapting(string));
	}

	public static Map<Character, Integer> findNonReapting(String string) {

		Map<Character, Integer> countMap = new HashMap<>();
		

		for (char ch : string.toCharArray()) {   // time o(n)

			countMap.put(ch, countMap.containsKey(ch) ? countMap.get(ch) + 1 : 1);

		}
		
		Map<Character, Integer> nonRepeatMap = new HashMap<>();

		
		for(Entry<Character, Integer> entry : countMap.entrySet()) { // o(n)
			
			if(entry.getValue()==1) {
				
				nonRepeatMap.put(entry.getKey(), entry.getValue());
			}
		}
		
		return nonRepeatMap;
		
		
	}

};