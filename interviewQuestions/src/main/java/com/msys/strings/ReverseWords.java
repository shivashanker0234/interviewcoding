package com.msys.strings;
public class ReverseWords {
	
	public static void main(String args[]) {
		
		
		String string = "Hello world Hello o";
		
		String splitArray[] = string.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for( int i = splitArray.length-1; i>=0; i--) {
			
			sb.append(splitArray[i]).append(" ");			
			
		}	
        System.out.println(sb);	
        
      

	}
}