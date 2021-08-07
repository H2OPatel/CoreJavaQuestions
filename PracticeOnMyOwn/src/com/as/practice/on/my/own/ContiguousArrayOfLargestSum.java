package com.as.practice.on.my.own;

import java.util.HashSet;
import java.util.Set;

public class ContiguousArrayOfLargestSum {

	public static void main(String[] args) {
		
		int[] a = {-2,-3,4,-1,-2,1,5,-6,-3};
		int max_so_far = a[0];
		int max_here =a[0];
		
		for(int i=0;i<a.length;i++) {
			max_here = Math.max(a[i], max_here+a[i]);
			max_so_far = Math.max(max_here, max_so_far);
		}
		
		
		System.out.println(max_so_far);
	}

}
