class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> q = new ArrayDeque<>();
        for(String s:tokens){
            if(s.equals("+") || s.equals("*") || s.equals("-") || s.equals("/")){
                int b = Integer.valueOf(q.poll());
                int a = Integer.valueOf(q.poll());
                int sol = 0;
                switch(s){
                    case "+" -> sol = a+b;
                    case "-" -> sol = a-b;
                    case "*" -> sol = a*b;
                    case "/" -> sol = a/b;
                }
                q.push(sol);
            } else{
                q.push(Integer.valueOf(s));
            }
        }
        return q.poll();
    }
}
