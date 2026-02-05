class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int cd = 0 ; 
        int tc = 0 ;
        int s = 0 ;
        for(int i = 0 ; i < gas.length ; i++){
            int d = gas[i] - cost[i];
            cd += d;
            tc += d;
            if(cd < 0){
                s = i+1;
                cd = 0;
            }
        }
        return tc >= 0 ? s : -1;
        
    }
}