import java.util.Stack;

public class ScoreofParanthesis {
      public int scoreOfParentheses(String s) {
         Stack<Integer> st=new Stack<>();
         int curr=0;
         for(char ch:s.toCharArray()){

            if(ch=='('){
                st.push(curr);
                curr=0;
            }
            else{
                curr=st.pop()+Math.max(2*curr,1);
            }
         }
         return curr;
    }
    
}
