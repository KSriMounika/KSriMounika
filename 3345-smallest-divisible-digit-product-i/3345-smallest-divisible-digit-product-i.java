class Solution {
    public int smallestNumber(int n, int t) {
        
        int m = Integer.MAX_VALUE;
        for(int i=n; i<=100; i++)
        {
            int temp =i;
            int ds = 1;
            while(temp > 0)
            {

                int res = temp%10;
                ds *= res;
                temp = temp/10;
                
            }

             if(ds % t == 0 && i >= n)
             {
                  m = Math.min(i, m);
            }
            
           
        }
        return m;
    }
}