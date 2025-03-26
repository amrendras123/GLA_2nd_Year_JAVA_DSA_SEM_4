public class StackClient {
    public static void main(String[] args) throws Exception{
        Stack1 st=new Stack1(10);
        st.push(10);
        st.push(20);
        st.push(30);
        st.pop();
        st.push(40);
        st.push(50);
        // st.push(60);
        System.out.println(st.peek());
        // st.pop();
        st.push(60);
        st.pop();
        System.out.println(st.peek());

        st.display();
    }
}
