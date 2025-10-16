class Solution {
    public int maxSubArray(int[] nums) {
        
        int counter =0;
        int Max = nums[0];
        for(int i=0; i< nums.length; i++)
        {
            counter = Math.max(nums[i], nums[i]+counter);
            Max = Math.max(counter, Max);

        
       
        if(counter <= 0)
        {
            counter =0;
        }
        }
        return Max;
    }
}