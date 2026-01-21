class Solution {
    public int maximumWealth(int[][] accounts) {
        
    
        int max1 = -1;
        int n = accounts.length;
        int m = accounts[0].length;
        for(int i=0; i<n; i++)
        {
            int s=0;
            for(int j=0; j<m; j++)
            {
               s += accounts[i][j];
               max1 = Math.max(s, max1);
              
            }
           
           
          
        }
        return max1;
    }
}