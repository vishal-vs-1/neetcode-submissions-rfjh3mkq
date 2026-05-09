class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String ss = new String(arr);
            map.computeIfAbsent(ss, k -> new ArrayList<>()).add(s);
        }
        for(List<String> l : map.values()){
            result.add(l);
        }
        return result;
    }
}
