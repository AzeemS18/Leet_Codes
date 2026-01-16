class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i = 0 ; i < r ; i++ ){
            for(int j = 0 ; j < c ; j++ ){
            int x = matrix[i][j];
            if(x==target){
                return true;
            }
            }
        }
        return false;
    }
}