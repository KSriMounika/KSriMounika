class Solution {
    public int[] decompressRLElist(int[] nums) {

        ArrayList<Integer>l = new ArrayList<>();
        for(int i=0; i<nums.length; i+=2)
        {
           int freq = nums[i];
           int value = nums[i+1];
           for(int j=0; j<freq; j++)
           {
               l.add(value);
           }
           
            
        }
        return l.stream().mapToInt(i -> i).toArray();        
    }
}