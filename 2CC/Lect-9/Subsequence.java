public class Subsequence {

    public static void main(String[] args) {
         String ques="abc";
         String ans="";
         sub(ques,ans);
    }
    public static void sub(String ques,String ans){

        if(ques.length()==0){
            System.out.print(ans+" ");
            return;
        }

        char ch=ques.charAt(0);
        sub(ques.substring(1), ans);
        sub(ques.substring(1), ans+ch);
    }
}