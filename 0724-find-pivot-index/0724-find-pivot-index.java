class Solution {
    public int pivotIndex(int[] nums) {

        int ts = 0;
        for(int x: nums)
        {
            ts += x;
        }
        int ls =0;
        for(int i=0; i<nums.length; i++)
        {
             int rs = ts-nums[i]-ls;
            
             if(ls==rs)
             { 
                return i;
             }
              ls += nums[i];
        }   

        return -1;

        
        
    }
}