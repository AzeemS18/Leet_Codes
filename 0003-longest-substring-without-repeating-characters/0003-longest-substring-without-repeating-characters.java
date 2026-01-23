class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = Integer.MIN_VALUE;
        if (s.length() == 0) return 0;
        for( int i = 0 ; i < s.length() ; i++ ){
            int c = 0;
            HashSet<Character> s2 = new HashSet<>();
            for( int j = i ; j < s.length() ; j++ ){
                if (! s2.contains(s.charAt(j))){
                    s2.add(s.charAt(j));
                    c++;
                }else{
                    break;
                }
            }
            res = Math.max(res,c);
        }
         
        return res;
    }
}