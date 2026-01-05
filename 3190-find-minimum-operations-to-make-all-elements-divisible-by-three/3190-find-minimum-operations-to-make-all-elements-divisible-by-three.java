class Solution {
    public int minimumOperations(int[] nums) {

        
        int mc =0;
        for(int x: nums)
        {
            if(x%3 != 0)
            {
                mc++;
            }
           
        }
        return mc;
    }
}