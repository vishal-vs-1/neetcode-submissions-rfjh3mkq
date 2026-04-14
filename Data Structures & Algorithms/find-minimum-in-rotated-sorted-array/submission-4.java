class Solution {
    public int findMin(int[] nums) {
        int s = 0, e = nums.length-1;
        if(nums[s] < nums[e])   return nums[s];
        while(s<e){
            int mid = (e-s)/2 +s;
            int sn = nums[s];
            int en = nums[e];
            int mn = nums[mid];
            if(mn > en) s = mid+1;
            else if(mn < en) e = mid;
        }
        return nums[s];
        
    }
}
