class Solution {
    public boolean isBalanced(String num) {

        int os =0;
        int es=0;
        char[] c = num.toCharArray();

        for(int i=0; i<c.length; i++)
        {
            
            if(i%2==0)
            {
                es += c[i]-'0';
            }
            else
            {
                os += c[i]-'0';
            }
        }
        if(os==es)
        {
            return true;
        }
        return false;

        
    }
}