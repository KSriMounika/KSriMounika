class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        int[] arr = new int[nums.length];
        int l =0;
        ArrayList<Integer>l1 = new ArrayList<>();
        ArrayList<Integer>l2 = new ArrayList<>();
        ArrayList<Integer>l3 = new ArrayList<>();
        while(l<nums.length)
        {
           if(nums[l]<pivot)
           {
             l1.add(nums[l]);
             l++;
           }
           else if(nums[l]==pivot)
           {
             l3.add(nums[l]);
             l++;
           }
           else 
           {
             l2.add(nums[l]);
             l++;
           }
        }
        int r=0, r1=0, r2=0;
        while(r<l1.size())
        {
            arr[r] = l1.get(r);
            r++;
        }
        while(r2<l3.size())
        {
            arr[r] = l3.get(r2);
            r2++;
            r++;
        }
        while(r1<l2.size())
        {
            arr[r] = l2.get(r1);
            r1++;
            r++;
        }
        return arr;

        
    }
}