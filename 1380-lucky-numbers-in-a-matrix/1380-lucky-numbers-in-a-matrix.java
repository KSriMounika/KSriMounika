class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0; i<m; i++)
        {
            int mi = Integer.MAX_VALUE;
            for(int j=0; j<n; j++)
            {
               mi = Math.min(mi, matrix[i][j]);
            }
            l.add(mi);
        }
        ArrayList<Integer> l1 = new ArrayList<>();
        for(int j=0; j<n; j++)
        {
            int maxi = Integer.MIN_VALUE;
            for(int i=0; i<m; i++)
            {
               maxi = Math.max(maxi, matrix[i][j]);
            }
            l1.add(maxi);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<l.size(); i++)
        {
            if(l1.contains(l.get(i)))
            {
                res.add(l.get(i));
            }
        }
        return res;
        
    }
}