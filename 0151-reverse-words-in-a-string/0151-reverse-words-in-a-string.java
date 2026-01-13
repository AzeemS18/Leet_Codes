class Solution {
    public String reverseWords(String s) {

        String[] x = s.trim().split("\\s+");
        int n = x.length;
        String[] y = new String[n];
        int j = 0 ;
        for(int i = n - 1 ; i >=0 ; i--){
            y[j] = x[i];
            j++;
        }
        String res = String.join(" ",y);
        return res;
        
    }
}