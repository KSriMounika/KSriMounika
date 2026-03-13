class Solution {
    public String convertDateToBinary(String date) {

        String [] d = date.split("-");
        String res = Integer.toBinaryString(Integer.parseInt(d[0]))+ "-"+ Integer.toBinaryString(Integer.parseInt(d[1]))+ "-"+ Integer.toBinaryString(Integer.parseInt(d[2]));
        return res;
        
    }
}