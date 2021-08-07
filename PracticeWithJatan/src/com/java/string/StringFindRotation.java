package com.java.string;

public class StringFindRotation {

	public static void main(String[] args) {
		
		String s1 = "jatan";
		String s2 = "anjat";
		
		s1 = s1 + s1;
		int in = -1;
		if(s1.length() == s2.length()) {
			in = s1.indexOf(s2);
		}else{
			System.out.println("The length of both strings are not equal thus they are not rotation ofeach other");
		}
		
		in = s1.indexOf(s2);
		
		if (in != -1) {
			System.out.println("yes both strings are rotation of eacg other");
		}else {
			System.out.println("no both strings are not rotation of eacg other");

		}

	}

}
