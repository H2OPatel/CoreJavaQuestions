package com.java.string;

public class StringPalindrome {

	public static void main(String[] args) {
		String str = "TacoCat";
		str = str.toLowerCase();
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}

		if (str.equals(rev)) {
			System.out.println("Yes the string is Palindrome");
		} else {
			System.out.println("NO the string is not Palindrome");

		}
		System.out.println(StringUtilities.isPalindrome(str));
		System.out.println(StringUtilities.isPalindrome("eye"));
		System.out.println(StringUtilities.isPalindrome("lol"));
		System.out.println(StringUtilities.isPalindrome("wow"));
		System.out.println(StringUtilities.isPalindrome("ggg"));
		System.out.println(StringUtilities.isPalindrome("nblfsnlbn"));
		System.out.println(StringUtilities.isPalindrome("yOboyyOboy"));
	}

}
