public class PD {

    public static void main(String[] args) {
        int n=5;
        // pd(n);
        pI(n);
    }

    public static void pI(int n){
        if(n==0){
            return;
        }
        pI(n-1);
        System.out.println(n);

    }
    public static void pd(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        pd(n-1);

    }
}