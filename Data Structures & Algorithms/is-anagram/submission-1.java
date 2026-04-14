class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length())
            return false;
        int[] sa = new int[26];
        int[] ta = new int[26];
        for(int i = 0; i < t.length(); i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            sa[cs - 'a'] +=1;
            ta[ct - 'a'] +=1;
        }
        for(int i = 0; i< 26; i++){
            if(sa[i] != ta[i])
                return false;
        }        
        return true;
    }
}
