class Solution {
    public int trap(int[] height) {
        int s = 0;
        int len = height.length;
        int e = len-1;
        int[] maxl = new int[len];
        int[] maxr = new int[len];
        int lmax = 0;
        int rmax = 0;
        for(int i = 0; i < len; i++){
            int rheight = height[len-1-i];
            int lheight = height[i];
            if(rheight > rmax)  rmax = Math.max(rmax, rheight);
            if(lheight > lmax)  lmax = Math.max(lmax, lheight);
            maxl[i] = lmax;
            maxr[len-1-i] = rmax;
        }

        while(s<e && height[s] < height[s+1]){
            s++;
        }
        int result = 0;
        int temp = 0;
        while(s++<e){
            if(height[s] == maxl[s]){
                continue;
            }
            int maxPole = maxr[s] < maxl[s] ? maxr[s] : maxl[s];
            temp+= maxPole-height[s];
        }
        return temp;
    }
}
