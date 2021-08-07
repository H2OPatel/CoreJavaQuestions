package basic.java.interview.question;

import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatingSubStrring {

	public static void main(String[] args) {

		String s = "abccdabcde";
		Set<Character> set = new HashSet<>();
		int maxLen = 0;
		String ls = "";
		int left = 0;
		int right = 0;
		
		while(right<s.length()) {
			if(!set.contains(s.charAt(right))) {
				set.add(s.charAt(right));
				right++; // meeting the condition, expand the window with right++
				if(right-left>=maxLen) {
					maxLen = right - left;
					ls = s.substring(left, right);
					//System.out.println("Maximum lengh for each time :" + maxLen);
					System.out.println(ls);
				}
			}else {
				set.remove(s.charAt(left));
				left++; // not meeting the condition, shrink the window with left++
			}
		}
		System.out.println("The longest non repeating subsequence is : "+ ls + " With length of :"+ maxLen);
		
		
	}

}
