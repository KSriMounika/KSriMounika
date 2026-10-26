class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        HashMap<Integer, Integer> m = new HashMap<>();
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        for(int i=0; i<nums1.length; i++)
        {
            m.put(nums1[i], m.getOrDefault(nums1[i], 0)+1);
            l.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++)
        {
            m.put(nums2[i], m.getOrDefault(nums2[i], 0)+1);
            l1.add(nums2[i]);
        }
        for(int i=0; i<nums3.length; i++)
        {
           m.put(nums3[i], m.getOrDefault(nums3[i], 0)+1);
           l2.add(nums3[i]);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : m.entrySet())
        {
            if(entry.getValue()>1)
            {
                int ans = entry.getKey();
                if((l.contains(ans) && l1.contains(ans))||
                  (l2.contains(ans) && l1.contains(ans))||
                  (l.contains(ans) && l2.contains(ans)))
                {
                    res.add(ans);
                }
            }
        }
        return res;

        
    }
}