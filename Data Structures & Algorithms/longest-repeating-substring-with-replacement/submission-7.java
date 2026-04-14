class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int pointer = 0;
        int size = s.length();
        int result = 0;
        int mF = 0;
        while(pointer < size){
            char c = s.charAt(pointer);
            int length = pointer - start + 1;
            map.put(c, map.getOrDefault(c, 0) + 1);
            mF = Math.max(mF, map.get(c));
            if(length - mF > k){
                char cs = s.charAt(start);
                map.put(cs, map.get(cs) - 1);
                start++;
            }else{
                result = Math.max(result, length);    
            }
            pointer++;
            
        }
        return result;
    }
}
