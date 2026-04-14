class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length-k + 1];
        int count = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for(int i = 0; i < nums.length; i++){
            while(!q.isEmpty() && nums[q.peekLast()] < nums[i]){
                q.pollLast();
            }
            q.addLast(i);
            if(q.peekFirst() < i-k+1)   q.pollFirst();

            if(i >= k-1)    res[count++] = nums[q.peekFirst()];
        }
        return res;
    }
}
