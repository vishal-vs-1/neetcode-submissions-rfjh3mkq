class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> search = new HashSet<>();
        for(int i: nums){
            search.add(i);
        }
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            int count = 1;
            if(search.contains(nums[i]-1)){
                continue;
            } 
            int no = nums[i];
            while(search.contains(no+1)){
                count++;
                no++;
            }
            if(count> res)
                res = count;
        }
        return res;

    }
}
