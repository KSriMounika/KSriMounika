class Solution {
    public void swapnums(int[] arr, int start, int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        
    }
    public int firstMissingPositive(int[] nums) {

        for(int i=0; i<nums.length; i++)
        {
           int curr = nums[i]-1;
           while(nums[i]>0 && nums[i] <= nums.length && nums[i] != nums[curr])
           {
                curr = nums[i]-1;
               swapnums(nums, curr, i);
           }
        }
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] != i+1)
            {
                return i+1;
            }
        }
        return nums.length+1;
        
    }
}