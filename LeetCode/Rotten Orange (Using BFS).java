class Solution {
    class Pair{
        int row;
        int col;
        int t;
        public Pair(int row,int col,int t){
            this.row=row;
            this.col=col;
            this.t=t;
        }
    }
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        Queue<Pair> q= new LinkedList<>();
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    vis[i][j]=2;
                    q.add(new Pair(i,j,0));
                }
                else{
                    vis[i][j]=0;
                }
                if(grid[i][j]==1){
                    count++;
                }
            }
        }
        int curr=0;
        int rowg[]= {-1,1,0,0};
        int colg[]={0,0,-1,1};
        int result=0;
        while(!q.isEmpty()){
            int r= q.peek().row;
            int c=q.peek().col;
            int time=q.peek().t;
            result= Math.max(time,result);
            q.remove();
            for(int i=0;i<4;i++){
                int nr = r+ rowg[i];
                int nc=c+ colg[i];
                if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==1 && vis[nr][nc]==0){ 
                    vis[nr][nc]=2;
                    q.add(new Pair(nr,nc, time+1));
                    curr++;
                    
                }

            }
        }    
        if(curr!= count){
            return -1;
        }    
        return result;
        
    }
}
