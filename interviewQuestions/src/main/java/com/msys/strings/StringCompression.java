package com.msys.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringCompression {
	
	public static void main (String args[]) {
		
		String string = "siddu";  
		//Output should be = s1i1d2u1
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		
		for(int i=0; i< string.length(); i++) {
			
			if(map.get(string.charAt(i))==null) {
				map.put(string.charAt(i), 1);
			}else {
				
				map.put(string.charAt(i), map.get(string.charAt(i))+1);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(Entry<Character, Integer> entry : map.entrySet()) {
			
			sb.append(entry.getKey());
			sb.append(entry.getValue());
			
		}
		System.out.println(sb);
	}
}
