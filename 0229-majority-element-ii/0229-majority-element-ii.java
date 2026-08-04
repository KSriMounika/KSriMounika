class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int res = nums.length/3;
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int num: nums)
        {
            m.put(num, m.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> l =new ArrayList<>();
        for(int val: m.keySet())
        {
            if(m.get(val) > res)
            {
                l.add(val);
            }
        }
        return l;
        
    }
}