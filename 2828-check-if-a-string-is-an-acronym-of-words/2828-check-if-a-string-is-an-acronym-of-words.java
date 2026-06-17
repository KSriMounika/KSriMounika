class Solution {
    public boolean isAcronym(List<String> words, String s) {

        String ans = "";
        for(String x: words)
        {
           char[] arr = x.toCharArray();
            ans += arr[0];
        }
        if(ans.equals(s))
        {
            return true;
        }
        return false;
        
    }
}