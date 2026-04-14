class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.isEmpty() || t.isEmpty())
            return false;
        if(s.length() != t.length())
            return false;
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            char c1 = t.charAt(i);
            if(map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
            if(map2.containsKey(c1))
                map2.put(c1, map2.get(c1) + 1);
            else
                map2.put(c1, 1);
            
        }
        
        for(Character c: map.keySet()){
            if(map2.containsKey(c) && map2.get(c).equals(map.get(c)))
                continue;
            else 
                return false;
        }
        return true;
    }
}
