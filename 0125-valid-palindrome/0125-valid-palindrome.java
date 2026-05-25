class Solution {
    public boolean isPalindrome(String r) {

        String m = r.replaceAll("[^A-Z0-9a-z]","");
        String v = m.toLowerCase();
        boolean f = true;
        int l = 0;
        int i = v.length()-1;
        while(l<i)
        {
            
          
            if(v.charAt(l)!=v.charAt(i))
            {
                f = false;
                break;
            }
             l++;
             i--;
               
        }
        return f;
        
    }
}
