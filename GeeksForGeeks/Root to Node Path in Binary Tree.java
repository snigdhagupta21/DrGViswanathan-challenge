class Solution {
    public ArrayList<ArrayList<Integer>> paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        ArrayList<Integer> path=new ArrayList<>();
        dfs(root,path,result);
        return result;
    }
    public void dfs(Node root, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> result){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            result.add(new ArrayList<>(path));
        }
        else{
            dfs(root.left,path,result);
            dfs(root.right,path,result);
        }
        path.remove(path.size()-1);
    }
}
