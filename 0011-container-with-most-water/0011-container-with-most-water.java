class Solution {
    public int maxArea(int[] height) {

        int l=0;
        int r = height.length-1;
        int Maxarea = 0;
        while(l<r)
        {
                int h1 = height[l];
                int h2 = height[r];
                int res = Math.min(h1, h2);
                int area = res * Math.abs(r-l);
                if(height[l]<height[r])
                {
                    l++;
                }
                else
                {
                    r--;
                }
                Maxarea = Math.max(area, Maxarea);
             
        }
      
        return Maxarea;

        
    }
}