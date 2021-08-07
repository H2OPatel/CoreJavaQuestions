 package basic.java.interview.question;

import java.util.Stack;

/*
 * (, ), {, }, [, ]
 *  str = "[]" 
 *  str = "({})" 
 *  str = "({)}"
 *  str = "}{)("
 *  "(){}{}[]"
 *  
 *  if((c=='}' && pop != '{') || ...)
 *   
 */
public class BalancedBrackets {
	public static void main(String[] args) {
		//String s = "(((}}}";
		String s = "(){}[]";
		Stack<Character> stack = new Stack<>();
		boolean isBalanced = true;
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c == '[' || c == '{' || c == '(') {
				stack.add(c);
			}
			if(c == ']' || c == '}' ||c == ')') {
				if(stack.isEmpty()) {
					isBalanced = false;
					break;
				}else {
					char pop = stack.pop();
					if((c == ']' && pop != '[') || (c == '}' && pop != '{') || (c == ')' && pop != '(') ) {
						isBalanced = false;
						break;
					}
				}
			}
		}
		if(isBalanced && stack.isEmpty())
			System.out.println("Balanced.");
		else
			System.out.println("Not Balanced.");
	}

}
