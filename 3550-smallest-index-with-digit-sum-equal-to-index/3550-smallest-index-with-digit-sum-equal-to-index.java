class Solution {
    public int smallestIndex(int[] nums) {

       
        int m = Integer.MAX_VALUE;
       
        for(int i=0; i<nums.length; i++)
        {
            int temp = nums[i];
            int s=0;
            while(temp >0)
            {
                int n = temp%10;
                s += n;
                temp = temp/10;
            }
             if(s==i)
              {
                m = Math.min(m,i);
              }

        }
        if(m == Integer.MAX_VALUE)
        {
            return -1;
        }
        return m;
    }
}