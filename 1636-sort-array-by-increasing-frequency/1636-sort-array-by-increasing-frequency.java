class Solution {
    public int[] frequencySort(int[] nums) {
        
        int[] freq = new int[201];
        for(int i=0; i<nums.length; i++)
        {
            freq[nums[i] + 100]++;
        }
       
        Integer[] ans = new Integer[nums.length];
        for(int i=0; i< nums.length; i++)
        {
             ans[i] = nums[i];

        }
        Arrays.sort(ans, (a,b) ->{
            if(freq[a + 100] != freq[b+100])
            {
                return freq[a + 100] - freq[b+100];
            }
            return b-a;
        });
        for(int i=0; i<nums.length; i++)
        {
            nums[i] = ans[i];
        }
        return nums;
    }
}