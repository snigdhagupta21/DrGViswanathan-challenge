class Solution {
    public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        reversepreorder(root,0,st,result);
        return result;
    }
    public void reversepreorder(Node root, int level, Stack<Integer> st, ArrayList<Integer> result){
        if(root==null){
            return;
        }
        if(st.size()==level){
            st.push(root.data);
            result.add(root.data);
        }
        reversepreorder(root.left, level+1,st,result);
        reversepreorder(root.right, level+1,st,result);
    }
}
