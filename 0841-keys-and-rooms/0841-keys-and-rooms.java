class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean visited[] = new boolean[rooms.size()];
        dfs(rooms,0, visited);
        for(boolean room: visited)
        {
            if(!room)
            {
               return false;
            }
        }
       
        return true;
        
        
    }
    public void dfs(List<List<Integer>> graph, int node, boolean[] V)
    {
       
        V[node] = true;
        
        for(int neighbor: graph.get(node))
        {
            if(!V[neighbor])
            {
                dfs(graph, neighbor,  V);
               
            }
        }
       
    }
}