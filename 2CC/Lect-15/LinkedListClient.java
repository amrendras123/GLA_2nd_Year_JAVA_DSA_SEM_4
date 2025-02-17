public class LinkedListClient {
    public static void main(String[] args)throws Exception {
        LinkedList ll=new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        // ll.print();
        ll.addLast(40);
        ll.addFirst(60);
        ll.addFirst(70);
        // ll.size=100;

        ll.print();
        // ll.removeFirst();
        // ll.removeLast();
        ll.removeAtAnyIndex(40);
        ll.print();
    }
}
