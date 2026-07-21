class Solution {
    public int[] countBits(int n) {

        int[] arr = new int[n+1];
     
        for(int i=0; i<arr.length; i++)
        {
            String b = Integer.toBinaryString(i);
            int c=0;
            for(int j=0; j<b.length(); j++)
            {
                if(b.charAt(j) == '1')
                {
                    c++;
                }
               
            }
            arr[i] = c;
        }
        return arr;
        
    }
}