// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {


//         int m = matrix.length;
//         int n = matrix[0].length;
//         for(int i=0; i<m; i++)
//         {
//             for(int j=0; j<n; j++)
//             {
//                 if(matrix[i][j]== target)
//                 {
//                     return true;
//                 }
//             }
//         }

//         return false;

        


//     }
// }
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {


        int m = matrix.length;
        int n = matrix[0].length;
        int i=0;
        int j =n-1;
        while(i<m && j>=0)
        {
            
            if(matrix[i][j]> target)
            {
                   j--;
            }
            else if(matrix[i][j]==target)
            {

             return true;
            }
            else
            {
                    i++;
            }

            
        }
       
        return false;

        


    }
}