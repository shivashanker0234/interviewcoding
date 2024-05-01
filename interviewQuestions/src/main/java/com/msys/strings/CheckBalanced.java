package com.msys.strings;

import java.util.Stack;

public class CheckBalanced {

	public static void main(String args[]) {

		String string = "{[]}";

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < string.length(); i++) {

			char ch = string.charAt(i);

			if (stack.isEmpty()) {
				stack.push(ch);
				
			} else if (ch == '{' || ch == '[' || ch == '(') {
				stack.push(ch);
				
			} else if (ch == '}' && stack.peek() == '{') {
				stack.pop();
				
			} else if (ch ==']' && stack.peek()=='[') {
				stack.pop();
			}
			else if (ch ==')' && stack.peek()=='(') {
				stack.pop();
			}
		}    if(stack.isEmpty()) {
			
			System.out.println("Given String is a Balanced String");
		} else {
			System.out.println("Not balanced");
		}
	}

}
