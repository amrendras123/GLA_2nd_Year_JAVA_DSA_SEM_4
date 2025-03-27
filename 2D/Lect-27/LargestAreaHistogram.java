import java.util.Stack;

public class LargestAreaHistogram {
    public int largestRectangleArea(int[] ht) {
        Stack<Integer> st = new Stack<>();
        int area = 0;
        for (int i = 0; i <= ht.length; i++) {
            int h = (i == ht.length ? 0 : ht[i]);
            while (!st.isEmpty() && ht[st.peek()] > h) {
                int tbs = st.pop();// to be solved
                int nsr = i;// next smaller element on right
                int nsl;//next
                if (st.isEmpty()) {
                    nsl = -1;
                } else
                    nsl = st.peek();
                int width = nsr - nsl - 1;
                area = Math.max(area, width * ht[tbs]);
            }
            st.push(i);
        }
        return area;
    }
}
