
public class LinkedList {

    class Node{
        int data;
        Node next;
    
        //constructor
        Node(int val){
            this.data = val;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int val){
        Node nn=new Node(val);

        if(size==0){
            head=nn;
            tail=nn;
            size++;

        }else{
            nn.next=head;
            head=nn;
            size++;
        }
    }
    public void addLast(int val){

        Node nn=new Node(val);
        if(size==0){
            addFirst(val);
        }else{
            tail.next=nn;
            tail=nn;
            size++;
        }
    }
    public void removeFirst(){
        if(size==1){
            head=null;
            tail=null;
            size=0;

        }else{
            head=head.next;
            size--;
        }

    }
    public void removeLast(){

    }

    //traverse;
    public void traverse(){
        traverse(head);
    }
        private void traverse(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("********************");
    }
}