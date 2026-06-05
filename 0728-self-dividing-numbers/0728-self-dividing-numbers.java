class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=left; i<=right; i++)
        {    
            int temp = i;
            boolean f = true;
            while(temp>0)
            {
               
                int res = temp % 10;
                if(res == 0)
                {
                    f = false;
                    break;
                }
                if(res !=0 )
                {
                  int q = i % res;
                    if(q == 0)
                    {
                       f = true;
                       
                    }
                    else
                    {
                        f = false;
                        break;
                    }
                }
                temp = temp/10;
               
            }
             if(f == true)
              {
                    l.add(i);
                  
            }
                
        }
        return l;
    }
}