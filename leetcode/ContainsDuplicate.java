class Solution {
    public boolean containsDuplicate(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            result ^= nums[i];
            if(result == 0) {
                return true;
            }
        }
        return false;
    }
}