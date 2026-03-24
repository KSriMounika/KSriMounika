class Solution {
    public int countAsterisks(String s) {

        int c=0;
        boolean ins = false;
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '|')
            {
                if(ins == true)
                {
                    ins = false;
                }
                else if(ins == false)
                {
                    ins = true;
                }


                
            }
            if(ch == '*' && ins == false)
            {
                c++;
            }
        }
        return c;
        
    }
}