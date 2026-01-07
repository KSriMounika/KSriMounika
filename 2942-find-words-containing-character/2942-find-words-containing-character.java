class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        ArrayList<Integer> l = new ArrayList<>();
        int n = words.length;
        for(int i=0; i<n; i++)
        {
              if(words[i].indexOf(x) != -1)
                {
                    l.add(i);
                   
                }
           
           
        }
        return l;
        
    }
}