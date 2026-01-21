class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m =mat.length;
        int n = mat[0].length;
        int[] res = new int[m*n];
        int i = 0 ;
        for(int d = 0 ; d < m+n-1 ; d++){
            int r , c;
            if( d % 2 == 0){
                r = Math.min(d,m-1);
                c = d - r;
                while( r >= 0 && c < n ){
                    res[i++] = mat[r][c];
                    r--;
                    c++;
                }
            }else{
                c = Math.min(d,n-1);
                r = d - c;
                while( c >= 0 && r < m){
                    res[i++] = mat[r][c];
                    c--;
                    r++;
                }
            }
        }
        return res;
        
    }
}