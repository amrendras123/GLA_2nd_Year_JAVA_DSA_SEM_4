public class Queen_Permutations {

    public static void main(String[] args) {
        int n=10;
        boolean[] box=new boolean[n];
        int tq=7;
        queen(box,tq,0,"");
    }
   public static void queen(boolean[] box,int tq,int qpsf,String ans){
    if(tq==qpsf){
        System.out.println(ans);
        return;
    }
    for(int i=0;i<box.length;i++){
        if(box[i]==false){
            box[i]=true;
            queen(box, tq, qpsf+1, ans+"b"+i+"q"+qpsf);
            box[i]=false;//backtracking step
        }
    }
   }
}