class Solution {
    public int ds(int n)
    {
        int temp = n;
        int digs = 0;
        while(temp > 0)
        {
           digs += temp % 10;
           temp = temp/10;
        }
        return digs;
    }
    public int differenceOfSum(int[] nums) {

        int res = 0;
        int s=0;
        for(int i=0; i<nums.length; i++)
        {
            s += nums[i];
            res += ds(nums[i]);
        }
        return Math.abs(res-s);
        
    }
}