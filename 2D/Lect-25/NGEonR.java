import java.util.Stack;

public class NGEonR {

    public static void main(String[] args) {
        int[] arr={4,1,2,5,6,10,7,8};
        NGER(arr);
    
    }
    public static void NGER(int[] arr){

        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty()&&arr[i]>arr[st.peek()]){
                ans[st.peek()]=arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.peek()]=-1;
            st.pop();
        }
        for(int i=0;i<ans.length;i++){
            System.out.println(arr[i]+"->"+ans[i]);
        }

    }
}