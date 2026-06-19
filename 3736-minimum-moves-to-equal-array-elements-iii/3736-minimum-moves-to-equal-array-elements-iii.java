class Solution {
    public int minMoves(int[] nums) {
        
        int c=0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length ; i++)
        {
            if(nums[i] < nums[nums.length-1])
            {
                int res = nums[nums.length-1]-nums[i];
                c += res;
            }
        }
        return c;
    }
}