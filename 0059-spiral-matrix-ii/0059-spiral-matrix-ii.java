class Solution {
    public int[][] generateMatrix(int n) {
        int t = 0 ;
        int b = n - 1 ; 
        int r = n - 1 ;
        int l = 0;
        int x = 1;
        int[][] res = new int[n][n];
        while(l <= r && t <= b){
            for(int i = l ; i <= r ; i++){
                res[t][i] = x++;
            }
            t++;
            for(int i = t ; i <= b ; i++){
                res[i][r] = x++;
            }
            r--;
            for(int i = r ; i >= l ; i--){
                res[b][i] = x++;
            }
            b--;
            for(int i = b ; i >= t ; i--){
                res[i][l] = x++;
            }
            l++;

        }
        return res;
        
    }
}