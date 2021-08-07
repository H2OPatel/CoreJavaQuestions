package com.java.string;

public class StringUpperLowerCase {

	public static void main(String[] args) {
		
		String str = "LeT's haVe SuM fuN";
		StringBuffer str1 = new StringBuffer(str);
		
		for(int i = 0 ; i < str.length() ; i++) {
			
			if(Character.isLowerCase(str.charAt(i))) {
				str1.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}
			
			else if(Character.isUpperCase(str.charAt(i))) {
				str1.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
			
		}
		
		String string = str1.toString();
		System.out.println(string);
		

	}

}
