class Solution {
    public int trap(int[] height) {
        int size = height.length;
        int[] left = new int[size];
        int[] right = new int[size];
        int lMax = 0;
        int rMax = 0;
        for(int i = 0; i < size; i++){
            int rIdx = size-1-i;
            rMax = Math.max(height[rIdx], rMax);
            lMax = Math.max(height[i], lMax);
            left[i] = lMax;
            right[rIdx] = rMax;
        }
        int result = 0;
        for(int i = 0; i < size; i++){
            result += Math.min(right[i], left[i]) - height[i];
        }
        return result; 
    }
}
