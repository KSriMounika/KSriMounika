class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int c=0;
        int s = 0;
        HashMap<Integer, Integer> m = new HashMap<>();
        m.put(0, 1);
        for(int val: nums)
        {
            s += val;
            int res = s-k;
            if(m.containsKey(res))
            {
                 c += m.get(res);
            }
            m.put(s, m.getOrDefault(s, 0)+1);
        }
        return c;
        
    }
}