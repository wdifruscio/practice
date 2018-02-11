class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}

//[1,5,9,1,2]  <- in
// 5 > 1 -> +4 
// 9 > 5 -> +5
// 1 < 9 -> do nothing
// 1 < 2 -> do nothing
