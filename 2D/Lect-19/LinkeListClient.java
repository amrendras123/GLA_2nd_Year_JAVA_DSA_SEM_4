public class LinkeListClient {
    public static void main(String[] args) throws Exception {
        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        // ll.print();
        ll.addLast(40);
        // ll.size=100;
        ll.addAtAnyindx(2, 50);
        // ll.removeFirst();
        // ll.removeLast();
        // ll.removeAt(3);
        ll.print();
        ll.reverseLL();
        ll.print();
    }
}
