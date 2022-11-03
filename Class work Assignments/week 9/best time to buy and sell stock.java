class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0], diff=0;
        for(int i=1;i<prices.length;i++){
            //if i sell
            int myprofit=prices[i]-min;
            if(myprofit>diff){
                diff=myprofit;
            }
            if(min>prices[i]){
                min=prices[i];
            }
        }
        return diff;
    }
}