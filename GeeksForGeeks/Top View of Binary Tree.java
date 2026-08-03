class Solution {
    class Pair{
        Node node;
        int hd;
        Pair(Node node, int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        Queue<Pair> queue=new LinkedList<>();
        TreeMap<Integer,Integer> map=new TreeMap<>();
        if(root==null){
            return result;
        }
        queue.add(new Pair(root,0));
        while(!queue.isEmpty()){
            Pair curr=queue.poll();
            Node node=curr.node;
            int hd=curr.hd;
            if(!map.containsKey(hd)){
                map.put(hd,node.data);
            }
            if(node.left!=null){
                queue.add(new Pair(node.left,hd-1));
            }
            if(node.right!=null){
                queue.add(new Pair(node.right,hd+1));
            }
        }
        for(int val:map.values()){
            result.add(val);
        }
        return result;
    }
}
