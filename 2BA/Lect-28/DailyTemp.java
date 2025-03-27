import java.util.Stack;

public class DailyTemp {

    public int[] dailyTemperatures(int[] arr) {

        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                ans[st.peek()] = i - st.peek();
                st.pop();
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            ans[st.peek()] = 0;
            st.pop();
        }
        return ans;
    }
}