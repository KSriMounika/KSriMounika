class Solution {
    int get_sum(int num)
    {
        int s=0;
        while(num > 0)
        {
            int r = num%10;
            s += r*r;
            num = num/10;
        }
        return s;
    }
    public boolean isHappy(int n)
     {
           
           while(n>9)
           {
             n = get_sum(n);
           }
       
            if(n==1 || n==7)
            {
                return true;
            }
            return false;
     }

          
}