// Title: Best Time to Buy and Sell Stock
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int min=prices[0];
        for(int i=0; i<prices.length; i++)
        {
            if(prices[i]<min)
        }
            {
                min=prices[i];
            }
    }
        return profit;

            if(prices[i]-min>profit) profit=prices[i]-min;
}
