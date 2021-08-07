package com.java.string;

/**
 * String Utility class having common methods to be reused.
 * @author jal
 *
 */
public class StringUtilities {
	/**
	 * This utility method checks a word for palindrome.
	 * @param word
	 * @return true or false
	 */
	public static boolean isPalindrome(String word) {
		if(word!=null) {
			word = word.toLowerCase();
			int left = 0;
			int right = word.length()-1;
			while(left<=right) {
				if(word.charAt(left)!=word.charAt(right))
					return false;
				left++;
				right--;
			}
			return true;
		}
		return false;
	}
	
	public static String isPrime(int n) {
		if(n==1) return "false";
		for(int i=2; i<=Math.sqrt(n); i++ ) {
			if(n%i==0)
				return "false";
		}
		return "true";
	}
	
	public static String isPrimeWithFlag(int n) {
		if(n==1) {
			return n+" is not Prime.";
		}
		boolean flag = true;
		for(int i=2; i<=Math.sqrt(n); i++ ) {
			if(n%i==0) {
				flag = false;
				break;
			}
		}
		if(flag)
			return n+" is Prime.";
		else
			return n+" is not Prime.";
	}
}
