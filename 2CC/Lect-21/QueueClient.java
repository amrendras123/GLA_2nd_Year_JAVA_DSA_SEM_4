public class QueueClient {
    public static void main(String[] args) throws Exception {
        Queue q=new Queue(6);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.display();
        System.out.println(q.dequeue());
        q.display();
        q.enqueue(50);
        q.enqueue(60);
        q.dequeue();
        q.enqueue(70);
        q.enqueue(80);
        q.display();
    }
}
