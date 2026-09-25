class Solution {
    public int fibo(int n1)
    {
        int a = 0;
        int b = 1;
        int c = 0;
        if(n1 == 0)
        {
            return 0;
        }
        if(n1==1)
        {
            return 1;
        }
        while(n1-->1)
        {
            c = a+b;
            a = b;
            b = c;
        }
        return c;

    }
    public int fib(int n) {
        
       
        int res = fibo(n);
       
        return res;
    }
}