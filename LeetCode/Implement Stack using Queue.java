class MyStack {
    Queue <Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
        int size=q.size();
        for(int i=0;i<size-1;i++){
            q.add(q.remove());
        }
    }
    
    public int pop() {
        if(!q.isEmpty()){
            return q.remove();
        }
        return -1;
    }
    
    public int top() {
        if(!q.isEmpty()){
            return q.peek();
        }
        return -1;
    }
    
    public boolean empty(){
        return q.isEmpty();
    }
}
