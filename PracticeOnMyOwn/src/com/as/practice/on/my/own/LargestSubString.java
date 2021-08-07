package com.as.practice.on.my.own;

import java.util.HashSet;
import java.util.Set;

public class LargestSubString {

	public static void main(String[] args) {

		String s = "abccbabcde";
		Set<Character> set = new HashSet<>();
		int left = 0;
		int right = 0;
		String ls = "";
		int maxlen = 0;
		
		while(right<s.length()) {
			if(!set.contains(s.charAt(right))) {
				set.add(s.charAt(right));
				right++;
			if(right-left>=maxlen) {
				maxlen = right- left;
				ls = s.substring(left, right);
			}
			}else {
				set.remove(s.charAt(left));
				left++;
			}
		}
		
		System.out.println("The longest substring in the string is: " + ls +" And it's length is: "+ maxlen);
		
	}

}
