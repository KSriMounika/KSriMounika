class Solution {
    public int elevatorRequests(int n, int[] requests) {

        int res = requests[0];
      
            for(int i=0; i<requests.length-1; i++)
            {
                res += Math.abs(requests[i+1]-requests[i]);
            }
        
        return res;
        
    }
}