public class PDI {

    public static void main(String[] args) {
        int n=5;
        pd(n);  
    }
    public static void pd(int n){
        if(n==0){//base case
            return ;
        }
        System.out.println(n);//self work
        pd(n-1);//sp

    }
    public static void pdi(int n){
        if(n==0){//base case
            return ;
        }
        pdi(n-1);//sp
        System.out.println(n);//self work

    }
}