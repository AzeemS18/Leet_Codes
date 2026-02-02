class Solution {
    public int findTargetSumWays(int[] nums, int t) {
        int sum = 0;
        for(int i : nums)sum += i;
        if(Math.abs(t) > sum ) return 0;
        if( (t + sum) %2 != 0) return 0;
        int subsum = (t+sum) / 2;
        int[] dp = new int[subsum+1];
        dp[0] = 1;
        for(int i : nums){
            for(int j = subsum ; j - i >= 0 ; j-- ){
                dp[j] += dp[j-i];
            }
        }
        return dp[subsum];
    }
}