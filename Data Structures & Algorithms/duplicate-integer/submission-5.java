class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set set = new HashSet<>();
        for(int i: nums){
            if(!set.add(i))
                return true;
        }
        return false;
    }
}