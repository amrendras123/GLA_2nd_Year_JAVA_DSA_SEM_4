import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> in=new Stack<>();
    Stack<Integer> ot=new Stack<>();

    public QueueUsingStack() {
        
    }
    public void push(int x) {
        in.push(x);
    }
    public int pop() {
        peek();
        return ot.pop();
    }
    public int peek() {
        if(ot.isEmpty()){
            while(!in.isEmpty()){
              ot.push(in.pop());
            }
        }
       return ot.peek();
    }
    public boolean empty() {
        return in.isEmpty()&&ot.isEmpty();
    }
}