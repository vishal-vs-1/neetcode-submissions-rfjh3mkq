class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i ,map.getOrDefault(i, 0)+1);
        }
        int[] res = new int[k];
        Queue<Integer> q = new PriorityQueue<>((a,b)-> map.get(b)-map.get(a));
        for(int i: map.keySet()){
            q.add(i);
        }
        for(int i = 0; i < k; i++){
            res[i] = q.poll();
        }
        return res;
    }
}
