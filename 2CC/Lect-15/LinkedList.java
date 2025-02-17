import java.io.EOFException;

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
  
    public Node getNode(int idx)throws Exception{

        if(idx>size){
            throw new Exception("index valid nhi hai");
        }

        Node temp=head;
        for(int i=1;i<idx;i++){
            temp=temp.next;
        }
        return temp;

    }
    public void addAtAnyIndex(int val ,int idx){

    }
    public void removeAtAnyIndex(int idx)throws Exception{
        
        if(idx>size){
            throw new Exception("index valid nhi hai");
        }

        if(idx==1){
            removeFirst();
        }else if(idx==size){
            removeLast();
        }else{
            Node temp=getNode(idx-1);
            Node idxplus1=temp.next.next;
            temp.next.next=null;
            temp.next=idxplus1;
            size--;

        }

        
       
    }
    public int getFirst() throws Exception{
        if(head==null){
            throw new Exception("ll empty hai");
        }
        return head.data;
    }
    public int getLast(){
        //exception handle
        return tail.data;

    }
    public void removeFirst()throws Exception{

        if(size==0){
            throw new Exception("linkedlist khali hai");
        }else if(size==1){
            head=null;
            tail=null;
            size=0;
        }else{
            Node temp=head.next;
            head.next=null;
            head=temp;
            size--;
        }

    }
    public void removeLast()throws Exception{

        if(size==1){
            removeFirst();
        }else{

            Node temp=getNode(size-1);
            temp.next=null;
            tail=temp;
            size--;
        }

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
        System.out.println();
        System.out.println("*********************");
    }
}