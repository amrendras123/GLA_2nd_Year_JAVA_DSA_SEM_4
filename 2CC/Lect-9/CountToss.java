public class CountToss {
    public static void main(String[] args) {
        int n=7;
       System.out.println(coin(n,""));
    }
    public static int coin(int n,String ans){

    if(n==0){
        System.out.print(ans+" ");
        return 1;
    }
        int a=coin(n-1, ans+"T"); 
        int b=coin(n-1, ans+"H");

        return a+b;
        
    }
}
