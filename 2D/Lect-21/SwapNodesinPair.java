public class SwapNodesinPair {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode h1=head;
        ListNode h2=head.next;
        while(h1.next!=null&&h2.next!=null){
            int temp=h1.val;
            h1.val=h2.val;
            h2.val=temp;
             //change h1 pointer
            h1=h2.next;
            //change h2 pointer
            if(h1.next!=null){
                h2=h1.next;
            }else{
                return head;
            }
        }
         int temp=h1.val;
            h1.val=h2.val;
            h2.val=temp;

        return head;

    }
}
