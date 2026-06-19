class Solution {
    public String sortSentence(String s) {

        String[] words = s.split(" ");
        String[] ans = new String[words.length];
        for(String w: words)
        {
            char[] a = w.toCharArray();
            int ind =0;
            String temp = "";
            for(char c: a)
            {
                
                if(Character.isDigit(c))
                {
                    ind = (c-'0')-1;

                }
                else
                {
                    temp += c;
                }
               
            }
            
            ans[ind] = temp;
                

            
        }
        return String.join(" ", ans);
        
    }
}