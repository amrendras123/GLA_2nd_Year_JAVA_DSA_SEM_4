class Queue{
    private int[] arr;
   private int front;
    private int size;
    Queue(int n){
        this.arr=new int[n];
        this.front=0;
        this.size=0;
    }
    Queue(){
        arr=new int[5];
        this.front=0;
        this.size=0;
    }
    public boolean isFull(){
      return this.size==this.arr.length;
    }
    public boolean isEmpty(){
      return this.size==0;
    }
    public int size(){
       return this.size;
    }
    public void enqueue(int val)throws Exception{
        if(size==arr.length){
            throw new Exception("queue full hai");
        }
        int idx=(front+size)%arr.length;
        arr[idx]=val;
        size++;
    }
    public int dequeue() throws Exception{
      if(size==0){
        throw new Exception("queue khali hai");
      }
        int rv=arr[front];
        arr[front]=-1;
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