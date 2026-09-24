class Solution {
    public int maximumStrongPairXor(int[] nums) {

        int m=0;
        for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums.length; j++)
            {
                int ans = Math.abs(nums[i]-nums[j]);
                if(ans <= Math.min(nums[i], nums[j]))
                {
                  int res = nums[i]^nums[j];
                  m = Math.max(res, m);
                }
            }
        }
        return m;
        
    }
}