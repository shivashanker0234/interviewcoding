package com.msys.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindMajorityOfElement {
	
	public static void main(String args[]) {
		
		int[] array = {1,1,2,2,2,3,4};
		
		System.out.println(findMajorityElementInArray(array,6));
	}
	
	
	public static int findMajorityElementInArray(int[] array, int size) {
		
		
		Map<Integer, Integer> map = new HashMap<>();
		
		    for(int i : array) {
		    	
		    	Integer value = map.get(i);
		    	
		    	if(value==null) {
		    		
		    		map.put(i, 1);
		    	}else {
		    		map.put(i, value+1);
		    	}
		    	
		    }  
             for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            	
            	 if(entry.getValue()>size/3) {
            		 
            		 return entry.getKey();
            	 }
             }
		 return 0;
	}

}
