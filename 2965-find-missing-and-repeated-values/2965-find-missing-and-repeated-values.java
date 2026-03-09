class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;
        int[] arr = new int[2];
        boolean[] s =  new boolean[n*n+1];
        int c=0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                  int val= grid[i][j];
                  if(s[val])
                  {
                    arr[0] = val;
                  }
                  else
                  {
                    s[val] = true;
                  }
                
            }
        }
        for(int i=1; i<=n*n; i++)
        {
            if(!s[i])
            {
                arr[1]=i;
            }
        }
        return arr;
    }
}