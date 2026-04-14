class Solution {
    public int characterReplacement(String s, int k) {
        int start = 0;
        int pointer = 0;
        int sLen = s.length();
        int result = 0;
        int maxFreq = 0;
        int[] arr = new int[26];
        while(pointer < sLen){
            arr[s.charAt(pointer) - 'A']++;
            maxFreq = Math.max(arr[s.charAt(pointer) - 'A'], maxFreq);
            int length = pointer - start + 1; 
            if((length - maxFreq) > k){
                arr[s.charAt(start) - 'A']--;
                start++;
            }
            result = Math.max(pointer - start + 1, result);
            pointer++;
        }

        return result;
    }
}
