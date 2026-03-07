class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int n = image.length;
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {

                  arr[i][n-1-j]= image[i][j];
                 if(image[i][j]==0)
                 {
                    arr[i][n-1-j]=1;
                 }
                 else if(image[i][j]==1)
                 {
                    arr[i][n-1-j]=0;
                 }
                
            }
        }
      
        return arr;
    }
}