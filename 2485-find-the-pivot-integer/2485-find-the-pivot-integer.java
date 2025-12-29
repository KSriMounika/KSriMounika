class Solution {
    public int pivotInteger(int n) {
        
      
       int ts = (n*(n+1))/2 ;
       int x = (int) Math.sqrt(ts);

       if(x*x == ts) 
       {
         return x;
       }
       return -1;
        
       
    }
}
