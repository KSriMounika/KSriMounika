class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        int[] freq = new int[2001];
        for(int i=0; i<arr.length; i++)
        {
            freq[arr[i]+1000]++;
        }
        boolean found = true;
        for(int i=0; i<freq.length; i++)
        {
            for(int j=i+1; j<freq.length; j++)
            {
                if(freq[i] >0 && freq[j] > 0)
                {
                
                
                    if(freq[i] == freq[j]  )
                    {
                        found = false;
                    }
                }
               
            }
        }
        if(found == true) return true;
        return found;
        
    }
}