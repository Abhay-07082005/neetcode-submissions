class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0;
        int minp=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minp){
                minp=prices[i];
            }else{
                maxp=Math.max(maxp,prices[i]-minp);
            }
        }
        return maxp;
    }
}
