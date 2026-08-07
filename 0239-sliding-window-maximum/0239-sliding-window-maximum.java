class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int[] pre = new int[n];
        int[] suf = new int[n];
        pre[0] = nums[0];
        for(int i=1; i<n; i++)
        {
            if(i%k==0)
            {
                pre[i] = nums[i];
            }
            else
            {
                pre[i] = Math.max(pre[i-1], nums[i]);
            }
        }
        suf[n-1] = nums[n-1];
        for(int i= n-2; i>=0; i--)
        {
            if((i+1)%k == 0)
            {
                suf[i] = nums[i];

            }
            else
            {
                suf[i] = Math.max(suf[i+1], nums[i]);
            }
        }
        int[] ans = new int[n-k+1];
        for(int i=0; i<=n-k; i++)
        {
            ans[i] = Math.max(pre[i+k-1], suf[i]);
        }

        return ans;
    }
}