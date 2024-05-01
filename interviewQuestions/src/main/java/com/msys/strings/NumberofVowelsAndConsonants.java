package com.msys.strings;

public class NumberofVowelsAndConsonants {

	public static boolean isVowel(char ch) {

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		} else {
			return false;

		}
	}

	public static void main(String args[]) {

		String string = "shiva";

		int vowels = 0;
		int consonents = 0;

		for (int i = 0; i < string.length(); i++) {

			if (isVowel(string.charAt(i))) {

				vowels++;
			} else {
				consonents++;
			}
		}
		System.out.println("vowels : "+vowels);
		System.out.println("Consonents : "+ consonents);
	}

}
