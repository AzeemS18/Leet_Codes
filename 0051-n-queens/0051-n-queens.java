class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] b = new char[n][n];
        for(int i = 0 ; i < n ; i++){
            Arrays.fill(b[i],'.');
        }
        List<List<String>> res = new ArrayList<>();
        backtrack(b,0,res);
        return res;
    }
    static void backtrack(char[][] b , int r , List<List<String>> res){
        int n = b.length;
        if(r == n){
            List<String> l = new ArrayList<>();
            for(int i = 0 ; i < n ; i++){
                l.add(new String(b[i]));
            }
            res.add(l);
            return;
        }
        for(int i = 0 ; i < n ; i++){
            if(isSafe(b,r,i)){
                b[r][i] = 'Q';
                backtrack(b,r+1,res);
                b[r][i] = '.';
            }
            
        }
    }
    static boolean isSafe(char[][] b , int r , int c){
        for(int i = 0 ; i < r ; i++){
            if(b[i][c] == 'Q')return false;
        }
        //left
        for(int i = r - 1, j = c -1 ; i >= 0 && j >= 0 ; i -- , j--){
            if(b[i][j] == 'Q')return false;
        }
        //right
        for(int i = r - 1 , j = c + 1 ; i >= 0 && j < b.length ; i-- , j++){
            if(b[i][j] == 'Q')return false;
        }
        return true;
    }
}