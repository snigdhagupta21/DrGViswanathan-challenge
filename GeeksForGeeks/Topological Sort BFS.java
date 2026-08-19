class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u= edges[i][0];
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
        for(int j=0;j<V;j++){
            if(indegree[j]==0){
                q.add(j);
            }
        }
        ArrayList<Integer> result=new ArrayList<>();
        while(!q.isEmpty()){
            int node=q.poll();
            result.add(node);
            for(int var: adj.get(node)){
                indegree[var]--;
                if(indegree[var]==0){
                    q.add(var);
                }
            }
        }
        return result;
    }
}
