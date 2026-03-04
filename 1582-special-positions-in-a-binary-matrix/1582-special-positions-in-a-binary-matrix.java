class Solution {
    public int numSpecial(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;
        int c=0;
        boolean flag = true;
        for(int i=0; i<m; i++ )
        {
            for(int j=0; j<n; j++)
            {
                if(mat[i][j]==1)
                {
                   flag = true;
                    for(int k=0; k<n; k++)
                    {
                        if(k!=j && mat[i][k]==1)
                        {
                            flag = false;
                            break;
                        }

                    }
                    for(int k=0; k<m; k++)
                    {
                        if(k!=i && mat[k][j]==1)
                        {
                            flag = false;
                            break;
                        }
                        
                    }
                     if(flag == true)
                    {
                        c++;
                    }
                }
                
            }
           
        }
        return c;
    }
}