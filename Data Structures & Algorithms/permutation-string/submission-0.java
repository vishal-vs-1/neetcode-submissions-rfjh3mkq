class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if(len1 > len2) return false;

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(int i = 0; i < len1; i++){
            arr1[s1.charAt(i) - 'a']++;
            arr2[s2.charAt(i) - 'a']++;
        }
        int matches = 0;
        for(int i = 0; i < 26; i++)
            if(arr1[i] == arr2[i])  matches++;
    
        int left = 0;
        int right = len1;
        while(right < len2){
            if(matches == 26)   return true;
            int i = s2.charAt(right) - 'a';
            arr2[i]++;

            if(arr1[i] == arr2[i])  matches++;
            else if(arr1[i] == arr2[i] - 1) matches--;
            right++;

            int x = s2.charAt(left) - 'a';
            arr2[x]--;

            if(arr1[x] == arr2[x])  matches++;
            else if(arr1[x] == arr2[x] + 1) matches--;
            left++;

        }
        return matches == 26;

    }
}
