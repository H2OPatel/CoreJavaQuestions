package com.java.string;

public class StringReplaceAll {

	public static void main(String[] args) {
		 
		String str = "Let's see what this string looks like we replace all white space with any character";
		System.out.println("Original string : " + str);
		str = str.replaceAll("\\s+", "-");
		System.out.println("String after operation : " + str); 

	}

}

// a-zA-Z\'[0-]+
// \\s+, -