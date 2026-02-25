class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int me1 = 0 ;
        int me2 = 0 ;
        int c1 = 0 ;
        int c2 = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if ( me1 == nums[i]){
                c1++;
            }else if ( me2 == nums[i]){
                c2++;
            }else if(c1 == 0){
                me1 = nums[i];
                c1 = 1 ;
            }else if ( c2 == 0){
                me2 = nums[i];
                c2 = 1 ;
            }else{
                c1--;
                c2--;
            }
        }
        
        c1 = 0 ;
        c2 = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == me1){
                c1++;
            }else if(nums[i] == me2){
                c2++;
            }
        }
        List<Integer> l = new ArrayList<>();
        if( c1 > nums.length / 3){
            l.add(me1);
        }
        if( c2 > nums.length / 3){
            l.add(me2);
        }  
        return l;        
    }
}