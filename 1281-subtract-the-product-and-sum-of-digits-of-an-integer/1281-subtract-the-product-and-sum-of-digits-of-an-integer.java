class Solution {
    
    public int subtractProductAndSum(int n) {
        int temp = n;
        int p = 1;
        int s =0;
        while(temp>0)
        {
            p *= temp%10;
            s += temp%10;
            temp = temp/10;
        }
        return p-s;
        
    }
}