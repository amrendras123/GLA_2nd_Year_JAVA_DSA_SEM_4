public class Fibonacci {
    public static void main(String[] args) {
        int n=7;
        System.out.println(fib(n));
    }
    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }

        int f1=fib(n-1);
        int f2=fib(n-2);

        return f1+f2;
    }
}
