class Solution {
    public int sumOddLengthSubarrays(int[] arr) {

        int s=0;
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
           int ts = (i+1)*(n-i);
           int os = (ts+1)/2;
           s += os*arr[i];
        }
        return s;


        
    }
}