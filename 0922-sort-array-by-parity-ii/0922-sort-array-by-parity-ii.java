class Solution {
    public int[] sortArrayByParityII(int[] nums) {


        int n = nums.length;
        int[] arr = new int[nums.length];
        int ev =0, oc=1;
        for(int i=0; i<n; i++)
        {
           
                
                if( nums[i]%2==0)
                {
                    
                    arr[ev]= nums[i];
                    ev += 2;
                }
                else if(nums[i]%2!=0)
                {
                    arr[oc] = nums[i];
                    oc += 2;
                }
               
            
            
        }
        return arr;
        
    }
}