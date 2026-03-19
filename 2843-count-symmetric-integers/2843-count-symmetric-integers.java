class Solution {
    public int countSymmetricIntegers(int low, int high) {

        int c=0;
        for(int i=low; i<=high; i++)
        {
            int dc =0;
            int temp =i;
            while(temp!=0)
            {
                dc += 1;
                temp = temp/10;
            }
            if(dc%2==0)
            {
                int h = dc/2;  
                int div = 1;
                for(int j=0; j<h; j++)
                {
                    div = div*10;
                }
              
                int n = i/div;
                int m = i%div;
                int s=0;
                int s1=0;
                while(n!=0)
                {
                    s += n%10;
                    n = n/10;

                }
                while(m!=0)
                {
                    s1+= m%10;
                    m = m/10;
                }
                if(s==s1)
                {
                    c++;
                }
            }
        }
        return c;
        
    }
}