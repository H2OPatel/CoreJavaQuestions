package com.interview.question.methods;

public class IsStringPalindrome {
	public static void isStringPalindrome(String str) {
		int len = str.length();
		int left = 0;
		int right = len - 1;
		boolean isPalindrome = true;

		while (left <= right) {
			if (str.charAt(left) == str.charAt(right)) {
				left++;
				right--;
			} else {
				System.out.println("String is not palindrome.");
				isPalindrome = false;
				break;
			}
		}
			if (isPalindrome) {
				System.out.println("String is palindrome.");
			}
		
	}
}
