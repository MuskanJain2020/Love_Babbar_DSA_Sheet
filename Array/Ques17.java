class Solution {
    public int maxProfit(int[] prices) {
        int maxsum = 0 ;
        int minvalue = prices[0];
        for (int i = 0 ; i< prices.length; i++){
           minvalue = Math.min(minvalue , prices[i]);
            maxsum = Math.max (maxsum , prices[i]-minvalue);
        }
        return maxsum ;
        
    }
}
