package com.msys.strings;

public class ExtractFirstLetter {
	
	public static void main(String args[]) {
		
		String string = "Shiva the die hard fan of praboss";
		find1stLetterofEachWord(string);
	}
    
	public static void find1stLetterofEachWord(String string) {
		
		String words[]= string.split(" ");
		
		for(int i=0; i<words.length; i++) {
			
			String s = words[i];
			
			System.out.println(s.charAt(0));
		}
		
	}
}
