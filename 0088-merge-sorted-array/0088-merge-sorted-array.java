class Solution {
    public void merge(int[] n1, int m, int[] n2, int n) {
        int[] res = new int[m+n];
        int i = 0;
        int j = 0;
        for(int a = 0 ; a < m+n ; a++ ){
            if( ( i < m ) && ( j >= n || n1[i] <= n2[j] )  ){
                res[a] = n1[i];
                i++;
            }else{
                res[a] = n2[j];
                j++;
            }  
        }
        for(int a = 0 ; a < m + n ; a++){
            n1[a] = res[a];
        }
         
        
    }
}