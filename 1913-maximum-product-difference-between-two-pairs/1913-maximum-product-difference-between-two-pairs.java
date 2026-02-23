class Solution {
    public int maxProductDifference(int[] nums) {

         int s =1, p=1;
         int mp = 0;
         int mp2 = Integer.MAX_VALUE;
         int res =0;
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
               
                 s =((nums[i]*nums[j]));
                 p = ((nums[i]*nums[j]));
                 mp = Math.max(mp,s);
                 mp2= Math.min(mp2,p);
                 res = Math.abs(mp-mp2);
                       
                
            }
        }
        return res;
    }
}