class Solution {
    public boolean isStrictlyPalindromic(int n) {

      if(n>=4) return false;
      String s = "";
      boolean flag = false;
      for(int i =2; i<= n-2; i++)
      {
        int temp = n;
        while(temp>0)
        {
            int d = temp%i;
            s += d;
            temp = temp/i;
        }
        int l =0;
        int h = s.length()-1;
        while(l<h)
        {
                if(s.charAt(l)==s.charAt(h))
                {
                     flag = true;
                }
                l++;
                h--;
         }

        

      }
      return flag;


    }
}