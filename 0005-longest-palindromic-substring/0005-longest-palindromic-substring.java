class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int st = 0 ; 
        int e = 0 ;
        int len = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            int ol = expand(s,i,i);
            int el = expand(s,i,i+1);
            len = Math.max(ol,el);
            if(len >  e - st + 1){
                st = i - (len - 1)/2;
                e = i + len / 2;
            }
        }
        return s.substring( st , e + 1 );
        
    }
    private int expand(String a  , int l , int r ){
        while( l >= 0 && r < a.length() && a.charAt(l) == a.charAt(r)  ){
            l--;
            r++;
        }
        return r - l - 1 ;
    }
}