public class Remove_Duplicates_2 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0);
        if (head == null || head.next == null)
            return head;
        dummy.next = head;
        ListNode temp = dummy, a = head, b = a.next;

        while (temp != null) {

            boolean dup = false;
            while (b != null && a.val == b.val) {
                dup = true;
                a = b;
                b = b.next;
            }
            a = b;
            if (b != null)
                b = b.next;
            if (dup)
                temp.next = a;
            else
                temp = temp.next;
        }
        return dummy.next;
    }
}
