class Solution {
    public int maxArea(int[] heights) {
        int len = heights.length;
        int start = 0;
        int end = len-1;
        int result = 0;
        while(start < end){
            int cap = Math.min(heights[start], heights[end]) * (end - start);
            result = Math.max(cap, result);
            if(heights[start] < heights[end])
                start++;
            else
                end--;
        }
        return result;
    }
}
