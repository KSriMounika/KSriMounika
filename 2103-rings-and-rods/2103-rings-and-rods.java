class Solution {
    public int countPoints(String rings) {

       
        int c=0;
        for(int rod=0; rod<=9; rod++)
        {

            boolean r = false;
            boolean g = false;
            boolean b = false;
            for(int i=0; i<rings.length(); i+=2) 
            {
                char ans = rings.charAt(i);
                int currod = rings.charAt(i+1) - '0';
                if(currod == rod)
                {
                    if(ans == 'R')
                    {
                        r = true;
                    }
                    else if(ans == 'G')
                    {
                        g = true;
                    }
                    else if(ans == 'B')
                    {
                        b = true;
                    }
                }
            }
            if ( r && g && b)
            {
                c++;
            }

        }
        return c;
        
    }
}