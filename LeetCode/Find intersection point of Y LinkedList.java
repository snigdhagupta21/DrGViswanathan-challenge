public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null)
            return null;

        ListNode pA = headA;
        ListNode pB = headB;

        while (pA != pB) {

            // if pA reaches end, switch to headB
            pA = (pA == null) ? headB : pA.next;

            // if pB reaches end, switch to headA
            pB = (pB == null) ? headA : pB.next;
        }

        return pA;   // intersection node or null
    }
}
