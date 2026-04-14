class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> ms = new HashMap<>();
        Map<Character, Integer> mt = new HashMap<>();
        for(char c: t.toCharArray())
            mt.put(c, mt.getOrDefault(c, 0) + 1);
        
        int l = 0;
        int r = 0;
        //no of character which are in T and have equal frequency
        int have = 0;
        //No of characters T have in hashmap
        int need = mt.size();
        //to store index of string
        int[] res = {-1, -1};
        int length = Integer.MAX_VALUE;

        while(r<s.length()){
            //get char at pointer
            char c = s.charAt(r);
            //put the character in map and increase it's number by one
            ms.put(c, ms.getOrDefault(c, 0) + 1);
            //if T contains this character and the frequency is same as in S map then increase have
            if(mt.containsKey(c) && ms.get(c) == mt.get(c)){
                //increase have
                have++;
            }
            //if the have is qual to need
            while(have == need){
                if((r-l+1) < length){
                    length = r-l+1;
                    res[0] = l;
                    res[1] = r;
                }
                char lc = s.charAt(l);
                ms.put(lc, ms.get(lc) - 1);
                if(mt.containsKey(lc) && mt.get(lc) > ms.get(lc)){
                    have--;
                }
                l++;
            }
            r++;
        }
        return length == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }
}
