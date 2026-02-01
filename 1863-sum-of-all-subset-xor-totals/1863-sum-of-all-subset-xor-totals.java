class Solution {
    public int subsetXORSum(int[] nums) {

        
       
        int ts =0;
        for(int i=0; i<(1<<nums.length); i++)
        {
            int s =0;
             for(int j=0; j<nums.length; j++)
             {
                if((i & (1<<j))!=0)
                {
                  s ^= nums[j];
                }
             }
             ts += s;
        }
        return ts;
        
    }
}