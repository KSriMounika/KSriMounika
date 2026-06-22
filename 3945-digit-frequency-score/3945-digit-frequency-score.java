class Solution {
    public int digitFrequencyScore(int n) {

        int[] freq = new int[256];
        int temp = n;
        while(temp >0)
        {
            int n1 = temp%10;
            freq[n1]++;
            temp = temp/10;
        }
        int s=0;
        for(int i=0; i<freq.length; i++)
        {
            s+= i*freq[i];
        }
        return s;
        
    }
}