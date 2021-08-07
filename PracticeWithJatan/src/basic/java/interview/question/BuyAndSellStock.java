package basic.java.interview.question;

public class BuyAndSellStock {

	public static void main(String[] args) {
		
		int[] stock = {800,300,200,700,100,400,500};
		int max_profit = -1*stock[0];
		int min_so_far = stock[0];
		int bestBuyingDay = 0;
		int bestSellingDay = 0;
		for(int i=0; i<stock.length-1; i++) {
			//min_so_far = Math.min(min_so_far, stock[i]);
			if(min_so_far>=stock[i]) {
				min_so_far = stock[i];
				if(bestSellingDay>=bestBuyingDay)
					bestBuyingDay = i;
			}
				
			int profit = stock[i+1] - min_so_far;
			//max_profit=Math.max(profit, max_profit);
			if(max_profit <= profit) {
				max_profit = profit;
				bestSellingDay = i+1;
			}
		}
		System.out.println(max_profit);
		System.out.println(bestBuyingDay);
		System.out.println(bestSellingDay);
	
	}

}
