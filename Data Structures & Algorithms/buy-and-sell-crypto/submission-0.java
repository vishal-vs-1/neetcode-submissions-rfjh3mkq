class Solution {
    public int maxProfit(int[] prices) {
        int s = 0;
        int e = 1;
        int res = 0;
        while(e<prices.length && s<e){
            int buy = prices[s];
            int sell = prices[e];
            int profit = sell-buy;
            if(profit<=0){
                s = e;
                e++;
            } else{
                if(profit>res){
                    res = profit;
                } 
                e++;
            }
        }
        return res;
        
    }
}
