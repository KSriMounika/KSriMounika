class Solution {
    public int maximumWealth(int[][] accounts) {

       
        int m = Integer.MIN_VALUE;
        int m1 = accounts.length;
        int n = accounts[0].length;
        for(int i=0; i<m1; i++)
        {
             int s=0;
            for(int j=0; j<n; j++)
            {
                s += accounts[i][j];
                
            }
             m = Math.max(s,m);
           
        }
        return m;
        
    }
}