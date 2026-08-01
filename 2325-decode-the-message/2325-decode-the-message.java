class Solution {
    public String decodeMessage(String key, String message) {

        HashMap<Character, Character> l = new HashMap<>();
        char next = 'a';
        for(char c: key.toCharArray())
        {
            if( c == ' ')
            {
                continue;
            }
            if(!l.containsKey(c))
            {
                l.put(c, next);
                next++;
            }
        }
        StringBuilder s = new StringBuilder();
        for(char c1: message.toCharArray())
        {
            if(c1 == ' ')
            {
                s.append(' ');
            }
            else
            {

                s.append(l.get(c1));
            }
        }
        return s.toString();
        
    }
}