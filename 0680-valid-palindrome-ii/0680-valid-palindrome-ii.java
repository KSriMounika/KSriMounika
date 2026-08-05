class Solution {
    public boolean isPalindrome(String s, int left, int right)
    {
        int i = left;
        int j = right;
        while(i<j)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {


        int l =0;
        int r = s.length()-1;
        boolean found = true;
        while(l<r)
        {
            if(s.charAt(l) == s.charAt(r))
            {
               l++;
               r--;
            }
            else
            {
                return isPalindrome(s, l+1, r) ||isPalindrome(s, l, r-1) ;
            }
        }
        return true;
       
        
    }
}