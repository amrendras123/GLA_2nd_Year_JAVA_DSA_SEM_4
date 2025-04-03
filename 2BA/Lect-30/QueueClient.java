public class QueueClient {
    public static void main(String[] args) throws Exception {
        Queue q=new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();//10 20 30 40 50
        q.dequeue();
        q.display();//20 30 40 50
        q.dequeue();
        q.display();//30 40 50
        q.enqueue(60);
        q.display();//30 40 50 60
        q.enqueue(70);
        q.display();//30 40 50 60 70
        q.enqueue(80);
    }
}
