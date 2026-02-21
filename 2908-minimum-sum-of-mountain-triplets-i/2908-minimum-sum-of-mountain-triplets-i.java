class Solution {
    public int minimumSum(int[] nums) {

        int s = 0;
        int m = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++)
        {
            
            for(int j=i+1; j<nums.length-1; j++)
            {
                for(int k=j+1; k<nums.length; k++)
                {
                   if((nums[i]<nums[j])&&(nums[k]<nums[j]))
                   {
                       s = nums[i]+nums[j]+nums[k];
                       if(s<m)
                       {
                          m=s;
                         
                       }
                    }
                   
                     
                
                }
                 
            }
           
           
            
        }
        if(m==Integer.MAX_VALUE)return -1;
        return m;
        
    }
}