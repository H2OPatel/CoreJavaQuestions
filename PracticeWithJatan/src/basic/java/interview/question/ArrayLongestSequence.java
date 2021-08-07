package basic.java.interview.question;

import java.util.HashSet;
import java.util.Set;

public class ArrayLongestSequence {

	public static void main(String[] args) {
		int[] nums = { 2, 5, 9, 3, 8, 11, 4, 100, 109, 106 };
		Set<Integer> numSet = new HashSet<>();
		for (int num : nums) {
			numSet.add(num);
		}

		System.out.println(numSet);

		int longestLength = 0;
		for (int num : nums) {
			if (!numSet.contains(num - 1)) {
				int lnum = num;
				int currentLength = 1;

				while (numSet.contains(lnum + 1)) {
					lnum++;
					currentLength++;
				}
				longestLength = Math.max(currentLength, longestLength);
			}
		}
		System.out.println("The length of the longest sequence of elements  is : " + longestLength);
		
	}

}
