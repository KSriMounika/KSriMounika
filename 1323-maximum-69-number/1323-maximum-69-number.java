class Solution {
    public int maximum69Number (int num) {

       
        String s =String.valueOf(num);
        int [] arr = new int[s.length()];
        for(int i=0; i<s.length(); i++)
        {
           
            arr[i] = s.charAt(i)-'0';
        }
        for(int i=0; i<s.length(); i++)
        {
            if(arr[i] == 6)
            {
                arr[i] = 9;
                break;
            }
        }
        int res =0;
        for(int i=0; i<arr.length; i++)
        {
            res = res*10+arr[i];
        }
        return res;
    }
}