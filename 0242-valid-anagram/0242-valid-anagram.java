class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            h1.put(ch, h1.getOrDefault(ch,0)+1);
        }
        for(char ch1 : t.toCharArray())
        {
            h2.put(ch1, h2.getOrDefault(ch1, 0)+1);
        }
        if(h1.equals(h2))
        {
            return true;
        }
        return false;
        
    }
}