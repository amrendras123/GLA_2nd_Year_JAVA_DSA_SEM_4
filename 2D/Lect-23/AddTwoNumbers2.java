
public class AddTwoNumbers2 {
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
    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        
        //  ListNode n1=reverseList(l1);
        //  ListNode n2=reverseList(l2);
        // ListNode f= addTwoNumbers1(n1,n2);
        //  return reverseList(f);
         
         Stack<Integer> st=new Stack<>();
         Stack<Integer> st2=new Stack<>();
         Stack<Integer> stf=new Stack<>();
         
         
         // ListNode temp=l1;
         while(l1!=null){
             st.push(l1.val);
             l1=l1.next;
         }
         // temp=l2;
         while(l2!=null){
             st2.push(l2.val);
             l2=l2.next;
         }
         int carry=0;
         ListNode nn1=new ListNode();
         ListNode temp2=nn1;
         
         while(!st.isEmpty()||!st2.isEmpty()||carry==1){
             
             int sum=0;
             if(!st.isEmpty()){
                 sum+=st.pop();
             }
             if(!st2.isEmpty()){
                 sum+=st2.pop();
             }
             sum+=carry;
             carry=sum/10;
             stf.push(sum%10);
            
         }
         while(!stf.isEmpty()){
              ListNode nn=new ListNode(stf.pop());
             temp2.next=nn;
             temp2=temp2.next;
         }
         return nn1.next;
         
     }
      public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode temp;
         ListNode nn1=new ListNode();
         temp=nn1;
         int carry=0;
         //int sum;
          l2=reverseList(l2);
          l1=reverseList(l1);
          
         while(l1!=null||l2!=null||carry==1){
             
            int sum=0;
             if(l1!=null){
                 sum+=l1.val;
                 l1=l1.next;
             }
             if(l2!=null){
                 sum+=l2.val;
                 l2=l2.next;
             }
             sum+=carry;
             
             carry=sum/10;
             ListNode nn=new ListNode(sum%10);
             temp.next=nn;
             temp=temp.next;
            
             
         }
       nn1=reverseList(nn1.next);
         return nn1;
     }
     
     //reverse by pointer
     public ListNode reverseList(ListNode head) {
     
         if(head==null||head.next==null){
             return head;
         }
         ListNode prev=head;
         ListNode curr=prev.next;
         
         head.next=null;
         while(prev!=null && curr!=null){
             
             ListNode ahead=curr.next;
             curr.next=prev;
             prev=curr;
             curr=ahead;
         }
         return prev;
         
     }

}
