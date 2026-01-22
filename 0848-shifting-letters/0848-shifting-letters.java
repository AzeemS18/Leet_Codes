class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = s.length();
        char[] c = s.toCharArray();
        int sum = 0 ;
        for(int i = n - 1 ; i >= 0 ; i-- ){
            sum =  ( sum + shifts[i] ) % 26 ;
            int val = ( c[i] - 'a' + sum ) % 26 ;
            c[i] = (char)('a' + val );
        }
        return new String(c);
    }
}