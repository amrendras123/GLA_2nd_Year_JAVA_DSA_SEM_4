import java.util.Stack;

public class Min_remove_to_make_ValidParenthesis {
    public String minRemoveToMakeValid(String s) {

        char[] arr = s.toCharArray();

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            char ch = arr[i];
            if (ch == '(') {
                st.push(i);
            } else if (ch == ')') {
                if (st.isEmpty())
                    arr[i] = '.';
                else
                    st.pop();
            }

        }
        while (!st.isEmpty()) {
            arr[st.pop()] = '.';
        }
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            if (c != '.')
                sb.append(c);
        }

        return sb.toString();
    }
}
