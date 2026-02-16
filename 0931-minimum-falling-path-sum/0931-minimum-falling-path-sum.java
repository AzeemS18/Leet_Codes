class Solution {
    public int minFallingPathSum(int[][] m) {
        int n = m.length;
        int[][] dp = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            dp[0][i] = m[0][i];
        }
        for(int i = 1 ; i < n ;i++){
            for(int j = 0 ; j < n ; j++){
                int min =Integer.MAX_VALUE;
                if( j > 0 && j < n-1){
                    min = Math.min( dp[i-1][j] , Math.min(dp[i-1][j-1] ,dp[i-1][j+1] ));
                }else if ( j == 0){
                    min = Math.min( dp[i-1][j] , dp[i-1][j+1] );
                }else if ( j == n-1 ){
                    min = Math.min( dp[i-1][j] , dp[i-1][j-1] );
                }
                dp[i][j] = min + m[i][j]; 
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            min = Math.min(dp[n-1][i],min);
        }
        return min;

        
    }
}