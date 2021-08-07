package com.as.practice.on.my.own;

import java.util.HashSet;
import java.util.Set;

public class ArrayTargetSum {

	public static void main(String[] args) {

		int[] a = {2,3,4,5,6,8,7,1,9};
		int target = 13;
		
		Set<Integer> set = new HashSet<>();
		
		for(int i : a) {
			set.add(i);
		if(set.contains(target-i)) {
			System.out.println("The first number is: "+i + " The second number is: "+ (target-i));
		}
		}
		
		
		
	}

}
