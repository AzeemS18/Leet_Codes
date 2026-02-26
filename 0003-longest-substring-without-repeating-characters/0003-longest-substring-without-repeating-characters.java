class Solution {
    public int lengthOfLongestSubstring(String s) {
       int n = s.length() ;
       int l = 0 ;
       int r = 0 ; 
       HashSet< Character > set = new HashSet<>();
       int ml = 0;
       while( r < n ){
        char c = s.charAt(r);
        while(set.contains(c)){
            set.remove(s.charAt(l));
            l++;
        }
        set.add(c);
        int len = r - l + 1; 
        ml = Math.max( len , ml ) ;
        r++;
       }
       return ml;
    }
}