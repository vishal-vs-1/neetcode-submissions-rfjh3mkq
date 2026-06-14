class KthLargest {

    private final PriorityQueue<Integer> pq;
    int size = 0;
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();
        size = k;
        for(int i : nums){
            add(i);
        }
    }
    
    public int add(int val) {
        pq.offer(val);
        if(pq.size() > size) {
            pq.poll();
        }
        return pq.peek();
    }
}
