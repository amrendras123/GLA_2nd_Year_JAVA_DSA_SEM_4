class Node{
    int data;
    Node next;

    //constructor
    Node(int val){
        this.data = val;
        this.next = null;
    }
}

public class singlyLinkedList {
    public static Node addFirst(Node head,int val){
        //step1 : new node create;
        Node newnode = new Node(val);

        //step 2: newnode.next mein head daal do;
        newnode.next = head;

        //step 3: head value update;
        head = newnode;
        return head;
    }

    //traverse;
    public static void traverse(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(12);
        System.out.println(head.data);
        System.out.println(head.next);


        head = addFirst(head,11);
        head = addFirst(head,10);
        head = addFirst(head,9);
        head = addFirst(head,8);

        traverse(head);
    }
}