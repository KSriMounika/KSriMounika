class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] arr = new int[nums.length];
        int[] st = new int[nums.length];
        int top = -1;
        
        for(int i=2*nums.length-1; i>=0; i--)
        {
        
          
            while(top != -1 && st[top] <= nums[i%n])
            {
                top--;
            }
            if(top == -1)
            {
                    arr[i%n] = -1; 
                     st[++top] = nums[i%n];                  
            }
            else
            {
                    arr[i%n] = st[top];
                     st[++top] = nums[i%n];
                   
            }
           

            
        }
        return arr;
        
    }
}