class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(dfs(board,i,j,word,0)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean dfs(char[][] board , int i , int j , String word , int c ){
        if( c == word.length())return true;

        if( i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(c))return false;

        char t = board[i][j];

        board[i][j] = '#';

        boolean found = dfs(board,i+1,j,word,c+1) ||
                        dfs(board,i-1,j,word,c+1) ||
                        dfs(board,i,j+1,word,c+1) ||
                        dfs(board,i,j-1,word,c+1) ;
        
        board[i][j] = t;

        return found;



    }
}