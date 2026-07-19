class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        Stack <Integer> temp=new Stack<>();
        while(!st.isEmpty()){
            int x=st.pop();
            while(!temp.isEmpty() && temp.peek()<x){
                st.push(temp.pop());
            }
            temp.push(x);
        }
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        
    }
}
