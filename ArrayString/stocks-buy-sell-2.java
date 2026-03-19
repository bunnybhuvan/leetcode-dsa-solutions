// Problem: Best Time to Buy and Sell Stock II
// Platform: LeetCode
// Pattern: Array / Greedy
// Time Complexity: O(n)
// Space Complexity: O(1)

// Description:
// Given an array prices where prices[i] is the price of a stock on day i,
// find the maximum profit you can achieve. You may complete as many transactions
// as you like (buy one and sell one share multiple times).
// However, you must sell the stock before you buy again.

// Approach:
// Traverse the array and capture every increasing price difference.
// If the price on the current day is greater than the previous day,
// add the difference to the total profit.
// This way, we accumulate all profitable transactions.
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
