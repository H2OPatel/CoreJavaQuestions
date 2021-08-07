package com.interview.question.methods;

import java.util.Stack;

public class BalancedBrackets {
	
	public static void balancedBrackets (String s) {
		
		Stack<Character> characters = new Stack<>();
		boolean isBalanced = true;
		
		for (int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c == '(' ||c == '{' ||c == '[') {
				characters.add(c);
			}if(c == ')' ||c == '}' ||c == ']') {
				if(characters.isEmpty()) {
					isBalanced = false;
				}else {
					char pop = characters.pop();
					if((c == ']' && pop != '[') || (c == '}' && pop != '{') || (c == ')' && pop != '(') ) {
						isBalanced = false;
						break;
					}
				}
			}
		}
		if (isBalanced && characters.isEmpty()) {
			System.out.println("It is Balanced");
		}else {
			System.out.println("It is not Balanced");
		}
		
	}

}
