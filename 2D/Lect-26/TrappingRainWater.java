import java.util.Stack;

public class TrappingRainWater {
     public int trap(int[] ht) {

       int sum=0;
       Stack<Integer> st=new Stack<>();
       int lm=-1;
       int rm=-1;
       int curr=-1;
       for(int i=0;i<ht.length;i++){

        while(!st.isEmpty()&&ht[i]>ht[st.peek()]){
            rm=i;
            curr=st.pop();
            if(st.isEmpty())
            break;
            lm=st.peek();
            int width=rm-lm-1;
            sum+=(Math.min(ht[lm],ht[rm])-ht[curr])*width;
        }
        st.push(i);
       } 
       return sum;
    }
}
