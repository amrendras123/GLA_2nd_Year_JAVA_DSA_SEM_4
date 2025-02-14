public class LinkedListClient {
    public static void main(String[] args) throws Exception{
        LinkedList ll=new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addLast(40);
        // ll.traverse();
        // ll.removeFirst();
        // ll.removeLast();
        // ll.removeLast();
        ll.traverse();
        ll.removeAtAnyindex(30);
        ll.traverse();
    }
}
