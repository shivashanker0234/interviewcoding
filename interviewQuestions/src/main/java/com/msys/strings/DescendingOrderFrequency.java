package com.msys.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class DescendingOrderFrequency {
    
    public static void main(String args[]) {
        
        String string = "banana";
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Count the frequency of each character
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        
        // Convert HashMap entries to a list
        List<Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());
        
        // Sort the list based on the values (frequency) in descending order
        Collections.sort(entryList, new Comparator<Entry<Character, Integer>>() {
            @Override
            public int compare(Entry<Character, Integer> e1, Entry<Character, Integer> e2) {
                return e2.getValue().compareTo(e1.getValue());
            }
        });
        
        // Display the characters in descending order of their frequency
        for (Entry<Character, Integer> entry : entryList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
