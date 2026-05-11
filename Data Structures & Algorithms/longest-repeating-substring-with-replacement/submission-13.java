class Solution {
    public int characterReplacement(String s, int k) {
        int lPointer = 0;
        int maxFreq = 0; 
        int result = 0;
        Map<Character, Integer> map = new HashMap<>(); 
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(map.get(c), maxFreq);
            while((i+1-lPointer)> k+maxFreq){
                char lc = s.charAt(lPointer++);
                map.put(lc, map.getOrDefault(lc, 0) -1);
            }
            result = Math.max(i+1-lPointer, result);
        }
        return result;
    }
}