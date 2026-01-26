class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n =arr.length;
        int l = 0 ; 
        int r = 0 ;
        double sum = 0;
        double max = Integer.MIN_VALUE;
        int c = 0 ;
        while(r < n){
            sum +=arr[r];
            if(r-l+1 == k){
                double res = sum/k;
                if(res >= threshold)c++;
                sum -= arr[l];
                l++; 
            }
            r++;
        }
        return c;
        
    }
}