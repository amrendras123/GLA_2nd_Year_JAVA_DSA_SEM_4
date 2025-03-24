public class Stack {

   private int[] arr;
   private int tos;

    Stack(){
        arr=new int[5];
        tos=-1;
    }
    Stack(int n){
        arr=new int[n];
        tos=-1;
    }
    public int peek() throws Exception{
        if(tos==-1){
            throw new Exception("stack khali hai ");
        }
        return arr[tos];
    }
    public boolean isEmpty(){
        return tos==-1;
    }
    public boolean isFull(){
        return tos==arr.length-1;
    }
    public void push(int val){

        tos++;
        arr[tos]=val;
    }
    public void pop() throws Exception{
        if(tos==-1){
            throw new Exception("stack khali hai ");
        }
        System.out.println(arr[tos]);
        arr[tos]=0;
        tos--;
    }
}