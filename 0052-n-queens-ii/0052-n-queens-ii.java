class Solution {
    int c = 0;
    public int totalNQueens(int n) {
        boolean[] d1 = new boolean[2*n];
        boolean[] d2 = new boolean[2*n];
        boolean[] col = new boolean[n];
        backtrack(0,n,d1,d2,col);
        return c;
    }
    void backtrack(int row , int n , boolean[] d1 , boolean[] d2,boolean[] cols){
        if(row == n){
            c++;
            return;
        }
        for(int i = 0 ; i < n ; i++){
            int j = row + i ;
            int k = row - i + n;
            if(cols[i] || d1[j] || d2[k])continue;
            cols[i] = d1[j] = d2[k] = true;
            backtrack(row + 1 , n , d1 , d2 , cols);
            cols[i] = d1[j] = d2[k] = false;
        }
    }
}