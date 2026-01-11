class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> m = new HashMap<>();

        int val = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            val = nums[i];
            if(m.containsKey(target-val)){
                res.add(m.get(target-val));
                res.add(i);
            }
            m.putIfAbsent(val,i);
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}