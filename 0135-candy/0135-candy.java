class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] final1 = new int[n];
        int res = 0;
        Arrays.fill(final1,1);
        for(int i = 1 ;  i < n  ; i++  ){
            if(ratings[i] > ratings[i-1]){
                final1[i] = final1[i - 1] + 1;
            }
        }
        for(int i = n - 2 ;  i >= 0 ; i--  ){
            if(ratings[i] > ratings[i+1]){
                final1[i] = Math.max( final1[i] , final1[i+1] + 1  );
            }
        }
        for(int i : final1){
            res +=i;
        }
        return res;
        
    }
}