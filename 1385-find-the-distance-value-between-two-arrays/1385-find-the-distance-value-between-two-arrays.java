class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        int c=0;
        for(int i=0; i<arr1.length; i++)
        {
            boolean found = false;
            for(int j=0; j<arr2.length; j++)
            {
                int res = Math.abs(arr1[i]-arr2[j]);
                if(res <= d)
                {
                    found = true;
                    break;
                }
                
            }
            if(found == false)
            {
               c++;
            }

        }
        return c;
        
    }
}