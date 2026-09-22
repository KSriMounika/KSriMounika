class Solution {
    public String longestPalindrome(String s) {

        if(s.length() <= 1)
        {
            return s;
        }
       
        int maxlen = 1;
        String res = s.substring(0,1);
        for(int i=1; i<s.length()-1; i++)
        {
            int low = i-1;
            int high = i+1;
            while(low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high))
            {
                low--;
                high++;
              
            }
            String lps = s.substring(low+1, high);
            if(lps.length() > maxlen)
            {
                maxlen = lps.length();
                res = lps;
            }
           


        }
         for(int i=0; i<s.length()-1; i++)
        {
            int low = i;
            int high = i+1;
            while(low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high))
            {
                low--;
                high++;
              
               
            }
            String elps = s.substring(low+1, high);
            if(elps.length() > maxlen)
            {
                maxlen = elps.length();
                res = elps;
            }
           
           

        }
       return res;
       
        
    }
}