class Solution {
    public int majorityElement(int[] nums) {
        

        int res = nums.length /2;
        HashMap<Integer, Integer> l = new HashMap<>();
        int c=1;
        for(int num: nums)
        {
            l.put(num, l.getOrDefault(num, 0)+1);
        }
        for(int key : l.keySet())
        {
            if(l.get(key) > res)
            {
                return key;
            }
        }
        return 0;
    }
}