class Solution {
    public String reverseByType(String s) {

        int l =0;
        ArrayList<Character> list = new ArrayList<>();
         ArrayList<Character> list1 = new ArrayList<>();
        while(l<s.length())
        {
            char ch = s.charAt(l);
            if(Character.isLetter(ch))
            {
                list.add(ch);
            }
            else
            {
                list1.add(ch);
            }
            l++;
        }
        StringBuilder sb = new StringBuilder(s);
        int l1=0;
        int r = list.size()-1;
        int r1 = list1.size()-1;
        while(l1<s.length())
        {
            char ch1 = s.charAt(l1);
            if(Character.isLetter(ch1))
            {
               sb.setCharAt(l1, list.get(r));
               r--;
            }
            else
            {
                 sb.setCharAt(l1,list1.get(r1));
                 r1--;
            }
            l1++;
            
        }
        return sb.toString();

        
    }
}