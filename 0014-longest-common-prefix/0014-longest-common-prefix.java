class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n = strs.length;
        String f = strs[0];
        String l = strs[ n - 1];
        int i = 0;
        while( i < f.length() && i < l.length() && f.charAt(i) == l.charAt(i)){
            i++;
        }
        return f.substring(0,i);
    }
}