class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> m = new HashMap<>();
        for(String s: strs){
            int[] arr= new int[26];
            for(char c: s.toCharArray()){
                arr[c-'a'] = arr[c-'a']+1;
            }
            StringBuilder dd = new StringBuilder();
            for(int i: arr){
                dd.append(i).append('#');
            }
            String d = dd.toString();
            if(m.containsKey(d))
                m.get(d).add(s);
            else {
                List<String> strings = new ArrayList<>();
                strings.add(s);
                m.put(d, strings);
            }
        }
        result.addAll(m.values());
        return result;
    }
}
