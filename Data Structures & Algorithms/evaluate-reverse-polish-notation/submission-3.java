class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s: tokens){
            if(!s.matches("[+*/-]")){
                stack.add(Integer.valueOf(s));
            }
            else{
                int a = stack.pop();
                int b = stack.pop();
                switch (s) {
                    case "+" -> a += b;
                    case "-" -> a = b - a;
                    case "*" -> a *= b;
                    case "/" -> {
                        if (a == 0) continue;
                        a = b / a;
                    }
                }
                stack.add(a);
            }
        }
        return stack.peek();
    }
}
