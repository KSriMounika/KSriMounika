class Solution {
    public boolean isValid(String s) {
        

        char[] st = new char[s.length()];
        int top = -1;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)== '{' || s.charAt(i) == '[')
            {
                top++;
                st[top] = s.charAt(i);
            }
            else
            {
                if(top == -1) return false;
                char ch = st[top--];
                if((s.charAt(i)== ')' && ch != '(') || (s.charAt(i)== '}' && ch != '{')|| (s.charAt(i)== ']' && ch != '['))
                {
                    return false;
                }
              
            }

        }
        return top == -1;
    }
}