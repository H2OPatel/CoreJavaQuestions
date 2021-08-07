package com.java.string;

public class StringFindLargestWord {

	public static void main(String[] args) {
		
		String str = "Hardships often prepare ordinary people for an extraordinary destiny";
		String[] s = str.split(" ");
		String shortest = s[0];
		String longest = "";
		
		for (String s1 : s) {
			if(shortest.length() > s1.length()) {
				shortest = s1;
			}else if(longest.length() < s1.length()) {
				longest = s1;
			}
		}
		 System.out.println("The Shortest word in the string is : " + shortest);
		 System.out.println("The Longest word in the string is : " + longest);

	}

}
