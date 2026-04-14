class Solution {
    public int lengthOfLongestSubstring(String s) {
        //start
        int start = 0;
        //pointer
        int pointer = 0;
        int sLen = s.length();
        int result = 0;
        Set<Character> search = new HashSet<>();
        //loop till pointer reaches end of string
        while(pointer < sLen){
            char c = s.charAt(pointer);
            //if set contains character
            if(search.contains(c)){
                //loop till start pointer get to that duplicate and remove all characters before that duplicate from set                
                while(s.charAt(start) != c){
                    search.remove(s.charAt(start));
                    start++;
                }
                //move start pointer after duplicate
                start++;
            }else{
                //else add character in set
                search.add(c);
            }
            //get length from start to pointer
            result = Math.max(pointer-start+1, result);
            //increase pointer
            pointer++;
        }
        return result;
    }
}
