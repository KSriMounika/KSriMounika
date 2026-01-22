class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        
        int n = arr.length;
        int count=0;
        for(int k=0; k<n; k++)
        {  
           
           for(int j=0; j<n; j++)
           {
                
                for(int i=0; i<n; i++)
                {
                    if(i<j && j<k)
                    {
                        int res = Math.abs(arr[i]-arr[j]);
                        int res1 = Math.abs(arr[j]-arr[k]);
                        int res2 =Math.abs(arr[i]-arr[k]);
                        if(res<=a && res1<=b && res2<=c)
                        {
                            count++;
                        
                        }
                         
                    }      
                   
                }
               
           }
          
          
        }
          return count;  
        
    }
}