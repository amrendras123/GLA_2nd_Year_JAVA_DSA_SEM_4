public class ReverseLL2 {
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

    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if(head==null)
            return head;
        
        ListNode prev=null;
        ListNode curr=head;
        
        while(left>1){
            prev=curr;
            curr=curr.next;
            left--;
            right--;
        }
        ListNode conn=prev;
        ListNode tail=curr;
        while(right>0){
            ListNode ahead=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ahead;
            right--;
        }
        if(conn!=null)
            conn.next=prev;
        else{
            head=prev;
        }
        tail.next=curr;
        return head;
    }

}
