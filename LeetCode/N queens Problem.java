class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        int leftrow[]= new int[n];
        int lowerdiagonal[]= new int[2*n-1];
        int upperdiagonal[]= new int[2*n-1];
        solve(0,n,ans,board, leftrow,lowerdiagonal,upperdiagonal);
        return ans;
    }
    public void solve(int col,int n,List<List<String>> ans, char board[][], int leftrow[], int lowerdiagonal[], int upperdiagonal[]){
        if(col==n){
            List<String> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(new String(board[i]));
            }
            ans.add(list);
            return;
        }
        for(int row=0;row<n;row++){
            if(leftrow[row]==0 && lowerdiagonal[row+col]==0 && upperdiagonal[n-1+col-row]==0){
                board[row][col]='Q';
                leftrow[row]=1;
                lowerdiagonal[row+col]=1;
                upperdiagonal[n-1+col-row]=1;
                solve(col+1,n,ans,board,leftrow,lowerdiagonal,upperdiagonal);
                board[row][col]='.';
                leftrow[row]=0;
                lowerdiagonal[row+col]=0;
                upperdiagonal[n-1+col-row]=0;

            }
        }
    }
}
