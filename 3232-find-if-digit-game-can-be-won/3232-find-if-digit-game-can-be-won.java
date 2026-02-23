class Solution {
    public boolean canAliceWin(int[] nums) {
        
        int ss=0, ds=0;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]<10)
            {
                ss += nums[i];
            }
            else
            {
                ds += nums[i];
            }
        }
        if((ss>ds)||(ds>ss)) return true;
        return false;
    }
}