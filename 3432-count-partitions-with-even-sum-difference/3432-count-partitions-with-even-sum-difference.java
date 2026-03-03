class Solution {
    public int countPartitions(int[] nums) {
        
        int c=0;
        for(int i=0; i<nums.length-1; i++)
        {
            int ls=0, rs=0;
            for(int j =0; j<=i; j++)
            {
                ls += nums[j];
               
            }
            for(int k=i+1; k<=nums.length-1; k++)
            {
                rs += nums[k];
               
            }
            int res = Math.abs(ls-rs);
            if(res%2==0)
            {
                c++;
             }
            
        }
        return c;
        

    }
}