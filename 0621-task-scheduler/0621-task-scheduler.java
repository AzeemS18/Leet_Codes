class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] f = new int[26];
        for(char i : tasks){
            f[i - 'A']++;
        }
        int mf = 0;
        for(int i : f){
            mf = Math.max(mf,i);
        }
        int mc = 0;
        for(int i : f){
            if(mf == i)mc++;
        }
        int res = (mf-1)*(n+1) + mc;
        int res1 = tasks.length;
        return (int)Math.max(res, res1);
        
    }
}