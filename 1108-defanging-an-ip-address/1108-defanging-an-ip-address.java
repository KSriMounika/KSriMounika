class Solution {
    public String defangIPaddr(String address) {
        
        int n = address.length();
        String  res = address.replaceAll("\\.", "[.]");
        return res;
       
       
    }
}