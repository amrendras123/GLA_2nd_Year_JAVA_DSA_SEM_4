public class PI {

    public static void main(String[] args) {
        int n=5;
        pi(n);
    }
    public static void pi(int n){
        if(n==0){//base case
            return ;
        }
        pi(n-1);//sp
        System.out.println(n);
    }
}