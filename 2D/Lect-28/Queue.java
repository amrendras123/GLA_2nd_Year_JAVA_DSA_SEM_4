public class Queue {

    private int[] arr;
    private int front;
    private int size;
    Queue(){
        this.arr=new int[5];
        this.front=0;
        this.size=0;
    }
    Queue(int n){
        this.arr=new int[n];
        this.front=0;
        this.size=0;
    }
    public boolean isFull(){
       return this.size==this.arr.length;
    }
    public boolean isEmpty(){
        return this.size==0;
    }

    public void enqueue(int val) throws Exception{
        if(isFull()){
            throw new Exception("queue full hai");
        }
        int idx=(front+size)%arr.length;
        arr[idx]=val;
        size++;

    }
    public int  dequeue() throws Exception{
       if(isEmpty()){
        throw new Exception("Queue is Empty");
       }
       int rv=arr[front];
       arr[front]=0;
       front=(front+1)%arr.length;
       size--;
       return rv;
    }
    public void display(){
        for(int i=0;i<size;i++){
             int idx=(i+front)%arr.length;
            System.out.print(arr[idx]+" ");
            
        }
        System.out.println();
    }
}