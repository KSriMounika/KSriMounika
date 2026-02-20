class Solution {
    public int countTriples(int n) {

        int c=0;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                for(int k=1; k<=n; k++)
                {
                    int res = i*i+j*j;
                    if(res == k*k)
                    {
                        c++;
                    }
                }
            }
        }
        return c;
        
    }
}