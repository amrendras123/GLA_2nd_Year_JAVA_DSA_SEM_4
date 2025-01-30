public class CountCoinToss {
    
    public static void main(String[] args) {
        int n=5;
        System.out.println(Coin(n,""));
    }
    public static int Coin(int n,String ans){
        if(n==0){
            System.out.println(ans+" ");
            return 1;
        }
       int a= Coin(n-1, ans+"H");
        int b=Coin(n-1, ans+"T");

        return a+b;
    
    }
}
