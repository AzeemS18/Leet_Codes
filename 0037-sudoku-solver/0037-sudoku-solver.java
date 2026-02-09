class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    private static boolean solve(char[][] b){
        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++ ){
                if(b[i][j] == '.'){
                    for(char k = '1' ; k <= '9' ; k++){
                        if(isvalid(b,i,j,k)){
                            b[i][j] = k;
                            if(solve(b)){
                                return true;
                            }
                            b[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    private static boolean isvalid(char[][] b ,int r ,int c ,char k){
        for(int i = 0 ; i < 9 ; i++){
            if(b[r][i] == k)return false;
            if(b[i][c] == k)return false;
            int br = 3 * (r/3) + i / 3;
            int bc = 3 * (c/3) + i % 3;
            if(b[br][bc]==k)return false;
        }
        return true;
    }
}