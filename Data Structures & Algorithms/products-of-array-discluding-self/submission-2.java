class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int temp = nums[0];
        result[0] = 1;
        for(int i = 1; i < nums.length; i++){
            result[i] = temp;
            temp *= nums[i]; 
        }
        System.out.print(Arrays.toString(result));
        temp = nums[nums.length-1];
        for(int i = nums.length-2; i >= 0; i--){
            result[i] *= temp;
            temp *= nums[i];
        }
        return result; 


    }
}  
