class Solution {
    public String reverseWords(String s) {
        String[] a = s.trim().split("\\s+");
        int n = a.length;
        String[] b = new String[n];
        int j = 0;
        for(int i = n-1 ; i >= 0 ; i--){
            b[j] = a[i];
            j++;
        }
        String res = String.join(" ",b);
        return res;
        
    }
}