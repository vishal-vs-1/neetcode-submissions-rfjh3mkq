class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character c: s.toCharArray()){
            if(stack.isEmpty() || c.equals('[') || c.equals('(') || c.equals('{')){
                stack.add(c);              
            }else if((c.equals(']') && stack.peek()=='[' ) || 
                    (c.equals(')') && stack.peek()=='(')||
                    (c.equals('}')&& stack.peek()=='{')){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}
