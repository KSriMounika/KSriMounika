class Solution {
    public boolean isThree(int n) {

       
        int c=1;
        for(int i=2; i<= (int)Math.sqrt(n); i++)
        {
            if(n%i==0)
            {
                int pow =0;
                while(n%i == 0)
                {
                    pow++;
                    n = n/i;
                }
                c = c*(pow+1);
            }

            if(n==1)
            {
                break;
            }

        }
        if(n>1)
        {
            c = c*2;;
        }
        if(c==3)
        {
            return true;
        }
        return false;
    }
}