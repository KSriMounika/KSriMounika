class Solution {
    public int minOperations(int[] nums) {
        if(nums.length == 1)
        {
            return 0;
        }
        int c=0;
        for(int i=1; i<nums.length; i++)
        {
             if(nums[i] <= nums[i-1])
             {
               int prev = nums[i-1]+1;
               c += prev-nums[i];
               nums[i]=prev;
             }
             
        }
        return c;


        
    }
}