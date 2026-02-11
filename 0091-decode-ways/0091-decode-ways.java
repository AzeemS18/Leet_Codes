class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if(n == 0 || s.charAt(0) == '0' || s == null) return 0;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2 ; i <= n ; i++){
            int f = Integer.parseInt(s.substring( i - 1 , i ));
            if( 1 <= f && f <= 9 ){
                dp[i] += dp[i-1];
            }
            int se = Integer.parseInt(s.substring( i - 2 , i ));
            if( 10 <= se && se <= 26 ){
                dp[i] += dp[i-2];
            }
        }
        return dp[n];
        
    }
}