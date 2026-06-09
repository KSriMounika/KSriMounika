class Solution {
    public String clearDigits(String s) {

        char[] st = new char[s.length()];
        String ans = "";
        int top = -1;
        for(int i=0; i<s.length(); i++)
        {
            if(Character.isLetter(s.charAt(i)))
            {
                st[++top] = s.charAt(i);
              
            }
            else
            {
                if(top == -1)
                {
                    return ans;
                }
                else
                {
                    char ch = s.charAt(i);
                    if(Character.isDigit(ch))
                    {
                         top--;

                    }
                   
                }
            }
             
        }
        for(int j=0; j<=top; j++)
        {
            ans += st[j];
           
        }
       

        return ans;
        
    }
}