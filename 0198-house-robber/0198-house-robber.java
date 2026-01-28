class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        
        int r = hrob(nums,0,n);
        return r;
    }
    static int hrob(int[] a , int s ,int e){
        int n = a.length;
        int[] dp = new int[n];
        if(a[0] < 0){
            dp[0] = 0 ;
        }else if(a[0] > 0 ){
            dp[0] = a[0];
        }
        if(n == 1)return a[0];
        dp[1] = Math.max(dp[0],a[1]);
        for(int i = 2 ; i < n ; i++){
            dp[i] = Math.max(dp[i-1], a[i] + dp[i-2]);
        }
        return dp[n-1];
    }
    
}