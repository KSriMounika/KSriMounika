class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> h = new HashMap<>();
        boolean f = false;
        for(int x: nums)
        {
            h.put(x, h.getOrDefault(x,0)+1);
        }
        for(int value: h.values())
        {
            if(value>=2)
            {
                f = true;
                break;
               
            }
           
        }
        return f;

        
    }
}