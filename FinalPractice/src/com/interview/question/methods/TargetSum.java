package com.interview.question.methods;

public class TargetSum {
	
	public static void targetSum(int a[],int target) {
		
		int size = a.length;
		
		for (int i=0;i<size-1;i++) {
			for (int j=i+1;j<size;j++) {
				if (a[j] == target - a[i]) {
					System.out.println(a[i]+" "+a[j]);
				}
			}
			
		}
		
	}

}
