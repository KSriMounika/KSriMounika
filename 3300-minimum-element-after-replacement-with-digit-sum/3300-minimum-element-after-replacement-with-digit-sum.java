class Solution {
    public int minElement(int[] nums) {

       
        int [] arr = new int[nums.length];
        int m = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++)
        {
            int temp = nums[i];
            int s =0;
            while(temp>0)
            {
               s += temp%10;
             temp = temp/10;
            }
            arr[i] = s;
           

        }
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<m)
            {
                m = arr[i];
            }
        }
        return  m;
        
    }
}