class Solution {
  public boolean isPalindrome(String s) {
        s = s.trim();
        s = s.toLowerCase();
        int start = 0;
        int end = s.length()-1;
        while (start < end){
            char a = s.charAt(start);
            char b = s.charAt(end);
            if(!String.valueOf(a).matches("[a-z0-9]")){
                start++;
                continue;
            }
            if(!String.valueOf(b).matches("[a-z0-9]")){
                end--;
                continue;
            }
            if(a == b){
                start++;
                end--;
            } else{
                return false;
            }
        }
        return true;
    }
}
