class Solution {
    public int mostWordsFound(String[] sentences) {
        int m = -1;
       
        for(String x: sentences)
        { 
             int c=0;
             for(String y : x.split(" "))
             {
               c = c+1;
               m = Math.max(m,c);
             }
                
            
        }
        return m;
    }
}