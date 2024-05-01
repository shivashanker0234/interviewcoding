package com.msys.strings;

import java.util.HashSet;

public class FindLongestSubstringWithoutRepeat {

	public static void main(String args[]) {

		String string = "abcd";

		System.out.println(longestSubstring(string));
	}

	public static String longestSubstring(String string) {

		String longestTillNow = "";
		String longestOverAll = "";

		HashSet<Character> set = new HashSet<>();

		for (int i = 0; i < string.length(); i++) {

			char c = string.charAt(i);

			if (set.contains(c)) {

				longestTillNow = "";
				set.clear();
			}

			set.add(c);
			longestTillNow += c;
			if (longestTillNow.length() > longestOverAll.length()) {

				longestOverAll = longestTillNow;
			}

		}

		return longestOverAll;
	}

}
