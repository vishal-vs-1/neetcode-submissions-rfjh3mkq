class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result= new ArrayList<>();
        for(int i = 0; i<nums.length-2; i++){
            if(i>0 && nums[i-1]==nums[i])
                continue;
            int start = i+1;
            int end = nums.length-1;
            List<Integer> l = new ArrayList<>();
            while(start < end){
                int sum = nums[i] + nums[start] + nums[end];
                if(sum>0)
                    end--;
                else if(sum<0)
                    start++;
                else if (sum==0){
                    result.add(Arrays.asList(nums[i],nums[start], nums[end]));
                    start++;
                    end--;
                    while(start<end && nums[start-1]==nums[start])
                        start++;
                    while(start<end && nums[end+1]==nums[end])
                        end--;
                }
            }
        }
        return result;
    }
}
