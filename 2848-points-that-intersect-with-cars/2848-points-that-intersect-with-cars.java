class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {

        int c=0;
        boolean[] v = new boolean[101];
        for(int i=0; i<nums.size(); i++)
        {   
            int start =nums.get(i).get(0);
            int end = nums.get(i).get(1);
            for(int j=start; j<=end; j++)
            {
                if(v[j]==false)
                {
                    c++;
                    v[j] = true;
                }
            }
                
                    
          
        }
        return c;

        
        
    }
}