class Solution {
    public int findDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int curr = Math.abs(nums[i]);
            int index = curr - 1;
            if(nums[index] < 0) return curr; 
            nums[index] *= -1;
        }
        return 0; 
    }
}
