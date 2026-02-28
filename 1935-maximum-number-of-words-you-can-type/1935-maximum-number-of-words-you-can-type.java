class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {


        int c=0;
        String[] parts = text.split(" ");
       
        for(int i=0; i<parts.length; i++)
        {
             boolean flag = false;
            for(int j=0; j<brokenLetters.length(); j++)
            {
                char ch = brokenLetters.charAt(j);
                if(parts[i].contains(String.valueOf(ch)))
                {
                   flag = true;
                   break;
                  
                
                }
                
            }
            if(flag == false)
            {
                c++;
            }
           
        }
        return c;
        
    }
}