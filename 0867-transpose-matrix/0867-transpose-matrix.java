class Solution {
    public int[][] transpose(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int[][] trans = new int[n][m];
        for(int i =0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                trans[j][i] =  matrix[i][j] ;
            }
        }
         for(int j=0; j<n; j++)
        {
            for(int i =0; i<m; i++)
            {
               System.out.print( trans[j][i] + " ") ;
            }
        }
        return trans;
        
    }
}