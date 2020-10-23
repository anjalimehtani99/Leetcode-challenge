class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0)return 0;
        int min=prices[0];
        int maxprof=0;
        for(int i=0;i<prices.length;i++)
        {
            min=Math.min(prices[i],min);
            maxprof=Math.max(maxprof,prices[i]-min);
        }
        return maxprof;
    }
}
