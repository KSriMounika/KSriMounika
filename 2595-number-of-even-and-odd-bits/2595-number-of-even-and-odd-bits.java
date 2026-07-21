class Solution {
    public int[] evenOddBit(int n) {

        int[] arr = new int[2];
        String b = Integer.toBinaryString(n);
        String reverse = new StringBuilder(b).reverse().toString();
        int c1=0, c2=0;
        for(int i=0; i<reverse.length(); i++)
        {
            if( i%2 == 0 && reverse.charAt(i) == '1')
            {
                c1++;
            }
            else if(i%2 != 0 && reverse.charAt(i) == '1')
            {
                c2++;
            }
        }
        arr[0] = c1;
        arr[1] = c2;
        return arr;
        
    }
}