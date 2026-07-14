class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        

        ArrayList<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> l1 = new HashSet<>();
        HashSet<Integer> l2 = new HashSet<>();
       
        for (int x: nums1)
        {
             l1.add(x);
            
        }
        for (int y: nums2)
        {
            
                l2.add(y);
            
        }
        ArrayList<Integer> res1 = new ArrayList<>();
        ArrayList<Integer> res2 = new ArrayList<>();
       
         for (int x1: l1)
        {
            if(!l2.contains(x1))
            {
                res1.add(x1);
            }
        }
         for (int x2: l2)
        {
            if(!l1.contains(x2))
            {
                res2.add(x2);
            }
        }
        ans.add(res1);
        ans.add(res2);
        return ans;
    }
}