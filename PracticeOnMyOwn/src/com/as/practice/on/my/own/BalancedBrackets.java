package com.as.practice.on.my.own;

import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		
		String s = ")({}[]";
		Stack<Character> stk = new Stack<>();
		boolean isBalanced = true;
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			char pop = ' ';
			if(c == '(' || c == '{' || c == '[' ) {
				stk.add(c);
			}if(c == ')' || c == '}' || c == ']') {
				if(stk.isEmpty()) {
					isBalanced = false;
				}else {
					pop = stk.pop();
				}
			}
		}
		
		if(stk.isEmpty() && isBalanced) {
			System.out.println("The given String is Balanced");
		}else {
			System.out.println("The given String is not Balanced");
		}
		
		
		
	}

}
