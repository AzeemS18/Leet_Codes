class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0 ;
        for(int i : nums){
            sum += i;
        }
        if(sum % 2 != 0 )return false;
        int r = sum /2 ;
        boolean[] dp = new boolean[r+1];
        Arrays.fill(dp,false);
        dp[0] = true;
        for(int i : nums){
            for(int j = r ; j >= i ; j --){
                dp[j] = dp[j] || dp[ j - i ];
            }
        }
        return dp[r];
        
    }
}