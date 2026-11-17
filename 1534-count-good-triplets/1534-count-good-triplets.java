class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {

        int c1=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                for(int k=0; k<arr.length; k++)
                {
                    if(i<j && j<k)
                    {
                        int res = Math.abs(arr[i]-arr[j]);
                        int res1 = Math.abs(arr[j]-arr[k]);
                        int res2 = Math.abs(arr[i]-arr[k]);
                        if(res <= a && res1 <= b && res2 <= c)
                        {
                            c1++;
                        }
                    }
                }
            }
        }
        return c1;
        
    }
}