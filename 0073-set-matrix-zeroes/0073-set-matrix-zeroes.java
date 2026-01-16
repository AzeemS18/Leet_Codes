class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] res = new int[r][c];
        for(int i = 0 ; i < r ; i++ ){
            for(int j = 0 ; j < c ; j++ ){
                res[i][j] = matrix[i][j];
            }
        }
        for(int i = 0 ; i < r ; i++ ){
            for(int j = 0 ; j < c ; j++ ){
                int z = res[i][j];
                if( z == 0 ){
                    for(int k = 0 ; k < r ; k++){
                        matrix[k][j] = 0 ;
                    }
                    for(int k = 0 ; k < c ; k++){
                        matrix[i][k] = 0 ;
                    }

                }
            }
        }
        for(int i = 0 ; i < r ; i++ ){
            for(int j = 0 ; j < c ; j++ ){
                System.out.print(matrix[i][j]);
            }
        }
        
        
    }
}