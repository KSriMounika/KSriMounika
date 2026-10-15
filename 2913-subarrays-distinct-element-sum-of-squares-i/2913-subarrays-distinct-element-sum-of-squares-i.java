class Solution {
    public int sumCounts(List<Integer> nums) {

        int s=0;
        for(int i=0; i<nums.size(); i++)
        {
            HashSet<Integer> h = new HashSet<>();
            for(int j=i; j<nums.size(); j++)
            {
                h.add(nums.get(j));
                s += h.size()*h.size();
            }
        } 
        return s;
        
    }
}