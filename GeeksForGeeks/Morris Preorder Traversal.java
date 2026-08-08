class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        
        //  code here
        ArrayList<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Node curr=root;
        while(curr!=null){
            if(curr.left==null){
                result.add(curr.data);
                curr=curr.right;
            }
            else{
                Node prev=curr.left;
                while(prev.right!=null && prev.right!=curr){
                    prev=prev.right;
                }
                if(prev.right==null){
                    result.add(curr.data);
                    prev.right=curr;
                    curr=curr.left;
                }
                else{
                    prev.right=null;
                    curr=curr.right;
                }
            }
        }
        return result;
       
    }
    
}
