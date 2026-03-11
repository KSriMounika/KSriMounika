class Solution {
    public int[] applyOperations(int[] nums) {
        
       
        for(int i=0; i<nums.length-1; i++)
        {  
                if(nums[i]==nums[i+1])
                {
                    nums[i] = nums[i]*2;
                    nums[i+1]=0;
                   

                }
                else
                {
                    nums[i] = nums[i];
                }
            
        }
        int [] arr = new int[nums.length];
        int j=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]!=0)
            {
                arr[j] = nums[i];
                j++;
            }
        }
        for(int i=j; i<nums.length; i++) 
        {
            arr[i] = 0;

        }
        return arr;
    }
}