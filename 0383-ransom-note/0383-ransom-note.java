class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] f1 = new char[26];
        char[] f2 = new char[26];
        for(int i = 0 ; i < ransomNote.length() ; i++){
            char x = ransomNote.charAt(i);
            f1[x - 'a']++;
        }
        for(int i = 0 ; i < magazine.length() ; i++){
            char x = magazine.charAt(i);
            f2[x - 'a']++;
        }
        for( int i = 0 ; i < 26 ; i++ ){
            if( f1[i] > f2[i]){
                return false;
            }
        }
        return true;

    }
}