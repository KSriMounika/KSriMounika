class Solution {
    public int maxArea(int[] height) {

        int i=0;
        int j = height.length-1;
        int m = Integer.MIN_VALUE;
        while(i<j)
        {
            int base = j-i;
            int m1 = Math.min(height[i], height[j]);
            int res = base*m1;
            m = Math.max(res, m);
            if(m1 == height[i])
            {
                i++;
            }
            else
            {
                j--;
            }

        }
        return m;
        
    }
}