class Solution {
    public int minBitFlips(int start, int goal) {
        

        int res = start ^ goal;
        int c=0;
        while(res>0)
        {
          
          if((res&1)==1)
          {
            c++;
          }
         
          res = res>>1;
        }
        return c;
        
    }
}