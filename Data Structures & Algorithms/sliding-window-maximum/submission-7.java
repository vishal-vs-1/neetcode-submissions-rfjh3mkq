class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q = new ArrayDeque<>();
        int [] arr = new int[nums.length - k +1];
        int pos = 0;
        for(int i = 0; i < nums.length; i++){
            while(!q.isEmpty() && (nums[q.peekLast()] < nums[i])){
                q.pollLast();
            }
            q.add(i);
            
            if(q.peekFirst() < (i-k+1)){
                q.pollFirst();
            }
            if(i >= k-1){
                arr[pos++] = nums[q.peekFirst()];
            }
        }
        return arr;
    }
}
