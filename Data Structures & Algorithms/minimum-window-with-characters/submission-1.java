class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";
        Map<Character, Integer> map = new HashMap<>();
        for(char c: t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int l =0, r = 0, count = map.size(), n = Integer.MAX_VALUE;
        String result = "";
        while(r < s.length()){
            char curr = s.charAt(r);
            if(map.containsKey(curr)){
                map.put(curr, map.getOrDefault(curr, 0) -1);
                if(map.get(curr) == 0)  count--;
            }

            while(count == 0){
                if(r-l+1 < n){
                    result = s.substring(l, r+1);
                    n = r-l+1;
                }
                char lcurr = s.charAt(l);
                if(map.containsKey(lcurr)){
                    map.put(lcurr, map.get(lcurr) +1);
                    if(map.get(lcurr) > 0)  count++;
                }
                l++;
            }
            r++;
        }
        return result;
    }
}
