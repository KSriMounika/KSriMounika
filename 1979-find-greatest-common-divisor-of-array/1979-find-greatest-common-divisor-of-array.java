class Solution {
    public int findGCD(int[] nums) {
        
        int m = nums[0], l = nums[0];
         for(int i=0; i<nums.length; i++)
         {
             if(nums[i]<m)
             {
                m = nums[i];
             }
             if(nums[i]>l)
             {
                l = nums[i];
             }
           
         }
         while(l!=0)
        {
                  int temp = l;
                  l = m%l;
                  m = temp;
         }
            
         return m;

    }
}