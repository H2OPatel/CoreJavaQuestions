package com.interview.question.methods;

public class ReverseTheString {
	
	public static String reverseTheString(String str) {
		int len = str.length();
		int left = 0;
		int right = len-1;
		
		char[] word =str.toCharArray();
		while (left <= right) {
			char temp = word[left];
			word[left] = word[right];
			word[right] = temp;
			left++;
			right--;
		}
			return String.valueOf(word);
	}
	public static String reverseTheStringWithBuffer (String str) {
		
		StringBuffer sb = new StringBuffer();
		for (int i = str.length()-1; i>=0;i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
}
