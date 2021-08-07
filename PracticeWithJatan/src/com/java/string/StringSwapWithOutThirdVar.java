package com.java.string;

public class StringSwapWithOutThirdVar {

	public static void main(String[] args) {
		String s1 = "Jal";
		String s2 = "Patel";
		System.out.println("The strings before swapping : "+ s1 + " " +s2);
		s1 = s1 + s2;
		
		s2 = s1.substring(0, (s1.length() - s2.length()));
		s1 = s1.substring(s2.length());
		System.out.println("The strings after swapping : "+ s1 + " " +s2);
	}

}
