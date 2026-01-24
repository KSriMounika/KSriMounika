class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int n = candies.length;
        ArrayList<Boolean> l = new ArrayList<>();
        int m = 0;
        for(int c: candies)
        {
            m = Math.max(m,c);
        }
        for(int i=0; i<n; i++)
        { 

             int sum = candies[i] + extraCandies;
             if(sum >= m)
             {
                    l.add(true);
             }
             else
             {
                 l.add(false);
             }   
        
           
            
        }
        return l;
    }
}