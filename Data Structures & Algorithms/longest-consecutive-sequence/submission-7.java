class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int result = 0;
        for(int i:nums){
            set.add(i);
        }
        for(int i:nums){
            int element = i;
            if(!set.contains(element-1)){
                int count = 1;
                while(set.contains(element + 1)){
                    count++;
                    element++;
                    set.remove(element);
                }
                result = Math.max(count, result);
            }
        }
        return result;
    }
}
