class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {

        int c=0; 
     
        for(int i=0; i<nums.length; i++)
        {
           
            for(int j=i+1; j<nums.length; j++)
            {
                
                for(int k = j+1; k<nums.length; k++)
                {
                       int res1 = nums[j]- nums[i];
                        int res2 = nums[k]-nums[j];
                        if(res1 == diff && res2 ==diff)
                        {
                            c = c+1;
                        }
                        
                    
                   
                }
            }
           
        }
        return c;
        
    }
}