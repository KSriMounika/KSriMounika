class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        
      ArrayList<Integer> l = new ArrayList<>();
      for(int i=0; i<nums.length; i++)
      {
        for(int j=0; j<nums.length; j++)
        {
            if(nums[j]==key)
            {
                int res = Math.abs(i-j);
                if(res<=k)
                {
                    l.add(i);
                    break;
                }
            }
        }
      
      }
        Collections.sort(l);
        return l;

    }
}