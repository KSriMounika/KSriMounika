class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {

        int [] ans = new int[nums.size()];
       
             for(int i=0; i<nums.size(); i++)
             {
                 int n = nums.get(i);
                 ans[i] = -1;
                 for(int x=0; x<n; x++)
                 {
                    if( (x | (x+1))==n)
                    {
                        ans[i]= x;
                        break;
                    }
                 }
                 

             }

        
        return ans;
       
      
        
    }
}