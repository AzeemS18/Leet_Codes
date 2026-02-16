class Solution {
    public int minimumTotal(List<List<Integer>> t) {
        int n = t.size();
        int[][] dp = new int[n][n];
        dp[0][0] = t.get(0).get(0);
        for(int i = 1 ; i < n ; i++){
            for(int j = 0 ; j <= i ; j++){
                int r = t.get(i).get(j);
                if( j == 0 ){
                    dp[i][j] = r + dp[i-1][j];
                }else if ( j == i){
                    dp[i][j] = r + dp[i-1][j-1];
                }else{
                    dp[i][j] = r + Math.min(dp[i-1][j],dp[i-1][j-1]);
                }
            }
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            min = Math.min(min,dp[n-1][i]);
        }
        return min;
    }
}