class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<>();
        int[] res = new int[temperatures.length];
        for(int i = 0; i< temperatures.length; i++){
            while(!s.isEmpty() && temperatures[s.peek()] < temperatures[i]){
                int index = s.pop();
                res[index] = i-index;
            }
            s.push(i);            
        }
        while(!s.isEmpty()){
            int index = s.pop();
            res[index] = 0;
        }
        return res;
    }
}
