class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int l = cost.length - 1;
        int[] dp = new int[l+1];
        Arrays.fill(dp,-1);
        int n1 = minc( cost , l , dp);
        int n2 = minc( cost , l - 1, dp);
        return Math.min(n1,n2);
    }
    public int minc(int[] a , int s ,int[] dp){
        if( s == 0 )return a[0];
        if( s == 1) return a[1];
        if(dp[s] != -1){
            return dp[s];
        }
        return dp[s] = Math.min (minc(a,s-1,dp),minc(a,s-2,dp)) + a[s];
    }

    
}