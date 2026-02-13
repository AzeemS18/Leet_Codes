class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int c= 0;
        if(n==0)return true;
        if(f.length ==  0) return false;
        if(f.length == 1 && f[0] == 0) return true;
        if(f[0] == 0 && f[1] == 0){
            f[0] = 1;
            c++;
        }
        if(c==n)return true;
        if(f[f.length - 1] == 0 && f[f.length - 2] == 0){
            f[f.length - 1] = 1;
            c++;
        }
        if(c==n)return true;
        for(int i = 1 ; i < f.length - 1 ; i++){
            if(i == 0 && f[i] == 0 && f[i+1] == 0){
                c++;
                f[i] = 1;
            }else if( i == f.length - 1 && f[i] == 0 && f[i-1] == 0 ){
                c++;
                f[i] = 1;
            }else if( f[i] == 0 && f[i-1] == 0 && f[i+1] == 0){
                c++;
                f[i] = 1;
            }
            if(c==n){
                return true;
            }
        }
        return false;
        
    }
}