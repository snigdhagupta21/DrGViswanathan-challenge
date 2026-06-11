class Solution {
    public Node reverseKGroup(Node head, int k) {
        // code here
       if(head==null || k==1){
            return head;
        }
        Node dummy=new Node(0);
        dummy.next=head;
        Node cur= dummy;
        Node prev=dummy;
        Node next=dummy;
        int count=0;
        while(cur.next!=null){
            cur=cur.next;
            count++;
        }
        while(count>0){
            int groupSize = Math.min(k, count);
            cur=prev.next;
            next=cur.next;
            for(int i=1;i<groupSize;i++){
                cur.next=next.next;
                next.next=prev.next;
                prev.next=next;
                next=cur.next;
            }
            prev=cur;
            count -=k;
        }
        return dummy.next;
    }
} 
    
