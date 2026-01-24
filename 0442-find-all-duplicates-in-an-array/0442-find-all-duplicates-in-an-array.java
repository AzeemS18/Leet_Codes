class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        List<Integer> l =new ArrayList<>();
        for(int i : m.keySet()){
            if(m.get(i) == 2){
                l.add(i);
            }
        }
        return l;
    }
}