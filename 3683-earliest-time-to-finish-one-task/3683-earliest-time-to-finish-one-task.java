class Solution {
    public int earliestTime(int[][] tasks) {

        int n = tasks.length;
        int n1 = tasks[0].length;
        int m = Integer.MAX_VALUE;
        
        for(int i=0; i<n; i++)
        {
            int sum=0;
            for(int j=0; j<n1; j++)
            {
                sum += tasks[i][j];
              
            }
              m = Math.min(m, sum);
        }
        return m;
        
    }
}