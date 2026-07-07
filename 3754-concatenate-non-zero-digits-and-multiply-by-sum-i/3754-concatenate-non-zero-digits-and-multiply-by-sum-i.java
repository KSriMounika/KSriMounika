class Solution {
    public long sumAndMultiply(int n) {
        
        int ds =0;
        String s = "";
        int temp = n;
        while(temp>0)
        {
            int res = temp%10;
            if(res > 0)
             {
                s = res+s;
              }
            ds += res;
            temp = temp/10;

        }
            
        long a=0;
        if(!s.isEmpty())
        {
           a = Long.parseLong(s);
        }
        long ans = (ds) * a;
        return ans;
        
    }
}