class Solution {
    public int[] finalPrices(int[] prices) {

        int n = prices.length;
        int [] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(j>i && prices[j]<=prices[i])
                {
                    arr[i] = prices[i]-prices[j];
                    break;
                }
                else
                {
                    arr[i]=prices[i];
                }

            }
        }
        return arr;
        
    }
}