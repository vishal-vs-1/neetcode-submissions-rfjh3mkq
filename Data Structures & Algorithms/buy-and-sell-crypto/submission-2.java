class Solution {
    public int maxProfit(int[] prices) {
        int buyIndex = 0;
        int sellIndex = 1;
        int mProfit = 0;
        while(sellIndex < prices.length){
            int profit = prices[sellIndex] - prices[buyIndex];
            if(profit < 0){
                buyIndex = sellIndex;
            }else{
                mProfit = Math.max(mProfit, profit);
            }
            sellIndex++;
        }
        return mProfit;
    }
}
