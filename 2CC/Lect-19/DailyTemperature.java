import java.util.Stack;

public class DailyTemperature {
     public int[] dailyTemperatures(int[] tmp) {
        int[] ans=new int[tmp.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tmp.length;i++){
            while(!st.isEmpty()&&tmp[i]>tmp[st.peek()]){
                ans[st.peek()]=i-st.peek();
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.peek()]=0;
            st.pop();
        }
        return ans;
    }
}
