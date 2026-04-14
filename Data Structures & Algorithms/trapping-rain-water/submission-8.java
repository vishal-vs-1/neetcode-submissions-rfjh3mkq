class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] maxl = new int[len];
        int[] maxr = new int[len];
        int lmax = 0;
        int rmax = 0;
        for(int i = 0; i < len; i++){
            lmax = Math.max(lmax, height[i]);
            maxl[i] = lmax;
            rmax = Math.max(rmax, height[len-1-i]);
            maxr[len-1-i] = rmax;
        }
        int result = 0;
        for(int i = 0; i < len; i++){
            result += Math.min(maxl[i], maxr[i]) - height[i];
        }
        return result;
    }
}
