package com.interview.question.methods;

import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatingSubStrring {

	public static void longestNonRepeatingSubString(String s) {
		int max_len = 0;
		int right = 0;
		int left = 0;
		String ls = "";

		Set<Character> set = new HashSet<>();

		while (right < s.length()) {
			if (!set.contains(s.charAt(right))) {
				set.add(s.charAt(right));
				right++;
				if (right - left >= max_len) {
					max_len = right - left;
					ls = s.substring(left, right);
				}
			} else {
				set.remove(s.charAt(left));
				left++;
			}

		}
		System.out.println("The longest non repeating subsequence is : "+ ls + " With length of :"+ max_len);

	}
}
