class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character, Integer> m = new HashMap<>();
        for(char c: s.toCharArray())
        {
            m.put(c, m.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character,Integer>> l = new ArrayList<>(m.entrySet());
        Collections.sort(l,(a,b) -> b.getValue()- a.getValue());
        String res = "";
        for(Map.Entry<Character,Integer> entry: l)
        {
            char c1 = entry.getKey();
            int val = entry.getValue();
            for(int i=0; i<val; i++)
            {
             res += c1;
            }

        }
        return res;
    }
}