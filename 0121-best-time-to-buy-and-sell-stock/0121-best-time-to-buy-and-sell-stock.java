class Solution {
    public int maxProfit(int[] prices) {

        int mincost = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i = 0; i < prices.length; i++) {

            mincost = Math.min(mincost, prices[i]);

            int profit = prices[i] - mincost;

            maxprofit = Math.max(maxprofit, profit);
        }

        return maxprofit;
    }
}