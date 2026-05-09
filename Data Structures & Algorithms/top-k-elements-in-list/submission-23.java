class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] list = new List[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[k];
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(list[entry.getValue()-1] == null){
                list[entry.getValue()-1] = new ArrayList<>();
            } 
            list[entry.getValue()-1].add(entry.getKey());
            
        }
        int count = 0;
        for(int i = list.length-1; i>= 0; i--){
            if(k == 0)  break;
            if(list[i] == null) continue;
            for(int n: list[i]){
                result[count++] = n;
                k--;
            }
        }
        return result;
    }
}
