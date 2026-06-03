class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> h = new HashMap<>();
        int[] arr = new int[k];
        for(int x: nums)
        {
            h.put(x, h.getOrDefault(x,0)+1);
        }
       
        ArrayList<Map.Entry<Integer, Integer>> l = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : h.entrySet())
        {
           
            l.add(entry);
        }
        Collections.sort(l, (a,b)->b.getValue()-a.getValue());
        for(int i=0; i<k; i++)
        {
            arr[i] = l.get(i).getKey();
        }  
        return arr;
        
    }
}