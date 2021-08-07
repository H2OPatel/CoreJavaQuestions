package com.interview.question.methods;

public class BestTimeToBuyAndSellStock {
	
	public static int bestTimeToBuyAndSellStock(int[] price) {
		
		int max = 0;
		int min = Integer.MAX_VALUE;
		
		for (int i =0; i<price.length;i++) {
			if(price[i]<min) {
				min = price[i];
			}else {
				max = Math.max(max, price[i]-min);
			}
		}
		return max;
	}
}
