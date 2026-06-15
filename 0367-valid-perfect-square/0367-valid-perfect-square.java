class Solution {
    public boolean isPerfectSquare(int num) {

      
        int low = 1;
        int high = num;
        boolean res = false;
        while(low <= high)
        {
            long mid = low+((high-low)/2);
            long ans = mid*mid;
            if( ans == num)
            {
                res = true;
                break;
               
            }
            else if(ans < num)
            {
                low = (int)mid+1;
            }
            else
            {
                 high =(int) mid-1;
            }
           
        }
        return res;
        
    }
}