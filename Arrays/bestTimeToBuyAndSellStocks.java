class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;

        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
        // int maxIndex=-1;
        // int minIndex=-1;
    
        // for(int i=0; i<prices.length; i++){
        //     if(prices[i] > max){
        //         max = prices[i];
        //         maxIndex = i;
        //     }

        //     if(prices[i] < min){
        //         min = prices[i];
        //         minIndex = i;
        //     }

        //     if(maxIndex <= minIndex){
        //         max = Integer.MIN_VALUE;
        //         maxIndex = -1;
        //     }else if(max - min > profit){
        //         profit = max-min;
        //     }


        // }

        int buy = 0;
        int sell = 1;

        while(sell < prices.length){
            if(prices[sell] - prices[buy] > profit){
                profit = prices[sell] - prices[buy];
            }else if(prices[sell] - prices[buy] < 0){
                buy = sell;
            }
            sell++;
        }

        return profit;
    }
}
