class Solution {
    public boolean isPalindrome(String s) {
        
        String s1 = s.toLowerCase();
        // String s2 = s1.replaceAll("[a-zA-Z0-9]", "");
        int left = 0;
        int right = s1.length()-1;
        while(left < right)
        {
            char l = s1.charAt(left);
            char r = s1.charAt(right);
            if(!Character.isLetterOrDigit(l))
            {
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(r))
            {
                right--;
                continue;
            }
            if(s1.charAt(left) != s1.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}