class Solution {
    public int minimumSum(int num) {

        int temp = num;
       
        int ms = Integer.MAX_VALUE;
         int [] a = new int[4];
         int ind =0;
         int num1 =0; 
         int num2 =0;
        while(temp>0)
        {
            int d = temp%10;
            a[ind] = d;
            ind++;
            temp = temp/10;

        }
        Arrays.sort(a);
        for(int i=0; i<a.length; i++)
        {
            if(i%2==0)
            {
                num1 = num1*10+a[i];
            }
            else
            {
                num2 = num2*10+a[i];
            }
               
            
        }
       
        return num1+num2;        
    }
}