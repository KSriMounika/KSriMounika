class Solution {
    public int[][] largestLocal(int[][] grid) {

        int n = grid.length;
        int [][] loc = new int[n-2][n-2];
       
        for(int r=0; r<n-2; r++)
        {
            for(int c=0; c<n-2; c++)
            {
                for(int i=r; i<=r+2; i++)
                {
                    for(int j=c; j<=c+2; j++)
                    {
                        loc[r][c] = Math.max(loc[r][c],grid[i][j]);
                    }
                }
             
            }
        }
        
        return loc;
    }
}