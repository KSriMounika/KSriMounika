class Solution {
    public int countEven(int num) {
        
        int c=0;
        for(int i=1; i<=num; i++)
        {
            int temp =i;
            int s=0;
            while(temp >0)
            {
                int res = temp % 10;
                s += res;
                temp = temp/10;
            }
            if(s%2 == 0)
            {
                c++;
            }
        }
        return c;
    }
}