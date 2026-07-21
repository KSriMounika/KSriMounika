class Solution {
    public int scoreOfString(String s) {

        int s1=0;
        for(int i=0; i<s.length()-1; i++)
        {
              s1 += Math.abs((s.charAt(i)-'a')-(s.charAt(i+1)-'a'));
            
        }
        return s1;
        
    }
}