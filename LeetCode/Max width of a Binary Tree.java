class Solution {
    class Pair{
        TreeNode node;
        int index;
        Pair(TreeNode node,int index){
            this.node=node;
            this.index=index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        int ans=0;
        while(!q.isEmpty()){
            int min=q.peek().index;
            int size=q.size();
            int first=0;
            int last=0;
            for(int i=0;i<size;i++){
                Pair curr= q.poll();
                int ind= curr.index-min;
                TreeNode n=curr.node;
                if(i==0){
                    first=ind;
                }
                if(i==size-1){
                    last=ind;
                }
                if(n.left!=null){
                    q.add(new Pair(n.left, 2*ind+1));
                }
                if(n.right!=null){
                    q.add(new Pair(n.right, 2*ind+2));
                }
            }
            ans=Math.max(ans, last-first+1);

        }
        return ans;
    }
}
