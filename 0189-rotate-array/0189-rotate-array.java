class Solution {
    public void rotate(int[] nums, int k) {


        int[] ans = new int[nums.length];
        int n = nums.length;
        for(int i=0; i<nums.length; i++)
        {
            int idx = (i + k)%n;
            ans[idx] = nums[i];
        }
        for(int i=0; i<nums.length; i++)
        {
            nums[i] = ans[i];
        }
       
        
    }
}