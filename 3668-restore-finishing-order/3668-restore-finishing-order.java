class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {

        HashSet<Integer> s = new HashSet<>();
        for(int x: friends)
        {
            s.add(x);
        }
        ArrayList<Integer> l = new ArrayList<>();
        for(int y : order)
        {
            if(s.contains(y))
            {
                l.add(y);
            }
        }
        int [] arr = new int[l.size()];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = l.get(i);
        }
        
        return arr;
        
    }
}