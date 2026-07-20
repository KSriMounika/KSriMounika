class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

       List<List<Integer>> l = new ArrayList<>();
       int m = grid.length;
       int n = grid[0].length;
       int[][] grid1 = new int[m][n];
       while(k-->0)
        {
            int temp =    grid[m-1][n-1];
            for(int i=0; i<m; i++)
            {
                for(int j=n-1; j>=0; j--)
                {
                   if(j>0)
                   {
                    grid1[i][j] = grid[i][j-1];
                    
                   }
                   else if(j==0 && i>0)
                   {
                    grid1[i][j] = grid[i-1][n-1];
                   }
                   else
                   {
                    grid1[i][j] = temp;
                   }
                       
                }
             }
             for (int i = 0; i < m; i++)
            {
                for (int j = 0; j < n; j++) 
                {
                       grid[i][j] = grid1[i][j];
                }
            }
       }
       for(int i=0; i<m; i++)
        {
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0; j<n; j++)
            {
                row.add(grid[i][j]);
            }
             l.add(row);
        }
       
        return l;

    }
}