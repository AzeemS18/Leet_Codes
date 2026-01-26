class Solution {
    public int thirdMax(int[] nums) {
        Long f = null;
        Long s = null;
        Long t = null;
        for(long n : nums){
            if ( ( f != null && f == n) || ( s != null && s == n) || ( t != null && t == n) )continue;

            if(f == null || n > f){
                Long temp = n;
                t = s;
                s = f;
                f = temp;
            }else if (s == null || n > s){
                Long temp = n;
                t = s;
                s = temp;
            }else if(t==null || n > t){
                t = n;
            }
        }
        if(t != null){
            return t.intValue();
        }else{
            return f.intValue();
        }
    }
}