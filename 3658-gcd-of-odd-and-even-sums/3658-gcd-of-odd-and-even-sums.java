class Solution {
    public int gcdOfOddEvenSums(int n) {
        int os = n*n;
        int es = n*(n+1);
        while(es!=0)
        {
            int temp = es;
            es = os%es;
            os = temp;
        }
        return os;
        
    }
}