class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int lp = 0;
        int result = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!set.add(c)){
                while(set.contains(c)){
                    set.remove(s.charAt(lp++));
                    count--;       
                }
                set.add(c);
            }
            count++;
            result = Math.max(count, result);
        }
        return result; 
    }
}
