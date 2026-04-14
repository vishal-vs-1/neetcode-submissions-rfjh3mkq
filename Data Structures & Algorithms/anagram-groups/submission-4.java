class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            int [] arr = new int[26];
            for(char c: s.toCharArray()){
                arr[c - 'a']++;
            }
            String key = Arrays.toString(arr);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        for(List<String> l: map.values()){
            result.add(l);
        }
        return result;

    }
}
