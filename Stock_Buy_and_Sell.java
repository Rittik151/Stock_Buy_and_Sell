import java.util.*;

class Stock_Buy_and_Sell {
    public int maxProfit(int[] prices) {
        // code here
        int totalProfit = 0;

		for (int i = 1; i < prices.length; i++) {
			int priceDiff = prices[i] - prices[i - 1];
			totalProfit += Math.max(0, priceDiff);
		}

		return totalProfit;
    }
}