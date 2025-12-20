class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        
        String[] a = s1.split(" ");
        HashMap<String, Integer> s = new HashMap<>();
        for(String word : a)
        {
            s.put(word, s.getOrDefault(word, 0)+1);
        }
        String[] b = s2.split(" ");
        for(String word: b )
        {
            s.put(word, s.getOrDefault(word, 0)+1);
        }

        ArrayList <String> l = new ArrayList<>();

        for(String key: s.keySet())
        {
            if(s.get(key) == 1)
            {
                l.add(key);
            }
        }
        return l.toArray(new String[0]);
    }
}