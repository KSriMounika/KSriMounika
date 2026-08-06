class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        ArrayList<List<Integer>> l = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int i =0;
        while(i<n-2)
        {
           
            int j = i+1;
            int k = n-1;
            if(i>0 && nums[i]==nums[i-1])
            {
                i++;
                continue;
            }
           
            while(j<k)
            {
                int s1 = nums[i]+nums[j]+nums[k];
               
                if( s1 < 0 )
                {
                j++;
                }
                else if(s1 > 0)
                {
                    k--;
                }
                else
                {
                    ArrayList<Integer> m = new ArrayList<>();
                    m.add(nums[i]);
                    m.add(nums[j]);
                    m.add(nums[k]);
                    l.add(m);
                    j++;
                    k--;
                     while(j<k && nums[j] == nums[j-1])
                    {
                        j++;
                    }
                    while(j<k && nums[k] == nums[k+1])
                    {
                        k--;
                    }
                   
                }
               
            }
           
             i++;
            
        }
      
       
        return l;
        
    }
}