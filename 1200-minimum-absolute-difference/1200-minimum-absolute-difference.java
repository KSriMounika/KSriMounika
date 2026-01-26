class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);
        int n = arr.length;
        ArrayList<List<Integer> >res = new ArrayList<>();
        int md = Integer.MAX_VALUE;
        for(int i=1; i<n; i++)
        {
            int d = arr[i]-arr[i-1];
             md = Math.min(d,md);
        }
        for(int i=1; i<n; i++)
        {
            int d = arr[i]-arr[i-1];
            if(d==md)
            {
                ArrayList<Integer>p = new ArrayList<>();
                p.add(arr[i-1]);
                p.add(arr[i]);
                res.add(p);
            }
        }
        return res;
           

        
    }
}