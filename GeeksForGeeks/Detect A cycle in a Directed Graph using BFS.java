class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);
        }
        int indegree[]=new int[V];
        for(int i=0;i<V;i++){
            for(int in: adj.get(i)){
                indegree[in]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int count=0;
        while(!q.isEmpty()){
            int node=q.poll();
            count++;
            for(int in: adj.get(node)){
                indegree[in]--;
                if(indegree[in]==0){
                    q.add(in);
                }
            }
        }
        if(count<V){
            return true;
        }
        return false;
    }
}
