class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int result = 0;
        for(int i:nums){
            int count = 1;
            int element  = i;
            while(set.contains(element - 1)){
                count++;
                element--;
            }
            element = i;
            while(set.contains(element + 1)){
                count++;
                element++;
            }
            result = Math.max(count, result);
            set.add(i);
        }
        return result;

    }
}
