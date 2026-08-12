class Solution {
    public int search(int[] nums, int target) {

        int n = nums.length;
        for(int i=0; i<nums.length; i++)
        {
            int idx = (i+ Math.abs(target))%n;
            if(nums[idx] == target)
            {
                return idx;
            }
        }
        return -1;        
    }
}