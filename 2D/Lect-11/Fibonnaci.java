public class Fibonnaci {
    
    public static void main(String[] args) {
        int n=5;
        System.out.println(fib(n));
    }
    public static int fib(int n){
        if(n==0||n==1){//base case
            return n;
        }
        int f1=fib(n-1);//sp1
        int f2=fib(n-2);//sp2
        return f1+f2;//self work
    }
}
