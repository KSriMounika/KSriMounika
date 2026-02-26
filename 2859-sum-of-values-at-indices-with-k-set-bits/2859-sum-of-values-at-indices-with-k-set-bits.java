class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {

        int s=0;
        int arr[] = new int[nums.size()];
        for(int i=0; i<nums.size(); i++)
        {
            
              arr[i] = Integer.bitCount(i);
              for(Integer x: nums)
              {  
                  
                if(arr[i] == k)
                {
                        s += nums.get(i);
                        break;

                }
              }

            
        
        }
        return s;
        
    }
}