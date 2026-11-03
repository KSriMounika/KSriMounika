class Solution {
    public int minMoves(int[] nums) {

        Arrays.sort(nums);
        int c=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]<nums[nums.length-1])
            {
                c += Math.abs(nums[i]-nums[nums.length-1]);
            }
        }
        return c;
    }
}