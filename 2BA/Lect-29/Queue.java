class Queue{
    int[] arr;
    int front;
    int size;

    Queue(){
        arr=new int[5];
        front=0;
        size=0;
    }
    Queue(int n){
        arr=new int[n];
        front=0;
        size=0;
    }
    public boolean isFull(){
      return size==arr.length;
    }
    public boolean isEmpty(){
     return size==0;
    }
    public void enqueue(int val) throws Exception{
        if(size==arr.length){
            throw new Exception("Queue is full");
        }
        int idx=(front+size)%arr.length;
        arr[idx]=val;
        size++;
    }
    public int dequeue() throws Exception{
      if(isEmpty()){
        throw new Exception("queue khali hai");
      }
        int rv=arr[front];
        arr[front]=0;
        front=(front+1)%arr.length;
        size--;
        return rv;

    }
}