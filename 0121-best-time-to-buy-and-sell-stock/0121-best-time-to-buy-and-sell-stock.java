class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int minp=Integer.MAX_VALUE;
        for(int price:prices){
            if(minp>price){
                minp=price;
            }
            else{
                maxprofit=Math.max(maxprofit,price-minp);
            }
        }
        return maxprofit;
    }
}