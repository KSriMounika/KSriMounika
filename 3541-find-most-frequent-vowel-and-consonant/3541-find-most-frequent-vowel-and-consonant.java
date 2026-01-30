class Solution {
    public int maxFreqSum(String s) {

        int n = s.length();
        int vm = 0;
        int cm=0;

        int [] freq = new int[256];
        for(int i=0; i<n; i++)
        {
            char ch = s.charAt(i);
            freq[ch]++;
           
        }
        for(int i=0; i<256; i++)
        {
            if(freq[i]>0)
            {
                char ch = (char) i;
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                {
                vm = Math.max(freq[i],vm);
                }
                else
                {
                    cm = Math.max(freq[i],cm);

                }
            }
        }
        return vm+cm;
        
    }
}