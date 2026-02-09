class Solution {
    public String multiply(String nums1, String nums2) {
        int n = nums1.length();
        int m = nums2.length();
        int[] res = new int[n+m];
        for(int i = n-1 ; i >=0 ; i--){
            int d1 = nums1.charAt(i) - '0' ;
            for(int j = m-1 ; j >= 0 ; j--){
                int d2 = nums2.charAt(j) - '0' ;
                int s = d1 * d2 + res[i+j+1];
                res[i+j+1] = s%10;
                res[i+j] += s / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i : res){
            if(!(sb.length() == 0 && i == 0) ){
                sb.append(i);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
        
    }
}