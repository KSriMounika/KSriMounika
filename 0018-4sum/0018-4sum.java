class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {


        HashSet<List<Integer>> l1 = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n-1; j++)
            {
            
                int k = j+1;
                int l = n-1;
                while(k<l)
                {
                    long s = (long) nums[i]+nums[j]+nums[k]+nums[l];
                    if(s < target)
                    {
                        k++;
                    }
                    else if( s > target)
                    {
                        l--;
                    }
                    else 
                    {
                        ArrayList<Integer> m = new ArrayList<>();
                        m.add(nums[i]);
                        m.add(nums[j]);
                        m.add(nums[k]);
                        m.add(nums[l]);
                        l1.add(m);
                        k++;
                        l--;
                       
                    }
                }
            }
           
        }
        return new ArrayList(l1);
    }
}