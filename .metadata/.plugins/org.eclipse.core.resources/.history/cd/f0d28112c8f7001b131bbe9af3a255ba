package com.interview.question.methods;

public class ContiguousArrayLargestSum {
	
	public static int calculateLargestSum (int num[]) {
		int max_so_far = num[0];
		int current_max = num[0];
		
		for (int i = 0; i<num.length;i++) {
			current_max = Math.max(num[i], current_max+num[i]);
			max_so_far = Math.max(current_max,max_so_far);
		}
		
		return max_so_far;
	}

}
