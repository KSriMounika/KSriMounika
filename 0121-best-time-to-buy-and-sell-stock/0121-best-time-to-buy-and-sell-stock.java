class Solution {
    public int maxProfit(int[] prices) {

        int m = 0;
        int ans = prices[0];
        for(int i=0; i<prices.length; i++)
        {
            if(prices[i] < ans)
            {
                ans = prices[i];
            }
            int res = prices[i] - ans;
            m = Math.max(m, res);
            
        }
        return m;
        
    }
}