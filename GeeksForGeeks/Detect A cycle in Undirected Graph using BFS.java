class Solution {

    class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public boolean isCycle(int V, int[][] edges) {

        // Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Convert edge list to adjacency list
        for (int i = 0; i < edges.length; i++) {

            int u = edges[i][0];
            int v = edges[i][1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] visited = new boolean[V];

        // Check all components
        for (int i = 0; i < V; i++) {

            if (!visited[i]) {

                if (bfs(i, visited, adj)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean bfs(int start, boolean[] visited,
                       ArrayList<ArrayList<Integer>> adj) {

        Queue<Pair> q = new LinkedList<>();

        visited[start] = true;

        q.add(new Pair(start, -1));

        while (!q.isEmpty()) {

            int node = q.peek().first;
            int parent = q.peek().second;

            q.poll();

            for (int neighbour : adj.get(node)) {

                if (!visited[neighbour]) {

                    visited[neighbour] = true;

                    q.add(new Pair(neighbour, node));
                }

                else if (neighbour != parent) {

                    return true;
                }
            }
        }

        return false;
    }
}
