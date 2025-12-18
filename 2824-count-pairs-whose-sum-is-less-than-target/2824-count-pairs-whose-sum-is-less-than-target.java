class Solution {
    public int countPairs(List<Integer> nums, int target) {


        int c =0;
        Integer[] arr = nums.toArray(new Integer[0]);
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]+ arr[j]<target)
                {
                    c++;
                }
            }
        }
        return c;
        
    }
}