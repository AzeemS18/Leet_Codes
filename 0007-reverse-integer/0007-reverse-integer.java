class Solution {
    public int reverse(int x) {
        long res = 0;
        if(x < 0){
            x = x * (-1);
            res = -1 * rev(x);
        }else{
            res = rev(x);
        }
        
        return (int)res;
    }
    static int rev(int n){
        long res = 0;
        while(n > 0){
            int r = n % 10 ;
            res = res * 10 + r;
            n = n / 10;
        }
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)res;

    }
}