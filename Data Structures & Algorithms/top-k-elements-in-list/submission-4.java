class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            m.put(nums[i], m.getOrDefault(nums[i],0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length+1];
        for(Integer i: m.keySet()){
            int fre = m.get(i);
            if(buckets[fre] == null){
                buckets[fre]= new ArrayList<>();
            }
            buckets[fre].add(i);
        }
        List<Integer> result = new ArrayList<>();
        for(int i = buckets.length-1; i >= 0; i--){
            if(buckets[i]!=null && result.size() <k){
                result.addAll(buckets[i]);
            }
        }
         return result.stream().mapToInt(Integer::intValue).toArray();
        
    }
}
