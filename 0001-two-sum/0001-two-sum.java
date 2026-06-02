class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> s = new HashMap<>();
        int[] arr = new int[2];
        int idx =0;
        for(int x: nums)
        {
           int res = target-x;
           if(s.containsKey(res))
           {
              
                arr[0] = s.get(res);
                arr[1] = idx;
              
           }
           else
           {
             s.put(x,idx);
           }
           idx++;
        }
       
        return arr;

        
    }
}