public class Factorial {
    
    public static void main(String[] args) {
        int n=10;
        int ans=1;
        System.out.println(fact(n,ans));
    }
    public static int fact(int n,int ans){
        if(n==0){
            return ans;
        }
        return fact(n-1, n*ans);   
    }
}
