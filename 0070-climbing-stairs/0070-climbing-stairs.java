class Solution {
    public int climbStairs(int n) {
        int f = 1 , s = 2, t = 3;
        if(n==0)return 0;
        if(n==1)return f;
        if(n==2)return s;
        int res = 0;
        for(int i = 3 ; i <= n ; i++){
            res = f+s;
            f = s;
            s = res;
        }
        return res;
        
    }
}