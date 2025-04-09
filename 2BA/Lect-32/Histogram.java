import java.util.Stack;

class Histogram{
      public int largestRectangleArea(int[] arr) {
        
        Stack<Integer> st=new Stack<>();
        int area=0;
        //sc=O(n)
        //tc=O(n)
        for(int i=0;i<=arr.length;i++){
            int val;
            if(i==arr.length){
                val=0;
            }else{
                val=arr[i];
            }
            while(!st.isEmpty()&&val<arr[st.peek()]){
               int nsr=i;
               int curr=st.pop();
               int nsl;
               if(st.isEmpty()){
                nsl=-1;
               }else{
                nsl=st.peek();
               }
               int width=nsr-nsl-1;
               area=Math.max(area,width*arr[curr]);
            }
            st.push(i);
        }
        return area;
    }
}