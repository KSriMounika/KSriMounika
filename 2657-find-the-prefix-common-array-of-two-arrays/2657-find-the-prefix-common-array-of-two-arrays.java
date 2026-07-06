class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        int[] res = new int[A.length];
         
          int k=0;
          while(k<A.length)
          {
                 int c=0;
                for(int i=0; i<=k; i++)
                {
                    
                    for(int j=0; j<=k; j++)
                    {
                        if(A[i]==B[j])
                        {
                            c++;
                        }
                        
                    }
                   
                   
                
                }
              
                  res[k] = c;
                  k++;
              
          }
        return res;
        
    }
}