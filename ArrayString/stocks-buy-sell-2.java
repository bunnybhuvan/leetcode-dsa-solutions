class Solution {
    
public int maxProfit(int[] prices) {
    int profit = 0;                       // total profit

    for (int i = 1; i < prices.length; i++) {
        if (prices[i] > prices[i - 1]) { // price rose?
            profit += prices[i] - prices[i - 1]; // collect gain
        }
    }

    return profit;
} 
}