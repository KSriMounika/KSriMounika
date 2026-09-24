class Solution {
    public int mostFrequentEven(int[] nums) {

        int[] freq = new int[100001];
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] % 2 == 0)
            {
              freq[nums[i]]++;
            }
           
        }
        int m = 0;
        int ans = -1;
        for(int i=0; i<freq.length; i++)
        {
            if(freq[i] > m )
            {
                m = freq[i];
                ans = i;
            }
            

          
        }
        return ans;
        
    }
}