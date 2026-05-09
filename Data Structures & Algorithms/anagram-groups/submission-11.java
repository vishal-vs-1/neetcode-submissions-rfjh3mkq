class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String ss = new String(arr);
            if(!map.containsKey(ss)){
                List<String> newList = new ArrayList<>();
                newList.add(s);
                map.put(ss, newList);
            } else{
                map.get(ss).add(s);
            }
        }
        for(List<String> l : map.values()){
            result.add(l);
        }
        return result;
    }
}
