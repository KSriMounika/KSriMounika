class Solution {
    public int[] leftRightDifference(int[] nums) {

          
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        
        for(int i=1; i<nums.length; i++)
        {
         
           arr1[i] += nums[i-1]+arr1[i-1];
          
           
        }
        for(int j= nums.length-2; j>=0; j--)
        {
           
           arr2[j] += nums[j+1]+arr2[j+1];
        
           
        }
        int [] res = new int[nums.length];
        
        for(int k =0; k<nums.length; k++)
        {
                res[k] = Math.abs(arr2[k]-arr1[k]);
              
        }
        
     
        return res;
    }
}