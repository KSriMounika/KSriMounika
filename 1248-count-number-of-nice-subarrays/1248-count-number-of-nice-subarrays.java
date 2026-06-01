class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        int r=0, l=0,c=0, s=0;
        while(r<nums.length)
        {
            s = s+(nums[r]%2);
            while(s>k)
            {
                 s= s-(nums[l]%2);
                 l++;
            }
            c = c+(r-l+1);
            r++;
        }
        int r1=0, l1=0,c1=0, s1=0;
        if(k-1<0)
        {
            c1=0;
        }
        else
        {
            while(r1<nums.length)
            {
                s1 = s1+(nums[r1]%2);
                while(s1>k-1)
                {
                    s1= s1-(nums[l1]%2);
                    l1++;
                }
                c1 = c1+(r1-l1+1);
                r1++;
            }
        }
        return c-c1;
        
    }
}