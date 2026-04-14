class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        List<Integer>[] size = new List[nums.length + 1];
        for(int key: map.keySet()){
            int value = map.get(key);
            if(size[value] == null)
                size[value] = new ArrayList<>();
            size[value].add(key);
        }
        int[] result = new int[k];
        int count = 0; 
        for(int i = size.length-1; i >= 0; i--){
            if(size[i] !=null && count != k){
                for(int z: size[i]){
                    result[count] = z;
                    count++;
                }
            }
        }
        return result;
    }
}
