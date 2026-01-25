class Solution {
    public String minWindow(String s, String t) {
        int[] n = new int[128];
        for(char c : t.toCharArray()){
            n[c]++;
        }
        int l = 0 ;
        int r = 0 ;
        int required = t.length();
        int st = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < s.length();  i++){
            char c = s.charAt(i);
            if( n[c] > 0 ){
                required--;
            }
            n[c]--;
            while( required == 0 ){
                int len = i - l + 1;
                if(len < min){
                    min = len;
                    st = l;
                }
                char left = s.charAt(l);
                n[left]++;
                if(n[left] > 0){
                    required++;
                }
                l++;
            }
        }
        if(min == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(st,st+min);
        
    }
}