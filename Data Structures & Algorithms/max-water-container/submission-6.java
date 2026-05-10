class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length-1;
        int maxArea = 0;
        while(l<r){
            int leftHeight = heights[l];
            int rightHeight = heights[r];
            maxArea = Math.max(maxArea, Math.min(leftHeight, rightHeight) * (r-l));
            if(leftHeight < rightHeight)    l++;
            else    r--;
        } 
        return maxArea; 
    }
}
