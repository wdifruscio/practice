class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }        
        
        for(int i = 0; i < nums.length; i++) {
            nums[(i + k) % nums.length] = arr[i];
        }
    }
}

//[1,2,1,4,5]
//[1,2,1,2,5]
//[1,2,1,2,3]
//[4,2,1,2,3]
//[4,5,1,2,3]