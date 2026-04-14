class Solution {
    public int maxArea(int[] heights) {
        int s  = 0;
        int e = heights.length - 1;
        int maxArea = 0;
        while(s<e){
            int gap = e-s;
            int fac = 0;
            if(heights[s] < heights[e]){
                fac = heights[s];
                s++;
            } else{
                fac = heights[e];
                e--;
            }
            maxArea = Math.max(maxArea, fac* gap);
        }
        return maxArea;
    }
}
