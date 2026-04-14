class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> search = new HashSet<>();
        int result = 0;
        for(int i: nums)
            search.add(i);
        for(int i: nums){
            int count = 1;
            if(!search.contains(i-1)){
                int start = i;
                while(search.contains(++start))
                    count++;
                result = Math.max(count,result);
            }
        }
        return result;
    }
}
