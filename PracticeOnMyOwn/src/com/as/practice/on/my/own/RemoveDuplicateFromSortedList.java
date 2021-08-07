package com.as.practice.on.my.own;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromSortedList {

	public static void main(String[] args) {

		Integer[] a = {1,1,2,2,2,3,4,454,22,31,31,31,40,40};
		List<Integer> l = Arrays.asList(a);
		
		int left =0;
		int right =0;
		for(right=0;right<l.size()-1;right++) {
			if(l.get(right) != l.get(right+1)) {
				l.set(left, l.get(right));
				left++;
			}
		}
		l.set(left, l.get(right));
		while(left<l.size()-1) {
			l.set(left+1, null);
			left++;
		}
		l.stream().forEach(element -> System.out.println(element));
	}

}
