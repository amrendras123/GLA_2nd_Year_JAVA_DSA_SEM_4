public class FInd_Inter {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            // if(a==null){
            // a=headB;
            // }else{
            // a=a.next;
            // }
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;

    }
}
