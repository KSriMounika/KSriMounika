class Solution {
    public int thirdMax(int[] nums) {

       
        HashSet<Integer> s = new HashSet<>();
        for(int i=0; i<nums.length; i++)
        {
            s.add(nums[i]);
        }
        List<Integer> l = new ArrayList<>(s);
        int[] arr = new int[s.size()];
         for(int i=0; i<l.size(); i++)
        {
            arr[i] = l.get(i);
        }
        if(arr.length < 3)
        {
            int m = arr[0];
            for(int x: arr)
            {
                m = Math.max(m,x);
            }
            return m;
        }
        for(int i=0; i<s.size()-1; i++)
        {
            int max = i;
            for(int j=i; j<s.size(); j++)
            {
                if(arr[j] > arr[max])
                {
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }
        return arr[2];
        
    }
}