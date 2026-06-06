class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        int[] a = new int[26];
        int[] b = new int[26];
        for(int i = 0 ; i < s.length() ; i++ ){
            int x = s.charAt(i) - 'a';
            a[x]++;
        }
        for(int i = 0 ; i < t.length() ; i++ ){
            int x = t.charAt(i) - 'a';
            b[x]++;
        }
        for(int i = 0 ; i < 26 ; i++ ){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}