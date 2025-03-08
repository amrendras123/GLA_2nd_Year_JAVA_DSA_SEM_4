public class DoublyLL {

    // Represent a node of the doubly linked list

    class Node {
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head, tail = null;
    public void addNodeLast(int data) {
        // Create a new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            head.previous = null;

            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void addFirst(int data) {

        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            tail = nn;
        } else {

            nn.next = head;
            head.previous = nn;
            head = nn;
        }

    }
    public void addAt(int idx,int data){
        //HW
    }
    public  void removeFirst(){
        //HW
    }
    public void removeLast(){
        //HW
    }
    public void removeAt(int idx){
        //HW
    }


    public void display() {
        // Node current will point to head
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while (current != null) {
            // Prints each node by incrementing the pointer.

            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {

        DoublyLL dList = new DoublyLL();
        // Add nodes to the list
        dList.addNodeLast(1);
        dList.addFirst(10);
        dList.addNodeLast(2);
        dList.addFirst(20);
        dList.addNodeLast(3);
        dList.addFirst(30);
        dList.addNodeLast(4);
        dList.addNodeLast(5);
        dList.addFirst(50);

        // Displays the nodes present in the list
        dList.display();
    }
}