class Solution 
{
    public int findMiddleIndex(int[] nums)
     {

        int ts =0;
        for(int n: nums)
        {
            ts += n;
        }
       
        int ls=0;
        int right = nums.length;
       
       
        for(int i=0; i<nums.length; i++)
        {
                int rs = ts-ls-nums[i];
                if(ls == rs)
                {
                        return i;
                }
                ls = ls+nums[i];
                
        }
       
       
            
        return -1;
        
    }
}