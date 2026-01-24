class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l = 0 ;
        int r = 0 ;
        int max = 0;
        HashSet<Character> s1 = new HashSet<>();
        while( r < n ){
            char c = s.charAt(r);
            while(s1.contains(c)){
                s1.remove(s.charAt(l));
                l++;
            }
            s1.add(c);
            int len = r - l + 1 ;
            max = Math.max(len,max);
            r++;

        }
        return max;
    }
}