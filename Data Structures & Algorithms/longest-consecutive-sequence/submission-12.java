class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums)   set.add(i);
        int result = 0;
        for(int i : nums){
            int count = 1;
            int a = i-1;
            int b = i+1;
            while(set.contains(a)){
                set.remove(a--);
                count++;
            }
            while(set.contains(b)){
                set.remove(b++);
                count++;
            }

            result = Math.max(result, count);
        }
        return result;
    }
}
