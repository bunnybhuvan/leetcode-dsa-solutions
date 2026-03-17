// Problem: Best Time to Buy and Sell Stock
// Platform: LeetCode
// Pattern: Array / Greedy
// Time Complexity: O(n)
// Space Complexity: O(1)

// Description:
// Given an array prices where prices[i] is the price of a stock on day i,
// find the maximum profit you can achieve by buying on one day and selling on another later day.
// Return the maximum profit. If no profit is possible, return 0.

// Approach:
// Traverse the array while tracking the minimum price seen so far.
// For each price, calculate the profit by subtracting the minimum price.
// Update the maximum profit if the current profit is higher.
// This ensures we always buy at the lowest price and sell at the highest profit.

class Solution {
    public int maxProfit(int[] prices) {
    int minPrice = Integer.MAX_VALUE;  // Track cheapest buy
    int maxProfit = 0;                 // Track best profit

    for (int price : prices) {
        if (price < minPrice) {
            minPrice = price;          // Update buy day
        } else {
            int profit = price - minPrice;
            maxProfit = Math.max(maxProfit, profit); // Update profit
        }
    }

    return maxProfit;
}
}