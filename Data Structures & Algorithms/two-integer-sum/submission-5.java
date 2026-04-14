class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            m.put(nums[i], i);
        }
        int[] arr = new int[2];
        for(int i = 0; i<nums.length; i++){
            int diff = target-nums[i];
            if(m.containsKey(diff)){
                if(i == m.get(diff))
                    continue;
                arr[0] = i;
                arr[1] = m.get(diff);
                return arr;
            }
        }
        return arr;
    }
}
