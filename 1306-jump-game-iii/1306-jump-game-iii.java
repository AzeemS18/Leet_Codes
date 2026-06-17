class Solution {
    public boolean canReach(int[] arr, int start) {
        if( (arr.length <= start) || start < 0 || arr[start] < 0){
            return false;
        }
        if(arr[start] == 0){
            return true;
        }
        int j = arr[start];
        arr[start] = -arr[start];

        return canReach(arr,start+j) || canReach(arr,start-j);
        
    }
}