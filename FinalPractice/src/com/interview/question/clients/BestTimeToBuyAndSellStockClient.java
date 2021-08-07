package com.interview.question.clients;

import com.interview.question.methods.BestTimeToBuyAndSellStock;

public class BestTimeToBuyAndSellStockClient {

	public static void main(String[] args) {
		int[] price1= {5,8,9,5,4,10,7,6};
		int[] price2= {10,7,6,5,2,1};

		int maxProfit1 = BestTimeToBuyAndSellStock.bestTimeToBuyAndSellStock(price1);
		System.out.println("the max profit for stock 1 would be : "+maxProfit1);
		int maxProfit2 = BestTimeToBuyAndSellStock.bestTimeToBuyAndSellStock(price2);
		System.out.println("the max profit for stock 2 would be : "+maxProfit2);
	}

}
