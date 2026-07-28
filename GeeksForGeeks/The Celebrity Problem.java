class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int n=mat.length;
        int top=0;
        int bottom=n-1;
        while(top<bottom){
            if(mat[top][bottom]==1){
                top++;
            }
            else{
                bottom--;
            }
        }
        int candidate=top;
        for(int i=0;i<n;i++){
            if(candidate!=i){
                if(mat[candidate][i]==1 || mat[i][candidate]==0){
                    return -1;
                }
            }
        }
        return candidate;
    }
}
