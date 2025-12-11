class Solution {
    public int finalValueAfterOperations(String[] operations) {

        int x = 0;
        String s;
        for(String val: operations)
        {
            
            if( val.charAt(1) == '+' )
            {
                x = x+1;
                 
            }
            else 
            {
                x = x-1;
               
            }
            
        }
          return x;
       
    }
}