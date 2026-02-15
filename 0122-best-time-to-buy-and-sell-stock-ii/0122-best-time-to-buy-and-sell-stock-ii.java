class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] dp = new int[n];
        dp[0] = 0;
        for(int i = 1 ; i < n ; i++){
            int profit = prices[i] - prices[i-1];
            dp[i] = Math.max(dp[i-1] , profit + dp[i-1]);
        }
        return dp[n-1];
        
    }
}