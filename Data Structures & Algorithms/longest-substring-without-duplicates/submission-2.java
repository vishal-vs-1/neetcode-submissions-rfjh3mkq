class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int length = 0;
        Set<Character> ss = new HashSet<>();
        for(int e = 0; e < s.length(); e++){
            char ch = s.charAt(e);
            if(ss.contains(ch)){
                length = Math.max(e-start, length);
                while(s.charAt(start) != ch){
                    ss.remove(s.charAt(start));
                    start++;
                }
                start++;
            }
            ss.add(ch);
        }
        length = Math.max(s.length()-start, length);
        return length;
    }
}
