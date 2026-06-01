class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        int l=0, r=0, s=0, c=0;
        while(r<nums.length)
        {
           
            s = s+nums[r];
            while(s>goal)
            {
                 s = s-nums[l];
                 l++;
              
            }
            c = c+(r-l+1);
                r++;
            
        }
        int l1=0, r1=0, s1=0, c1=0;
      
         if (goal-1<0) 
        {
                c1=0;
        }
        else
        {
            while(r1<nums.length)
            {
                
                s1 = s1+nums[r1];
                while(s1>goal-1)
                {
                    
                    s1 = s1-nums[l1];
                    l1++;
                
                }
                c1 = c1+(r1-l1+1);
                    r1++;
                
            }
        }
      
        return c-c1;
        
    }
}