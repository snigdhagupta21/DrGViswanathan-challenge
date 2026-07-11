class Solution {
    public ArrayList<Integer> mergeArrays(int[][] mat) {
        // Code here
        ArrayList<Integer> result=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                pq.add(mat[i][j]);
            }
        }
        for(int i=0;i<n*m;i++){
            result.add(pq.poll());
        }
        return result;
    }
}
