class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

         int[] arr = new int[temperatures.length];
        int[] st = new int[temperatures.length];
        
        int top = -1;
        
        for(int i = temperatures.length-1; i>=0; i--)
        {
             while(top != -1 && temperatures[st[top]]<= temperatures[i])
            {
                top--;
              
              
            }
           
            if(top == -1)
            {
                arr[i] = 0;
                st[++top] = i;
            }
            else 
            {
                int idx = st[top];
               arr[i] = idx-i;
               st[++top] = i;
             
             
            }
          
    
        }
       
        return arr;
        
    }
}