class Solution {
    public int[] minCosts(int[] cost) {

        int[] arr = new int[cost.length];
        int m = Integer.MAX_VALUE;
        for(int i=0; i<cost.length; i++)
        {
           
                m= Math.min(cost[i], m);
                arr[i] = m;
                

            
        }
        return arr;
        
    }
}