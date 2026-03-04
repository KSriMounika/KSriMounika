class Solution 
{
    public int addDigits(int num) 
    {
        if(num < 10)
        {
            return num;
        }
         int sum = 0;
        while(num>0)
        {
            int n = num%10;
            sum = sum+n;
            num = num/10;
        }
       return addDigits(sum);
     }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Solution obj = new Solution();
        int res= obj.addDigits(a);
        System.out.println(res);

    }
}