class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return reverse(s,0,s.length()-1);
    }
    private boolean reverse(String s ,int l , int r){
        if(l>=r)return true;
        if(s.charAt(l) != s.charAt(r)){
            return false;
        }
        return reverse (s,l+1,r-1);
    }
}