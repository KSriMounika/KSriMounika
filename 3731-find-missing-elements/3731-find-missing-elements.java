class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        ArrayList<Integer> l = new ArrayList<>();
        Arrays.sort(nums);
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
           m.put(nums[i], 0);
        }
        for(int i=nums[0]; i<=nums[nums.length-1]; i++)
        {
            if(!m.containsKey(i))
            {
                l.add(i);
            }
        }
        return l;
        
    }
}