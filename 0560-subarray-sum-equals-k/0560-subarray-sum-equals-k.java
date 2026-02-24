class Solution {
    public int subarraySum(int[] nums, int k) {
        int cs = 0 ;
        int ml = 0 ;
        HashMap<Integer,Integer> m = new HashMap<>();
        m.put(0,1);
        for(int i = 0 ; i < nums.length ; i++){
            cs += nums[i] ;
            if( m.containsKey( cs - k ) ){
                ml += m.get(cs-k);
            }
            m.put(cs,m.getOrDefault(cs,0)+1);
        }
        return ml;
    }
}