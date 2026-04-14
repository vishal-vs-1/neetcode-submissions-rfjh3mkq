class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        if(piles.length > h)    return -1;
        int max = 0;
        for(int i:piles){
            max = Math.max(max, i);
        }
        int result = max;
        int s = 1, e = max;
        while(s<=e){
            int k = (e-s)/2 +s;
            int time = 0;
            for(int i:piles){
                time += (long)(i + k - 1) / k;
                if(time > h)    break;
            }
            if(time > h)    s = k+1;
            else{
                result = Math.min(result, k);
                e = k-1;
            }
        }
        return result;
    }
}
