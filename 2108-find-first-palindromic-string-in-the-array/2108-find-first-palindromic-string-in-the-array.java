class Solution {
    public String firstPalindrome(String[] words) {
        
          
           
            for(int i=0; i<words.length; i++)
            {
                String s1 = words[i];
                int l =0;
                int r = s1.length()-1;
                boolean flag = true;
                while(l < r)
                {
                    if(s1.charAt(l) != s1.charAt(r))
                    {
                          flag = false;
                          break;

                    }
                    l++;
                    r--;
                    
                    
                }
                 if(flag)   return s1;
            }
           
            return "";

    }
}