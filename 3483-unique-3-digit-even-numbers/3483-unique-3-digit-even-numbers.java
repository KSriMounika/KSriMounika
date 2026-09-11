class Solution {
    public int totalNumbers(int[] digits) {

        
        int c=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<digits.length; i++)
        {
            for(int j=0; j<digits.length; j++)
            {
                for(int k=0; k<digits.length; k++)
                {
                    if(i != j && j!=k && k!=i)
                    {
                       if(digits[i] != 0 && digits[k] % 2 == 0)
                       {
                         String s = ""+digits[i]+digits[j]+ digits[k];
                         int res = Integer.parseInt(s);
                         set.add(res);
                            
                       }
                    }

                       
                    
                }
            }
            
            
        }
        return set.size();
        
    }
}