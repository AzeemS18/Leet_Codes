class Solution {
    public int distinctPrimeFactors(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int sum : nums){
        for(int i = 2 ; i*i <= sum ; i++){
            if(sum % i == 0 ){
                set.add(i);
                while(sum % i == 0 ){
                    sum /= i;
                }
            }
        }
        if ( sum > 1 ) set.add(sum);
        }
        return set.size();
        
    }
}