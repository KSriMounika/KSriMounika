class Solution {
    public int largestAltitude(int[] gain) {

        int m = 0;
        int a=0;
        for(int i=0; i<gain.length; i++)
        {
                
                m += gain[i];
                a = Math.max(a,m);

            
        }
        return a;
        
    }
}