class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

           
            String ans = "";
            for(String s: words)
            {
                char[] ch = s.toCharArray();
                 int sum = 0;
                for(char c: ch)
                {
                   
                        int idx = c-'a';
                        sum += weights[idx];
                    
                    
                    
                }
                int res = sum%26;
                 ans += (char)('z'- res);
                
        

            }
            return ans;
           
        
        
    }
}