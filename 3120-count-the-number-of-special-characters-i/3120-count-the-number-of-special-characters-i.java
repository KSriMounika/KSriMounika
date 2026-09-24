class Solution {
    public int numberOfSpecialChars(String word) {

        
        HashSet<Character> s = new HashSet<>();
        for(int i=0; i<word.length(); i++)
        {
            char c = Character.toLowerCase(word.charAt(i));
            char c1 = Character.toUpperCase(word.charAt(i));
            if(word.contains(String.valueOf(c)) && word.contains(String.valueOf(c1)))
            {
           
                   s.add(c);
                   
            } 
        }
        return s.size();
        
    }
}