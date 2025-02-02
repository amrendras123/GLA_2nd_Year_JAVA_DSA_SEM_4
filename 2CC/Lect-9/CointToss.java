public class CointToss {
    public static void main(String[] args) {
        int n=7;
        coin(n,"");
    }
    public static void coin(int n,String ans){

    if(n==0){
        System.out.println(ans+" ");
        return;
    }
        coin(n-1, ans+"T"); 
        coin(n-1, ans+"H");
        
    }
}
