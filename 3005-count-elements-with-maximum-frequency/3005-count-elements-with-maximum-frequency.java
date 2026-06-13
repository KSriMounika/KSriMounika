class Solution {
    public int maxFrequencyElements(int[] nums) {

        int[] freq = new int[256];
        for(int i=0; i<nums.length; i++)
        {
            freq[nums[i]]++;
        }
        int m = 0;
       
        for(int j=0; j<freq.length; j++)
        { 
            if(freq[j]>m)
            {
                m = freq[j];
                
               
            }
          

        }
        int s=0;
        for(int x: freq)
        {
            if(x==m)
            {
                s+=x;
            }
        }
        return s;
    }
}