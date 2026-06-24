class Solution {
    public String replaceDigits(String s) {
        char[] c = s.toCharArray();
        String res = "";
        for(int i = 0 ; i < c.length ; i++){
            if(Character.isDigit(c[i])){
                int x = (int)c[i-1];
                int curr = (c[i] - '0') + x ;
                res += (char) curr;
            }else{
                res += c[i];
            }
        }
        return res;
        
    }
}