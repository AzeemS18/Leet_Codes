class Solution {
    public boolean exist(char[][] board, String word) {
        int a = board.length;
        int b = board[0].length;
        for(int i = 0 ; i < a ; i++){
            for(int j = 0 ; j < b ; j++){
                if(dfs(board,word,i,j,0)){
                    return true;
                }
            }
        }    
        return false;
    }
    private boolean dfs(char[][] board , String word , int i , int j , int c ){
        if( c == word.length() ){
            return true;
        }
        if( i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(c)  ){
            return false;
        }

        char t = board[i][j];
        board[i][j] = '#';

        boolean found = dfs(board,word,i+1,j,c+1) || dfs(board,word,i-1,j,c+1) || dfs(board,word,i,j+1,c+1) || dfs(board,word,i,j-1,c+1) ;
        board[i][j] = t;

        return found;

    }
    
}