class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        HashMap<Integer, Integer> m = new HashMap<>();
        int[] arr = new int[2];
        int idx =0;
        for(int x: nums)
        {
            int diff = target -x;
            if(m.containsKey(diff))
            {
                arr[0] = m.get(diff);
                arr[1] = idx;

            }
            else
            {
                m.put(x, idx);
            }
            idx++;
        }
        return arr;
    }
}