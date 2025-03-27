import java.util.Stack;

public class NGER {

    public static void main(String[] args) {
        
        int[] arr={6,5,3,2,1,7,8,9,10,11,12};
        NGERight(arr);
    }
    public static void NGERight(int[] arr){

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