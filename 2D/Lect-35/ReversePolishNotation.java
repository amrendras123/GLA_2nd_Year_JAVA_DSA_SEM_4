import java.util.Stack;

public class ReversePolishNotation {
      public int evalRPN(String[] tokens) {
        
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){

            switch(tokens[i]){
            case "+":
            st.push(st.pop()+st.pop());
            break;
            case "-":
            st.push(-st.pop()+st.pop());
            break;
            case "*":
             st.push(st.pop()*st.pop());
             break;
            case "/":
            int n1=st.pop(),n2=st.pop();
            st.push(n2/n1);
            break;
            default:
            st.push(Integer.parseInt(tokens[i]));

            }
        }
        return st.pop();
    }
}
