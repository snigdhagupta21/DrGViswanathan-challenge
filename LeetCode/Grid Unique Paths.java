class Solution {
    public int uniquePaths(int m, int n) {
        int N=m+n-2;
        int row=Math.min(m-1,n-1);
        long res=1;
        for(int i=1;i<=row;i++){
            res=res*(N-row+i)/i;
        }
        return (int)res;
    }
}
