public class Partition_List {
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

    public ListNode partition(ListNode head, int x) {
        ListNode n1 = new ListNode(0);
        ListNode sm = n1;
        ListNode n2 = new ListNode(0);
        ListNode gr = n2;

        ListNode temp = head;
        while (temp != null) {
            if (temp.val < x) {
                n1.next = temp;
                n1 = n1.next;
            } else {
                n2.next = temp;
                n2 = n2.next;
            }
            temp = temp.next;
        }
        n2.next = null;
        n1.next = gr.next;
        return sm.next;

    }
}