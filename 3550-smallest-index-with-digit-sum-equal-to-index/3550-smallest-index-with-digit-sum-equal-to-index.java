class Solution {
    public int sumDigits(int n)
    {
        int temp = n;
        int ds = 0;
        while(temp >0)
        {
            ds += temp%10;
            temp = temp/10;
        }
        return ds;
    }
    public int smallestIndex(int[] nums) {
        
        for(int i=0; i<nums.length; i++)
        {
            int res = sumDigits(nums[i]);
            if(res == i)
            {
                return i;
            }
        }
        return -1;
    }
}