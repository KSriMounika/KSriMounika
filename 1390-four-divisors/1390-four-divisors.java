class Solution {
    public int sumFourDivisors(int[] nums) {


         int t  =0;
        for(int x: nums)
        {
            int c=0;
            int s=0;
            for(int i=1; i*i<=x; i++)
            {
                    
                    if(x%i==0)
                    {
                        if(i*i==x )
                        {
                        c++;
                        s = s+i;  
                        }
                        else if(i*i != x)
                        {
                            c+=2;
                            s = s+i+x/i;
                        }   
                    }
               
                 
            }
             if(c==4)
                {
                     t =s+t;   
                }
                     
        }
        return t;
    }
}