class Solution {
    public int firstMatchingIndex(String s) {

         
        for(int i=0; i<s.length(); i++)
        {
           
            for(int j=s.length()-1; j>=0; j--)
            {
           
                if(s.charAt(i) == s.charAt(s.length()-i-1))
                {
                return i;
                    
                }
            }
          
         
        }
      
          return -1;
    }
}