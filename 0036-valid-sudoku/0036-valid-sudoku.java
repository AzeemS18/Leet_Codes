class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] r = new boolean[9][9];
        boolean[][] c = new boolean[9][9];
        boolean[][] b = new boolean[9][9];
        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                char c1 = board[i][j];
                if(c1=='.')continue;
                int n = c1 - '1';
                int b1 = (i/3) * 3 + (j/3);

                if(r[i][n] || c[j][n] || b[b1][n])return false;

                r[i][n] = true;
                c[j][n] = true;
                b[b1][n] = true;
            }
            
        }
        return true;
    }
}