public class Factorial {
    public static void main(String[] args) {
        int n=5;
       System.out.println(fact(n));
    }
    public static int fact(int n){
     if(n==0){//base case
        return 1;
     }
        int sp=fact(n-1);//sp
        int self=n*sp;//self
        return self;
    }
}
