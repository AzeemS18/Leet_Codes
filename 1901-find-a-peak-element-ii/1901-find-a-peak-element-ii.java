class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length; // r
        int n = mat[0].length; //c
        int mr = 0;
        int l = 0 ;
        int r = n - 1;
        while( l <= r){
            int mid = l + (r - l) / 2;
            for(int i = 0 ; i < m ; i++){
                if(mat[mr][mid] < mat[i][mid]){
                    mr = i;
                }    
            }
            int ll = mid-1 >= 0 ? mat[mr][mid-1] : -1;
            int rl = mid+1 < n ? mat[mr][mid+1] : -1;

            if( mat[mr][mid] > ll && rl < mat[mr][mid] ){
                return new int[]{mr,mid};
            }else if ( mat[mr][mid] < ll ){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return new int[]{-1,-1};
        
    }
}