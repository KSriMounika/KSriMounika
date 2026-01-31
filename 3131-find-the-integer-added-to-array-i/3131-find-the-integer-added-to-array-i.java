class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        

        int m1 =0;
        for(int x: nums1)
        {
            m1 = Math.max(x, m1);
        }
        int m2 =0;
        for(int y: nums2)
        {
            m2 = Math.max(y,m2);
        }
        return m2-m1;
    }
}