class Solution {
    public long removeZeros(long n) {

        String res = String.valueOf(n);
        String ans = res.replace("0", "");
        return Long.parseLong(ans);
        
    }
}