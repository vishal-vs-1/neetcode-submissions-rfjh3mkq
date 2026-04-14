class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String word: strs){
            int [] arr = new int[26];
            for(char c: word.toCharArray()){
                arr[c-'a'] += 1;
            }
            String key =  Arrays.toString(arr);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
