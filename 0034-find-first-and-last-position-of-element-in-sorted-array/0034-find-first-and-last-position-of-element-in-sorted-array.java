class Solution {
    public int[] searchRange(int[] nums, int target) {

        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        int[] arr = new int[2];
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(nums[mid]==target)
            {
                ans = mid;
                high = mid-1;
            }
            else if(nums[mid] < target)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
         
        }
        int low1 = 0;
        int high1 = nums.length-1;
        int ans1 = -1;
        while(low1<=high1)
        {
            int mid1 = (low1+high1)/2;
            if(nums[mid1]==target)
            {
                ans1 = mid1;
                low1 = mid1+1;
            }
            else if(nums[mid1] < target)
            {
                low1 = mid1+1;
            }
            else
            {
                high1 = mid1-1;
              
            }
           
        }
        if(ans == -1)
        {
            arr[0] = -1;
            arr[1] = -1;
        }
        arr[0] = ans;
        arr[1] = ans1;
        return arr;
        
    }
}