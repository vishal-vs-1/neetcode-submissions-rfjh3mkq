class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer []> stack = new ArrayDeque<>();
        int result = 0;
        for(int i = 0; i < heights.length; i++){
            Integer [] arr = new Integer[2];
            arr[0] = i;
            arr[1] = heights[i];
            if(stack.isEmpty()){
                stack.push(arr);
                continue;
            }
            while (!stack.isEmpty() && stack.peek()[1] > arr[1]){
                Integer [] pop = stack.pop();
                int popIndex = pop[0];
                int popHeight = pop[1];
                result = Math.max(result, (i-popIndex) * popHeight);
                arr[0] = popIndex;
            }
            stack.push(arr);
        }
        int len = heights.length;
        while(!stack.isEmpty()){
            Integer [] arr = stack.pop();
            result = Math.max(result, (len - arr[0]) * arr[1]);
        }
        return result;
    }
}
