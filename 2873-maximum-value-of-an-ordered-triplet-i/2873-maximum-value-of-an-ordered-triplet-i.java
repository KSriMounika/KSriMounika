class Solution {
    public long maximumTripletValue(int[] nums) {

        long res=0;
        long m = Long.MIN_VALUE;
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length-1; j++)
            {
                for(int k=j+1; k<nums.length; k++)
                {
                    res = 1L*(nums[i]-nums[j])*nums[k];
                      m = Math.max(m, res);
                    
                }
            }
           
            
        }
      
        if(m<0) return 0; 
        return m;       
    }
}