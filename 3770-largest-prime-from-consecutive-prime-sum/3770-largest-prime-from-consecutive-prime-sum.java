class Solution {
    public int largestPrime(int n) {
        if(n < 2)return 0;
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
        int res = 0 ;
        HashSet<Integer> m = new HashSet<>();
        for(int i = 2 ; i < n ; i++){
            if(a[i]){
                sum += i;
                m.add(sum);
            }
        }
        for(int i = n ; i > 0 ; i--){
            if(m.contains(i) && a[i]){
                return i;
            }
        }
        return res;

       
    }
}