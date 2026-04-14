class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int l = 0, r = 0, res = 0, mf = 0;
        while(r < s.length()){
            int count = ++arr[s.charAt(r)-'A'];
            mf = Math.max(count, mf);
            while((r-l+1) - mf > k){
                arr[s.charAt(l) - 'A']--;
                l++;
            }
            res = Math.max(res, r-l+1);
            r++;
        }
        return res;
    }
}
