class Solution {
    public List<Integer> findMissingElements(int[] nums) {


        ArrayList<Integer> l = new ArrayList<>();
        int low = nums[0];
        int m = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]<low)
            {
              low= nums[i];
            }
            if(nums[i]>m)
            {
              m = nums[i];
            }
        }
        for(int j=low; j<=m; j++)
        {
            boolean found = false;
            for(int i=0; i<nums.length; i++ )
            {
               
                if(nums[i]==j)
                {
                    found = true;
                    break;
                }
                
                
             }
              if(found== false)
                {
                   l.add(j);
                }
            
        }
        return l;
        
    }
}