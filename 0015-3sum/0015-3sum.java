class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        HashSet<List<Integer>> l = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        int i =0;
        // HashSet<Integer> m = new HashSet<>();
        while(i<n-2)
        {
           
            int j = i+1;
            int k = n-1;
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
                    
                   
                }
               
            }
           
             i++;
            
        }
      
        
        return new ArrayList<>(l);
        
    }
}