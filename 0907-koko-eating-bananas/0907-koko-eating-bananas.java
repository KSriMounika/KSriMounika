class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = getmax(piles);
        int res = high;
        while(low<=high)
        {
            int mid = low + (high-low)/2;

            long h1 = hours(piles, mid);

            if(h1 <= h)
            {
                res = mid;
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }

        }
            return res;

        }
        private int getmax(int[] piles)
        {
            int val = 0;
            for(int num: piles)
            {
                val = Math.max(val, num);
            }
            return val;
        }
        private long hours(int[] piles, int mid)
        {
            long hr = 0;
            for(int num : piles)
            {
                hr += (long) Math.ceil((double)num/mid);
            }
            return hr;
        }
       
    
}