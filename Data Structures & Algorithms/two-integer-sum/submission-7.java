class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> search = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            int num = target - nums[i];
            if(search.containsKey(num))
                return new int[]{search.get(num), i};
            search.put(nums[i],i);
        }
        return new int[]{0, 0};
    }
}
