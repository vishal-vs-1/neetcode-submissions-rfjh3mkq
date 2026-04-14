class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int l = 0, r = 0, result = 0;
        for (char c : s.toCharArray()){
            if(map.containsKey(c)) l = Math.max(map.get(c) + 1, l);
            map.put(c, r);
            result = Math.max(r-l+1, result);
            // System.out.println(result);
            r++;
        }
        return result;
    }
}
