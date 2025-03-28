import java.util.Stack;

public class TrappingRainWater {

    public int trap(int[] ht) {

        Stack<Integer> st = new Stack<>();
        int water = 0;
        for (int i = 0; i < ht.length; i++) {
            while (!st.isEmpty() && ht[i] > ht[st.peek()]) {
                int rm = i;
                int curr = st.pop();
                if (st.isEmpty()) {
                    break;
                }
                int lm = st.peek();
                int width = rm - lm - 1;
                water += (Math.min(ht[lm], ht[rm]) - ht[curr]) * width;
            }
            st.push(i);
        }
        return water;
    }
}