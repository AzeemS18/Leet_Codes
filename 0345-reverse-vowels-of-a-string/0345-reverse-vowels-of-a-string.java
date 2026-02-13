class Solution {
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
        String vow = "";
        for(char i : a){
            if( i == 'a' || i == 'e' || i == 'o' || i == 'i' || i == 'u' || 
            i == 'A' || i == 'E' || i == 'O' || i == 'I' || i == 'U' ){
                vow += String.valueOf( (char) i);
            }
        }
        char[] x = vow.toCharArray();
        int k = x.length - 1;
        for(int j  = 0 ; j < a.length ; j++){
            char i = a[j];
            if( i == 'a' || i == 'e' || i == 'o' || i == 'i' || i == 'u' || 
            i == 'A' || i == 'E' || i == 'O' || i == 'I' || i == 'U' ){
                char t = a[j];
                a[j] = x[k];
                x[k] = t;
                k--;
            }
        }
        return new String(a);
    }
}