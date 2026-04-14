class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        for(int i = 0; i<length; i++){
            result[i]= 1;
        }
        int right = 1;
        int left = 1;
        for(int i = 1; i<length; i++){
            right *= nums[i-1];
            result[i] *= right;
            
            left *= nums[length-i];
            result[length-i-1] *= left;
        }
        return result;
    }
}  
