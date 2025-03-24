public class Stack1 {

   private int[] arr;
   private int tos;

    Stack1(){
        arr=new int[5];
        tos=-1;
    }
    Stack1(int n){
        arr=new int[n];
        tos=-1;
    }
    public boolean isFull(){
        return tos==arr.length-1;
    }
    public boolean isEmpty(){
        return tos==-1;
    }

    public void push(int val) throws Exception{
        if(isFull()){
            throw new Exception("stack full hai");
        }
        tos++;
        arr[tos]=val;
    }
    public void pop() throws Exception{
      if(isEmpty()){
        throw new Exception("stack khali hai");
      }
        System.out.println(arr[tos]);
        arr[tos]=0;
        tos--;

    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("stack khali hai");
          }
        return arr[tos];
    }
    public void Display(){

        for(int i=tos;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}