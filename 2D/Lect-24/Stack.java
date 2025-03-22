public class Stack {

    private int[] arr;
    private int tos;

    Stack() {
        arr = new int[5];
        tos = -1;
    }

    Stack(int n) {
        arr = new int[n];
        tos = -1;
    }
    public boolean isFull(){
        return tos==arr.length-1;
    }
    public boolean isEmpty(){
        return tos==-1;
    }
    public int size(){
        return tos+1;
    }

    public void push(int val) throws Exception {
        if(isFull()){
            throw new Exception("stack full  hai ");
            
        }
        tos++;
        arr[tos]=val;
    }
    public int peek() throws Exception{
        if(tos==-1){
            throw new Exception("stack empty hai ");
        }

        return arr[tos];
    }
    public int pop() throws Exception{

        if(tos==-1){
            throw new Exception("stack empty hai ");
        }
        return arr[tos--];
    }
    public void display(){

        for(int i=tos;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println("**********************");
    }
}