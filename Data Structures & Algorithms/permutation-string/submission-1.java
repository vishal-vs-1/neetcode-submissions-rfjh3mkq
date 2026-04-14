class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int a = s1.length();
        int b = s2.length();
        if(a>b) return false;
        int[] arr = new int[26];
        for(int i = 0; i < a; i++){
            arr[s1.charAt(i) - 'a']--;
            arr[s2.charAt(i) - 'a']++;
        }
        if(checkZeroes(arr)) return true;

        int l = 1, r = a;
        while(r<b){
            arr[s2.charAt(l-1) - 'a']--;
            l++;
            arr[s2.charAt(r) - 'a']++;
            if(checkZeroes(arr))    return true;
            r++;
        }
        return false;
    }

    static boolean checkZeroes(int[] arr){
        for(int i: arr){
            if(i != 0)
                return false;
        }
        return true;
    }
}
