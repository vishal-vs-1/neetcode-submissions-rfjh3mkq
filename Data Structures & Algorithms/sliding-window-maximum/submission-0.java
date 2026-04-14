class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //contains result of each window
        List<Integer> result = new ArrayList<>();
        //A dequeue
        Deque<Integer> d = new ArrayDeque<>();
        //pointers
        int l = 0, r = 0;
        while(r < nums.length){
            //if queue is not empty and last number in queue is smaller than new one
            while(!d.isEmpty() && nums[d.peekLast()] < nums[r])
                d.pollLast();   //remove last element
            d.addLast(r);   //add number index in queue
            //if window lengths get equal to K
            if(r- l + 1 == k) {
                //if the first element index is equal of less than right pointer - k
                while (d.peekFirst() <= r  - k)
                    d.pollFirst();  //remove first in queue
                result.add(nums[d.peekFirst()]);    //add first num in result
                l++;    //increase left pointer
            }
            //increase right pointer
            r++;
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
