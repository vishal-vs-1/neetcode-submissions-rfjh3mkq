class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0 ; i<nums.length-2; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int start = i+1;
            int end = nums.length-1;
            int sum = 0 - nums[i]; 
            while(start<end){
                int total = nums[start] + nums[end];
                if(total == sum){
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;
                    while(start < end && nums[start] == nums[start-1])
                        start++;
                    while(start < end && nums[end] == nums[end+1])
                        end--;
                } 
                else if(total < sum){
                    start++;
                    while(start < end && nums[start] == nums[start-1])
                        start++;
                }
                else{
                    end--;
                    while(start < end && nums[end] == nums[end+1])
                        end--;
                }
                
            }
        }
        return result;
    }
}
