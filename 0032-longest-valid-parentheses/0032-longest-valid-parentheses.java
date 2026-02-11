class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        int[] dp = new int[n];
        int m = 0;
        for(int i = 1 ; i < n ; i++){
            if( s.charAt(i) == ')'){
                if(s.charAt(i-1) == '('){
                    dp[i] = 2;
                    if(i >= 2 ){
                        dp[i] += dp[i-2];
                    }
                }else{
                    int p = i - dp[i-1] - 1;
                    if(p >= 0 && s.charAt(p) == '('){
                        dp[i] = dp[ i - 1 ] + 2;
                        if ( p >= 1 ){
                            dp[i] += dp[p-1];
                         } 
                    }
                }
                m = Math.max(m,dp[i]);
            }
        }
        return m;
        
    }
}