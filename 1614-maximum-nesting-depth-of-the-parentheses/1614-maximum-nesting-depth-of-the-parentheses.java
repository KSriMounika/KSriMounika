class Solution {
    public int maxDepth(String s) {

        int c =0;
        int ans =0;
        int m = Integer.MIN_VALUE;
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
             if(ch == '(')
                {
                    
                    c++;
                }
                else if(ch == ')')
                {
                    c--;
                   
                }
                 m = Math.max(m , c);
            
        }
        return m;
        
    }
}