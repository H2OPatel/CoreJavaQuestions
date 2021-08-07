package com.interview.question.methods;

import java.util.HashSet;
import java.util.Set;

public class ArrayLongestSequence {
	
	public static int lengthOfLongestSequence (int nums[]) {
		Set<Integer> numSet = new HashSet<>();
		
		for (int a : nums) {
			numSet.add(a);
		}
		//System.out.println(numSet);
		
		int longestLength = 0;
		
		for (int num : nums) {
			if(!numSet.contains(num-1)) {
				int tempNum = num;
				int currentLength = 1;
				
				while (numSet.contains(tempNum+1)) {
					tempNum++;
					currentLength++;
				}
				longestLength = Math.max(currentLength, longestLength);
				
			}
		}
		//System.out.println(longestLength);
		return longestLength;
	}

}
