class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        int n = c - 1 ;
        int i = 0 ;
        
        while( i < r && n >= 0){
            int current = matrix[i][n];
            if( current == target ){
                return true;
            }
            if(current > target){
                n-- ;
            }
            if(current < target){
                i++ ;
            }

        }
        return false;
        
    }
}