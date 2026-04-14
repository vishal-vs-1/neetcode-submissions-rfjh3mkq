class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0, r = 0, result = 0;
        for (char c : s.toCharArray()){
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);
            result = Math.max(r-l+1, result);
            r++;
        }
        return result;
    }
}
