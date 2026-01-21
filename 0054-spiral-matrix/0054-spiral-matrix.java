class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return li;
        int row = matrix.length;
        int col = matrix[0].length;
        int l = 0 ; 
        int r = col - 1;
        int t = 0 ;
        int b = row - 1;
        int x = 0;
        
        while ( l <= r && t <= b ){
            for(int i = l ; i <= r ; i++){
                x = matrix[t][i];
                li.add(x); 
            }
            t++;
            for(int i = t ; i <= b ; i++){
                x = matrix[i][r];
                li.add(x);
            }
            r--;
            if(t<=b){
            for(int i = r ; i >=l  ; i--){
                x = matrix[b][i];
                li.add(x);
            }
            b--;
            }
            if(l<=r){
            for(int i = b ; i >= t ; i--){
                x = matrix[i][l];
                li.add(x);
            }
            l++;
            }
        }
        return li;
        
    }
}