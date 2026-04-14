class Solution {
    public int trap(int[] height) {
        int size = height.length;
        int [] maxL = new int[size];
        int [] maxR = new int[size];
        int mL = 0; 
        int mR = 0;
        for(int i = 0; i < height.length; i++){
            if(height[i] > mL)
                mL = height[i];
            if(height[size-i-1] > mR)
                mR = height[size-i-1];
            maxL[i] = mL;
            maxR[size-i-1] = mR; 
        }

        int result = 0;
        for(int i = 0; i < size; i++){
            int h = Math.min(maxL[i], maxR[i]) - height[i];
            if(h>0)
                result += h;
        }

        return result;
    } 
}
