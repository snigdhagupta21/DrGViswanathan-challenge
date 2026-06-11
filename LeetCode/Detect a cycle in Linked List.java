class Solution {
    public boolean detectLoop(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
        while(head==null ||head.next==null){
            return false;
        }
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
