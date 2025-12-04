class Solution {
    public int[] separateDigits(int[] nums) {

        ArrayList<Integer> al = new ArrayList<>();
        for(int i : nums)
        {
            al.add(i);
               
        }
         ArrayList<Integer> result = new ArrayList<>();
        for(int num: al)
        {
               ArrayList<Integer> temp = new ArrayList<>();
               while(num>0)
               {
                  temp.add(num%10);
                  num = num/10;
               }
               for (int i = temp.size() - 1; i >= 0; i--) {
                result.add(temp.get(i));
            }
        }
      
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
       return ans;
    }  
}