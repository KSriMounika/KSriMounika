class Solution {
    public String reverseWords(String s) {

        String [] words =s.split(" ");
        StringBuilder res = new StringBuilder();
        for(String word: words)
        {
            StringBuilder s1 = new StringBuilder(word);
            res.append(s1.reverse()).append(" ");
        }
        return res.toString().trim();

        
    }
}