class Solution {
    public int diagonalSum(int[][] mat) {

        int n = mat.length;
        int s=0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==j)
                {
                    s+= mat[i][j];
                }
            }
        }
         for(int i=0; i<n; i++)
        {
           
            {
                  
                s+= mat[i][n-i-1];
                  
                
            }
        }
        if(n%2 !=0)
        {
            s = s-mat[n/2][n/2];
            return s;
        }
     
        return s;
    }
}