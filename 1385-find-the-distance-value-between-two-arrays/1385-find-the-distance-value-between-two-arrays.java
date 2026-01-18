class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        int c=0;
        for(int x =0; x<arr1.length; x++)
        {
            int flag = 1;
            
            for(int j=0; j<arr2.length; j++)
            {

                if(Math.abs(arr1[x]-arr2[j])<=d)
                {
                    flag = 0;
                    break;
                }
                
                
            }
            if(flag == 1)
            c++;
           
        }
        
       return c;
        
    }
}