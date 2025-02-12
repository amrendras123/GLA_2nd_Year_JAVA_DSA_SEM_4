public class LinkedList {

    class Node{
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size=0;

    public void addFirst(int val){
       Node nn=new Node();
       nn.data=val;
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
        Node nn=new Node();
        nn.data=val;
        if(size==0){
            addFirst(val);
        }else{
            tail.next=nn;
            tail=nn;
            size++;
        }
    }
    private Node getNodeAt(int idx) throws Exception{
        if(idx>size){
            throw new Exception("invalid index hai");
        }
        Node temp=head;
        for(int i=1;i<idx;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void print(){
        print(head);
    }
    private void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
}