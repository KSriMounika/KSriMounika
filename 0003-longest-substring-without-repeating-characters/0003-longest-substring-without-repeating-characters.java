class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] arr = new int[256];
        Arrays.fill(arr, -1);
        int maxlen = 0;
        int l =0;
        int r = 0; 
        while(r<s.length())
        {
              if(arr[s.charAt(r)] != -1)
              {
                if(arr[s.charAt(r)]>= l)
                {
                    l = arr[s.charAt(r)]+1;
                }
              }
              int len = r-l+1;
              arr[s.charAt(r)] = r;
              maxlen = Math.max(len, maxlen);
              r++;

        }
        return maxlen;
        
    }
}