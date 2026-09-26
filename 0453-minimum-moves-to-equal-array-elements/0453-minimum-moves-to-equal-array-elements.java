class Solution {
    public int minMoves(int[] nums) {

        int m = nums[0];
        int n =nums.length;
        int sum =0;
        for(int i=0; i<nums.length; i++)
        {
           
              sum += nums[i];
              m = Math.min(m, nums[i]);
            
        }
        int res = sum - (n*m);
        return res;
        
    }
}