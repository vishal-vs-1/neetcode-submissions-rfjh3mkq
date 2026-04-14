class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length-1;
        int result = 0;
        while(start<end){
            int a = heights[start];
            int b = heights[end];
            int volume = 0;
            if(a<b){
                volume = a*(end-start);
                start++;
            }
            else{
                volume = b*(end-start);
                end--;
            }
            if(volume > result)
                result = volume;

        }
        return result;
    }
}
