class Solution {
    public int findMaxK(int[] nums) {

          
        int m = -1;
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                int res = nums[i]+nums[j];
                if(res ==0)
                {
                    int a = Math.abs(nums[i]);
                
                    m = Math.max(a, m);
                }
                   
                  
                
                  
                
            }
            
            
        }
      
        return m;
    }
}