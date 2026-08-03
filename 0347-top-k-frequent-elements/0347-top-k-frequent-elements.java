class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> m = new HashMap<>();
        for(int x: nums)
        {
            m.put(x, m.getOrDefault(x,0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(

           (a,b) -> b[1] -a[1]
        );

        for(int key: m.keySet())
        {
            pq.offer(new int[]{key, m.get(key)});
        }
        int[] ans = new int[k];
        for(int i=0; i<k; i++)
        {
            ans[i] = pq.poll()[0];
        }
        return ans;


        
    }
}