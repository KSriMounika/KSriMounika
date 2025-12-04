class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        int top=0, left=0,i;
        int right= n-1, bottom = m-1;
        ArrayList<Integer> list = new ArrayList<>();
        while(left<=right && top<=bottom)
        {
            for(i=left; i<=right; i++)
            {
                list.add(matrix[top][i]);
            }
            top++;
            for(i=top; i<=bottom; i++)
            {
                list.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom)
            {
                for(i=right; i>=left; i--)
                {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right)
            {
                for(i=bottom; i>=top; i--)
                {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}