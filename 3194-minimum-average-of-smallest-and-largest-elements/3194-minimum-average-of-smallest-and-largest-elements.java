class Solution {
    public double minimumAverage(int[] nums) {

        Arrays.sort(nums);
        
        int left = 0;
        int right = nums.length-1;
        double avg = Double.MAX_VALUE;
        while(left<right)
        {
            double Cavg = (nums[left]+nums[right])/2.0;
            avg = Math.min(avg, Cavg);
            left++;
            right--;

           
        }
        return avg;
        
    }
}