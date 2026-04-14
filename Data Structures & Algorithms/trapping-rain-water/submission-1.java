class Solution {
    public int trap(int[] height) {
        int hLen = height.length;
        int[] leftMax = new int[hLen];
        int[] rightMax = new int[hLen];
        int lm = 0;
        int rm = 0;
        
        for(int i = 0; i < hLen; i++){
            lm = Math.max(lm, height[i]);
            leftMax[i] = lm;
            rm = Math.max(rm, height[hLen -i - 1]);
            rightMax[hLen -i - 1] = rm;
        }

        int result = 0;
        for(int i = 0; i < hLen; i++){
            int water = Math.min(leftMax[i], rightMax[i])- height[i];
            if(water > 0)
                result += water;
        }

        return result;
    }
}
