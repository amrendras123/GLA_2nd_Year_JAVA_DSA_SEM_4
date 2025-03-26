import java.util.Stack;

class NSER{
    public static void main(String[] args) {
        int[] arr={8,1,2,3,4,5,9,8,7,1,2,32};
        NGERight(arr);

    }
    public static void NGERight(int[] arr){

        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<arr.length;i++){

            while(!st.isEmpty()&&arr[i]<arr[st.peek()]){
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