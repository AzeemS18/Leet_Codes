class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int i = 0 ;
        int w = 0 ;
        while( i < n ){
            int c = 0 ;
            char x = chars[i];
            while( i < n && x == chars[i]){
                i++;
                c++;
            }
            chars[w++] = x ;
            if( c > 1 ){
                String k = Integer.toString(c);
                for(int j = 0 ; j < k.length() ; j++){
                    chars[w++] = k.charAt(j);
                }
            }
        }
        return w;

        
    }
}