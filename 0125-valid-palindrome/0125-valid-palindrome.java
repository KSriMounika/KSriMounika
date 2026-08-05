class Solution {
    public boolean isPalindrome(String s) {

        String res = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int l=0;
        int r = res.length()-1;
        boolean found = true;
        while(l<r)
        {
            if(res.charAt(l) != res.charAt(r))
            {
                found = false;

            }
            l++;
            r--;
        }
        if(found == true)
        {
            return true;
        }
        return false;
        
    }
}