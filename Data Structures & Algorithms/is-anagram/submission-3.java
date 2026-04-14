class Solution {
    public boolean isAnagram(String s, String t) {
        int ssize = s.length();
        int tsize = t.length();
        if(ssize != tsize)
            return false;
        int [] result = new int[26];
        for(int i = 0; i < ssize; i++){
            int sIndex = s.charAt(i) - 'a';
            int iIndex = t.charAt(i) - 'a';
            result[sIndex]++;
            result[iIndex]--;
        }
        for(int i: result){
            if(i != 0)
                return false;
        }
        return true;
    }
}
