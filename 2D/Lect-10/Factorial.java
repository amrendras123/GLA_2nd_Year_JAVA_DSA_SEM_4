public class Factorial {
    
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    public static int fact(int n){

       if(n==0){
        return 1;
       }
        int sp=fact(n-1);//sp
        int self=n*sp;

        return self;

    }
}
