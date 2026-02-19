class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {


        int n = nums1.length;
        int m = nums2.length;
        int [] arr = new int[2];
        int c=0;
        int c1=0;
        for(int i=0; i<n; i++)
        {
           
            for(int j=0; j<m; j++)
            {
               
                if(nums1[i]==nums2[j])
                {
                     c++;
                     break;
                } 

            }
        } 
        for(int j=0; j<m; j++)
        {
           
            for(int i=0; i<n; i++)
            {
               
                if(nums2[j]==nums1[i])
                {
                     c1++;
                     break;
                } 

            }
        } 
    
        arr[0] = c;
        arr[1] = c1;
        return arr;

        
    }
}