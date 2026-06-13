class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode firstHalf=head;
        ListNode secondHalf=reverseList(slow);
        while(secondHalf!=null){
            if(firstHalf.val!=secondHalf.val){
                return false;
            }
            firstHalf=firstHalf.next;
            secondHalf=secondHalf.next;

        }
        return true;
    

    }

    private ListNode reverseList(ListNode head){
        ListNode prev=null;
        ListNode current=head;
        while(current!=null){
            ListNode nextNode=current.next;
            current.next=prev;
            prev=current;
            current=nextNode;
            
        }
        return prev;
        
    }
}
