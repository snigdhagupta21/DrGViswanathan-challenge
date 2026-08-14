class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> result=new ArrayList<>();
        boolean visited[]=new boolean[adj.size()];
        call(adj, result, visited, 0);
        return result;
    }
    public void call(ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> result, boolean visited[], int node){
        visited[node]=true;
        result.add(node);
        for(int i: adj.get(node)){
            if(visited[i]==false){
                call(adj,result, visited,i);
            }
        }
        
    }
}
