class Solution {
    public String replaceDigits(String s) {
        
        String s1 = "";
        for(int i=1; i<s.length(); i+=2)
        {
            char ch = s.charAt(i-1);
            int dig = s.charAt(i) - '0';
            s1 += ch;
            s1 += (char)(ch+ dig);
        }
        if(s.length() %2 !=0)
        {
            s1 += s.charAt(s.length()-1);
        }
        return s1;
    }
}