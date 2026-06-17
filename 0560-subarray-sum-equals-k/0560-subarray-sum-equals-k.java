class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> m = new HashMap<>();
        int ps = 0 ;
        int c = 0 ;
        m.put(0,1);
        for(int i : nums){
            ps+=i;

            c += m.getOrDefault(ps-k,0);

            m.put(ps,m.getOrDefault(ps,0)+1);

        }
        return c;
    }
}