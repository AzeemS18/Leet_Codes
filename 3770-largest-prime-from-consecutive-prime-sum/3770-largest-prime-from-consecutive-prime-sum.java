class Solution {
    public int largestPrime(int n) {
        if(n==2)return 2;
        boolean[] a = new boolean[n+1];
        Arrays.fill(a,true);
        a[0] = false;
        a[1] = false;
        for(int i = 2 ; i *i <= n ; i++){
            if(a[i]){
                for(int j = i*i ; j <= n ; j += i){
                    a[j] = false;
                }
            }
        }
        int sum = 0 ;
        int res = 0;
        for(int i = 2 ; i < n ; i++){
            if(a[i]){
                sum += i;
                if(sum > n){
                    break;    
                }
                if(a[sum]){
                    res = sum;
                }
            }
        }
        return res;

       
    }
}