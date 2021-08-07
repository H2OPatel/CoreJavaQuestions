package com.java.string;

public class StringRemoveWhiteSpace {

	public static void main(String[] args) {
		
		String str = "Let's remove all the white space from the string";
		System.out.println("Original string : " + str);
		str = str.replaceAll("\\s+", "");
		System.out.println("The string after operation : " + str);
		
	}

}
