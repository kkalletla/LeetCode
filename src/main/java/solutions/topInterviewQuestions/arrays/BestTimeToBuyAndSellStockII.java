package solutions.topInterviewQuestions.arrays;

public class BestTimeToBuyAndSellStockII {

    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 0; i < prices.length - 1; i++) {
            profit += (prices[i] < prices[i+1]) ? (prices[i+1] - prices[i]) : 0;
        }
        return profit;
    }
}
