class Solution {
    public boolean isValid(String s) {
        Deque<Character> q = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            switch(c){
                case '{', '[', '(' -> q.add(c);
                case '}' -> {
                    if(q.isEmpty() || q.pollLast() != '{') return false;
                } 
                case ']' -> {
                    if(q.isEmpty() || q.pollLast() != '[') return false;
                }
                case ')' -> {
                    if(q.isEmpty() || q.pollLast() != '(') return false;
                }
                default -> {return false;}
            }
        }
        return q.isEmpty();
    }
}
