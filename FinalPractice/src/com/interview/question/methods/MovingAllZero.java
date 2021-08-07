package com.interview.question.methods;

public class MovingAllZero {
	
	public static void movingAllZero(int[] values) {
		
		int count = 0;
		
		for(int i =0;i<values.length;i++) {
			if(values[i] !=0) {
				values[count] = values[i];
				count++;
			}
		}
		while(count<values.length) {
			values[count] =0;
			count++;
		}
		for(int a : values) {
			System.out.println(a);
		}
	}

}
