public class Stack_Client {
    public static void main(String[] args)throws Exception {
        Stack st=new Stack();
        st.push(20);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.display();
        // System.out.println(st.peek());
        System.out.println(st.pop());
        st.display();

    }
}
