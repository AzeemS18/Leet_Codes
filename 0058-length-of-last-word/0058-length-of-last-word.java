class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim(); 
        int n = s.length();
        int len = 0 ;
        if(n == 0) return n;
        
        for(int i = n-1 ; i >= 0 ; i--){
            if( s.charAt(i) != ' '){
                len++;
            }else{
                break;
            }
        }
        return len;
    }
}