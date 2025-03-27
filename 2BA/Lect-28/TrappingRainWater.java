import java.util.Stack;

public class TrappingRainWater {

    public int trap(int[] ht) {
        int ans = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < ht.length; i++) {
            while (!st.isEmpty() && ht[i] > ht[st.peek()]) {
                int rm = i;
                int curr = st.pop();
                int lm;
                if (st.isEmpty()) {
                    break;
                }
                lm = st.peek();
                int width = rm - lm - 1;
                ans += (Math.min(ht[lm], ht[rm]) - ht[curr]) * width;
            }
            st.push(i);
        }
        return ans;
    }
}