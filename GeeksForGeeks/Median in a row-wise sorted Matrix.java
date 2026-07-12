class Solution {
    public int median(int[][] mat) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                pq.add(mat[i][j]);
            }
        }
        int size= pq.size();
        int median= size/2;
        while(median>0){
            pq.poll();
            median--;
        }
        return pq.poll();
        
    }
}
