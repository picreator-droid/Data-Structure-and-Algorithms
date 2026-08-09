class Solution {
    public int maxProfit(int[] prices) {
        // int maxProfit=0;
        // for(int i=0; i<prices.length; i++){
        //     int buy=prices[i];
        //     for(int j=i+1; j<prices.length; j++){
        //         int sell=prices[j];
        //         if(sell>buy){
        //             int profit=sell-buy;
        //             maxProfit=Math.max(maxProfit, profit);
        //         }

        //     }
            

        // }
        // return maxProfit;

        int maxProfit=0;
        int buy=Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            int newPrice=prices[i];
            if(newPrice<buy){
                buy=newPrice;
            }
            int curr_profit=newPrice-buy;
            maxProfit=Math.max(curr_profit, maxProfit);

        }
        return maxProfit;
    }
}