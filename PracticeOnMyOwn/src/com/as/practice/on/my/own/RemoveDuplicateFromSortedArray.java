package com.as.practice.on.my.own;

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {

		int[] a = {1,1,1,2,2,3,4,4,4,5,5,5,6,6,6,6};
		int left = 0;
		//int right = 0;
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				a[left]=a[i];
				left++;
			}
		
		}
		a[left] = a[a.length-1];
		for(int j=0;j<=left;j++) {
			System.out.println(a[j]);
		}
		
		
	}

}
