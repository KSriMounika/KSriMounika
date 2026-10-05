class Solution {
    public int totalMoney(int n) {

        int weeks = n / 7;
        int remaining = n % 7;
        int total = 0;
        for(int i=1; i<=weeks; i++)
        {
            total += 7*i + 21;
        }
        int start = weeks + 1;
        for(int j=0; j< remaining; j++)
        {
            total += start+ j;
        }
        return total;
        
    }
}