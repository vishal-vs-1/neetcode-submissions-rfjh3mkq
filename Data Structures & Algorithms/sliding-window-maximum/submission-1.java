class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l = 0, r = 0;
        int[] res = new int[nums.length-k + 1];
        int count = 0;
        Deque<Integer> q = new ArrayDeque<>();
        while(r < nums.length){
            while(!q.isEmpty() && nums[q.peekLast()] < nums[r]){
                q.pollLast();
            }
            q.addLast(r);

            if(r-l+1 >= k){
                res[count++] = nums[q.peekFirst()];
                if(q.peekFirst() <=l){
                    q.pollFirst();
                }
                l++;
                
            }
            r++;
        }
        return res;
    }
}
