class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        ArrayList<List<String>> l = new ArrayList<>();
        HashMap<String, List<String>> h1 =new HashMap<>();
        for(String s: strs)
        {
            
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if(!h1.containsKey(sorted))
            {
                 ArrayList<String> n = new ArrayList<>();
                 h1.put(sorted,n);
            }
            h1.get(sorted).add(s);
        }
        for(List<String> group : h1.values())
        {
           l.add(group);
         }
        return l;
      
    }
}