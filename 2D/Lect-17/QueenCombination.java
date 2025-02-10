public class QueenCombination {

    public static void main(String[] args) {
        int n=4;
        int tq=2;
        boolean[] box=new boolean[n];
        queen(tq,0,box,"");
    }
    public static void queen(int tq,int qpsf,boolean[] box,String ans){
        if(qpsf==tq){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<box.length;i++){
            if(box[i]==false){
                box[i]=true;
               queen(tq, qpsf+1, box, ans+"b"+i+"q"+qpsf);
               box[i]=false;//bactracking
            }
        }

    }
}