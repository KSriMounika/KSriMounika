class Solution {
    public int countPairs(int[] nums, int k) {

        int n = nums.length;
        int c=0;
        for(int i=0; i<n; i++)
        {
           
            for(int j=n-1; j>=1; j--)
            {
                if(i<j)
                {
                    if(nums[i]==nums[j] && (i*j) % k==0)
                    {
                        c++;
                    } 
                   
                }
                
            
            }
          
        }
        return c;
        
    }
}