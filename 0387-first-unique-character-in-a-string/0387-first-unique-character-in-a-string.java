class Solution {
    public int firstUniqChar(String s) {
        int[] f1 = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            char x = s.charAt(i);
            f1[x - 'a']++;
        }
        for(int i = 0 ; i < s.length() ; i++){
            if(f1[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;

    }
}