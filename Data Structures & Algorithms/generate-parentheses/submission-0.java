class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(n, 0, 0, res, "");
        return res;
    }
    void backtrack(int n, int open, int close, List<String> res, String s){
        if(s.length() == n*2){
            res.add(s);
            return;
        }
        if(open<n){
            backtrack(n, open+1, close, res, s + "(");
        }
        if(close<open){
            backtrack(n, open, close+1, res, s + ")");
        }
    }
    
}
