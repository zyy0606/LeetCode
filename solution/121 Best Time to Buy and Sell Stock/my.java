public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<2) return 0;
        int max=0;
        int tmp=0;
        for(int i=1;i<prices.length;i++){
            tmp+=prices[i]-prices[i-1];
            tmp=tmp<0?0:tmp;
            if(tmp>max) max=tmp;
        }
        return max;
    }
}