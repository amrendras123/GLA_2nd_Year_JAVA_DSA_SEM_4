public class Subseq {

    public static void main(String[] args) {
        String ques="abc";
        Subs(ques,"");
        System.out.println(count);
    }
    static int count=0;
    public static void Subs(String ques, String ans){
         if(ques.length()==0){
            System.out.print(ans+" ");
            count++;
            return ;
         }
        char ch=ques.charAt(0);
        Subs(ques.substring(1), ans);
        Subs(ques.substring(1), ans+ch);
    }

}