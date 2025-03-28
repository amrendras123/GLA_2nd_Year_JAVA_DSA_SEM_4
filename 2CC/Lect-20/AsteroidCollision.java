import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int i = 0;
        while (i < arr.length) {
            if (st.isEmpty() || arr[i] > 0 || st.peek() < 0) {
                st.push(arr[i]);
                i++;
            } else if (-arr[i] < st.peek()) {
                i++;
            } else {
                if (-arr[i] == st.peek()) {
                    st.pop();
                    i++;
                } else {
                    st.pop();
                }
            }
        }
        int[] ans = new int[st.size()];
        int j = st.size() - 1;
        while (!st.isEmpty()) {
            ans[j] = st.pop();
            j--;
        }
        return ans;
    }
}
