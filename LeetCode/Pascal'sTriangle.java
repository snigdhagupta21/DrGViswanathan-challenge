class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> temp=new ArrayList<>();
            int ans=1;
            temp.add(ans);
            for(int j=1;j<i;j++){
                ans= ans*(i-j);
                ans=ans/j;
                temp.add(ans);
            }
            list.add(temp);
        }
        return list;
        
    }
}
