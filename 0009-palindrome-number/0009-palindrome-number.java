class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        if(n >= 0 && n <= 9)return true;
        if(n < 0)return false;
        int res = 0;
        while( n != 0 ){
            int rem = n % 10;
            res = res*10 + rem;
            n /= 10 ; 
        }
        return res == x;
        
    }
}