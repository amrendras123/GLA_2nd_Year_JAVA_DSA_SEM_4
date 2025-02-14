import java.io.EOFException;

public class LinkedList {

    class Node {
        int data;
        Node next;

        // constructor
        Node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    // o(1)
    public void addFirst(int val) {
        Node nn = new Node(val);

        if (size == 0) {
            head = nn;
            tail = nn;
            size++;

        } else {
            nn.next = head;
            head = nn;
            size++;
        }
    }

    // o(1)
    public void addLast(int val) {

        Node nn = new Node(val);
        if (size == 0) {
            addFirst(val);
        } else {
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    public void addAtAnyindx(int idx, int key) throws Exception {
        if (idx == 1) {
            addFirst(key);
        } else if (idx == size) {
            addLast(key);
        } else {

            Node temp = getNodeAt(idx - 1);
            Node nn = new Node(key);
            nn.next = temp.next;
            temp.next = nn;
            size++;
        }
    }

    // o(1)
    public void removeFirst() {
        if (size == 1) {
            head = null;
            tail = null;
            size = 0;

        } else {
            head = head.next;
            size--;
        }

    }

    // o(n)
    public Node getNodeAt(int idx) throws Exception {
        if (idx > size) {
            throw new Exception("invalid index");
        }
        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // O(n)
    public void removeLast() throws Exception {
        if (size == 0) {
            throw new Exception("linkedlist khali hai");
        } else if (size == 1) {
            head = null;
            tail = null;
            size = 0;
        } else {
            Node temp = getNodeAt(size - 1);
            temp.next = null;
            tail = temp;
            size--;

        }
    }

    public void removeAtAnyindex(int idx) throws Exception {
        if (idx == 1) {
            removeFirst();
        } else if (idx == size) {
            removeLast();
        } else {

            Node idxmin1 = getNodeAt(idx - 1);
            Node idxplus1 = idxmin1.next.next;
            idxmin1.next = idxplus1;
            idxmin1.next.next = null;
            size--;
        }
    }

    // traverse;
    public void traverse() {
        traverse(head);
    }

    private void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("********************");
    }

    public void reverseLL() {
        this.head = reverseLL(head);
    }

    private Node reverseLL(Node head) {
        if (head == null) {
            return head;
        }
        Node prev = head;
        Node curr = prev.next;
        while (curr != null) {
            Node ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        head.next = null;
        head = prev;
        return head;
    }
}