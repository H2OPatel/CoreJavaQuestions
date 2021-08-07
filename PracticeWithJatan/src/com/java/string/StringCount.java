package com.java.string;

public class StringCount {

	public static void main(String[] args) {
	
		String str = "Let's count total characters of the string.";
		int count = 0;
		
		for(int i = 0 ; i < str.length() ; i++) {
			if(str.charAt(i) != ' ') {
				count++;
				
			}
		}
		System.out.println("The total number of characters in the string are " + count);
	}

}
