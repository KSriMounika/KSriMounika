class Solution {
    public List<String> buildArray(int[] target, int n) {

        ArrayList<String> l = new ArrayList<>();
           int x=1;
            int idx =0;
            while(idx < target.length)
            {
                if(x<=n)
                {
                    if (x == target[idx])
                    {
                    
                        l.add("Push");
                        x++;
                        idx++;
                        
                    }
                    else if( x!= target[idx])
                    {
                        l.add("Push");
                        l.add("Pop");
                        x++;
                    }
                
                }
            }
            
           
        
      
        return l;
        
    }
}