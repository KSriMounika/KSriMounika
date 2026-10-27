class Solution {
    public String[] createGrid(int m, int n) {

       String[] ans = new String[m];
       char[][] res = new char[m][n];
       for(int i=0; i<m; i++)
       {
       
         for(int j=0; j<n; j++)
         {
            res[i][j] = '#';
            res[0][j] = '.';
            res[i][n-1]= '.';
            
         }
       }
       for(int i=0; i<m; i++)
       {
         ans[i] = new String(res[i]);
       }
       return ans;
        
    }
}