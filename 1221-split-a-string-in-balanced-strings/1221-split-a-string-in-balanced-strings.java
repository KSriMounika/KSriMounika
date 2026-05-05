class Solution {
    public int balancedStringSplit(String s) {

        int b=0;
        int ans = 0;
        for(int i=0; i<s.length(); i++)
        {
           
            if(s.charAt(i) == 'L')
            {
                b++;
            }
            else
            {
                b--;
            }
            if(b==0)
            {
               ans += 1;
             }

        }
       
       
        return ans;
        
    }
}