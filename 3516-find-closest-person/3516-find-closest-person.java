class Solution {
    public int findClosest(int x, int y, int z) {

        int res = Math.abs(z-x);
        int res1 = Math.abs(z-y);
        if(res < res1)
        {
            return 1;
        }
        else if(res1 < res)
        {
            return 2;
        }
        else
        {
            return 0;
        }
        
    }
}