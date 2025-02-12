public class LinkedListClient {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addLast(40);
        ll.traverse();
        ll.removeFirst();
        ll.traverse();
    }
}
