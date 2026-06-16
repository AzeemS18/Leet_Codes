class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int res = -1;
        int ts = 0 ;
        for(int i = 0 ; i < n ; i++){
            ts += nums[i];
        }
        int ls = 0 ;
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            m.put(i,ls);
            ls += nums[i];
            
        }
        for(int i = 0 ; i < n ; i++){
            int rs = ts - m.get(i) - nums[i];
            if( m.get(i) == rs){
                return i;
            } 
            
        }

        return -1;
        
    }
}