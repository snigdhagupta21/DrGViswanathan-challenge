class Solution {
    class Pair{
        TreeNode node;
        int hd;
        int level;
        Pair(TreeNode node,int hd,int level){
            this.node=node;
            this.hd=hd;
            this.level=level;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        Queue<Pair> q=new LinkedList<>();
        TreeMap<Integer,TreeMap<Integer, PriorityQueue<Integer>>> map=new TreeMap<>();
        if(root==null){
            return result;
        }
        q.add(new Pair(root,0,0));
        while(!q.isEmpty()){
            Pair curr=q.poll();
            TreeNode node=curr.node;
            int hd=curr.hd;
            int level=curr.level;
            map.putIfAbsent(hd,new TreeMap<>());
            map.get(hd).putIfAbsent(level, new PriorityQueue<>());
            map.get(hd).get(level).add(node.val);
            if(node.left!=null){
                q.add(new Pair(node.left,hd-1,level+1));
            }
            if(node.right!=null){
                q.add(new Pair(node.right,hd+1,level+1));
            }
        }
        for(TreeMap<Integer, PriorityQueue<Integer>> t: map.values()){
            List<Integer> list=new ArrayList<>();
            for(PriorityQueue<Integer> pq: t.values()){
                while(!pq.isEmpty()){
                    list.add(pq.poll());
                }
            }
            result.add(list);
        }
        return result;
    }
}
