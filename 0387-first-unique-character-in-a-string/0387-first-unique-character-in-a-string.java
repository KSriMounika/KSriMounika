class Solution {
    public int firstUniqChar(String s) {

     char[] arr =s.toCharArray();
     int [] freqarr = new int[26];
     for(int i=0; i<arr.length; i++)
     {
        freqarr[arr[i]-'a']++;
     }
     for(int i = 0; i<arr.length; i++)
     {
        if(freqarr[arr[i]-'a']==1)
        {
            return i;
        }
     }
     return -1;
        
    }
}