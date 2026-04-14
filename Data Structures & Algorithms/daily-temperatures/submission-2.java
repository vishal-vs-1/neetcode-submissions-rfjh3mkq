class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Deque<Integer> d = new ArrayDeque<>();
        int count = 0;
        for(int i = 0; i < temperatures.length; i++){            
            while(!d.isEmpty() && temperatures[d.peek()] < temperatures[i]){
                int pos = d.pop();
                result[pos] = i-pos;
            }
            d.push(i);
        }
        return result;
        
    }
}