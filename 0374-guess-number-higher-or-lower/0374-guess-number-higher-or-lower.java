/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {

        // int res = n;
        // for(int i=1; i<=n; i++)
        // {
        //     if(i > res)
        //     {
        //         res += -1;
        //     }
        //     else if(i<res)
        //     {
        //         res += 1;
        //     }
        //     else
        //     {
        //         res+=0;
        //     }
        // }
        // return res;
        int low = 1;
        int high = n;
        while(low <= high)
        {
            int mid = low+((high-low)/2);
            if(guess(mid) == 0)
            {
               return mid;
            }
            else if(guess(mid)==1)
            {
               
               low = mid+1;
            }
            else
            {
                high = mid-1;
            }
           
        }
        return -1;
        
    }
}