import java.util.Stack;

public class Histogram {
    public int largestRectangleArea(int[] ht) {
        
        //tc=O(n)
        //sc=O(n)
        
        Stack<Integer> st=new Stack<>();
        int area=0;
        for(int i=0;i<=ht.length;i++){
            int val;
              if(i==ht.length){
               val=0;
              }else{
                val=ht[i];
              }
            //   int val=(i==ht.length)?0:ht[i];
            while(!st.isEmpty()&&val<ht[st.peek()]){
                int nsr=i;//next smaller element on right
                int curr=st.pop();//to be solved
                int nsl;//next smaller element on left
                if(st.isEmpty())
                   nsl=-1;
                else
                nsl=st.peek();
                int width=nsr-nsl-1;
                area=Math.max(area,width*ht[curr]);

            }
            st.push(i);
        }
        return area;
    }
}
