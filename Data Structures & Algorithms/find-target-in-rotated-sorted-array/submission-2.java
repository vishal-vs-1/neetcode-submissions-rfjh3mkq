class Solution {
    public int search(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        while(s<=e){
            int m = (e-s)/2 + s;
            int mid = nums[m];
            int l = nums[s];
            int r = nums[e];
            if(target == mid)   return m;
            if(mid >= l){
                if(target < mid && target >= l){
                    e = m-1;
                }else{
                    s = m+1;
                }
            } else{
                if(target > mid && target <= r){
                    s=m+1;
                } else {
                    e = m-1;
                }
            }
        }
        return -1;
        
    }
}
