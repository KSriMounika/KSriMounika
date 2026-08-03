class Solution {
    public boolean containsDuplicate(int[] nums) {

        // int[] freq = new int[10];
        // for(int i=0; i<nums.length; i++)
        // {
        //     freq[i]++;
        // }
       
        // int c=0;
        // for(int i=0; i<freq.length; i++)
        // {
        //     if(freq[i]>=2)
        //     {
        //         c += 1;

        //     }
        // }
        // if(c==0)
        // {
        //     return false;
        // }
        // return true;   
        HashMap<Integer, Integer> l = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            if(l.containsKey(nums[i]))
            {
                return true;
            }
            else
            {
                l.put(nums[i],i);
            }
        }     
        return false;
    }
}