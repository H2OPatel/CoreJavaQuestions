package com.as.practice.on.my.own;
/*
 * when left = 0 -> {1,2,0,3,0,5,7,44,0,9,11}
 * when left = 1 -> {1,2,0,3,0,5,7,44,0,9,11}
 * when left = 2 -> {1,2,3,3,0,5,7,44,0,9,11}
 * when left = 3 -> {1,2,3,5,0,5,7,44,0,9,11}
 * when left = 4 -> {1,2,3,5,7,5,7,44,0,9,11}
 * when left = 5 -> {1,2,3,5,7,44,7,44,0,9,11}
 * when left = 6 -> {1,2,3,5,7,44,9,44,0,9,11}
 * when left = 7 -> {1,2,3,5,7,44,9,11,0,9,11}
 */

public class MovingAllZeroToEnd {

	public static void main(String[] args) {
		
		
		int[] a = {1,2,0,3,0,5,7,44,0,9,11};
		int left = 0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				a[left] = a[i];
				left++;
			}
		}
		while(left<a.length) {
			a[left] = 0;
			left++;
		}
		for(int o : a) {
			System.out.println(o);
		}
		
		
		

	}

}
