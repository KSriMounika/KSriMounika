class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {

        int n = nums.size();
        int [] ans = new int[nums.size()];
       
        for(int i=0; i<n; i++)
        {
            
             int n1 = nums.get(i);
             if(n1 % 2 ==0)
             {
                ans[i] = -1;
                continue;
             }
             int c=0;
             int temp = n1;
             while((temp&1)==1)
             {
                c++;
                temp >>=1;
             }
            ans[i]=n1-(1 << (c-1));

             
        }
        return ans;
    }
}