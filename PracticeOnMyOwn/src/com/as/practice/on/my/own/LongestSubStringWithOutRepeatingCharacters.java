package com.as.practice.on.my.own;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithOutRepeatingCharacters {

	public static void main(String[] args) {
		
		String s ="abccbabcde";
		Set<Character> set = new HashSet<>();
		String ls ="";
		int right = 0;
		int left =0;
		int maxLen = 0;
		
		while(right<s.length()) {
			if(!set.contains(s.charAt(right))) {
				set.add(s.charAt(right));
				right++;
			if(right-left>=maxLen) {
				maxLen = right-left;
				ls = s.substring(left, right);
				System.out.println("String : " + ls + " It's length : "+ maxLen);
			}
			}else {
				set.remove(s.charAt(left));
				left++;
			}
		}
	}
}	