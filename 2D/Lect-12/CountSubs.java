public class CountSubs {
    
    public static void main(String[] args) {
        String ques="abcjdfvhsdvsvd";
        System.out.println(Subs(ques,""));
    }
    public static int Subs(String ques, String ans){
        if(ques.length()==0){
           System.out.print(ans+" ");
           return 1;
        }
       char ch=ques.charAt(0);
      int a= Subs(ques.substring(1), ans);
      int b= Subs(ques.substring(1), ans+ch);

      return a+b;
   }
}
