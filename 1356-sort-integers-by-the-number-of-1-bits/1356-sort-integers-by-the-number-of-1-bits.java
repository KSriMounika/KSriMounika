class Solution {
    public int[] sortByBits(int[] arr) {

      
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=0; j<arr.length-i-1; j++)
            {
                int bitA = Integer.bitCount(arr[j]);
                int bitB = Integer.bitCount(arr[j+1]);
                if(bitA>bitB || (bitA == bitB && arr[j]>arr[j+1]) )
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            
        }
      
        return arr;
        
    }
}