public class PartitionList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode partition(ListNode head, int x) {
        
        ListNode hA=new ListNode(0);
        ListNode hB=new ListNode(0);
        ListNode A=hA;
        ListNode B=hB;
        ListNode temp=head;
        while(temp!=null){

            if(temp.val<x){
                A.next=temp;
                A=A.next;
            }else{
                B.next=temp;
                B=B.next;
            }
            temp=temp.next;
        }
          B.next=null;
          A.next=hB.next;
          return hA.next;
    }
}
