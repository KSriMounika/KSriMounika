
class Solution {
   
    public boolean isPowerOfTwo(int n) {

      if(n<=0) return false;
       int ans;
       for(int i=0; i<31; i++)
       {
             ans = (int) Math.pow(2,i);
             if(n == ans) return true;
             if(ans>n) break;
       }
         return false;
       
        
    }
    
}