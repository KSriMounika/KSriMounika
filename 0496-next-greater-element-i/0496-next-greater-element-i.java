class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] arr = new int[nums1.length];
        int[] st = new int[nums2.length];
        HashMap<Integer, Integer> h = new HashMap<>();
        int top = -1;
        for(int i = nums2.length-1; i>=0; i--)
        {
             while(top != -1 && st[top]<= nums2[i])
            {
                top--;
            }
            if(top == -1)
            {
                h.put(nums2[i], -1);
                st[++top] = nums2[i];
            }
            else 
            {
               h.put(nums2[i], st[top]);
               st[++top] = nums2[i];
            }
           
        }
        for(int i=0; i<nums1.length; i++)
        {
            arr[i]= h.get(nums1[i]);
        }
        return arr;
         


    }
}