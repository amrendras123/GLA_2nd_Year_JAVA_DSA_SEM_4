public class CntSubseq {
    public static void main(String[] args) {
        String ques="abdcsicdassc";
        String ans="";
        System.out.println(sub(ques,ans));
   }
   public static int sub(String ques,String ans){

       if(ques.length()==0){
           System.out.print(ans+" ");
           return 1;
       }

       char ch=ques.charAt(0);
       int a=sub(ques.substring(1), ans);
       int b=sub(ques.substring(1), ans+ch);
       return a+b;
   }
}
