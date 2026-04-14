class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i ,map.getOrDefault(i, 0)+1);
        }
        int[] res = new int[k];
        List<Integer> [] ss = new List[nums.length];
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(ss[entry.getValue() - 1] == null){
                ss[entry.getValue() - 1] = new ArrayList<>();
            }
            ss[entry.getValue() - 1].add(entry.getKey());
        }
        for(int i = nums.length-1 ; i >=0 ; i--){
            if(k == 0)
                break;
            if(ss[i] == null)
                continue;
            for(int element : ss[i]){
                res[--k] = element;
            }
        }
        return res;
    }
}
