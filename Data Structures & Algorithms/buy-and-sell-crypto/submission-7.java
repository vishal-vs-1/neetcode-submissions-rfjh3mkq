class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int buy = prices[0];
        for(int i: prices){
            if(i < buy){
                buy = i;
            } 
            else{
                result = Math.max(i - buy, result);
            } 
        }
        return result;
    }
}
